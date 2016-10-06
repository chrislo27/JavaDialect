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

package chrislo27.javadialect.grammar.example;

import chrislo27.javadialect.grammar.Grammar;
import chrislo27.javadialect.grammar.JavaKeywords;

public class VerboseJava extends Grammar {

	public VerboseJava() {
		addJavaKeyword(JavaKeywords.LAMBDA, "lambda");

		addJavaKeyword(JavaKeywords.INCREMENT, "increase");
		addJavaKeyword(JavaKeywords.DECREMENT, "decrease");

		addJavaKeyword(JavaKeywords.ADD, "plus");
		addJavaKeyword(JavaKeywords.SUBTRACT, "minus");
		addJavaKeyword(JavaKeywords.MULTIPLY, "times");
		addJavaKeyword(JavaKeywords.DIVIDE, "dividedby");
		addJavaKeyword(JavaKeywords.MODULO, "remainderof");

		addJavaKeyword(JavaKeywords.SHIFT_LEFT, "shiftleft");
		addJavaKeyword(JavaKeywords.SHIFT_RIGHT, "shiftright");
		addJavaKeyword(JavaKeywords.SHIFT_RIGHT_UNSIGNED, "shiftrightunsigned");

		addJavaKeyword(JavaKeywords.EQUALITY, "equals");
		addJavaKeyword(JavaKeywords.INEQUALITY, "notequals");

		addJavaKeyword(JavaKeywords.ASSIGNMENT, "is");

		addJavaKeyword(JavaKeywords.ABSTRACT, "mustinherit");
		addJavaKeyword(JavaKeywords.ASSERT, "areyousurethat");
		addJavaKeyword(JavaKeywords.BOOLEAN, "yesno");
		addJavaKeyword(JavaKeywords.BREAK, "exitloop");
		addJavaKeyword(JavaKeywords.BYTE, "eightbitnumber");
		addJavaKeyword(JavaKeywords.CASE, "incaseof");
		addJavaKeyword(JavaKeywords.CATCH, "capture");
		addJavaKeyword(JavaKeywords.CHAR, "sixteenbitcharacter");
		addJavaKeyword(JavaKeywords.CLASS, "container");
//		addJavaKeyword(JavaKeywords.CONST, "");
		addJavaKeyword(JavaKeywords.CONTINUE, "tryagain");
		addJavaKeyword(JavaKeywords.DEFAULT, "ifnothingmatches");
		addJavaKeyword(JavaKeywords.DO, "dothis");
		addJavaKeyword(JavaKeywords.DOUBLE, "sixtyfourbitfloatingpointnumber");
		addJavaKeyword(JavaKeywords.ELSE, "otherwise");
		addJavaKeyword(JavaKeywords.ENUM, "enumerator");
		addJavaKeyword(JavaKeywords.EXTENDS, "branchesfrom");
		addJavaKeyword(JavaKeywords.FALSE, "no");
		addJavaKeyword(JavaKeywords.FINAL, "4ever");
		addJavaKeyword(JavaKeywords.FINALLY, "atlast");
		addJavaKeyword(JavaKeywords.FLOAT, "thirtytwobitfloatingpointnumber");
		addJavaKeyword(JavaKeywords.FOR, "forthisthat");
//		addJavaKeyword(JavaKeywords.GOTO, "");
		addJavaKeyword(JavaKeywords.IF, "whatif");
		addJavaKeyword(JavaKeywords.IMPLEMENTS, "connectedto");
		addJavaKeyword(JavaKeywords.IMPORT, "shipin");
		addJavaKeyword(JavaKeywords.INSTANCEOF, "isaninstanceofthisclassthatis");
		addJavaKeyword(JavaKeywords.INT, "thirtytwobitinteger");
		addJavaKeyword(JavaKeywords.INTERFACE, "extension");
		addJavaKeyword(JavaKeywords.LONG, "sixtyfourbitinteger");
		addJavaKeyword(JavaKeywords.NATIVE, "nativecode");
		addJavaKeyword(JavaKeywords.NEW, "create");
		addJavaKeyword(JavaKeywords.NULL, "nothing");
		addJavaKeyword(JavaKeywords.PACKAGE, "packagedin");
		addJavaKeyword(JavaKeywords.PRIVATE, "privatized");
		addJavaKeyword(JavaKeywords.PROTECTED, "packagesonly");
		addJavaKeyword(JavaKeywords.PUBLIC, "everyonecansee");
		addJavaKeyword(JavaKeywords.RETURN, "herehavethis");
		addJavaKeyword(JavaKeywords.SHORT, "sixteenbitinteger");
		addJavaKeyword(JavaKeywords.STATIC, "omnipresent");
		addJavaKeyword(JavaKeywords.STRICTFP, "strictfloatingpoint");
		addJavaKeyword(JavaKeywords.SUPER, "parents");
		addJavaKeyword(JavaKeywords.SWITCH, "when");
		addJavaKeyword(JavaKeywords.SYNCHRONIZED, "togethernow");
		addJavaKeyword(JavaKeywords.THIS, "thisone");
		addJavaKeyword(JavaKeywords.THROW, "toss");
		addJavaKeyword(JavaKeywords.THROWS, "cantoss");
		addJavaKeyword(JavaKeywords.TRANSIENT, "excludefromserialization");
		addJavaKeyword(JavaKeywords.TRUE, "yes");
		addJavaKeyword(JavaKeywords.TRY, "attempt");
		addJavaKeyword(JavaKeywords.VOID, "returnsnothing");
		addJavaKeyword(JavaKeywords.VOLATILE, "explosive");
		addJavaKeyword(JavaKeywords.WHILE, "whilethisistrue");
	}
}
