/**
 *
 */
package org.mule.modules.papaertrail.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.papaertrail.automation.runner.FunctionalTestSuite;
import org.mule.modules.paperstrail.PapersTrailConnector;
import org.mule.modules.papertrail.beans.DetsinationGetResponse;

public class GetDestinationInfoTestCase extends PaperTrailAbstractTestCase{
	public GetDestinationInfoTestCase() {
		super(PapersTrailConnector.class);
	}
	@Test
	@Category({FunctionalTestSuite.class})
	public void getDestinationById()
	{
		DetsinationGetResponse response=getConnector().getDestinationInfo(getApikey(),getDestinationId() );
		assertNotNull(response);
	}
}
