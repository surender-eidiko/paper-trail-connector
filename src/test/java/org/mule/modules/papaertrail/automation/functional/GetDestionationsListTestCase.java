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
import org.mule.modules.papertrail.beans.DetsinationGetResponse;

public class GetDestionationsListTestCase extends PaperTrailAbstractTestCase {
	public GetDestionationsListTestCase() {
		super(PapersTrailConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void getDestinationList()
	{
		
	      List<DetsinationGetResponse> response=getConnector().getDestinationList(getApikey());
	      System.out.println("***************************************************"+response.get(0));
	      assertNotNull(response);
	     
	}
}
