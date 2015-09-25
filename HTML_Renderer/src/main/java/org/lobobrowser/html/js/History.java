/*
 * GNU LESSER GENERAL PUBLIC LICENSE Copyright (C) 2006 The XAMJ Project.
 * Copyright (C) 2014 - 2015 Lobo Evolution This library is free software; you
 * can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version. This
 * library is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details. You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 * Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
 */
package org.lobobrowser.html.js;

import org.lobobrowser.html.HtmlRendererContext;
import org.lobobrowser.js.AbstractScriptableDelegate;

/**
 * The Class History.
 */
public class History extends AbstractScriptableDelegate {

	/** The window. */
	private final Window window;

	/**
	 * Instantiates a new history.
	 *
	 * @param window
	 *            the window
	 */
	History(Window window) {
		this.window = window;
	}

	/**
	 * Gets the current.
	 *
	 * @return the current
	 */
	public String getCurrent() {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		return ctx != null ? ctx.getCurrentURL() : null;
	}

	/**
	 * Gets the next.
	 *
	 * @return the next
	 */
	public String getNext() {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		return ctx != null ? ctx.getNextURL() : null;
	}

	/**
	 * Gets the previous.
	 *
	 * @return the previous
	 */
	public String getPrevious() {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		return ctx != null ? ctx.getPreviousURL() : null;
	}

	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	public int getLength() {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		return ctx != null ? ctx.getHistoryLength() : 0;
	}

	/**
	 * Back.
	 */
	public void back() {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		if (ctx != null) {
			ctx.back();
		}
	}

	/**
	 * Forward.
	 */
	public void forward() {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		if (ctx != null) {
			ctx.forward();
		}
	}

	/**
	 * Go.
	 *
	 * @param offset
	 *            the offset
	 */
	public void go(int offset) {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		if (ctx != null) {
			ctx.moveInHistory(offset);
		}
	}

	/**
	 * Go.
	 *
	 * @param url
	 *            the url
	 */
	public void go(String url) {
		HtmlRendererContext ctx = this.window.getHtmlRendererContext();
		if (ctx != null) {
			ctx.goToHistoryURL(url);
		}
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public Object getState() {
		return window.getStatus();

	}

	/**
	 * Push state.
	 *
	 * @param data
	 *            the data
	 * @param title
	 *            the title
	 * @param url
	 *            the url
	 */
	public void pushState(Object data, String title, String url) {
		// TODO
	}

	/**
	 * Replace state.
	 *
	 * @param data
	 *            the data
	 * @param title
	 *            the title
	 * @param url
	 *            the url
	 */
	public void replaceState(Object data, String title, String url) {
		// TODO
	}
}
