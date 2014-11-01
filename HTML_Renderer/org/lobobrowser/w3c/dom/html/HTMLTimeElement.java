package org.lobobrowser.w3c.dom.html;

public interface HTMLTimeElement extends HTMLElement
{
    // HTMLTimeElement
    public String getDateTime();
    public void setDateTime(String dateTime);
    public boolean getPubDate();
    public void setPubDate(boolean pubDate);
    public long getValueAsDate();
}
