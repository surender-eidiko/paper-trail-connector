/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class GroupsGetResponse.
 */
public class GroupsGetResponse extends StatusResponse{
	
	
	 /** The systems. */
 	private Systems[] systems;

	    /** The id. */
    	private String id;

	    /** The system_wildcard. */
    	private String system_wildcard;

	    /** The name. */
    	private String name;

	    /** The _links. */
    	private _links _links;

	    /**
    	 * Gets the systems.
    	 *
    	 * @return the systems
    	 */
    	public Systems[] getSystems ()
	    {
	        return systems;
	    }

	    /**
    	 * Sets the systems.
    	 *
    	 * @param systems the new systems
    	 */
    	public void setSystems (Systems[] systems)
	    {
	        this.systems = systems;
	    }

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
    	 * Gets the system_wildcard.
    	 *
    	 * @return the system_wildcard
    	 */
    	public String getSystem_wildcard ()
	    {
	        return system_wildcard;
	    }

	    /**
    	 * Sets the system_wildcard.
    	 *
    	 * @param system_wildcard the new system_wildcard
    	 */
    	public void setSystem_wildcard (String system_wildcard)
	    {
	        this.system_wildcard = system_wildcard;
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
	        return "ClassPojo [systems = "+systems+", id = "+id+", system_wildcard = "+system_wildcard+", name = "+name+", _links = "+_links+"]";
	    }

}
