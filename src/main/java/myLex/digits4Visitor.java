// Generated from /home/oldem/Desktop/ANTLR/GrammarFile/digits4.g4 by ANTLR 4.1

	package myLex;
	//import util.checkStats;
        //import util.classChecker; //util è il nome del mio package, chiamalo come vuoi te


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link digits4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface digits4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link digits4Parser#statID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatID(@NotNull digits4Parser.StatIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#languages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguages(@NotNull digits4Parser.LanguagesContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#sclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSclass(@NotNull digits4Parser.SclassContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull digits4Parser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#mandatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatory(@NotNull digits4Parser.MandatoryContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#abilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbilities(@NotNull digits4Parser.AbilitiesContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#skills}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkills(@NotNull digits4Parser.SkillsContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#pgBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgBody(@NotNull digits4Parser.PgBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#classVectorElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVectorElem(@NotNull digits4Parser.ClassVectorElemContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#stats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStats(@NotNull digits4Parser.StatsContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#classVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVector(@NotNull digits4Parser.ClassVectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#pg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPg(@NotNull digits4Parser.PgContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull digits4Parser.PropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull digits4Parser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link digits4Parser#stat_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_line(@NotNull digits4Parser.Stat_lineContext ctx);
}