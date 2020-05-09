// Generated from C:/Users/gianl/IdeaProjects/d_and_d_auto\ddmLang.g4 by ANTLR 4.8

	package myLex;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ddmLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ddmLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#optionalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalValue(ddmLangParser.OptionalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#toSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSet(ddmLangParser.ToSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(ddmLangParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece(ddmLangParser.PieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#pieceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceValue(ddmLangParser.PieceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#consumableVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsumableVector(ddmLangParser.ConsumableVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#consumableVectorElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsumableVectorElem(ddmLangParser.ConsumableVectorElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ddmLangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#classVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVector(ddmLangParser.ClassVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#classVectorElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVectorElem(ddmLangParser.ClassVectorElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#abilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbilities(ddmLangParser.AbilitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#skills}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkills(ddmLangParser.SkillsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#languages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguages(ddmLangParser.LanguagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#mandatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatory(ddmLangParser.MandatoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#statID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatID(ddmLangParser.StatIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#pgDefition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgDefition(ddmLangParser.PgDefitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#equipDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquipDefinition(ddmLangParser.EquipDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#equipPiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquipPiece(ddmLangParser.EquipPieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ddmLangParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#importData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportData(ddmLangParser.ImportDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(ddmLangParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetting(ddmLangParser.SettingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ddmLangParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ddmLangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ddmLangParser.StartContext ctx);
}