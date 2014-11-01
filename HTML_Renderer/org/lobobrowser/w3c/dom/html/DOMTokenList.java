package org.lobobrowser.w3c.dom.html;

public interface DOMTokenList
{
    // DOMTokenList
    public int getLength();
    public String item(int index);
    public boolean contains(String token);
    public void add(String token);
    public void remove(String token);
    public boolean toggle(String token);
    public String toString();
}
