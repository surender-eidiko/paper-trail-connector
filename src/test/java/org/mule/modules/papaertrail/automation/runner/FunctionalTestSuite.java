/**
 *
 */
package org.mule.modules.papaertrail.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.papaertrail.automation.functional.GetArchiveInformationTestCase;
import org.mule.modules.papaertrail.automation.functional.GetDestinationInfoTestCase;
import org.mule.modules.papaertrail.automation.functional.GetDestionationsListTestCase;
import org.mule.modules.papaertrail.automation.functional.GetFilterLogsTestCase;
import org.mule.modules.papaertrail.automation.functional.GetGroupsListTestCase;
import org.mule.modules.papaertrail.automation.functional.GetSystemInformationTestCase;
import org.mule.modules.papaertrail.automation.functional.GetSystemUsageTestCase;
import org.mule.modules.papaertrail.automation.functional.GetUsersListTestCase;
import org.mule.modules.papaertrail.automation.functional.SystemsListGetTestCase;
import org.mule.modules.paperstrail.PapersTrailConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

/*@RunWith(Categories.class)
 @IncludeCategory(FunctionalTestSuite.class)*/
@RunWith(Suite.class)
@SuiteClasses({
	GetArchiveInformationTestCase.class,
	GetDestinationInfoTestCase.class,
	GetDestionationsListTestCase.class,
	GetFilterLogsTestCase.class,
	GetGroupsListTestCase.class,
	GetSystemInformationTestCase.class,
	GetSystemUsageTestCase.class,
	GetUsersListTestCase.class,
	SystemsListGetTestCase.class
	
	
	
})
public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite() {

		ConnectorTestContext.initialize(PapersTrailConnector.class);

	}

	@AfterClass
	public static void shutdownSuite() {

		ConnectorTestContext.shutDown();

	}

}
