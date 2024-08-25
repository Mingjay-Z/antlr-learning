// Generated from E:/IdeaProjects/yuntai/antlr-learning/src/main/java/com/zmj/antlr/Demo.g4 by ANTLR 4.13.1
package com.zmj.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DemoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(DemoParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(DemoParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DemoParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(DemoParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#onClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClause(DemoParser.OnClauseContext ctx);
}