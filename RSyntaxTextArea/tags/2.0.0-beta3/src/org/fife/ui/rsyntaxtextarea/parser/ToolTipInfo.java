/*
 * 07/29/2009
 *
 * ToolTipInfo.java - A tool tip's text and hyperlink listener.
 * Copyright (C) 2009 Robert Futrell
 * robert_futrell at users.sourceforge.net
 * http://fifesoft.com/rsyntaxtextarea
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307 USA.
 */
package org.fife.ui.rsyntaxtextarea.parser;

import java.net.URL;
import javax.swing.event.HyperlinkListener;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.focusabletip.FocusableTip;


/**
 * Wrapper for a tool tip and a listener for hyperlink events in the tool
 * tip (assuming the tip is HTML).  If the {@link RSyntaxTextArea} instance
 * has {@link FocusableTip}s enabled, and the user clicks on a hyperlink in
 * the tool tip, the specified {@link HyperlinkListener} will be called.
 *
 * @author Robert Futrell
 * @version 1.0
 */
public class ToolTipInfo {

	private String text;
	private HyperlinkListener listener;
	private URL imageBase;


	/**
	 * Constructor.
	 *
	 * @param text The tool tip text, or <code>null</code> for none.
	 * @param listener The hyperlink listener, or <code>null</code> for none.
	 */
	public ToolTipInfo(String text, HyperlinkListener listener) {
		this(text, listener, null);
	}


	/**
	 * Constructor.
	 *
	 * @param text The tool tip text, or <code>null</code> for none.
	 * @param l The hyperlink listener, or <code>null</code> for none.
	 * @param imageBase The base URL for images in the HTML <code>text</code>,
	 *        or <code>null</code> for the default.
	 */
	public ToolTipInfo(String text, HyperlinkListener l, URL imageBase) {
		this.text = text;
		this.listener = l;
		this.imageBase = imageBase;
	}


	/**
	 * Returns the listener to call when hyperlinks are clicked in the tool
	 * tip.
	 *
	 * @return The listener, or <code>null</code> for none.
	 */
	public HyperlinkListener getHyperlinkListener() {
		return listener;
	}


	/**
	 * Returns the base URL that any images in the HTML tool tip live in.
	 * This allows you to reference images in a jar file in your
	 * {@link FocusableTip}s.
	 * Note that if what {@link #getToolTipText()} returns isn't HTML, this
	 * value is effectively ignored.
	 *
	 * @return The image base, or <code>null</code> for the default.
	 */
	public URL getImageBase() {
		return imageBase;
	}


	/**
	 * Returns the tool tip text to display.
	 *
	 * @return The tool tip text, or <code>null</code> for none.
	 */
	public String getToolTipText() {
		return text;
	}


}