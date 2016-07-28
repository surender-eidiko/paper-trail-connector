/**
 *
 */
package org.mule.modules.papaertrail.automation.functional;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.papaertrail.automation.runner.FunctionalTestSuite;
import org.mule.modules.paperstrail.PapersTrailConnector;
import org.mule.modules.papertrail.beans.SystemInfoGetResponse;
import org.mule.modules.papertrail.beans.SystemsListGetResponse;

public class GetSystemInformationTestCase extends PaperTrailAbstractTestCase{
	public GetSystemInformationTestCase() {
		super(PapersTrailConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void getSystemInfo()
	{
		
	      
		  SystemInfoGetResponse response=getConnector().getSystemInformation(getApikey(), getSystemName());
	      System.out.println("***************************************************"+response);
	      assertNotNull(response);
	     
	}
}
