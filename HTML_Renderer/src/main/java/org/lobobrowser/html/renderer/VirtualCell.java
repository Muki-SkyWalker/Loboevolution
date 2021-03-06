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
/*
 * Created on Dec 3, 2005
 */
package org.lobobrowser.html.renderer;

import org.lobobrowser.html.style.HtmlLength;

/**
 * The Class VirtualCell.
 */
public class VirtualCell {

    /** The actual cell. */
    private final RTableCell actualCell;

    /** The is top left. */
    private final boolean isTopLeft;

    /** The column. */
    private int column;

    /** The row. */
    private int row;

    /**
     * Instantiates a new virtual cell.
     *
     * @param cell
     *            the cell
     * @param isTopLeft
     *            the is top left
     */
    public VirtualCell(RTableCell cell, boolean isTopLeft) {
        actualCell = cell;
        this.isTopLeft = isTopLeft;
    }

    /** Checks if is top left.
	 *
	 * @return true, if is top left
	 */
    public boolean isTopLeft() {
        return this.isTopLeft;
    }

    /** Gets the column.
	 *
	 * @return the column
	 */
    public int getColumn() {
        return column;
    }

    /** Sets the column.
	 *
	 * @param column
	 *            the new column
	 */
    public void setColumn(int column) {
        this.column = column;
    }

    /** Gets the row.
	 *
	 * @return the row
	 */
    public int getRow() {
        return row;
    }

    /** Sets the row.
	 *
	 * @param row
	 *            the new row
	 */
    public void setRow(int row) {
        this.row = row;
    }

    /** Gets the actual cell.
	 *
	 * @return the actual cell
	 */
    public RTableCell getActualCell() {
        return actualCell;
    }

    /** Gets the height length.
	 *
	 * @return the height length
	 */
    public HtmlLength getHeightLength() {
        // TODO: Does not consider cellpadding and border
        RTableCell cell = this.actualCell;
        String heightText = cell.getHeightText();
        HtmlLength length;
        try {
            length = heightText == null ? null : new HtmlLength(heightText);
        } catch (Exception err) {
            length = null;
        }
        if (length != null) {
            length.divideBy(cell.getRowSpan());
        }
        return length;
    }

    /** Gets the width length.
	 *
	 * @return the width length
	 */
    public HtmlLength getWidthLength() {
        RTableCell cell = this.actualCell;
        String widthText = cell.getWidthText();
        HtmlLength length;
        try {
            length = widthText == null ? null : new HtmlLength(widthText);
        } catch (Exception err) {
            length = null;
        }
        if (length != null) {
            length.divideBy(cell.getColSpan());
        }
        return length;
    }
}
