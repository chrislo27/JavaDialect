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

package chrislo27.javadialect;

import chrislo27.javadialect.grammar.Grammar;
import chrislo27.javadialect.grammar.Replacement;

import java.util.List;

public class Translator {

	public final Grammar grammar;

	public Translator(Grammar grammar) {
		this.grammar = grammar;
	}

	/**
	 * Translates from source to the new grammar.
	 *
	 * @param code
	 * @return The translated source
	 */
	public String translateToGrammar(String code) {
		return translate(code, grammar.toGrammar);
	}

	/**
	 * Translates from the grammar back to original source.
	 *
	 * @param code
	 * @return The translated source
	 */
	public String translateFromGrammar(String code) {
		return translate(code, grammar.fromGrammar);
	}

	private String translate(String code, List<Replacement> replacements) {
		String newCode = code;

		for (Replacement r : replacements) {
			newCode = r.regex.matcher(newCode).replaceAll(r.replaceWith);
		}

		return newCode;
	}

}
