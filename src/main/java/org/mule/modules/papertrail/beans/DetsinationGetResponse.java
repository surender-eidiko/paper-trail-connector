/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class DetsinationGetResponse.
 */
public class DetsinationGetResponse extends StatusResponse{
	
	/** The id. */
	private String id;

    /** The syslog. */
    private Syslog syslog;

    /** The filter. */
    private String filter;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId ()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    /**
     * Gets the syslog.
     *
     * @return the syslog
     */
    public Syslog getSyslog ()
    {
        return syslog;
    }

    /**
     * Sets the syslog.
     *
     * @param syslog the new syslog
     */
    public void setSyslog (Syslog syslog)
    {
        this.syslog = syslog;
    }

    /**
     * Gets the filter.
     *
     * @return the filter
     */
    public String getFilter ()
    {
        return filter;
    }

    /**
     * Sets the filter.
     *
     * @param filter the new filter
     */
    public void setFilter (String filter)
    {
        this.filter = filter;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", syslog = "+syslog+", filter = "+filter+"]";
    }
}
