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
 * This defines functions for making Patterns for certain Java keywords. It also has default constants.
 */
public class JavaKeywords {

	/*
	 *
	 abstract	continue	for			new			switch
	 assert		default		goto		package		synchronized
	 boolean	do			if			private		this
	 break		double		implements	protected	throw
	 byte		else		import		public		throws
	 case		enum		instanceof	return		transient
	 catch		extends		int			short		try
	 char		final		interface	static		void
	 class		finally		long		strictfp	volatile
	 const		float		native		super		while
	 */

	public static final String LAMBDA = "->";

	public static final String INCREMENT = "++";
	public static final String DECREMENT = "--";

	public static final String ADD = "+";
	public static final String SUBTRACT = "-";
	public static final String MULTIPLY = "*";
	public static final String DIVIDE = "/";
	public static final String MODULO = "%";

	public static final String SHIFT_LEFT = "<<";
	public static final String SHIFT_RIGHT = ">>";
	public static final String SHIFT_RIGHT_UNSIGNED = ">>>";

	public static final String EQUALITY = "==";
	public static final String INEQUALITY = "!=";

	public static final String ASSIGNMENT = "=";

	public static final String ABSTRACT = "abstract";
	public static final String ASSERT = "assert";
	public static final String BOOLEAN = "boolean";
	public static final String BREAK = "break";
	public static final String BYTE = "byte";
	public static final String CASE = "case";
	public static final String CATCH = "catch";
	public static final String CHAR = "char";
	public static final String CLASS = "class";
	public static final String CONST = "const";
	public static final String CONTINUE = "continue";
	public static final String DEFAULT = "default";
	public static final String DO = "do";
	public static final String DOUBLE = "double";
	public static final String ELSE = "else";
	public static final String ENUM = "enum";
	public static final String EXTENDS = "extends";
	public static final String FINAL = "final";
	public static final String FINALLY = "finally";
	public static final String FLOAT = "float";
	public static final String FOR = "for";
	public static final String GOTO = "goto";
	public static final String IF = "if";
	public static final String IMPLEMENTS = "implements";
	public static final String IMPORT = "import";
	public static final String INSTANCEOF = "instanceof";
	public static final String INT = "int";
	public static final String INTERFACE = "interface";
	public static final String LONG = "long";
	public static final String NATIVE = "native";
	public static final String NEW = "new";
	public static final String PACKAGE = "package";
	public static final String PRIVATE = "private";
	public static final String PROTECTED = "protected";
	public static final String PUBLIC = "public";
	public static final String RETURN = "return";
	public static final String SHORT = "short";
	public static final String STATIC = "static";
	public static final String STRICTFP = "strictfp";
	public static final String SUPER = "super";
	public static final String SWITCH = "switch";
	public static final String SYNCHRONIZED = "synchronized";
	public static final String THIS = "this";
	public static final String THROW = "throw";
	public static final String THROWS = "throws";
	public static final String TRANSIENT = "transient";
	public static final String TRY = "try";
	public static final String VOID = "void";
	public static final String VOLATILE = "volatile";
	public static final String WHILE = "while";

	public static Pattern javaKeyword(String keyword) {
		return Pattern.compile("\\b" + keyword + "\\b");
	}

}
