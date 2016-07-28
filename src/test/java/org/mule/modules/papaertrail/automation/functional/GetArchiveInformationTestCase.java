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
import org.mule.modules.papertrail.beans.ArchiveGetResponse;

public class GetArchiveInformationTestCase extends PaperTrailAbstractTestCase {
	public GetArchiveInformationTestCase() {
		super(PapersTrailConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void getArchiveInformation()
	{
		
	      
          List<ArchiveGetResponse> response=getConnector().getArchiveInformation(getApikey());	     
	      System.out.println("***************************************************"+response.get(0));
	      assertNotNull(response);
	     
	}
}
