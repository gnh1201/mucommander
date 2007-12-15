/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2007 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.file.filter;

/**
 * This {@link FilenameFilter} matches filenames that are equal to a specified string.
 *
 * @author Maxence Bernard
 */
public class EqualsFilenameFilter extends FilenameFilter {

    /** The string to compare filenames against */
    private String s;

    /**
     * Creates a new <code>EqualsFilenameFilter</code>.
     *
     * @param s the string to compare filenames against
     * @param caseSensitive if true, this FilenameFilter will be case-sentive
     */
    public EqualsFilenameFilter(String s, boolean caseSensitive) {
        super(caseSensitive);
        this.s = s;
    }


    ///////////////////////////////////
    // FilenameFilter implementation //
    ///////////////////////////////////

    public boolean accept(String filename) {
        if(isCaseSensitive())
            return filename.equals(s);

        return filename.equalsIgnoreCase(s);
    }
}