// Generated from E:/IdeaProjects/yuntai/antlr-learning/src/main/java/com/zmj/antlr/Demo.g4 by ANTLR 4.13.1
package com.zmj.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DemoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DemoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(DemoParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(DemoParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(DemoParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(DemoParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DemoParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DemoParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(DemoParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(DemoParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#onClause}.
	 * @param ctx the parse tree
	 */
	void enterOnClause(DemoParser.OnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#onClause}.
	 * @param ctx the parse tree
	 */
	void exitOnClause(DemoParser.OnClauseContext ctx);
}