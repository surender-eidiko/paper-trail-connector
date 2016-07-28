/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class ArchiveGetResponse.
 */
public class ArchiveGetResponse extends StatusResponse{
	 
 	/** The filesize. */
 	private String filesize;

	    /** The duration_formatted. */
    	private String duration_formatted;

	    /** The start. */
    	private String start;

	    /** The start_formatted. */
    	private String start_formatted;

	    /** The _links. */
    	private _links _links;

	    /** The filename. */
    	private String filename;

	    /** The end. */
    	private String end;

	    /**
    	 * Gets the filesize.
    	 *
    	 * @return the filesize
    	 */
    	public String getFilesize ()
	    {
	        return filesize;
	    }

	    /**
    	 * Sets the filesize.
    	 *
    	 * @param filesize the new filesize
    	 */
    	public void setFilesize (String filesize)
	    {
	        this.filesize = filesize;
	    }

	    /**
    	 * Gets the duration_formatted.
    	 *
    	 * @return the duration_formatted
    	 */
    	public String getDuration_formatted ()
	    {
	        return duration_formatted;
	    }

	    /**
    	 * Sets the duration_formatted.
    	 *
    	 * @param duration_formatted the new duration_formatted
    	 */
    	public void setDuration_formatted (String duration_formatted)
	    {
	        this.duration_formatted = duration_formatted;
	    }

	    /**
    	 * Gets the start.
    	 *
    	 * @return the start
    	 */
    	public String getStart ()
	    {
	        return start;
	    }

	    /**
    	 * Sets the start.
    	 *
    	 * @param start the new start
    	 */
    	public void setStart (String start)
	    {
	        this.start = start;
	    }

	    /**
    	 * Gets the start_formatted.
    	 *
    	 * @return the start_formatted
    	 */
    	public String getStart_formatted ()
	    {
	        return start_formatted;
	    }

	    /**
    	 * Sets the start_formatted.
    	 *
    	 * @param start_formatted the new start_formatted
    	 */
    	public void setStart_formatted (String start_formatted)
	    {
	        this.start_formatted = start_formatted;
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

	    /**
    	 * Gets the filename.
    	 *
    	 * @return the filename
    	 */
    	public String getFilename ()
	    {
	        return filename;
	    }

	    /**
    	 * Sets the filename.
    	 *
    	 * @param filename the new filename
    	 */
    	public void setFilename (String filename)
	    {
	        this.filename = filename;
	    }

	    /**
    	 * Gets the end.
    	 *
    	 * @return the end
    	 */
    	public String getEnd ()
	    {
	        return end;
	    }

	    /**
    	 * Sets the end.
    	 *
    	 * @param end the new end
    	 */
    	public void setEnd (String end)
	    {
	        this.end = end;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [filesize = "+filesize+", duration_formatted = "+duration_formatted+", start = "+start+", start_formatted = "+start_formatted+", _links = "+_links+", filename = "+filename+", end = "+end+"]";
	    }
}
