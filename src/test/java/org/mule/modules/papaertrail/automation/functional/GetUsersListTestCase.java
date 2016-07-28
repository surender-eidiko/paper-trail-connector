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
import org.mule.modules.papertrail.beans.SystemsListGetResponse;
import org.mule.modules.papertrail.beans.UserListGetResponse;

public class GetUsersListTestCase extends PaperTrailAbstractTestCase {

	public GetUsersListTestCase() {
		super(PapersTrailConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void getUsersList()
	{
		
	      
	      List<UserListGetResponse> response = getConnector().getUsersList(getApikey());
	      System.out.println("***************************************************"+response.get(0));
	      assertNotNull(response);
	     
	}

}
