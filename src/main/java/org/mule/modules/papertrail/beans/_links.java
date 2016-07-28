/**
 *
 */
package org.mule.modules.papertrail.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class _links.
 */
public class _links {
	
	/** The search. */
	private Search search;

    /** The html. */
    private Html html;

    /** The self. */
    private Self self;
    
    /** The download. */
    private Download download;


    /**
     * Gets the download.
     *
     * @return the download
     */
    public Download getDownload() {
		return download;
	}

	/**
	 * Sets the download.
	 *
	 * @param download the new download
	 */
	public void setDownload(Download download) {
		this.download = download;
	}

	/**
	 * Gets the search.
	 *
	 * @return the search
	 */
	public Search getSearch ()
    {
        return search;
    }

    /**
     * Sets the search.
     *
     * @param search the new search
     */
    public void setSearch (Search search)
    {
        this.search = search;
    }

    /**
     * Gets the html.
     *
     * @return the html
     */
    public Html getHtml ()
    {
        return html;
    }

    /**
     * Sets the html.
     *
     * @param html the new html
     */
    public void setHtml (Html html)
    {
        this.html = html;
    }

    /**
     * Gets the self.
     *
     * @return the self
     */
    public Self getSelf ()
    {
        return self;
    }

    /**
     * Sets the self.
     *
     * @param self the new self
     */
    public void setSelf (Self self)
    {
        this.self = self;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [search = "+search+", html = "+html+", self = "+self+"]";
    }
}
