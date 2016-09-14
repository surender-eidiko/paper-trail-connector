/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class Syslog.
 */
public class Syslog {
	
	/** The port. */
	private String port;

    /** The hostname. */
    private String hostname;
    private String description;

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
     * Gets the port.
     *
     * @return the port
     */
    public String getPort ()
    {
        return port;
    }

    /**
     * Sets the port.
     *
     * @param port the new port
     */
    public void setPort (String port)
    {
        this.port = port;
    }

    /**
     * Gets the hostname.
     *
     * @return the hostname
     */
    public String getHostname ()
    {
        return hostname;
    }

    /**
     * Sets the hostname.
     *
     * @param hostname the new hostname
     */
    public void setHostname (String hostname)
    {
        this.hostname = hostname;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [port = "+port+", hostname = "+hostname+"]";
    }
}
