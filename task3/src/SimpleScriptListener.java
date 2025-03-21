// Generated from SimpleScript.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleScriptParser}.
 */
public interface SimpleScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SimpleScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SimpleScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(SimpleScriptParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(SimpleScriptParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#printCmd}.
	 * @param ctx the parse tree
	 */
	void enterPrintCmd(SimpleScriptParser.PrintCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#printCmd}.
	 * @param ctx the parse tree
	 */
	void exitPrintCmd(SimpleScriptParser.PrintCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#addCmd}.
	 * @param ctx the parse tree
	 */
	void enterAddCmd(SimpleScriptParser.AddCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#addCmd}.
	 * @param ctx the parse tree
	 */
	void exitAddCmd(SimpleScriptParser.AddCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#substractCmd}.
	 * @param ctx the parse tree
	 */
	void enterSubstractCmd(SimpleScriptParser.SubstractCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#substractCmd}.
	 * @param ctx the parse tree
	 */
	void exitSubstractCmd(SimpleScriptParser.SubstractCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleScriptParser#exitCmd}.
	 * @param ctx the parse tree
	 */
	void enterExitCmd(SimpleScriptParser.ExitCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleScriptParser#exitCmd}.
	 * @param ctx the parse tree
	 */
	void exitExitCmd(SimpleScriptParser.ExitCmdContext ctx);
}