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
		SKILL=50, BACKGROUND=51, LANGUAGE=52, RACES=53, OPTIONAL=54, LETTER=55;
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
			"PGCLASS", "SUBCLASS", "SKILL", "BACKGROUND", "LANGUAGE", "RACES", "OPTIONAL", 
			"LETTER"
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
		public TerminalNode BACKGROUND() { return getToken(ddmLangParser.BACKGROUND, 0); }
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
			setState(51);
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
			case BACKGROUND:
				{
				setState(50);
				match(BACKGROUND);
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
			setState(53);
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
			setState(55);
			match(T__0);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
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
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BLANKSPACE || _la==LETTER );
			setState(61);
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
			setState(63);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARMORTYPE:
				{
				setState(65);
				match(ARMORTYPE);
				}
				break;
			case WEAPONTYPE:
				{
				setState(66);
				match(WEAPONTYPE);
				}
				break;
			case SHIELDPRESENCE:
				{
				setState(67);
				match(SHIELDPRESENCE);
				}
				break;
			case T__1:
			case NONE:
				{
				setState(68);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(NONE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(72);
				match(T__1);
				setState(73);
				consumableVectorElem();
				setState(74);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(78);
				match(CONSUMABLE);
				setState(79);
				match(T__3);
				setState(80);
				match(DIGIT);
				setState(81);
				match(T__4);
				setState(82);
				consumableVectorElem();
				}
				break;
			case 2:
				{
				setState(83);
				match(CONSUMABLE);
				setState(84);
				match(T__3);
				setState(85);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(88);
				match(RACES);
				}
				break;
			case 2:
				{
				setState(89);
				match(DIGIT);
				}
				break;
			case 3:
				{
				setState(90);
				classVector();
				}
				break;
			case 4:
				{
				setState(91);
				abilities();
				}
				break;
			case 5:
				{
				setState(92);
				match(ALIGNMENT);
				}
				break;
			case 6:
				{
				setState(93);
				skills();
				}
				break;
			case 7:
				{
				setState(94);
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
			setState(97);
			match(T__1);
			setState(98);
			classVectorElem();
			setState(99);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(101);
				match(PGCLASS);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(102);
					match(T__5);
					setState(103);
					match(SUBCLASS);
					}
				}

				setState(106);
				match(T__4);
				setState(107);
				classVectorElem();
				}
				break;
			case 2:
				{
				setState(108);
				match(PGCLASS);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(109);
					match(T__5);
					setState(110);
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
			setState(115);
			match(T__1);
			setState(116);
			match(DIGIT);
			setState(117);
			match(T__4);
			setState(118);
			match(DIGIT);
			setState(119);
			match(T__4);
			setState(120);
			match(DIGIT);
			setState(121);
			match(T__4);
			setState(122);
			match(DIGIT);
			setState(123);
			match(T__4);
			setState(124);
			match(DIGIT);
			setState(125);
			match(T__4);
			setState(126);
			match(DIGIT);
			setState(127);
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
			setState(129);
			match(T__1);
			setState(130);
			match(SKILL);
			setState(131);
			match(T__4);
			setState(132);
			match(SKILL);
			setState(133);
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
			setState(135);
			match(T__1);
			setState(136);
			match(LANGUAGE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(137);
				match(T__4);
				setState(138);
				match(LANGUAGE);
				}
			}

			setState(141);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACE:
				{
				setState(143);
				match(RACE);
				}
				break;
			case HP:
				{
				setState(144);
				match(HP);
				}
				break;
			case ARCHTYPE:
				{
				setState(145);
				match(ARCHTYPE);
				}
				break;
			case ABILITY:
				{
				setState(146);
				match(ABILITY);
				}
				break;
			case ALIGN:
				{
				setState(147);
				match(ALIGN);
				}
				break;
			case SKILLSID:
				{
				setState(148);
				match(SKILLSID);
				}
				break;
			case LANG:
				{
				setState(149);
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
				setState(150);
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
			setState(153);
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
			setState(155);
			match(CREATE);
			setState(156);
			match(BLANKSPACE);
			setState(157);
			match(PLAYER);
			setState(158);
			match(BLANKSPACE);
			setState(159);
			match(LETTER);
			setState(160);
			match(STARTENTITY);
			setState(161);
			match(BL);
			setState(162);
			property();
			setState(163);
			match(BL);
			setState(164);
			property();
			setState(165);
			match(BL);
			setState(166);
			property();
			setState(167);
			match(BL);
			setState(168);
			property();
			setState(169);
			match(BL);
			setState(170);
			property();
			setState(171);
			match(BL);
			setState(172);
			property();
			setState(173);
			match(BL);
			setState(174);
			property();
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(175);
				match(BL);
				setState(176);
				property();
				setState(177);
				match(BL);
				setState(178);
				property();
				setState(179);
				match(BL);
				setState(180);
				property();
				setState(181);
				match(BL);
				setState(182);
				property();
				setState(183);
				match(BL);
				setState(184);
				property();
				}
				break;
			}
			setState(188);
			match(BL);
			setState(189);
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
			setState(191);
			match(CREATE);
			setState(192);
			match(BLANKSPACE);
			setState(193);
			match(EQUIPMENT);
			setState(194);
			match(BLANKSPACE);
			setState(195);
			match(LETTER);
			setState(196);
			match(STARTENTITY);
			setState(197);
			match(BL);
			setState(198);
			equipPiece();
			setState(199);
			match(BL);
			setState(200);
			equipPiece();
			setState(201);
			match(BL);
			setState(202);
			equipPiece();
			setState(203);
			match(BL);
			setState(204);
			equipPiece();
			setState(205);
			match(BL);
			setState(206);
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
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(208);
				match(BLANKSPACE);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			piece();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(215);
				match(BLANKSPACE);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(COLON);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(222);
				match(BLANKSPACE);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(230);
				match(BLANKSPACE);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			mandatory();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(237);
				match(BLANKSPACE);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(COLON);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(244);
				match(BLANKSPACE);
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
			setState(252);
			match(IMPORT);
			setState(253);
			match(BLANKSPACE);
			setState(254);
			match(LETTER);
			setState(255);
			match(BLANKSPACE);
			setState(256);
			match(FROM);
			setState(257);
			match(BLANKSPACE);
			setState(258);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(260);
				pgDefition();
				}
				break;
			case 2:
				{
				setState(261);
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
			setState(264);
			match(T__6);
			setState(265);
			match(BLANKSPACE);
			setState(266);
			match(OPTIONAL);
			setState(267);
			match(BLANKSPACE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(268);
				match(T__7);
				setState(269);
				match(BLANKSPACE);
				setState(270);
				toSet();
				setState(271);
				match(BLANKSPACE);
				}
			}

			setState(275);
			match(T__8);
			setState(276);
			match(BLANKSPACE);
			setState(277);
			match(LETTER);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(278);
				match(BLANKSPACE);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(T__9);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(285);
				match(BLANKSPACE);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case CREATE:
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(293);
					entity();
					}
					break;
				case IMPORT:
					{
					setState(294);
					importData();
					}
					break;
				case T__6:
					{
					setState(295);
					setting();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298);
				match(BL);
				}
				break;
			case BL:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				line();
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << CREATE) | (1L << IMPORT) | (1L << BL))) != 0) );
			setState(308);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\5\2\66\n\2\3\3\3\3\3\4\3\4\6\4<\n\4\r\4\16\4=\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\5\13k\n\13\3\13\3\13\3\13\3\13\3\13\5\13r"+
		"\n\13\5\13t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u008e\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00bd\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\7\23"+
		"\u00d4\n\23\f\23\16\23\u00d7\13\23\3\23\3\23\7\23\u00db\n\23\f\23\16\23"+
		"\u00de\13\23\3\23\3\23\7\23\u00e2\n\23\f\23\16\23\u00e5\13\23\3\23\3\23"+
		"\3\24\7\24\u00ea\n\24\f\24\16\24\u00ed\13\24\3\24\3\24\7\24\u00f1\n\24"+
		"\f\24\16\24\u00f4\13\24\3\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0109"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0114\n\27\3\27"+
		"\3\27\3\27\3\27\7\27\u011a\n\27\f\27\16\27\u011d\13\27\3\27\3\27\7\27"+
		"\u0121\n\27\f\27\16\27\u0124\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u012b"+
		"\n\30\3\30\3\30\3\30\5\30\u0130\n\30\3\31\6\31\u0133\n\31\r\31\16\31\u0134"+
		"\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\2\5\4\2\r\r99\3\2(+\3\2\22\27\2\u0148\2\65\3\2\2\2\4\67\3\2\2\2\6"+
		"9\3\2\2\2\bA\3\2\2\2\nG\3\2\2\2\fN\3\2\2\2\16X\3\2\2\2\20a\3\2\2\2\22"+
		"c\3\2\2\2\24s\3\2\2\2\26u\3\2\2\2\30\u0083\3\2\2\2\32\u0089\3\2\2\2\34"+
		"\u0099\3\2\2\2\36\u009b\3\2\2\2 \u009d\3\2\2\2\"\u00c1\3\2\2\2$\u00d5"+
		"\3\2\2\2&\u00eb\3\2\2\2(\u00fe\3\2\2\2*\u0108\3\2\2\2,\u010a\3\2\2\2."+
		"\u012f\3\2\2\2\60\u0132\3\2\2\2\62\66\5\6\4\2\63\66\7\21\2\2\64\66\7\65"+
		"\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\3\3\2\2\2\678\7\62\2"+
		"\28\5\3\2\2\29;\7\3\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>?\3\2\2\2?@\7\3\2\2@\7\3\2\2\2AB\t\3\2\2B\t\3\2\2\2CH\7,\2\2DH\7"+
		"-\2\2EH\7.\2\2FH\5\f\7\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\13\3"+
		"\2\2\2IO\7/\2\2JK\7\4\2\2KL\5\16\b\2LM\7\5\2\2MO\3\2\2\2NI\3\2\2\2NJ\3"+
		"\2\2\2O\r\3\2\2\2PQ\7\60\2\2QR\7\6\2\2RS\7\21\2\2ST\7\7\2\2TY\5\16\b\2"+
		"UV\7\60\2\2VW\7\6\2\2WY\7\21\2\2XP\3\2\2\2XU\3\2\2\2Y\17\3\2\2\2Zb\7\67"+
		"\2\2[b\7\21\2\2\\b\5\22\n\2]b\5\26\f\2^b\7\61\2\2_b\5\30\r\2`b\5\32\16"+
		"\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2"+
		"\2\2b\21\3\2\2\2cd\7\4\2\2de\5\24\13\2ef\7\5\2\2f\23\3\2\2\2gj\7\62\2"+
		"\2hi\7\b\2\2ik\7\63\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\7\2\2mt\5\24"+
		"\13\2nq\7\62\2\2op\7\b\2\2pr\7\63\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sg"+
		"\3\2\2\2sn\3\2\2\2t\25\3\2\2\2uv\7\4\2\2vw\7\21\2\2wx\7\7\2\2xy\7\21\2"+
		"\2yz\7\7\2\2z{\7\21\2\2{|\7\7\2\2|}\7\21\2\2}~\7\7\2\2~\177\7\21\2\2\177"+
		"\u0080\7\7\2\2\u0080\u0081\7\21\2\2\u0081\u0082\7\5\2\2\u0082\27\3\2\2"+
		"\2\u0083\u0084\7\4\2\2\u0084\u0085\7\64\2\2\u0085\u0086\7\7\2\2\u0086"+
		"\u0087\7\64\2\2\u0087\u0088\7\5\2\2\u0088\31\3\2\2\2\u0089\u008a\7\4\2"+
		"\2\u008a\u008d\7\66\2\2\u008b\u008c\7\7\2\2\u008c\u008e\7\66\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\5"+
		"\2\2\u0090\33\3\2\2\2\u0091\u009a\7!\2\2\u0092\u009a\7\"\2\2\u0093\u009a"+
		"\7#\2\2\u0094\u009a\7$\2\2\u0095\u009a\7%\2\2\u0096\u009a\7&\2\2\u0097"+
		"\u009a\7\'\2\2\u0098\u009a\5\36\20\2\u0099\u0091\3\2\2\2\u0099\u0092\3"+
		"\2\2\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\35\3\2\2"+
		"\2\u009b\u009c\t\4\2\2\u009c\37\3\2\2\2\u009d\u009e\7\32\2\2\u009e\u009f"+
		"\7\r\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\79\2\2\u00a2"+
		"\u00a3\7\30\2\2\u00a3\u00a4\7 \2\2\u00a4\u00a5\5&\24\2\u00a5\u00a6\7 "+
		"\2\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\7 \2\2\u00a8\u00a9\5&\24\2\u00a9"+
		"\u00aa\7 \2\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\7 \2\2\u00ac\u00ad\5&\24"+
		"\2\u00ad\u00ae\7 \2\2\u00ae\u00af\5&\24\2\u00af\u00b0\7 \2\2\u00b0\u00bc"+
		"\5&\24\2\u00b1\u00b2\7 \2\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\7 \2\2\u00b4"+
		"\u00b5\5&\24\2\u00b5\u00b6\7 \2\2\u00b6\u00b7\5&\24\2\u00b7\u00b8\7 \2"+
		"\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\7 \2\2\u00ba\u00bb\5&\24\2\u00bb\u00bd"+
		"\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7 \2\2\u00bf\u00c0\7\31\2\2\u00c0!\3\2\2\2\u00c1\u00c2\7\32\2\2"+
		"\u00c2\u00c3\7\r\2\2\u00c3\u00c4\7\34\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6"+
		"\79\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\5$\23\2\u00c9"+
		"\u00ca\7 \2\2\u00ca\u00cb\5$\23\2\u00cb\u00cc\7 \2\2\u00cc\u00cd\5$\23"+
		"\2\u00cd\u00ce\7 \2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0\7 \2\2\u00d0\u00d1"+
		"\7\31\2\2\u00d1#\3\2\2\2\u00d2\u00d4\7\r\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dc\5\b\5\2\u00d9\u00db\7\r\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\7\37\2\2\u00e0"+
		"\u00e2\7\r\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\5\n\6\2\u00e7%\3\2\2\2\u00e8\u00ea\7\r\2\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f2\5\34\17\2\u00ef\u00f1\7\r\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f9\7\37\2\2"+
		"\u00f6\u00f8\7\r\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\5\20\t\2\u00fd\'\3\2\2\2\u00fe\u00ff\7\35\2\2\u00ff\u0100\7\r\2"+
		"\2\u0100\u0101\79\2\2\u0101\u0102\7\r\2\2\u0102\u0103\7\36\2\2\u0103\u0104"+
		"\7\r\2\2\u0104\u0105\79\2\2\u0105)\3\2\2\2\u0106\u0109\5 \21\2\u0107\u0109"+
		"\5\"\22\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109+\3\2\2\2\u010a"+
		"\u010b\7\t\2\2\u010b\u010c\7\r\2\2\u010c\u010d\78\2\2\u010d\u0113\7\r"+
		"\2\2\u010e\u010f\7\n\2\2\u010f\u0110\7\r\2\2\u0110\u0111\5\4\3\2\u0111"+
		"\u0112\7\r\2\2\u0112\u0114\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\13\2\2\u0116\u0117\7\r\2\2\u0117"+
		"\u011b\79\2\2\u0118\u011a\7\r\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0122\7\f\2\2\u011f\u0121\7\r\2\2\u0120\u011f\3\2"+
		"\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\5\2\2\2\u0126-\3\2\2\2"+
		"\u0127\u012b\5*\26\2\u0128\u012b\5(\25\2\u0129\u012b\5,\27\2\u012a\u0127"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7 \2\2\u012d\u0130\3\2\2\2\u012e\u0130\7 \2\2\u012f\u012a\3\2\2"+
		"\2\u012f\u012e\3\2\2\2\u0130/\3\2\2\2\u0131\u0133\5.\30\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\7\2\2\3\u0137\61\3\2\2\2\33\65=GNXajqs\u008d"+
		"\u0099\u00bc\u00d5\u00dc\u00e3\u00eb\u00f2\u00f9\u0108\u0113\u011b\u0122"+
		"\u012a\u012f\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}