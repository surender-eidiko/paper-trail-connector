/**
 *
 */
package org.mule.modules.paperstrail.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.rest.RestHeaderParam;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	 @Configurable
	  @Optional
	  @Default("https://papertrailapp.com/api/v1")
	  private String url = "https://papertrailapp.com/api/v1";

	  @Configurable
	  @Optional
	  @RestHeaderParam("Authorization")
	  private String authorization = "QVGQzJWKprXgA6wymoSu";

	  public String getUrl() {
	    return url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }

	  public String getAuthorization() {
	    return authorization;
	  }

	  public void setAuthorization(String authorization) {
	    this.authorization = authorization;
	  }

}