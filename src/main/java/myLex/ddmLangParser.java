// Generated from /home/oldem/IdeaProjects/D_and_D_Compiler/ddmLang.g4 by ANTLR 4.8

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BLANKSPACE=8, 
		WS=9, COMMENT=10, LINE_COMMENT=11, DIGIT=12, STR=13, DEX=14, CHA=15, INT=16, 
		CON=17, WIS=18, STARTENTITY=19, ENDENTITY=20, CREATE=21, PLAYER=22, EQUIPMENT=23, 
		IMPORT=24, FROM=25, SET=26, FOR=27, OF=28, COLON=29, BL=30, RACE=31, HP=32, 
		ARCHTYPE=33, ABILITY=34, ALIGN=35, SKILLSID=36, LANG=37, ARMOR=38, WEAPON=39, 
		SHIELD=40, CONSUMABLES=41, ARMORTYPE=42, WEAPONTYPE=43, SHIELDPRESENCE=44, 
		NONE=45, CONSUMABLE=46, ALIGNMENT=47, PGCLASS=48, SUBCLASS=49, SKILL=50, 
		BACKGROUND=51, LANGUAGE=52, RACES=53, OPTIONAL=54, ACCENT=55, LETTER=56;
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
			null, "'\"'", "'('", "')'", "'*'", "','", "'->'", "'='", "' '", null, 
			null, null, null, null, null, null, null, null, null, "'{'", "'}'", "'create'", 
			"'Player'", "'Equipment'", "'import'", "'from'", "'set'", "'for'", "'of'", 
			"':'", null, null, null, null, null, null, null, null, "'armor'", "'weapon'", 
			"'shield'", "'consumables'", null, null, null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "BLANKSPACE", "WS", "COMMENT", 
			"LINE_COMMENT", "DIGIT", "STR", "DEX", "CHA", "INT", "CON", "WIS", "STARTENTITY", 
			"ENDENTITY", "CREATE", "PLAYER", "EQUIPMENT", "IMPORT", "FROM", "SET", 
			"FOR", "OF", "COLON", "BL", "RACE", "HP", "ARCHTYPE", "ABILITY", "ALIGN", 
			"SKILLSID", "LANG", "ARMOR", "WEAPON", "SHIELD", "CONSUMABLES", "ARMORTYPE", 
			"WEAPONTYPE", "SHIELDPRESENCE", "NONE", "CONSUMABLE", "ALIGNMENT", "PGCLASS", 
			"SUBCLASS", "SKILL", "BACKGROUND", "LANGUAGE", "RACES", "OPTIONAL", "ACCENT", 
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
		public TerminalNode LETTER() { return getToken(ddmLangParser.LETTER, 0); }
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
			setState(52);
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
			case LETTER:
				{
				setState(51);
				match(LETTER);
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
			setState(54);
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
		public TerminalNode ACCENT() { return getToken(ddmLangParser.ACCENT, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(57);
						matchWildcard();
						}
						} 
					}
					setState(62);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(63);
				match(ACCENT);
				}
				break;
			}
			setState(66);
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
			setState(68);
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARMORTYPE:
				{
				setState(70);
				match(ARMORTYPE);
				}
				break;
			case WEAPONTYPE:
				{
				setState(71);
				match(WEAPONTYPE);
				}
				break;
			case SHIELDPRESENCE:
				{
				setState(72);
				match(SHIELDPRESENCE);
				}
				break;
			case T__1:
			case NONE:
				{
				setState(73);
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(NONE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(77);
				match(T__1);
				setState(78);
				consumableVectorElem();
				setState(79);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(83);
				match(CONSUMABLE);
				setState(84);
				match(T__3);
				setState(85);
				match(DIGIT);
				setState(86);
				match(T__4);
				setState(87);
				consumableVectorElem();
				}
				break;
			case 2:
				{
				setState(88);
				match(CONSUMABLE);
				setState(89);
				match(T__3);
				setState(90);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(93);
				match(RACES);
				}
				break;
			case 2:
				{
				setState(94);
				match(DIGIT);
				}
				break;
			case 3:
				{
				setState(95);
				classVector();
				}
				break;
			case 4:
				{
				setState(96);
				abilities();
				}
				break;
			case 5:
				{
				setState(97);
				match(ALIGNMENT);
				}
				break;
			case 6:
				{
				setState(98);
				skills();
				}
				break;
			case 7:
				{
				setState(99);
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
			setState(102);
			match(T__1);
			setState(103);
			classVectorElem();
			setState(104);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(106);
				match(PGCLASS);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(107);
					match(T__5);
					setState(108);
					match(SUBCLASS);
					}
				}

				setState(111);
				match(T__4);
				setState(112);
				classVectorElem();
				}
				break;
			case 2:
				{
				setState(113);
				match(PGCLASS);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(114);
					match(T__5);
					setState(115);
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
			setState(120);
			match(T__1);
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
			match(T__4);
			setState(127);
			match(DIGIT);
			setState(128);
			match(T__4);
			setState(129);
			match(DIGIT);
			setState(130);
			match(T__4);
			setState(131);
			match(DIGIT);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__1);
			setState(135);
			match(SKILL);
			setState(136);
			match(T__4);
			setState(137);
			match(SKILL);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(138);
				match(T__4);
				setState(139);
				match(SKILL);
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(142);
				match(T__4);
				setState(143);
				match(SKILL);
				}
				break;
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(146);
				match(T__4);
				setState(147);
				match(SKILL);
				}
			}

			setState(150);
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
			setState(152);
			match(T__1);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGUAGE) {
				{
				setState(153);
				match(LANGUAGE);
				}
			}

			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(156);
				match(T__4);
				setState(157);
				match(LANGUAGE);
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(160);
				match(T__4);
				setState(161);
				match(LANGUAGE);
				}
			}

			setState(164);
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
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACE:
				{
				setState(166);
				match(RACE);
				}
				break;
			case HP:
				{
				setState(167);
				match(HP);
				}
				break;
			case ARCHTYPE:
				{
				setState(168);
				match(ARCHTYPE);
				}
				break;
			case ABILITY:
				{
				setState(169);
				match(ABILITY);
				}
				break;
			case ALIGN:
				{
				setState(170);
				match(ALIGN);
				}
				break;
			case SKILLSID:
				{
				setState(171);
				match(SKILLSID);
				}
				break;
			case LANG:
				{
				setState(172);
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
				setState(173);
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
			setState(176);
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
			setState(178);
			match(CREATE);
			setState(179);
			match(BLANKSPACE);
			setState(180);
			match(PLAYER);
			setState(181);
			match(BLANKSPACE);
			setState(182);
			match(LETTER);
			setState(183);
			match(STARTENTITY);
			setState(184);
			match(BL);
			setState(185);
			property();
			setState(186);
			match(BL);
			setState(187);
			property();
			setState(188);
			match(BL);
			setState(189);
			property();
			setState(190);
			match(BL);
			setState(191);
			property();
			setState(192);
			match(BL);
			setState(193);
			property();
			setState(194);
			match(BL);
			setState(195);
			property();
			setState(196);
			match(BL);
			setState(197);
			property();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(198);
				match(BL);
				setState(199);
				property();
				setState(200);
				match(BL);
				setState(201);
				property();
				setState(202);
				match(BL);
				setState(203);
				property();
				setState(204);
				match(BL);
				setState(205);
				property();
				setState(206);
				match(BL);
				setState(207);
				property();
				}
				break;
			}
			setState(211);
			match(BL);
			setState(212);
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
			setState(214);
			match(CREATE);
			setState(215);
			match(BLANKSPACE);
			setState(216);
			match(EQUIPMENT);
			setState(217);
			match(BLANKSPACE);
			setState(218);
			match(LETTER);
			setState(219);
			match(STARTENTITY);
			setState(220);
			match(BL);
			setState(221);
			equipPiece();
			setState(222);
			match(BL);
			setState(223);
			equipPiece();
			setState(224);
			match(BL);
			setState(225);
			equipPiece();
			setState(226);
			match(BL);
			setState(227);
			equipPiece();
			setState(228);
			match(BL);
			setState(229);
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
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(231);
				match(BLANKSPACE);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			piece();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(238);
				match(BLANKSPACE);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(COLON);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(245);
				match(BLANKSPACE);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(253);
				match(BLANKSPACE);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			mandatory();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(260);
				match(BLANKSPACE);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(COLON);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(267);
				match(BLANKSPACE);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
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
			setState(275);
			match(IMPORT);
			setState(276);
			match(BLANKSPACE);
			setState(277);
			match(LETTER);
			setState(278);
			match(BLANKSPACE);
			setState(279);
			match(FROM);
			setState(280);
			match(BLANKSPACE);
			setState(281);
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(283);
				pgDefition();
				}
				break;
			case 2:
				{
				setState(284);
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
		public TerminalNode SET() { return getToken(ddmLangParser.SET, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(ddmLangParser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(ddmLangParser.BLANKSPACE, i);
		}
		public TerminalNode OPTIONAL() { return getToken(ddmLangParser.OPTIONAL, 0); }
		public TerminalNode FOR() { return getToken(ddmLangParser.FOR, 0); }
		public TerminalNode LETTER() { return getToken(ddmLangParser.LETTER, 0); }
		public OptionalValueContext optionalValue() {
			return getRuleContext(OptionalValueContext.class,0);
		}
		public TerminalNode OF() { return getToken(ddmLangParser.OF, 0); }
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
			setState(287);
			match(SET);
			setState(288);
			match(BLANKSPACE);
			setState(289);
			match(OPTIONAL);
			setState(290);
			match(BLANKSPACE);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(291);
				match(OF);
				setState(292);
				match(BLANKSPACE);
				setState(293);
				toSet();
				setState(294);
				match(BLANKSPACE);
				}
			}

			setState(298);
			match(FOR);
			setState(299);
			match(BLANKSPACE);
			setState(300);
			match(LETTER);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(301);
				match(BLANKSPACE);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(T__6);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(308);
				match(BLANKSPACE);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
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
		public TerminalNode EOF() { return getToken(ddmLangParser.EOF, 0); }
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
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(316);
					entity();
					}
					break;
				case IMPORT:
					{
					setState(317);
					importData();
					}
					break;
				case SET:
					{
					setState(318);
					setting();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(321);
				match(BL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(323);
					entity();
					}
					break;
				case IMPORT:
					{
					setState(324);
					importData();
					}
					break;
				case SET:
					{
					setState(325);
					setting();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(BL);
				}
				break;
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
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				line();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << IMPORT) | (1L << SET) | (1L << BL))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\5\2\67\n\2\3\3\3\3\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3"+
		"\4\5\4C\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7T\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tg\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13p\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13w\n\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008f\n\r\3\r\3\r"+
		"\5\r\u0093\n\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\3\16\3\16\5\16\u009d\n\16"+
		"\3\16\3\16\5\16\u00a1\n\16\3\16\3\16\5\16\u00a5\n\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00d4\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\7\23\u00eb\n\23"+
		"\f\23\16\23\u00ee\13\23\3\23\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13"+
		"\23\3\23\3\23\7\23\u00f9\n\23\f\23\16\23\u00fc\13\23\3\23\3\23\3\24\7"+
		"\24\u0101\n\24\f\24\16\24\u0104\13\24\3\24\3\24\7\24\u0108\n\24\f\24\16"+
		"\24\u010b\13\24\3\24\3\24\7\24\u010f\n\24\f\24\16\24\u0112\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0120\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012b\n\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0131\n\27\f\27\16\27\u0134\13\27\3\27\3\27\7\27\u0138"+
		"\n\27\f\27\16\27\u013b\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u0142\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0149\n\30\3\30\3\30\3\30\5\30\u014e\n"+
		"\30\3\31\6\31\u0151\n\31\r\31\16\31\u0152\3\31\3>\2\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2(+\3\2\17\24\2\u016e\2\66"+
		"\3\2\2\2\48\3\2\2\2\6:\3\2\2\2\bF\3\2\2\2\nL\3\2\2\2\fS\3\2\2\2\16]\3"+
		"\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24x\3\2\2\2\26z\3\2\2\2\30\u0088\3\2\2"+
		"\2\32\u009a\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2\""+
		"\u00d8\3\2\2\2$\u00ec\3\2\2\2&\u0102\3\2\2\2(\u0115\3\2\2\2*\u011f\3\2"+
		"\2\2,\u0121\3\2\2\2.\u014d\3\2\2\2\60\u0150\3\2\2\2\62\67\5\6\4\2\63\67"+
		"\7\16\2\2\64\67\7\65\2\2\65\67\7:\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64"+
		"\3\2\2\2\66\65\3\2\2\2\67\3\3\2\2\289\7\62\2\29\5\3\2\2\2:B\7\3\2\2;="+
		"\13\2\2\2<;\3\2\2\2=@\3\2\2\2>?\3\2\2\2><\3\2\2\2?C\3\2\2\2@>\3\2\2\2"+
		"AC\79\2\2B>\3\2\2\2BA\3\2\2\2CD\3\2\2\2DE\7\3\2\2E\7\3\2\2\2FG\t\2\2\2"+
		"G\t\3\2\2\2HM\7,\2\2IM\7-\2\2JM\7.\2\2KM\5\f\7\2LH\3\2\2\2LI\3\2\2\2L"+
		"J\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NT\7/\2\2OP\7\4\2\2PQ\5\16\b\2QR\7\5\2"+
		"\2RT\3\2\2\2SN\3\2\2\2SO\3\2\2\2T\r\3\2\2\2UV\7\60\2\2VW\7\6\2\2WX\7\16"+
		"\2\2XY\7\7\2\2Y^\5\16\b\2Z[\7\60\2\2[\\\7\6\2\2\\^\7\16\2\2]U\3\2\2\2"+
		"]Z\3\2\2\2^\17\3\2\2\2_g\7\67\2\2`g\7\16\2\2ag\5\22\n\2bg\5\26\f\2cg\7"+
		"\61\2\2dg\5\30\r\2eg\5\32\16\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2\2fb\3\2\2\2"+
		"fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\21\3\2\2\2hi\7\4\2\2ij\5\24\13\2jk\7\5"+
		"\2\2k\23\3\2\2\2lo\7\62\2\2mn\7\b\2\2np\7\63\2\2om\3\2\2\2op\3\2\2\2p"+
		"q\3\2\2\2qr\7\7\2\2ry\5\24\13\2sv\7\62\2\2tu\7\b\2\2uw\7\63\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xl\3\2\2\2xs\3\2\2\2y\25\3\2\2\2z{\7\4\2\2{|\7"+
		"\16\2\2|}\7\7\2\2}~\7\16\2\2~\177\7\7\2\2\177\u0080\7\16\2\2\u0080\u0081"+
		"\7\7\2\2\u0081\u0082\7\16\2\2\u0082\u0083\7\7\2\2\u0083\u0084\7\16\2\2"+
		"\u0084\u0085\7\7\2\2\u0085\u0086\7\16\2\2\u0086\u0087\7\5\2\2\u0087\27"+
		"\3\2\2\2\u0088\u0089\7\4\2\2\u0089\u008a\7\64\2\2\u008a\u008b\7\7\2\2"+
		"\u008b\u008e\7\64\2\2\u008c\u008d\7\7\2\2\u008d\u008f\7\64\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u0091\7\7\2\2\u0091"+
		"\u0093\7\64\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0095\7\7\2\2\u0095\u0097\7\64\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\5\2\2\u0099\31\3\2\2"+
		"\2\u009a\u009c\7\4\2\2\u009b\u009d\7\66\2\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\7\7\2\2\u009f\u00a1\7\66"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a3\7\7\2\2\u00a3\u00a5\7\66\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\33\3\2\2\2\u00a8"+
		"\u00b1\7!\2\2\u00a9\u00b1\7\"\2\2\u00aa\u00b1\7#\2\2\u00ab\u00b1\7$\2"+
		"\2\u00ac\u00b1\7%\2\2\u00ad\u00b1\7&\2\2\u00ae\u00b1\7\'\2\2\u00af\u00b1"+
		"\5\36\20\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00aa\3\2\2\2"+
		"\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3"+
		"\37\3\2\2\2\u00b4\u00b5\7\27\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\7\30"+
		"\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\7:\2\2\u00b9\u00ba\7\25\2\2\u00ba"+
		"\u00bb\7 \2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\7 \2\2\u00bd\u00be\5&\24"+
		"\2\u00be\u00bf\7 \2\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\7 \2\2\u00c1\u00c2"+
		"\5&\24\2\u00c2\u00c3\7 \2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5\7 \2\2\u00c5"+
		"\u00c6\5&\24\2\u00c6\u00c7\7 \2\2\u00c7\u00d3\5&\24\2\u00c8\u00c9\7 \2"+
		"\2\u00c9\u00ca\5&\24\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd"+
		"\7 \2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\7 \2\2\u00cf\u00d0\5&\24\2\u00d0"+
		"\u00d1\7 \2\2\u00d1\u00d2\5&\24\2\u00d2\u00d4\3\2\2\2\u00d3\u00c8\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7 \2\2\u00d6"+
		"\u00d7\7\26\2\2\u00d7!\3\2\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00da\7\n\2"+
		"\2\u00da\u00db\7\31\2\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\7:\2\2\u00dd\u00de"+
		"\7\25\2\2\u00de\u00df\7 \2\2\u00df\u00e0\5$\23\2\u00e0\u00e1\7 \2\2\u00e1"+
		"\u00e2\5$\23\2\u00e2\u00e3\7 \2\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\7 \2"+
		"\2\u00e5\u00e6\5$\23\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\7\26\2\2\u00e8#"+
		"\3\2\2\2\u00e9\u00eb\7\n\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f3\5\b\5\2\u00f0\u00f2\7\n\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fa\7\37\2\2\u00f7\u00f9\7\n\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5\n\6\2\u00fe"+
		"%\3\2\2\2\u00ff\u0101\7\n\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2"+
		"\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0109\5\34\17\2\u0106\u0108\7\n\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\7\37\2\2\u010d\u010f\7\n\2\2"+
		"\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\5\20\t\2"+
		"\u0114\'\3\2\2\2\u0115\u0116\7\32\2\2\u0116\u0117\7\n\2\2\u0117\u0118"+
		"\7:\2\2\u0118\u0119\7\n\2\2\u0119\u011a\7\33\2\2\u011a\u011b\7\n\2\2\u011b"+
		"\u011c\7:\2\2\u011c)\3\2\2\2\u011d\u0120\5 \21\2\u011e\u0120\5\"\22\2"+
		"\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120+\3\2\2\2\u0121\u0122\7"+
		"\34\2\2\u0122\u0123\7\n\2\2\u0123\u0124\78\2\2\u0124\u012a\7\n\2\2\u0125"+
		"\u0126\7\36\2\2\u0126\u0127\7\n\2\2\u0127\u0128\5\4\3\2\u0128\u0129\7"+
		"\n\2\2\u0129\u012b\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\7\35\2\2\u012d\u012e\7\n\2\2\u012e\u0132\7"+
		":\2\2\u012f\u0131\7\n\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0139\7\t\2\2\u0136\u0138\7\n\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013d\5\2\2\2\u013d-\3\2\2\2\u013e\u0142"+
		"\5*\26\2\u013f\u0142\5(\25\2\u0140\u0142\5,\27\2\u0141\u013e\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7 "+
		"\2\2\u0144\u014e\3\2\2\2\u0145\u0149\5*\26\2\u0146\u0149\5(\25\2\u0147"+
		"\u0149\5,\27\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7\2\2\3\u014b\u014e\3\2\2\2\u014c"+
		"\u014e\7 \2\2\u014d\u0141\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014e/\3\2\2\2\u014f\u0151\5.\30\2\u0150\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\61\3\2\2\2\"\66"+
		">BLS]fovx\u008e\u0092\u0096\u009c\u00a0\u00a4\u00b0\u00d3\u00ec\u00f3"+
		"\u00fa\u0102\u0109\u0110\u011f\u012a\u0132\u0139\u0141\u0148\u014d\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}