/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchGetResponse.
 */
public class SearchGetResponse extends StatusResponse {
	
	/** The min_time_at. */
	private String min_time_at;

    /** The max_id. */
    private String max_id;

    /** The events. */
    private Events[] events;

    /** The min_id. */
    private String min_id;

    /** The reached_beginning. */
    private String reached_beginning;

    /**
     * Gets the min_time_at.
     *
     * @return the min_time_at
     */
    public String getMin_time_at ()
    {
        return min_time_at;
    }

    /**
     * Sets the min_time_at.
     *
     * @param min_time_at the new min_time_at
     */
    public void setMin_time_at (String min_time_at)
    {
        this.min_time_at = min_time_at;
    }

    /**
     * Gets the max_id.
     *
     * @return the max_id
     */
    public String getMax_id ()
    {
        return max_id;
    }

    /**
     * Sets the max_id.
     *
     * @param max_id the new max_id
     */
    public void setMax_id (String max_id)
    {
        this.max_id = max_id;
    }

    /**
     * Gets the events.
     *
     * @return the events
     */
    public Events[] getEvents ()
    {
        return events;
    }

    /**
     * Sets the events.
     *
     * @param events the new events
     */
    public void setEvents (Events[] events)
    {
        this.events = events;
    }

    /**
     * Gets the min_id.
     *
     * @return the min_id
     */
    public String getMin_id ()
    {
        return min_id;
    }

    /**
     * Sets the min_id.
     *
     * @param min_id the new min_id
     */
    public void setMin_id (String min_id)
    {
        this.min_id = min_id;
    }

    /**
     * Gets the reached_beginning.
     *
     * @return the reached_beginning
     */
    public String getReached_beginning ()
    {
        return reached_beginning;
    }

    /**
     * Sets the reached_beginning.
     *
     * @param reached_beginning the new reached_beginning
     */
    public void setReached_beginning (String reached_beginning)
    {
        this.reached_beginning = reached_beginning;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [min_time_at = "+min_time_at+", max_id = "+max_id+", events = "+events+", min_id = "+min_id+", reached_beginning = "+reached_beginning+"]";
    }
}
