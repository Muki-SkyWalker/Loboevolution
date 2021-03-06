/*
    GNU GENERAL LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 - 2016 Lobo Evolution

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    verion 2 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General License for more details.

    You should have received a copy of the GNU General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
 */
package org.lobobrowser.clientlet;

import java.awt.Component;

/**
 * Content set by a {@link Clientlet}. To ensure backward compatibility, it is
 * recommended that {@link AbstractComponentContent} be extended instead of
 * implementing this interface whenever possible.
 *
 * @see ClientletContext#setResultingContent(ComponentContent)
 */
public interface ComponentContent {

    /** Gets the component.
	 *
	 * @return the component
	 */
    Component getComponent();

    /** Gets the title.
	 *
	 * @return the title
	 */
    String getTitle();

    /** Gets the description.
	 *
	 * @return the description
	 */
    String getDescription();

    /**
     * Determines whether it's possible to copy content to the clipboard. This
     * method can be used by the platform to determine if a menu item should be
     * enabled.
     *
     * @return true, if successful
     */
    boolean canCopy();

    /**
     * Copies content to the clipboard.
     *
     * @return True if the operation succeeded.
     */
    boolean copy();

    /** Gets the source code.
	 *
	 * @return the source code
	 */
    String getSourceCode();

    /** Called after the content has been added to a container for display. */
    void addNotify();

    /**
     * Called after the content has been removed from the display container.
     * This method may be used to dispose associated resources.
     */
    void removeNotify();

    /** Gets the content object.
	 *
	 * @return the content object
	 */
    Object getContentObject();

    /** Gets the mime type.
	 *
	 * @return the mime type
	 */
    String getMimeType();

    /**
     * Sets a property of the content. Property names are
     * implementation-dependent.
     *
     * @param name
     *            the name
     * @param value
     *            the value
     */
    void setProperty(String name, Object value);
}
