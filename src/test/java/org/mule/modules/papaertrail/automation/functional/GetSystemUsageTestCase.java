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
import org.mule.modules.papertrail.beans.AccountUsageGetResponse;


public class GetSystemUsageTestCase extends PaperTrailAbstractTestCase{

	public GetSystemUsageTestCase() {
		super(PapersTrailConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void getSystemUsage()
	{
		
	      
	     
			AccountUsageGetResponse response=getConnector().getAccountUsage(getApikey());
	      System.out.println("***************************************************"+response);
	      assertNotNull(response);
	     
	}
}
