/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountUsageGetResponse.
 */
public class AccountUsageGetResponse extends StatusResponse {
	
	/** The log_data_transfer_used_percent. */
	private String log_data_transfer_used_percent;

    /** The log_data_transfer_hard_limit. */
    private String log_data_transfer_hard_limit;

    /** The log_data_transfer_plan_limit. */
    private String log_data_transfer_plan_limit;

    /** The log_data_transfer_used. */
    private String log_data_transfer_used;

    /**
     * Gets the log_data_transfer_used_percent.
     *
     * @return the log_data_transfer_used_percent
     */
    public String getLog_data_transfer_used_percent ()
    {
        return log_data_transfer_used_percent;
    }

    /**
     * Sets the log_data_transfer_used_percent.
     *
     * @param log_data_transfer_used_percent the new log_data_transfer_used_percent
     */
    public void setLog_data_transfer_used_percent (String log_data_transfer_used_percent)
    {
        this.log_data_transfer_used_percent = log_data_transfer_used_percent;
    }

    /**
     * Gets the log_data_transfer_hard_limit.
     *
     * @return the log_data_transfer_hard_limit
     */
    public String getLog_data_transfer_hard_limit ()
    {
        return log_data_transfer_hard_limit;
    }

    /**
     * Sets the log_data_transfer_hard_limit.
     *
     * @param log_data_transfer_hard_limit the new log_data_transfer_hard_limit
     */
    public void setLog_data_transfer_hard_limit (String log_data_transfer_hard_limit)
    {
        this.log_data_transfer_hard_limit = log_data_transfer_hard_limit;
    }

    /**
     * Gets the log_data_transfer_plan_limit.
     *
     * @return the log_data_transfer_plan_limit
     */
    public String getLog_data_transfer_plan_limit ()
    {
        return log_data_transfer_plan_limit;
    }

    /**
     * Sets the log_data_transfer_plan_limit.
     *
     * @param log_data_transfer_plan_limit the new log_data_transfer_plan_limit
     */
    public void setLog_data_transfer_plan_limit (String log_data_transfer_plan_limit)
    {
        this.log_data_transfer_plan_limit = log_data_transfer_plan_limit;
    }

    /**
     * Gets the log_data_transfer_used.
     *
     * @return the log_data_transfer_used
     */
    public String getLog_data_transfer_used ()
    {
        return log_data_transfer_used;
    }

    /**
     * Sets the log_data_transfer_used.
     *
     * @param log_data_transfer_used the new log_data_transfer_used
     */
    public void setLog_data_transfer_used (String log_data_transfer_used)
    {
        this.log_data_transfer_used = log_data_transfer_used;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [log_data_transfer_used_percent = "+log_data_transfer_used_percent+", log_data_transfer_hard_limit = "+log_data_transfer_hard_limit+", log_data_transfer_plan_limit = "+log_data_transfer_plan_limit+", log_data_transfer_used = "+log_data_transfer_used+"]";
    }
}
