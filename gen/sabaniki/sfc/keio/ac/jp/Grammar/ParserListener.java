// Generated from /Users/sabac/MyPrograms/source/Kotlin/IoTGener/IoTGener/src/main/kotlin/sabaniki/sfc/keio/ac/jp/Grammar/Parser.g4 by ANTLR 4.9
package sabaniki.sfc.keio.ac.jp.Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(Parser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(Parser.ClassContext ctx);
}