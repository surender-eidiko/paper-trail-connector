/**
 *
 */
package org.mule.modules.papaertrail.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.papaertrail.automation.runner.FunctionalTestSuite;
import org.mule.modules.paperstrail.PapersTrailConnector;
import org.mule.modules.papertrail.beans.SystemsListGetResponse;


public class SystemsListGetTestCase extends PaperTrailAbstractTestCase{
	public SystemsListGetTestCase()
	{
		super(PapersTrailConnector.class);
	}
	
	@Test
	@Category({FunctionalTestSuite.class})
	public void getSystemsList()
	{
		
	      
	      List<SystemsListGetResponse> response = getConnector().getSystemsList(getApikey());
	      System.out.println("***************************************************"+response);
	      assertNotNull(response);
	     
	}

}
