// Generated from /Users/sabac/MyPrograms/source/Kotlin/IoTGener/IoTGener/src/main/kotlin/sabaniki/sfc/keio/ac/jp/Grammar/Parser.g4 by ANTLR 4.9
package sabaniki.sfc.keio.ac.jp.Grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(Parser.ClassContext ctx);
}