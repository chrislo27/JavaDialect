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
public class JavaPatterns {

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

	public static final Pattern LAMBDA = javaKeyword("->");

	public static final Pattern INCREMENT = javaKeyword("++");
	public static final Pattern DECREMENT = javaKeyword("--");

	public static final Pattern ADD = javaKeyword("+");
	public static final Pattern SUBTRACT = javaKeyword("-");
	public static final Pattern MULTIPLY = javaKeyword("*");
	public static final Pattern DIVIDE = javaKeyword("/");
	public static final Pattern MODULO = javaKeyword("%");

	public static final Pattern SHIFT_LEFT = javaKeyword("<<");
	public static final Pattern SHIFT_RIGHT = javaKeyword(">>");
	public static final Pattern SHIFT_RIGHT_UNSIGNED = javaKeyword(">>>");

	public static final Pattern EQUALITY = javaKeyword("==");
	public static final Pattern INEQUALITY = javaKeyword("!=");

	public static final Pattern ASSIGNMENT = javaKeyword("=");

	public static final Pattern ABSTRACT = javaKeyword("abstract");
	public static final Pattern ASSERT = javaKeyword("assert");
	public static final Pattern BOOLEAN = javaKeyword("boolean");
	public static final Pattern BREAK = javaKeyword("break");
	public static final Pattern BYTE = javaKeyword("byte");
	public static final Pattern CASE = javaKeyword("case");
	public static final Pattern CATCH = javaKeyword("catch");
	public static final Pattern CHAR = javaKeyword("char");
	public static final Pattern CLASS = javaKeyword("class");
	public static final Pattern CONST = javaKeyword("const");
	public static final Pattern CONTINUE = javaKeyword("continue");
	public static final Pattern DEFAULT = javaKeyword("default");
	public static final Pattern DO = javaKeyword("do");
	public static final Pattern DOUBLE = javaKeyword("double");
	public static final Pattern ELSE = javaKeyword("else");
	public static final Pattern ENUM = javaKeyword("enum");
	public static final Pattern EXTENDS = javaKeyword("extends");
	public static final Pattern FINAL = javaKeyword("final");
	public static final Pattern FINALLY = javaKeyword("finally");
	public static final Pattern FLOAT = javaKeyword("float");
	public static final Pattern FOR = javaKeyword("for");
	public static final Pattern GOTO = javaKeyword("goto");
	public static final Pattern IF = javaKeyword("if");
	public static final Pattern IMPLEMENTS = javaKeyword("implements");
	public static final Pattern IMPORT = javaKeyword("import");
	public static final Pattern INSTANCEOF = javaKeyword("instanceof");
	public static final Pattern INT = javaKeyword("int");
	public static final Pattern INTERFACE = javaKeyword("interface");
	public static final Pattern LONG = javaKeyword("long");
	public static final Pattern NATIVE = javaKeyword("native");
	public static final Pattern NEW = javaKeyword("new");
	public static final Pattern PACKAGE = javaKeyword("package");
	public static final Pattern PRIVATE = javaKeyword("private");
	public static final Pattern PROTECTED = javaKeyword("protected");
	public static final Pattern PUBLIC = javaKeyword("public");
	public static final Pattern RETURN = javaKeyword("return");
	public static final Pattern SHORT = javaKeyword("short");
	public static final Pattern STATIC = javaKeyword("static");
	public static final Pattern STRICTFP = javaKeyword("strictfp");
	public static final Pattern SUPER = javaKeyword("super");
	public static final Pattern SWITCH = javaKeyword("switch");
	public static final Pattern SYNCHRONIZED = javaKeyword("synchronized");
	public static final Pattern THIS = javaKeyword("this");
	public static final Pattern THROW = javaKeyword("throw");
	public static final Pattern THROWS = javaKeyword("throws");
	public static final Pattern TRANSIENT = javaKeyword("transient");
	public static final Pattern TRY = javaKeyword("try");
	public static final Pattern VOID = javaKeyword("void");
	public static final Pattern VOLATILE = javaKeyword("volatile");
	public static final Pattern WHILE = javaKeyword("while");

	public static Pattern javaKeyword(String keyword) {
		return Pattern.compile("\\b" + keyword + "\\b");
	}

}
