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

import java.util.ArrayList;
import java.util.List;

/**
 * This defines the replacements used. Replacements added are executed in add order.
 */
public class Grammar {

	public final List<Replacement> fromGrammar = new ArrayList<>();
	public final List<Replacement> toGrammar = new ArrayList<>();

	public Grammar() {

	}

	public Grammar add(Replacement to, Replacement from) {
		fromGrammar.add(from);
		toGrammar.add(to);

		return this;
	}

	public Grammar addJavaKeyword(String toReplace, String replacement) {
		return add(new Replacement(replacement, JavaKeywords.javaKeyword(toReplace)),
				new Replacement(toReplace, JavaKeywords.javaKeyword(replacement)));
	}

}
