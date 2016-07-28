/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class Events.
 */
public class Events {
	
	/** The message. */
	private String message;

    /** The id. */
    private String id;

    /** The received_at. */
    private String received_at;

    /** The facility. */
    private String facility;

    /** The source_ip. */
    private String source_ip;

    /** The source_id. */
    private String source_id;

    /** The program. */
    private String program;

    /** The hostname. */
    private String hostname;

    /** The generated_at. */
    private String generated_at;

    /** The severity. */
    private String severity;

    /** The source_name. */
    private String source_name;

    /** The display_received_at. */
    private String display_received_at;

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage ()
    {
        return message;
    }

    /**
     * Sets the message.
     *
     * @param message the new message
     */
    public void setMessage (String message)
    {
        this.message = message;
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
     * Gets the received_at.
     *
     * @return the received_at
     */
    public String getReceived_at ()
    {
        return received_at;
    }

    /**
     * Sets the received_at.
     *
     * @param received_at the new received_at
     */
    public void setReceived_at (String received_at)
    {
        this.received_at = received_at;
    }

    /**
     * Gets the facility.
     *
     * @return the facility
     */
    public String getFacility ()
    {
        return facility;
    }

    /**
     * Sets the facility.
     *
     * @param facility the new facility
     */
    public void setFacility (String facility)
    {
        this.facility = facility;
    }

    /**
     * Gets the source_ip.
     *
     * @return the source_ip
     */
    public String getSource_ip ()
    {
        return source_ip;
    }

    /**
     * Sets the source_ip.
     *
     * @param source_ip the new source_ip
     */
    public void setSource_ip (String source_ip)
    {
        this.source_ip = source_ip;
    }

    /**
     * Gets the source_id.
     *
     * @return the source_id
     */
    public String getSource_id ()
    {
        return source_id;
    }

    /**
     * Sets the source_id.
     *
     * @param source_id the new source_id
     */
    public void setSource_id (String source_id)
    {
        this.source_id = source_id;
    }

    /**
     * Gets the program.
     *
     * @return the program
     */
    public String getProgram ()
    {
        return program;
    }

    /**
     * Sets the program.
     *
     * @param program the new program
     */
    public void setProgram (String program)
    {
        this.program = program;
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
     * Gets the generated_at.
     *
     * @return the generated_at
     */
    public String getGenerated_at ()
    {
        return generated_at;
    }

    /**
     * Sets the generated_at.
     *
     * @param generated_at the new generated_at
     */
    public void setGenerated_at (String generated_at)
    {
        this.generated_at = generated_at;
    }

    /**
     * Gets the severity.
     *
     * @return the severity
     */
    public String getSeverity ()
    {
        return severity;
    }

    /**
     * Sets the severity.
     *
     * @param severity the new severity
     */
    public void setSeverity (String severity)
    {
        this.severity = severity;
    }

    /**
     * Gets the source_name.
     *
     * @return the source_name
     */
    public String getSource_name ()
    {
        return source_name;
    }

    /**
     * Sets the source_name.
     *
     * @param source_name the new source_name
     */
    public void setSource_name (String source_name)
    {
        this.source_name = source_name;
    }

    /**
     * Gets the display_received_at.
     *
     * @return the display_received_at
     */
    public String getDisplay_received_at ()
    {
        return display_received_at;
    }

    /**
     * Sets the display_received_at.
     *
     * @param display_received_at the new display_received_at
     */
    public void setDisplay_received_at (String display_received_at)
    {
        this.display_received_at = display_received_at;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", id = "+id+", received_at = "+received_at+", facility = "+facility+", source_ip = "+source_ip+", source_id = "+source_id+", program = "+program+", hostname = "+hostname+", generated_at = "+generated_at+", severity = "+severity+", source_name = "+source_name+", display_received_at = "+display_received_at+"]";
    }
}
