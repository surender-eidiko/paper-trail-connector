/**
 *
 */
package org.mule.modules.paperstrail;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mule.modules.papertrail.beans.AccountUsageGetResponse;
import org.mule.modules.papertrail.beans.ArchiveGetResponse;
import org.mule.modules.papertrail.beans.DetsinationGetResponse;
import org.mule.modules.papertrail.beans.GroupsGetResponse;
import org.mule.modules.papertrail.beans.SearchGetResponse;
import org.mule.modules.papertrail.beans.StatusResponse;
import org.mule.modules.papertrail.beans.SystemInfoGetResponse;
import org.mule.modules.papertrail.beans.SystemsListGetResponse;
import org.mule.modules.papertrail.beans.UserListGetResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class PaperTrailClient {
  private Client client;
  private WebResource apiResource;
  private PapersTrailConnector connector;
  private static final Logger log = Logger.getLogger(PaperTrailClient.class
    .getName());

  public PaperTrailClient(PapersTrailConnector connector) {
    setConnector(connector);

    ClientConfig clientConfig = new DefaultClientConfig();
    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
      Boolean.TRUE);
    this.client = Client.create(clientConfig);
    this.apiResource = this.client.resource(getConnector().getConfig().getUrl());

  }

  public List<SystemsListGetResponse> getSystemsList(String apiKey) {
    WebResource webResource = getApiResource().path("systems.json");

    String responseStirng = (String) getData(webResource,
      SystemsListGetResponse.class, apiKey, "array");

    return (List<SystemsListGetResponse>) getListObject(responseStirng, SystemsListGetResponse.class);
  }

  @SuppressWarnings("unchecked")
  public List<UserListGetResponse> getUsersList(String apiKey) {

    WebResource webResource = getApiResource().path("users.json");

    String response = (String) getData(webResource,
      UserListGetResponse.class, apiKey, "array");

    return (List<UserListGetResponse>) getListObject(response, UserListGetResponse.class);
  }

  public SystemInfoGetResponse getSystemInformation(String apikey,
    String systemName) {
    WebResource webResource = getApiResource().path("systems").path("" + systemName + ".json");
    return (SystemInfoGetResponse) getData(webResource, SystemInfoGetResponse.class, apikey, "");

  }

  public AccountUsageGetResponse getAccountUsage(String apikey) {

    WebResource webResource = getApiResource().path("accounts.json");

    return (AccountUsageGetResponse) getData(webResource, AccountUsageGetResponse.class, apikey, "");
  }

  public List<GroupsGetResponse> getGroupsList(String apiKey) {

    WebResource webResource = getApiResource().path("groups.json");

    String response = (String) getData(webResource,
      GroupsGetResponse.class, apiKey, "array");

    return (List<GroupsGetResponse>) getListObject(response, GroupsGetResponse.class);
  }

  public List<DetsinationGetResponse> getDestinationList(String apiKey) {
    WebResource webResource = getApiResource().path("destinations.json");

    String response = (String) getData(webResource,
      DetsinationGetResponse.class, apiKey, "array");

    return (List<DetsinationGetResponse>) getListObject(response, DetsinationGetResponse.class);
  }

  public DetsinationGetResponse getDestinationInfo(String apiKey,
    String destinationId) {
    WebResource webResource = getApiResource().path("destinations").path("" + destinationId + ".json");

    return (DetsinationGetResponse) getData(webResource, DetsinationGetResponse.class, apiKey, "");
  }

  public List<ArchiveGetResponse> getArchiveInformation(String apikey) {

    WebResource webResource = getApiResource().path("archives.json");

    String response = (String) getData(webResource,
      ArchiveGetResponse.class, apikey, "array");

    return (List<ArchiveGetResponse>) getListObject(response, ArchiveGetResponse.class);
  }

  public SearchGetResponse getFilterLogs(String key, String value,
    String apikey) {
    WebResource webResource = getApiResource().path("events").path("search.json");
    MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
    if (key != null && value != null) {
      queryParams.add("" + key + "", value);
    }

    webResource = webResource.queryParams(queryParams);
    return (SearchGetResponse) getData(webResource,
      SearchGetResponse.class, apikey, "");
  }

  private Object getData(WebResource webResource, Class<?> returnClass, String token, String type) {

    WebResource.Builder builder = addHeader(webResource, token);
    ClientResponse clientResponse = builder.get(ClientResponse.class);

    if (type.equals("array"))
    {

      return clientResponse.getEntity(String.class);

    }
    else
    {
      return buildResponseObject(returnClass, clientResponse);
    }

  }

  private WebResource.Builder addHeader(WebResource webResource, String token) {
    WebResource.Builder builder = webResource
      .accept(MediaType.APPLICATION_JSON);
    String paperTrailToken;
    if (token == null) {
      paperTrailToken = connector.getConfig().getAuthorization();
    }
    else {
      paperTrailToken = token;
    }
    builder.header("X-Papertrail-Token", paperTrailToken);
    return builder;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public WebResource getApiResource() {
    return apiResource;
  }

  public void setApiResource(WebResource apiResource) {
    this.apiResource = apiResource;
  }

  public PapersTrailConnector getConnector() {
    return connector;
  }

  public void setConnector(PapersTrailConnector connector) {
    this.connector = connector;
  }

  @SuppressWarnings("unchecked")
  public Object getListObject(String responseStirng, Class<?> responseClass)
  {
    JSONArray jsonArray = new JSONArray(responseStirng);
    ObjectMapper mapper = new ObjectMapper();
    @SuppressWarnings("rawtypes")
    List usersList = new ArrayList();
    for (int i = 0; i < jsonArray.length(); i++) {
      JSONObject jsonObject = jsonArray.getJSONObject(i);

      try {
        usersList.add(mapper.readValue(jsonObject.toString(),
          responseClass));
      } catch (Exception e) {
        log.log(Level.SEVERE, "Error", e);
      }
    }
    return usersList;
  }

  private Object buildResponseObject(Class<?> returnClass,
    ClientResponse clientResponse) {
    StatusResponse statusResponse = null;
    if (clientResponse.getStatus() == 200) {
      statusResponse = (StatusResponse) clientResponse
        .getEntity(returnClass);
      statusResponse.setStatusCode("200");
    } else {

      String strResponse = clientResponse.getEntity(String.class);
      try {
        Constructor<?> ctor = returnClass.getConstructor();
        statusResponse = (StatusResponse) ctor.newInstance();
        statusResponse.setStatusCode(String.valueOf(clientResponse
          .getStatus()));
        statusResponse.setStatusMessage(strResponse);
      } catch (Exception ex) {
        log.log(Level.SEVERE, "Error", ex);
      }
    }

    return statusResponse;

  }

}
