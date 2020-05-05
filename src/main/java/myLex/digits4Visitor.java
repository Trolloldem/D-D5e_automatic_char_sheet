// Generated from digits4.g4 by ANTLR 4.8

	package myLex;


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
	 * Visit a parse tree produced by {@link digits4Parser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece(digits4Parser.PieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#pieceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceValue(digits4Parser.PieceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#consumableVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsumableVector(digits4Parser.ConsumableVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#consumableVectorElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsumableVectorElem(digits4Parser.ConsumableVectorElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(digits4Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#classVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVector(digits4Parser.ClassVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#classVectorElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVectorElem(digits4Parser.ClassVectorElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#abilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbilities(digits4Parser.AbilitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#skills}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkills(digits4Parser.SkillsContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#languages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguages(digits4Parser.LanguagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#mandatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatory(digits4Parser.MandatoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#statID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatID(digits4Parser.StatIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#pgDefition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgDefition(digits4Parser.PgDefitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#equipDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquipDefinition(digits4Parser.EquipDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#equipPiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquipPiece(digits4Parser.EquipPieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(digits4Parser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#importData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportData(digits4Parser.ImportDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(digits4Parser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(digits4Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link digits4Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(digits4Parser.StartContext ctx);
}