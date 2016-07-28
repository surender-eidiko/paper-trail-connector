/**
 *
 */
package org.mule.modules.papertrail.beans;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class UserListGetResponse.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserListGetResponse extends StatusResponse{
	 
 	/** The id. */
 	private String id;

	    /** The email. */
    	private String email;

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
    	 * Gets the email.
    	 *
    	 * @return the email
    	 */
    	public String getEmail ()
	    {
	        return email;
	    }

	    /**
    	 * Sets the email.
    	 *
    	 * @param email the new email
    	 */
    	public void setEmail (String email)
	    {
	        this.email = email;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", email = "+email+"]";
	    }
}
