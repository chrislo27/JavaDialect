/*
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package chrislo27.javadialect.grammar;

import java.util.regex.Pattern;

/**
 * This defines a keyword or token, and what to replace it with.
 */
public class Replacement {

	public final String replaceWith;
	public final Pattern regex;

	public Replacement(String replaceWith, Pattern regex) {
		this.replaceWith = replaceWith;
		this.regex = regex;
	}

	public Replacement(String replaceWith, String regex) {
		this(replaceWith, Pattern.compile(regex));
	}

}
