// Generated from C:/Users/gianl/IdeaProjects/d_and_d_auto\ddmLang.g4 by ANTLR 4.8

	package myLex;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ddmLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BLANKSPACE=11, WS=12, COMMENT=13, LINE_COMMENT=14, DIGIT=15, 
		STR=16, DEX=17, CHA=18, INT=19, CON=20, WIS=21, STARTENTITY=22, ENDENTITY=23, 
		CREATE=24, PLAYER=25, EQUIPMENT=26, IMPORT=27, FROM=28, COLON=29, BL=30, 
		RACE=31, HP=32, ARCHTYPE=33, ABILITY=34, ALIGN=35, SKILLSID=36, LANG=37, 
		ARMOR=38, WEAPON=39, SHIELD=40, CONSUMABLES=41, ARMORTYPE=42, WEAPONTYPE=43, 
		SHIELDPRESENCE=44, NONE=45, CONSUMABLE=46, ALIGNMENT=47, PGCLASS=48, SUBCLASS=49, 
		SKILL=50, LANGUAGE=51, RACES=52, OPTIONAL=53, LETTER=54;
	public static final int
		RULE_optionalValue = 0, RULE_toSet = 1, RULE_description = 2, RULE_piece = 3, 
		RULE_pieceValue = 4, RULE_consumableVector = 5, RULE_consumableVectorElem = 6, 
		RULE_value = 7, RULE_classVector = 8, RULE_classVectorElem = 9, RULE_abilities = 10, 
		RULE_skills = 11, RULE_languages = 12, RULE_mandatory = 13, RULE_statID = 14, 
		RULE_pgDefition = 15, RULE_equipDefinition = 16, RULE_equipPiece = 17, 
		RULE_property = 18, RULE_importData = 19, RULE_entity = 20, RULE_setting = 21, 
		RULE_line = 22, RULE_start = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"optionalValue", "toSet", "description", "piece", "pieceValue", "consumableVector", 
			"consumableVectorElem", "value", "classVector", "classVectorElem", "abilities", 
			"skills", "languages", "mandatory", "statID", "pgDefition", "equipDefinition", 
			"equipPiece", "property", "importData", "entity", "setting", "line", 
			"start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'('", "')'", "'*'", "','", "'->'", "'set'", "'of'", "'for'", 
			"'='", "' '", null, null, null, null, null, null, null, null, null, null, 
			"'{'", "'}'", "'create'", "'Player'", "'Equipment'", "'import'", "'from'", 
			"':'", null, null, null, null, null, null, null, null, "'armor'", "'weapon'", 
			"'shield'", "'consumables'", null, null, null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "BLANKSPACE", 
			"WS", "COMMENT", "LINE_COMMENT", "DIGIT", "STR", "DEX", "CHA", "INT", 
			"CON", "WIS", "STARTENTITY", "ENDENTITY", "CREATE", "PLAYER", "EQUIPMENT", 
			"IMPORT", "FROM", "COLON", "BL", "RACE", "HP", "ARCHTYPE", "ABILITY", 
			"ALIGN", "SKILLSID", "LANG", "ARMOR", "WEAPON", "SHIELD", "CONSUMABLES", 
			"ARMORTYPE", "WEAPONTYPE", "SHIELDPRESENCE", "NONE", "CONSUMABLE", "ALIGNMENT", 
			"PGCLASS", "SUBCLASS", "SKILL", "LANGUAGE", "RACES", "OPTIONAL", "LETTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ddmLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ddmLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OptionalValueContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(ddmLangParser.DIGIT, 0); }
		public OptionalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitOptionalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalValueContext optionalValue() throws RecognitionException {
		OptionalValueContext _localctx = new OptionalValueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_optionalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(48);
				description();
				}
				break;
			case DIGIT:
				{
				setState(49);
				match(DIGIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToSetContext extends ParserRuleContext {
		public TerminalNode PGCLASS() { return getToken(ddmLangParser.PGCLASS, 0); }
		public ToSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitToSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToSetContext toSet() throws RecognitionException {
		ToSetContext _localctx = new ToSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_toSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			match(PGCLASS);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(ddmLangParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(ddmLangParser.LETTER, i);
		}
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==BLANKSPACE || _la==LETTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BLANKSPACE || _la==LETTER );
			setState(60);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieceContext extends ParserRuleContext {
		public TerminalNode ARMOR() { return getToken(ddmLangParser.ARMOR, 0); }
		public TerminalNode WEAPON() { return getToken(ddmLangParser.WEAPON, 0); }
		public TerminalNode SHIELD() { return getToken(ddmLangParser.SHIELD, 0); }
		public TerminalNode CONSUMABLES() { return getToken(ddmLangParser.CONSUMABLES, 0); }
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARMOR) | (1L << WEAPON) | (1L << SHIELD) | (1L << CONSUMABLES))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieceValueContext extends ParserRuleContext {
		public TerminalNode ARMORTYPE() { return getToken(ddmLangParser.ARMORTYPE, 0); }
		public TerminalNode WEAPONTYPE() { return getToken(ddmLangParser.WEAPONTYPE, 0); }
		public TerminalNode SHIELDPRESENCE() { return getToken(ddmLangParser.SHIELDPRESENCE, 0); }
		public ConsumableVectorContext consumableVector() {
			return getRuleContext(ConsumableVectorContext.class,0);
		}
		public PieceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitPieceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceValueContext pieceValue() throws RecognitionException {
		PieceValueContext _localctx = new PieceValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pieceValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARMORTYPE:
				{
				setState(64);
				match(ARMORTYPE);
				}
				break;
			case WEAPONTYPE:
				{
				setState(65);
				match(WEAPONTYPE);
				}
				break;
			case SHIELDPRESENCE:
				{
				setState(66);
				match(SHIELDPRESENCE);
				}
				break;
			case T__1:
			case NONE:
				{
				setState(67);
				consumableVector();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsumableVectorContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(ddmLangParser.NONE, 0); }
		public ConsumableVectorElemContext consumableVectorElem() {
			return getRuleContext(ConsumableVectorElemContext.class,0);
		}
		public ConsumableVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consumableVector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitConsumableVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsumableVectorContext consumableVector() throws RecognitionException {
		ConsumableVectorContext _localctx = new ConsumableVectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_consumableVector);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(NONE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(71);
				match(T__1);
				setState(72);
				consumableVectorElem();
				setState(73);
				match(T__2);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsumableVectorElemContext extends ParserRuleContext {
		public TerminalNode CONSUMABLE() { return getToken(ddmLangParser.CONSUMABLE, 0); }
		public TerminalNode DIGIT() { return getToken(ddmLangParser.DIGIT, 0); }
		public ConsumableVectorElemContext consumableVectorElem() {
			return getRuleContext(ConsumableVectorElemContext.class,0);
		}
		public ConsumableVectorElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consumableVectorElem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitConsumableVectorElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsumableVectorElemContext consumableVectorElem() throws RecognitionException {
		ConsumableVectorElemContext _localctx = new ConsumableVectorElemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_consumableVectorElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77);
				match(CONSUMABLE);
				setState(78);
				match(T__3);
				setState(79);
				match(DIGIT);
				setState(80);
				match(T__4);
				setState(81);
				consumableVectorElem();
				}
				break;
			case 2:
				{
				setState(82);
				match(CONSUMABLE);
				setState(83);
				match(T__3);
				setState(84);
				match(DIGIT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode RACES() { return getToken(ddmLangParser.RACES, 0); }
		public TerminalNode DIGIT() { return getToken(ddmLangParser.DIGIT, 0); }
		public ClassVectorContext classVector() {
			return getRuleContext(ClassVectorContext.class,0);
		}
		public AbilitiesContext abilities() {
			return getRuleContext(AbilitiesContext.class,0);
		}
		public TerminalNode ALIGNMENT() { return getToken(ddmLangParser.ALIGNMENT, 0); }
		public SkillsContext skills() {
			return getRuleContext(SkillsContext.class,0);
		}
		public LanguagesContext languages() {
			return getRuleContext(LanguagesContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				match(RACES);
				}
				break;
			case 2:
				{
				setState(88);
				match(DIGIT);
				}
				break;
			case 3:
				{
				setState(89);
				classVector();
				}
				break;
			case 4:
				{
				setState(90);
				abilities();
				}
				break;
			case 5:
				{
				setState(91);
				match(ALIGNMENT);
				}
				break;
			case 6:
				{
				setState(92);
				skills();
				}
				break;
			case 7:
				{
				setState(93);
				languages();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassVectorContext extends ParserRuleContext {
		public ClassVectorElemContext classVectorElem() {
			return getRuleContext(ClassVectorElemContext.class,0);
		}
		public ClassVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitClassVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVectorContext classVector() throws RecognitionException {
		ClassVectorContext _localctx = new ClassVectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			match(T__1);
			setState(97);
			classVectorElem();
			setState(98);
			match(T__2);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassVectorElemContext extends ParserRuleContext {
		public TerminalNode PGCLASS() { return getToken(ddmLangParser.PGCLASS, 0); }
		public ClassVectorElemContext classVectorElem() {
			return getRuleContext(ClassVectorElemContext.class,0);
		}
		public TerminalNode SUBCLASS() { return getToken(ddmLangParser.SUBCLASS, 0); }
		public ClassVectorElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVectorElem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitClassVectorElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVectorElemContext classVectorElem() throws RecognitionException {
		ClassVectorElemContext _localctx = new ClassVectorElemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classVectorElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(100);
				match(PGCLASS);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(101);
					match(T__5);
					setState(102);
					match(SUBCLASS);
					}
				}

				setState(105);
				match(T__4);
				setState(106);
				classVectorElem();
				}
				break;
			case 2:
				{
				setState(107);
				match(PGCLASS);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(108);
					match(T__5);
					setState(109);
					match(SUBCLASS);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbilitiesContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ddmLangParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ddmLangParser.DIGIT, i);
		}
		public AbilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abilities; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitAbilities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbilitiesContext abilities() throws RecognitionException {
		AbilitiesContext _localctx = new AbilitiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_abilities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__1);
			setState(115);
			match(DIGIT);
			setState(116);
			match(T__4);
			setState(117);
			match(DIGIT);
			setState(118);
			match(T__4);
			setState(119);
			match(DIGIT);
			setState(120);
			match(T__4);
			setState(121);
			match(DIGIT);
			setState(122);
			match(T__4);
			setState(123);
			match(DIGIT);
			setState(124);
			match(T__4);
			setState(125);
			match(DIGIT);
			setState(126);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkillsContext extends ParserRuleContext {
		public List<TerminalNode> SKILL() { return getTokens(ddmLangParser.SKILL); }
		public TerminalNode SKILL(int i) {
			return getToken(ddmLangParser.SKILL, i);
		}
		public SkillsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skills; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitSkills(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillsContext skills() throws RecognitionException {
		SkillsContext _localctx = new SkillsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_skills);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__1);
			setState(129);
			match(SKILL);
			setState(130);
			match(T__4);
			setState(131);
			match(SKILL);
			setState(132);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguagesContext extends ParserRuleContext {
		public List<TerminalNode> LANGUAGE() { return getTokens(ddmLangParser.LANGUAGE); }
		public TerminalNode LANGUAGE(int i) {
			return getToken(ddmLangParser.LANGUAGE, i);
		}
		public LanguagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languages; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitLanguages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguagesContext languages() throws RecognitionException {
		LanguagesContext _localctx = new LanguagesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_languages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__1);
			setState(135);
			match(LANGUAGE);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(136);
				match(T__4);
				setState(137);
				match(LANGUAGE);
				}
			}

			setState(140);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MandatoryContext extends ParserRuleContext {
		public TerminalNode RACE() { return getToken(ddmLangParser.RACE, 0); }
		public TerminalNode HP() { return getToken(ddmLangParser.HP, 0); }
		public TerminalNode ARCHTYPE() { return getToken(ddmLangParser.ARCHTYPE, 0); }
		public TerminalNode ABILITY() { return getToken(ddmLangParser.ABILITY, 0); }
		public TerminalNode ALIGN() { return getToken(ddmLangParser.ALIGN, 0); }
		public TerminalNode SKILLSID() { return getToken(ddmLangParser.SKILLSID, 0); }
		public TerminalNode LANG() { return getToken(ddmLangParser.LANG, 0); }
		public StatIDContext statID() {
			return getRuleContext(StatIDContext.class,0);
		}
		public MandatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatory; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitMandatory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MandatoryContext mandatory() throws RecognitionException {
		MandatoryContext _localctx = new MandatoryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mandatory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACE:
				{
				setState(142);
				match(RACE);
				}
				break;
			case HP:
				{
				setState(143);
				match(HP);
				}
				break;
			case ARCHTYPE:
				{
				setState(144);
				match(ARCHTYPE);
				}
				break;
			case ABILITY:
				{
				setState(145);
				match(ABILITY);
				}
				break;
			case ALIGN:
				{
				setState(146);
				match(ALIGN);
				}
				break;
			case SKILLSID:
				{
				setState(147);
				match(SKILLSID);
				}
				break;
			case LANG:
				{
				setState(148);
				match(LANG);
				}
				break;
			case STR:
			case DEX:
			case CHA:
			case INT:
			case CON:
			case WIS:
				{
				setState(149);
				statID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatIDContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(ddmLangParser.STR, 0); }
		public TerminalNode DEX() { return getToken(ddmLangParser.DEX, 0); }
		public TerminalNode INT() { return getToken(ddmLangParser.INT, 0); }
		public TerminalNode CHA() { return getToken(ddmLangParser.CHA, 0); }
		public TerminalNode CON() { return getToken(ddmLangParser.CON, 0); }
		public TerminalNode WIS() { return getToken(ddmLangParser.WIS, 0); }
		public StatIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitStatID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatIDContext statID() throws RecognitionException {
		StatIDContext _localctx = new StatIDContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << DEX) | (1L << CHA) | (1L << INT) | (1L << CON) | (1L << WIS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PgDefitionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ddmLangParser.CREATE, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public TerminalNode PLAYER() { return getToken(ddmLangParser.PLAYER, 0); }
		public TerminalNode LETTER() { return getToken(ddmLangParser.LETTER, 0); }
		public TerminalNode STARTENTITY() { return getToken(ddmLangParser.STARTENTITY, 0); }
		public List<TerminalNode> BL() { return getTokens(ddmLangParser.BL); }
		public TerminalNode BL(int i) {
			return getToken(ddmLangParser.BL, i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode ENDENTITY() { return getToken(ddmLangParser.ENDENTITY, 0); }
		public PgDefitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgDefition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitPgDefition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PgDefitionContext pgDefition() throws RecognitionException {
		PgDefitionContext _localctx = new PgDefitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pgDefition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CREATE);
			setState(155);
			match(BLANKSPACE);
			setState(156);
			match(PLAYER);
			setState(157);
			match(BLANKSPACE);
			setState(158);
			match(LETTER);
			setState(159);
			match(STARTENTITY);
			setState(160);
			match(BL);
			setState(161);
			property();
			setState(162);
			match(BL);
			setState(163);
			property();
			setState(164);
			match(BL);
			setState(165);
			property();
			setState(166);
			match(BL);
			setState(167);
			property();
			setState(168);
			match(BL);
			setState(169);
			property();
			setState(170);
			match(BL);
			setState(171);
			property();
			setState(172);
			match(BL);
			setState(173);
			property();
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(174);
				match(BL);
				setState(175);
				property();
				setState(176);
				match(BL);
				setState(177);
				property();
				setState(178);
				match(BL);
				setState(179);
				property();
				setState(180);
				match(BL);
				setState(181);
				property();
				setState(182);
				match(BL);
				setState(183);
				property();
				}
				break;
			}
			setState(187);
			match(BL);
			setState(188);
			match(ENDENTITY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquipDefinitionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ddmLangParser.CREATE, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public TerminalNode EQUIPMENT() { return getToken(ddmLangParser.EQUIPMENT, 0); }
		public TerminalNode LETTER() { return getToken(ddmLangParser.LETTER, 0); }
		public TerminalNode STARTENTITY() { return getToken(ddmLangParser.STARTENTITY, 0); }
		public List<TerminalNode> BL() { return getTokens(ddmLangParser.BL); }
		public TerminalNode BL(int i) {
			return getToken(ddmLangParser.BL, i);
		}
		public List<EquipPieceContext> equipPiece() {
			return getRuleContexts(EquipPieceContext.class);
		}
		public EquipPieceContext equipPiece(int i) {
			return getRuleContext(EquipPieceContext.class,i);
		}
		public TerminalNode ENDENTITY() { return getToken(ddmLangParser.ENDENTITY, 0); }
		public EquipDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitEquipDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquipDefinitionContext equipDefinition() throws RecognitionException {
		EquipDefinitionContext _localctx = new EquipDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equipDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CREATE);
			setState(191);
			match(BLANKSPACE);
			setState(192);
			match(EQUIPMENT);
			setState(193);
			match(BLANKSPACE);
			setState(194);
			match(LETTER);
			setState(195);
			match(STARTENTITY);
			setState(196);
			match(BL);
			setState(197);
			equipPiece();
			setState(198);
			match(BL);
			setState(199);
			equipPiece();
			setState(200);
			match(BL);
			setState(201);
			equipPiece();
			setState(202);
			match(BL);
			setState(203);
			equipPiece();
			setState(204);
			match(BL);
			setState(205);
			match(ENDENTITY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquipPieceContext extends ParserRuleContext {
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ddmLangParser.COLON, 0); }
		public PieceValueContext pieceValue() {
			return getRuleContext(PieceValueContext.class,0);
		}
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public EquipPieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipPiece; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitEquipPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquipPieceContext equipPiece() throws RecognitionException {
		EquipPieceContext _localctx = new EquipPieceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equipPiece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(207);
				match(BLANKSPACE);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			piece();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(214);
				match(BLANKSPACE);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(COLON);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(221);
				match(BLANKSPACE);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			pieceValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public MandatoryContext mandatory() {
			return getRuleContext(MandatoryContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ddmLangParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(229);
				match(BLANKSPACE);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			mandatory();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(236);
				match(BLANKSPACE);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(COLON);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(243);
				match(BLANKSPACE);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDataContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ddmLangParser.IMPORT, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(ddmLangParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(ddmLangParser.LETTER, i);
		}
		public TerminalNode FROM() { return getToken(ddmLangParser.FROM, 0); }
		public ImportDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importData; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitImportData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDataContext importData() throws RecognitionException {
		ImportDataContext _localctx = new ImportDataContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_importData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IMPORT);
			setState(252);
			match(BLANKSPACE);
			setState(253);
			match(LETTER);
			setState(254);
			match(BLANKSPACE);
			setState(255);
			match(FROM);
			setState(256);
			match(BLANKSPACE);
			setState(257);
			match(LETTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityContext extends ParserRuleContext {
		public PgDefitionContext pgDefition() {
			return getRuleContext(PgDefitionContext.class,0);
		}
		public EquipDefinitionContext equipDefinition() {
			return getRuleContext(EquipDefinitionContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(259);
				pgDefition();
				}
				break;
			case 2:
				{
				setState(260);
				equipDefinition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingContext extends ParserRuleContext {
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public TerminalNode OPTIONAL() { return getToken(ddmLangParser.OPTIONAL, 0); }
		public TerminalNode LETTER() { return getToken(ddmLangParser.LETTER, 0); }
		public OptionalValueContext optionalValue() {
			return getRuleContext(OptionalValueContext.class,0);
		}
		public ToSetContext toSet() {
			return getRuleContext(ToSetContext.class,0);
		}
		public SettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setting; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitSetting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingContext setting() throws RecognitionException {
		SettingContext _localctx = new SettingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__6);
			setState(264);
			match(BLANKSPACE);
			setState(265);
			match(OPTIONAL);
			setState(266);
			match(BLANKSPACE);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(267);
				match(T__7);
				setState(268);
				match(BLANKSPACE);
				setState(269);
				toSet();
				setState(270);
				match(BLANKSPACE);
				}
			}

			setState(274);
			match(T__8);
			setState(275);
			match(BLANKSPACE);
			setState(276);
			match(LETTER);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(277);
				match(BLANKSPACE);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(T__9);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(284);
				match(BLANKSPACE);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			optionalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode BL() { return getToken(ddmLangParser.BL, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public ImportDataContext importData() {
			return getRuleContext(ImportDataContext.class,0);
		}
		public SettingContext setting() {
			return getRuleContext(SettingContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_line);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case CREATE:
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(292);
					entity();
					}
					break;
				case IMPORT:
					{
					setState(293);
					importData();
					}
					break;
				case T__6:
					{
					setState(294);
					setting();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297);
				match(BL);
				}
				break;
			case BL:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(BL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ddmLangParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ddmLangVisitor ) return ((ddmLangVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(302);
				line();
				}
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << CREATE) | (1L << IMPORT) | (1L << BL))) != 0) );
			setState(307);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\3\3\3\3\4\3\4\6\4;\n\4\r\4\16\4<\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\5\13j\n\13\3\13\3\13\3\13\3\13\3\13\5\13q\n\13"+
		"\5\13s\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0099\n\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00bc\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\7\23\u00d3"+
		"\n\23\f\23\16\23\u00d6\13\23\3\23\3\23\7\23\u00da\n\23\f\23\16\23\u00dd"+
		"\13\23\3\23\3\23\7\23\u00e1\n\23\f\23\16\23\u00e4\13\23\3\23\3\23\3\24"+
		"\7\24\u00e9\n\24\f\24\16\24\u00ec\13\24\3\24\3\24\7\24\u00f0\n\24\f\24"+
		"\16\24\u00f3\13\24\3\24\3\24\7\24\u00f7\n\24\f\24\16\24\u00fa\13\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0108"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0113\n\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0119\n\27\f\27\16\27\u011c\13\27\3\27\3\27\7\27"+
		"\u0120\n\27\f\27\16\27\u0123\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u012a"+
		"\n\30\3\30\3\30\3\30\5\30\u012f\n\30\3\31\6\31\u0132\n\31\r\31\16\31\u0133"+
		"\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\2\5\4\2\r\r88\3\2(+\3\2\22\27\2\u0146\2\64\3\2\2\2\4\66\3\2\2\2\6"+
		"8\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\fM\3\2\2\2\16W\3\2\2\2\20`\3\2\2\2\22"+
		"b\3\2\2\2\24r\3\2\2\2\26t\3\2\2\2\30\u0082\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\u0098\3\2\2\2\36\u009a\3\2\2\2 \u009c\3\2\2\2\"\u00c0\3\2\2\2$\u00d4"+
		"\3\2\2\2&\u00ea\3\2\2\2(\u00fd\3\2\2\2*\u0107\3\2\2\2,\u0109\3\2\2\2."+
		"\u012e\3\2\2\2\60\u0131\3\2\2\2\62\65\5\6\4\2\63\65\7\21\2\2\64\62\3\2"+
		"\2\2\64\63\3\2\2\2\65\3\3\2\2\2\66\67\7\62\2\2\67\5\3\2\2\28:\7\3\2\2"+
		"9;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\3\2\2"+
		"?\7\3\2\2\2@A\t\3\2\2A\t\3\2\2\2BG\7,\2\2CG\7-\2\2DG\7.\2\2EG\5\f\7\2"+
		"FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\13\3\2\2\2HN\7/\2\2IJ\7\4\2"+
		"\2JK\5\16\b\2KL\7\5\2\2LN\3\2\2\2MH\3\2\2\2MI\3\2\2\2N\r\3\2\2\2OP\7\60"+
		"\2\2PQ\7\6\2\2QR\7\21\2\2RS\7\7\2\2SX\5\16\b\2TU\7\60\2\2UV\7\6\2\2VX"+
		"\7\21\2\2WO\3\2\2\2WT\3\2\2\2X\17\3\2\2\2Ya\7\66\2\2Za\7\21\2\2[a\5\22"+
		"\n\2\\a\5\26\f\2]a\7\61\2\2^a\5\30\r\2_a\5\32\16\2`Y\3\2\2\2`Z\3\2\2\2"+
		"`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\21\3\2\2\2bc\7\4"+
		"\2\2cd\5\24\13\2de\7\5\2\2e\23\3\2\2\2fi\7\62\2\2gh\7\b\2\2hj\7\63\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\7\2\2ls\5\24\13\2mp\7\62\2\2no\7\b"+
		"\2\2oq\7\63\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rf\3\2\2\2rm\3\2\2\2s\25"+
		"\3\2\2\2tu\7\4\2\2uv\7\21\2\2vw\7\7\2\2wx\7\21\2\2xy\7\7\2\2yz\7\21\2"+
		"\2z{\7\7\2\2{|\7\21\2\2|}\7\7\2\2}~\7\21\2\2~\177\7\7\2\2\177\u0080\7"+
		"\21\2\2\u0080\u0081\7\5\2\2\u0081\27\3\2\2\2\u0082\u0083\7\4\2\2\u0083"+
		"\u0084\7\64\2\2\u0084\u0085\7\7\2\2\u0085\u0086\7\64\2\2\u0086\u0087\7"+
		"\5\2\2\u0087\31\3\2\2\2\u0088\u0089\7\4\2\2\u0089\u008c\7\65\2\2\u008a"+
		"\u008b\7\7\2\2\u008b\u008d\7\65\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\5\2\2\u008f\33\3\2\2\2\u0090"+
		"\u0099\7!\2\2\u0091\u0099\7\"\2\2\u0092\u0099\7#\2\2\u0093\u0099\7$\2"+
		"\2\u0094\u0099\7%\2\2\u0095\u0099\7&\2\2\u0096\u0099\7\'\2\2\u0097\u0099"+
		"\5\36\20\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0092\3\2\2\2"+
		"\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0097\3\2\2\2\u0099\35\3\2\2\2\u009a\u009b\t\4\2\2\u009b"+
		"\37\3\2\2\2\u009c\u009d\7\32\2\2\u009d\u009e\7\r\2\2\u009e\u009f\7\33"+
		"\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\78\2\2\u00a1\u00a2\7\30\2\2\u00a2"+
		"\u00a3\7 \2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7 \2\2\u00a5\u00a6\5&\24"+
		"\2\u00a6\u00a7\7 \2\2\u00a7\u00a8\5&\24\2\u00a8\u00a9\7 \2\2\u00a9\u00aa"+
		"\5&\24\2\u00aa\u00ab\7 \2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7 \2\2\u00ad"+
		"\u00ae\5&\24\2\u00ae\u00af\7 \2\2\u00af\u00bb\5&\24\2\u00b0\u00b1\7 \2"+
		"\2\u00b1\u00b2\5&\24\2\u00b2\u00b3\7 \2\2\u00b3\u00b4\5&\24\2\u00b4\u00b5"+
		"\7 \2\2\u00b5\u00b6\5&\24\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\5&\24\2\u00b8"+
		"\u00b9\7 \2\2\u00b9\u00ba\5&\24\2\u00ba\u00bc\3\2\2\2\u00bb\u00b0\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7 \2\2\u00be"+
		"\u00bf\7\31\2\2\u00bf!\3\2\2\2\u00c0\u00c1\7\32\2\2\u00c1\u00c2\7\r\2"+
		"\2\u00c2\u00c3\7\34\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\78\2\2\u00c5\u00c6"+
		"\7\30\2\2\u00c6\u00c7\7 \2\2\u00c7\u00c8\5$\23\2\u00c8\u00c9\7 \2\2\u00c9"+
		"\u00ca\5$\23\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd\7 \2"+
		"\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\7 \2\2\u00cf\u00d0\7\31\2\2\u00d0#"+
		"\3\2\2\2\u00d1\u00d3\7\r\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00db\5\b\5\2\u00d8\u00da\7\r\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\7\37\2\2\u00df\u00e1\7\r\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\n\6\2\u00e6"+
		"%\3\2\2\2\u00e7\u00e9\7\r\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00f1\5\34\17\2\u00ee\u00f0\7\r\2\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\7\37\2\2\u00f5\u00f7\7\r\2\2"+
		"\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5\20\t\2"+
		"\u00fc\'\3\2\2\2\u00fd\u00fe\7\35\2\2\u00fe\u00ff\7\r\2\2\u00ff\u0100"+
		"\78\2\2\u0100\u0101\7\r\2\2\u0101\u0102\7\36\2\2\u0102\u0103\7\r\2\2\u0103"+
		"\u0104\78\2\2\u0104)\3\2\2\2\u0105\u0108\5 \21\2\u0106\u0108\5\"\22\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108+\3\2\2\2\u0109\u010a\7"+
		"\t\2\2\u010a\u010b\7\r\2\2\u010b\u010c\7\67\2\2\u010c\u0112\7\r\2\2\u010d"+
		"\u010e\7\n\2\2\u010e\u010f\7\r\2\2\u010f\u0110\5\4\3\2\u0110\u0111\7\r"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\7\13\2\2\u0115\u0116\7\r\2\2\u0116\u011a\7"+
		"8\2\2\u0117\u0119\7\r\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u0121\7\f\2\2\u011e\u0120\7\r\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\5\2\2\2\u0125-\3\2\2\2\u0126\u012a"+
		"\5*\26\2\u0127\u012a\5(\25\2\u0128\u012a\5,\27\2\u0129\u0126\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7 "+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012f\7 \2\2\u012e\u0129\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f/\3\2\2\2\u0130\u0132\5.\30\2\u0131\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\7\2\2\3\u0136\61\3\2\2\2\33\64<FMW`ipr\u008c\u0098"+
		"\u00bb\u00d4\u00db\u00e2\u00ea\u00f1\u00f8\u0107\u0112\u011a\u0121\u0129"+
		"\u012e\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}