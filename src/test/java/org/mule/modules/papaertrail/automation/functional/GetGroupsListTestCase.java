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
import org.mule.modules.papertrail.beans.GroupsGetResponse;

public class GetGroupsListTestCase extends PaperTrailAbstractTestCase {
	public GetGroupsListTestCase() {
		super(PapersTrailConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void getGroupsList()
	{
		
	      
	      List<GroupsGetResponse> response=getConnector().getGroupsList(getApikey());
	      System.out.println("***************************************************"+response.get(0));
	      assertNotNull(response);
	     
	}
}
