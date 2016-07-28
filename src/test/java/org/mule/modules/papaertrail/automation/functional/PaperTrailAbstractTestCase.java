/**
 *
 */
package org.mule.modules.papaertrail.automation.functional;

import org.junit.Before;
import org.mule.modules.paperstrail.PapersTrailConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public class PaperTrailAbstractTestCase extends AbstractTestCase<PapersTrailConnector>{
	  private PapersTrailConnector connector;
	  private ConnectorDispatcher<PapersTrailConnector> dispatcher;
	  
	  
	  
	  public PaperTrailAbstractTestCase(Class<PapersTrailConnector> connector){
		    super(connector);
		  }

	
	protected PapersTrailConnector getConnector() {
		return connector;
	}


	protected ConnectorDispatcher<PapersTrailConnector> getDispatcher() {
		return dispatcher;
	}
	
	@SuppressWarnings("deprecation")
	@Before
	  public void init() throws Exception {

	    // Initialization for single-test run
	    ConnectorTestContext.initialize(PapersTrailConnector.class, false);

	    // Context instance
		ConnectorTestContext<PapersTrailConnector> context = ConnectorTestContext
	      .getInstance(PapersTrailConnector.class);

	    // Connector dispatcher
	    dispatcher = context.getConnectorDispatcher();

	    connector = dispatcher.createMockup();

	  }	
	
	public String getApikey()
	{
		return "QVGQzJWKprXgA6wymoSu";
	}
	
	public String getSystemName()
	{
		return "sudeep11";
		
	}
	public String getDestinationId()
	{
		return "2938354";
	}
	
}
