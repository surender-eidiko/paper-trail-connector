/**
 *
 */
package org.mule.modules.paperstrail;

import java.util.List;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.modules.paperstrail.config.ConnectorConfig;
import org.mule.modules.papertrail.beans.AccountUsageGetResponse;
import org.mule.modules.papertrail.beans.ArchiveGetResponse;
import org.mule.modules.papertrail.beans.DetsinationGetResponse;
import org.mule.modules.papertrail.beans.GroupsGetResponse;
import org.mule.modules.papertrail.beans.SearchGetResponse;
import org.mule.modules.papertrail.beans.SystemInfoGetResponse;
import org.mule.modules.papertrail.beans.SystemsListGetResponse;
import org.mule.modules.papertrail.beans.UserListGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class PapersTrailConnector.
 */

/**
 * This is Pager Duty Connector Class.
 *
 * @author Surender
 */




@Connector(name="papers-trail", friendlyName="PapersTrail")
public class PapersTrailConnector {

	/** The config. */
	@Config
	  ConnectorConfig config;

	  /** The client. */
  	private PaperTrailClient client;
	  
	  
	  
	  /**
  	 * Inits the.
  	 */
  	@Start
	  public void init() {
	    setClient(new PaperTrailClient(this));
	  }
	  
	  /**
  	 * Gets the systems list configured under the specific account. 
  	 * 
  	 *
  	 * @param apiKey the api key
  	 * @return the systems list
  	 */
  	@Processor
	  
	  public List<SystemsListGetResponse> getSystemsList(String apiKey)
	  {
		  
		  return getClient().getSystemsList(apiKey);
	  }
	  
	  /**
  	 * This method will return the list of users associated with that account.
  	 *
  	 * @param apiKey the api key
  	 * @return the users list
  	 */
  	@Processor
	  
	  public List<UserListGetResponse> getUsersList(String apiKey)
	  {
		  return getClient().getUsersList(apiKey);
		  
	  }
	  
	  
	  /**
  	 * This method will return the single system information based on the systemname parameter.
  	 *
  	 * @param apikey the apikey
  	 * @param systemName the system name
  	 * @return the system information
  	 */
  	@Processor
	  
	  public SystemInfoGetResponse getSystemInformation(String apikey,String systemName)
	  {
		  
		  return getClient().getSystemInformation(apikey,systemName);
		  
		  
	  }
	  
	  
	  /**
  	 * Gets the account usage.
  	 *
  	 * @param apikey the apikey
  	 * @return the account usage
  	 */
  	@Processor
	  
	  public AccountUsageGetResponse getAccountUsage(String apikey)
	  {
		  
		  return getClient().getAccountUsage(apikey);
		  
	  }
	  
	  /**
  	 * Gets the groups list.
  	 *
  	 * @param apiKey the api key
  	 * @return the groups list
  	 */
  	@Processor
	  public List<GroupsGetResponse> getGroupsList(String apiKey)
	  {
		  
		  return getClient().getGroupsList(apiKey);
	  }
	  
	  /**
  	 * Gets the destination list.
  	 *
  	 * @param apiKey the api key
  	 * @return the destination list
  	 */
  	@Processor
	  
	  public List<DetsinationGetResponse> getDestinationList(String apiKey)
	  {
		  return getClient().getDestinationList(apiKey);
		  
	  }
	  
	  
	  
	  
	  /**
  	 * Gets the specific destination information.
  	 *
  	 * @param apiKey the api key
  	 * @param destinationId the destination id
  	 * @return the destination info
  	 */
  	@Processor
	  
	  public DetsinationGetResponse getDestinationInfo(String apiKey,String destinationId)
	  {
		  return getClient().getDestinationInfo(apiKey,destinationId);
		  
	  }
	  
	  
	  /**
  	 * Gets the archive information.
  	 *
  	 * @param apikey the apikey
  	 * @return the archive information
  	 */
  	@Processor
	  
	  public List<ArchiveGetResponse> getArchiveInformation(String apikey)
	  {
		  
		  return getClient().getArchiveInformation(apikey);
	  }
	  
	  
	  /**
  	 * Gives the logs by filtering with key value pair of attributes.
  	  
  	  existing keys:-
  	  q: search query(key:q,value:"any string")
	  group_id or system_id: limit results to a specific group or system (by ID or in most cases, by name)
	  min_id or min_time: the oldest message ID or timestamp that Papertrail should examine
      max_id or max_time: the newest message ID or timestamp that Papertrail should examine
  	 * @param key the key
  	 * @param value the value
  	 * @param apikey the apikey
  	 * @return the filter logs
  	 * 
  	 * 
  	 */
  	@Processor
	  
	  public SearchGetResponse getFilterLogs(String key,String value,String apikey)
	  {
		  return getClient().getFilterLogs(key,value,apikey);
		  
	  }
	  
	  
	  /**
  	 * Gets the config.
  	 *
  	 * @return the config
  	 */
  	public ConnectorConfig getConfig() {
		    return config;
		  }

		  /**
  		 * Sets the config.
  		 *
  		 * @param config the new config
  		 */
		public void setConfig(ConnectorConfig config) {
		    this.config = config;
		  }

		  /**
  		 * Gets the client.
  		 *
  		 * @return SparkClient Object
  		 */
		public PaperTrailClient getClient() {
		    return client;
		  }

		  /**
  		 * Sets the client.
  		 *
  		 * @param client the new client
  		 */
		public void setClient(PaperTrailClient client) {
		    this.client = client;
		  }
	  
	  
	  
    
}