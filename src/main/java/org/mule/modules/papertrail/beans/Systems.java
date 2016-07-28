/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class Systems.
 */
public class Systems {
	 
 	/** The id. */
 	private String id;

	    /** The syslog. */
    	private Syslog syslog;

	    /** The auto_delete. */
    	private String auto_delete;

	    /** The ip_address. */
    	private String ip_address;

	    /** The last_event_at. */
    	private String last_event_at;

	    /** The name. */
    	private String name;

	    /** The hostname. */
    	private String hostname;

	    /** The _links. */
    	private _links _links;
	    


	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
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
    	 * Gets the auto_delete.
    	 *
    	 * @return the auto_delete
    	 */
    	public String getAuto_delete ()
	    {
	        return auto_delete;
	    }

	    /**
    	 * Sets the auto_delete.
    	 *
    	 * @param auto_delete the new auto_delete
    	 */
    	public void setAuto_delete (String auto_delete)
	    {
	        this.auto_delete = auto_delete;
	    }

	    /**
    	 * Gets the ip_address.
    	 *
    	 * @return the ip_address
    	 */
    	public String getIp_address ()
	    {
	        return ip_address;
	    }

	    /**
    	 * Sets the ip_address.
    	 *
    	 * @param ip_address the new ip_address
    	 */
    	public void setIp_address (String ip_address)
	    {
	        this.ip_address = ip_address;
	    }

	    /**
    	 * Gets the last_event_at.
    	 *
    	 * @return the last_event_at
    	 */
    	public String getLast_event_at ()
	    {
	        return last_event_at;
	    }

	    /**
    	 * Sets the last_event_at.
    	 *
    	 * @param last_event_at the new last_event_at
    	 */
    	public void setLast_event_at (String last_event_at)
	    {
	        this.last_event_at = last_event_at;
	    }

	    /**
    	 * Gets the name.
    	 *
    	 * @return the name
    	 */
    	public String getName ()
	    {
	        return name;
	    }

	    /**
    	 * Sets the name.
    	 *
    	 * @param name the new name
    	 */
    	public void setName (String name)
	    {
	        this.name = name;
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

	    /**
    	 * Gets the _links.
    	 *
    	 * @return the _links
    	 */
    	public _links get_links ()
	    {
	        return _links;
	    }

	    /**
    	 * Sets the _links.
    	 *
    	 * @param _links the new _links
    	 */
    	public void set_links (_links _links)
	    {
	        this._links = _links;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", syslog = "+syslog+", auto_delete = "+auto_delete+", ip_address = "+ip_address+", last_event_at = "+last_event_at+", name = "+name+", hostname = "+hostname+", _links = "+_links+"]";
	    }
}
