// Generated from digits4.g4 by ANTLR 4.8

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
public class digits4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BLANKSPACE=6, WS=7, DIGIT=8, STR=9, 
		DEX=10, CHA=11, INT=12, CON=13, WIS=14, STARTENTITY=15, ENDENTITY=16, 
		CREATE=17, PLAYER=18, EQUIPMENT=19, IMPORT=20, FROM=21, COLON=22, BL=23, 
		RACE=24, HP=25, ARCHTYPE=26, ABILITY=27, ALIGN=28, SKILLSID=29, LANG=30, 
		ARMOR=31, WEAPON=32, SHIELD=33, CONSUMABLES=34, ARMORTYPE=35, WEAPONTYPE=36, 
		SHIELDPRESENCE=37, NONE=38, CONSUMABLE=39, ALIGNMENT=40, PGCLASS=41, SUBCLASS=42, 
		SKILL=43, LANGUAGE=44, RACES=45, LETTER=46;
	public static final int
		RULE_piece = 0, RULE_pieceValue = 1, RULE_consumableVector = 2, RULE_consumableVectorElem = 3, 
		RULE_value = 4, RULE_classVector = 5, RULE_classVectorElem = 6, RULE_abilities = 7, 
		RULE_skills = 8, RULE_languages = 9, RULE_mandatory = 10, RULE_statID = 11, 
		RULE_pgDefition = 12, RULE_equipDefinition = 13, RULE_equipPiece = 14, 
		RULE_property = 15, RULE_importData = 16, RULE_entity = 17, RULE_line = 18, 
		RULE_start = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"piece", "pieceValue", "consumableVector", "consumableVectorElem", "value", 
			"classVector", "classVectorElem", "abilities", "skills", "languages", 
			"mandatory", "statID", "pgDefition", "equipDefinition", "equipPiece", 
			"property", "importData", "entity", "line", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "','", "'->'", "' '", null, null, null, null, 
			null, null, null, null, "'{'", "'}'", "'create'", "'Player'", "'Equipment'", 
			"'import'", "'from'", "':'", null, null, null, null, null, null, null, 
			null, "'armor'", "'weapon'", "'shield'", "'consumables'", null, null, 
			null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BLANKSPACE", "WS", "DIGIT", "STR", 
			"DEX", "CHA", "INT", "CON", "WIS", "STARTENTITY", "ENDENTITY", "CREATE", 
			"PLAYER", "EQUIPMENT", "IMPORT", "FROM", "COLON", "BL", "RACE", "HP", 
			"ARCHTYPE", "ABILITY", "ALIGN", "SKILLSID", "LANG", "ARMOR", "WEAPON", 
			"SHIELD", "CONSUMABLES", "ARMORTYPE", "WEAPONTYPE", "SHIELDPRESENCE", 
			"NONE", "CONSUMABLE", "ALIGNMENT", "PGCLASS", "SUBCLASS", "SKILL", "LANGUAGE", 
			"RACES", "LETTER"
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
	public String getGrammarFileName() { return "digits4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public digits4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PieceContext extends ParserRuleContext {
		public TerminalNode ARMOR() { return getToken(digits4Parser.ARMOR, 0); }
		public TerminalNode WEAPON() { return getToken(digits4Parser.WEAPON, 0); }
		public TerminalNode SHIELD() { return getToken(digits4Parser.SHIELD, 0); }
		public TerminalNode CONSUMABLES() { return getToken(digits4Parser.CONSUMABLES, 0); }
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
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
		public TerminalNode ARMORTYPE() { return getToken(digits4Parser.ARMORTYPE, 0); }
		public TerminalNode WEAPONTYPE() { return getToken(digits4Parser.WEAPONTYPE, 0); }
		public TerminalNode SHIELDPRESENCE() { return getToken(digits4Parser.SHIELDPRESENCE, 0); }
		public ConsumableVectorContext consumableVector() {
			return getRuleContext(ConsumableVectorContext.class,0);
		}
		public PieceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitPieceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceValueContext pieceValue() throws RecognitionException {
		PieceValueContext _localctx = new PieceValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pieceValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARMORTYPE:
				{
				setState(42);
				match(ARMORTYPE);
				}
				break;
			case WEAPONTYPE:
				{
				setState(43);
				match(WEAPONTYPE);
				}
				break;
			case SHIELDPRESENCE:
				{
				setState(44);
				match(SHIELDPRESENCE);
				}
				break;
			case T__0:
			case NONE:
				{
				setState(45);
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
		public TerminalNode NONE() { return getToken(digits4Parser.NONE, 0); }
		public ConsumableVectorElemContext consumableVectorElem() {
			return getRuleContext(ConsumableVectorElemContext.class,0);
		}
		public ConsumableVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consumableVector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitConsumableVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsumableVectorContext consumableVector() throws RecognitionException {
		ConsumableVectorContext _localctx = new ConsumableVectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_consumableVector);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(NONE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(49);
				match(T__0);
				setState(50);
				consumableVectorElem();
				setState(51);
				match(T__1);
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
		public TerminalNode CONSUMABLE() { return getToken(digits4Parser.CONSUMABLE, 0); }
		public TerminalNode DIGIT() { return getToken(digits4Parser.DIGIT, 0); }
		public ConsumableVectorElemContext consumableVectorElem() {
			return getRuleContext(ConsumableVectorElemContext.class,0);
		}
		public ConsumableVectorElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consumableVectorElem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitConsumableVectorElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsumableVectorElemContext consumableVectorElem() throws RecognitionException {
		ConsumableVectorElemContext _localctx = new ConsumableVectorElemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_consumableVectorElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(55);
				match(CONSUMABLE);
				setState(56);
				match(T__2);
				setState(57);
				match(DIGIT);
				setState(58);
				match(T__3);
				setState(59);
				consumableVectorElem();
				}
				break;
			case 2:
				{
				setState(60);
				match(CONSUMABLE);
				setState(61);
				match(T__2);
				setState(62);
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
		public TerminalNode RACES() { return getToken(digits4Parser.RACES, 0); }
		public TerminalNode DIGIT() { return getToken(digits4Parser.DIGIT, 0); }
		public ClassVectorContext classVector() {
			return getRuleContext(ClassVectorContext.class,0);
		}
		public AbilitiesContext abilities() {
			return getRuleContext(AbilitiesContext.class,0);
		}
		public TerminalNode ALIGNMENT() { return getToken(digits4Parser.ALIGNMENT, 0); }
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
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(65);
				match(RACES);
				}
				break;
			case 2:
				{
				setState(66);
				match(DIGIT);
				}
				break;
			case 3:
				{
				setState(67);
				classVector();
				}
				break;
			case 4:
				{
				setState(68);
				abilities();
				}
				break;
			case 5:
				{
				setState(69);
				match(ALIGNMENT);
				}
				break;
			case 6:
				{
				setState(70);
				skills();
				}
				break;
			case 7:
				{
				setState(71);
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
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitClassVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVectorContext classVector() throws RecognitionException {
		ClassVectorContext _localctx = new ClassVectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			match(T__0);
			setState(75);
			classVectorElem();
			setState(76);
			match(T__1);
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
		public TerminalNode PGCLASS() { return getToken(digits4Parser.PGCLASS, 0); }
		public ClassVectorElemContext classVectorElem() {
			return getRuleContext(ClassVectorElemContext.class,0);
		}
		public TerminalNode SUBCLASS() { return getToken(digits4Parser.SUBCLASS, 0); }
		public ClassVectorElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVectorElem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitClassVectorElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVectorElemContext classVectorElem() throws RecognitionException {
		ClassVectorElemContext _localctx = new ClassVectorElemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classVectorElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(78);
				match(PGCLASS);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(79);
					match(T__4);
					setState(80);
					match(SUBCLASS);
					}
				}

				setState(83);
				match(T__3);
				setState(84);
				classVectorElem();
				}
				break;
			case 2:
				{
				setState(85);
				match(PGCLASS);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(86);
					match(T__4);
					setState(87);
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
		public List<TerminalNode> DIGIT() { return getTokens(digits4Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(digits4Parser.DIGIT, i);
		}
		public AbilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abilities; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitAbilities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbilitiesContext abilities() throws RecognitionException {
		AbilitiesContext _localctx = new AbilitiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abilities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(93);
			match(DIGIT);
			setState(94);
			match(T__3);
			setState(95);
			match(DIGIT);
			setState(96);
			match(T__3);
			setState(97);
			match(DIGIT);
			setState(98);
			match(T__3);
			setState(99);
			match(DIGIT);
			setState(100);
			match(T__3);
			setState(101);
			match(DIGIT);
			setState(102);
			match(T__3);
			setState(103);
			match(DIGIT);
			setState(104);
			match(T__1);
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
		public List<TerminalNode> SKILL() { return getTokens(digits4Parser.SKILL); }
		public TerminalNode SKILL(int i) {
			return getToken(digits4Parser.SKILL, i);
		}
		public SkillsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skills; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitSkills(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillsContext skills() throws RecognitionException {
		SkillsContext _localctx = new SkillsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_skills);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__0);
			setState(107);
			match(SKILL);
			setState(108);
			match(T__3);
			setState(109);
			match(SKILL);
			setState(110);
			match(T__1);
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
		public List<TerminalNode> LANGUAGE() { return getTokens(digits4Parser.LANGUAGE); }
		public TerminalNode LANGUAGE(int i) {
			return getToken(digits4Parser.LANGUAGE, i);
		}
		public LanguagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languages; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitLanguages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguagesContext languages() throws RecognitionException {
		LanguagesContext _localctx = new LanguagesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_languages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__0);
			setState(113);
			match(LANGUAGE);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(114);
				match(T__3);
				setState(115);
				match(LANGUAGE);
				}
			}

			setState(118);
			match(T__1);
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
		public TerminalNode RACE() { return getToken(digits4Parser.RACE, 0); }
		public TerminalNode HP() { return getToken(digits4Parser.HP, 0); }
		public TerminalNode ARCHTYPE() { return getToken(digits4Parser.ARCHTYPE, 0); }
		public TerminalNode ABILITY() { return getToken(digits4Parser.ABILITY, 0); }
		public TerminalNode ALIGN() { return getToken(digits4Parser.ALIGN, 0); }
		public TerminalNode SKILLSID() { return getToken(digits4Parser.SKILLSID, 0); }
		public TerminalNode LANG() { return getToken(digits4Parser.LANG, 0); }
		public StatIDContext statID() {
			return getRuleContext(StatIDContext.class,0);
		}
		public MandatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatory; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitMandatory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MandatoryContext mandatory() throws RecognitionException {
		MandatoryContext _localctx = new MandatoryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mandatory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACE:
				{
				setState(120);
				match(RACE);
				}
				break;
			case HP:
				{
				setState(121);
				match(HP);
				}
				break;
			case ARCHTYPE:
				{
				setState(122);
				match(ARCHTYPE);
				}
				break;
			case ABILITY:
				{
				setState(123);
				match(ABILITY);
				}
				break;
			case ALIGN:
				{
				setState(124);
				match(ALIGN);
				}
				break;
			case SKILLSID:
				{
				setState(125);
				match(SKILLSID);
				}
				break;
			case LANG:
				{
				setState(126);
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
				setState(127);
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
		public TerminalNode STR() { return getToken(digits4Parser.STR, 0); }
		public TerminalNode DEX() { return getToken(digits4Parser.DEX, 0); }
		public TerminalNode INT() { return getToken(digits4Parser.INT, 0); }
		public TerminalNode CHA() { return getToken(digits4Parser.CHA, 0); }
		public TerminalNode CON() { return getToken(digits4Parser.CON, 0); }
		public TerminalNode WIS() { return getToken(digits4Parser.WIS, 0); }
		public StatIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitStatID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatIDContext statID() throws RecognitionException {
		StatIDContext _localctx = new StatIDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		public TerminalNode CREATE() { return getToken(digits4Parser.CREATE, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public TerminalNode PLAYER() { return getToken(digits4Parser.PLAYER, 0); }
		public TerminalNode LETTER() { return getToken(digits4Parser.LETTER, 0); }
		public TerminalNode STARTENTITY() { return getToken(digits4Parser.STARTENTITY, 0); }
		public List<TerminalNode> BL() { return getTokens(digits4Parser.BL); }
		public TerminalNode BL(int i) {
			return getToken(digits4Parser.BL, i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode ENDENTITY() { return getToken(digits4Parser.ENDENTITY, 0); }
		public PgDefitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgDefition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitPgDefition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PgDefitionContext pgDefition() throws RecognitionException {
		PgDefitionContext _localctx = new PgDefitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pgDefition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CREATE);
			setState(133);
			match(BLANKSPACE);
			setState(134);
			match(PLAYER);
			setState(135);
			match(BLANKSPACE);
			setState(136);
			match(LETTER);
			setState(137);
			match(STARTENTITY);
			setState(138);
			match(BL);
			setState(139);
			property();
			setState(140);
			match(BL);
			setState(141);
			property();
			setState(142);
			match(BL);
			setState(143);
			property();
			setState(144);
			match(BL);
			setState(145);
			property();
			setState(146);
			match(BL);
			setState(147);
			property();
			setState(148);
			match(BL);
			setState(149);
			property();
			setState(150);
			match(BL);
			setState(151);
			property();
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(152);
				match(BL);
				setState(153);
				property();
				setState(154);
				match(BL);
				setState(155);
				property();
				setState(156);
				match(BL);
				setState(157);
				property();
				setState(158);
				match(BL);
				setState(159);
				property();
				setState(160);
				match(BL);
				setState(161);
				property();
				}
				break;
			}
			setState(165);
			match(BL);
			setState(166);
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
		public TerminalNode CREATE() { return getToken(digits4Parser.CREATE, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public TerminalNode EQUIPMENT() { return getToken(digits4Parser.EQUIPMENT, 0); }
		public TerminalNode LETTER() { return getToken(digits4Parser.LETTER, 0); }
		public TerminalNode STARTENTITY() { return getToken(digits4Parser.STARTENTITY, 0); }
		public List<TerminalNode> BL() { return getTokens(digits4Parser.BL); }
		public TerminalNode BL(int i) {
			return getToken(digits4Parser.BL, i);
		}
		public List<EquipPieceContext> equipPiece() {
			return getRuleContexts(EquipPieceContext.class);
		}
		public EquipPieceContext equipPiece(int i) {
			return getRuleContext(EquipPieceContext.class,i);
		}
		public TerminalNode ENDENTITY() { return getToken(digits4Parser.ENDENTITY, 0); }
		public EquipDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitEquipDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquipDefinitionContext equipDefinition() throws RecognitionException {
		EquipDefinitionContext _localctx = new EquipDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equipDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(CREATE);
			setState(169);
			match(BLANKSPACE);
			setState(170);
			match(EQUIPMENT);
			setState(171);
			match(BLANKSPACE);
			setState(172);
			match(LETTER);
			setState(173);
			match(STARTENTITY);
			setState(174);
			match(BL);
			setState(175);
			equipPiece();
			setState(176);
			match(BL);
			setState(177);
			equipPiece();
			setState(178);
			match(BL);
			setState(179);
			equipPiece();
			setState(180);
			match(BL);
			setState(181);
			equipPiece();
			setState(182);
			match(BL);
			setState(183);
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
		public TerminalNode COLON() { return getToken(digits4Parser.COLON, 0); }
		public PieceValueContext pieceValue() {
			return getRuleContext(PieceValueContext.class,0);
		}
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public EquipPieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipPiece; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitEquipPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquipPieceContext equipPiece() throws RecognitionException {
		EquipPieceContext _localctx = new EquipPieceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equipPiece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(185);
				match(BLANKSPACE);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			piece();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(192);
				match(BLANKSPACE);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(COLON);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(199);
				match(BLANKSPACE);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
		public TerminalNode COLON() { return getToken(digits4Parser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property);
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
			mandatory();
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
		public TerminalNode IMPORT() { return getToken(digits4Parser.IMPORT, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(digits4Parser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(digits4Parser.LETTER, i);
		}
		public TerminalNode FROM() { return getToken(digits4Parser.FROM, 0); }
		public ImportDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importData; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitImportData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDataContext importData() throws RecognitionException {
		ImportDataContext _localctx = new ImportDataContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IMPORT);
			setState(230);
			match(BLANKSPACE);
			setState(231);
			match(LETTER);
			setState(232);
			match(BLANKSPACE);
			setState(233);
			match(FROM);
			setState(234);
			match(BLANKSPACE);
			setState(235);
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
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(237);
				pgDefition();
				}
				break;
			case 2:
				{
				setState(238);
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode BL() { return getToken(digits4Parser.BL, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public ImportDataContext importData() {
			return getRuleContext(ImportDataContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_line);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(241);
					entity();
					}
					break;
				case IMPORT:
					{
					setState(242);
					importData();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245);
				match(BL);
				}
				break;
			case BL:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
		public TerminalNode EOF() { return getToken(digits4Parser.EOF, 0); }
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
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				line();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << IMPORT) | (1L << BL))) != 0) );
			setState(255);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bT\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5"+
		"\13w\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0083\n\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\7\20\u00bd\n\20\f\20\16\20\u00c0\13\20\3\20\3\20\7\20\u00c4\n\20\f\20"+
		"\16\20\u00c7\13\20\3\20\3\20\7\20\u00cb\n\20\f\20\16\20\u00ce\13\20\3"+
		"\20\3\20\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21\3\21\3\21\7\21\u00da"+
		"\n\21\f\21\16\21\u00dd\13\21\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23"+
		"\u00f2\n\23\3\24\3\24\5\24\u00f6\n\24\3\24\3\24\3\24\5\24\u00fb\n\24\3"+
		"\25\6\25\u00fe\n\25\r\25\16\25\u00ff\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2!$\3\2\13\20\2\u0110\2*\3\2\2"+
		"\2\4\60\3\2\2\2\6\67\3\2\2\2\bA\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16\\\3\2"+
		"\2\2\20^\3\2\2\2\22l\3\2\2\2\24r\3\2\2\2\26\u0082\3\2\2\2\30\u0084\3\2"+
		"\2\2\32\u0086\3\2\2\2\34\u00aa\3\2\2\2\36\u00be\3\2\2\2 \u00d4\3\2\2\2"+
		"\"\u00e7\3\2\2\2$\u00f1\3\2\2\2&\u00fa\3\2\2\2(\u00fd\3\2\2\2*+\t\2\2"+
		"\2+\3\3\2\2\2,\61\7%\2\2-\61\7&\2\2.\61\7\'\2\2/\61\5\6\4\2\60,\3\2\2"+
		"\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\628\7(\2\2\63\64\7"+
		"\3\2\2\64\65\5\b\5\2\65\66\7\4\2\2\668\3\2\2\2\67\62\3\2\2\2\67\63\3\2"+
		"\2\28\7\3\2\2\29:\7)\2\2:;\7\5\2\2;<\7\n\2\2<=\7\6\2\2=B\5\b\5\2>?\7)"+
		"\2\2?@\7\5\2\2@B\7\n\2\2A9\3\2\2\2A>\3\2\2\2B\t\3\2\2\2CK\7/\2\2DK\7\n"+
		"\2\2EK\5\f\7\2FK\5\20\t\2GK\7*\2\2HK\5\22\n\2IK\5\24\13\2JC\3\2\2\2JD"+
		"\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\13\3\2\2\2"+
		"LM\7\3\2\2MN\5\16\b\2NO\7\4\2\2O\r\3\2\2\2PS\7+\2\2QR\7\7\2\2RT\7,\2\2"+
		"SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\6\2\2V]\5\16\b\2WZ\7+\2\2XY\7\7\2\2"+
		"Y[\7,\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\P\3\2\2\2\\W\3\2\2\2]\17\3\2"+
		"\2\2^_\7\3\2\2_`\7\n\2\2`a\7\6\2\2ab\7\n\2\2bc\7\6\2\2cd\7\n\2\2de\7\6"+
		"\2\2ef\7\n\2\2fg\7\6\2\2gh\7\n\2\2hi\7\6\2\2ij\7\n\2\2jk\7\4\2\2k\21\3"+
		"\2\2\2lm\7\3\2\2mn\7-\2\2no\7\6\2\2op\7-\2\2pq\7\4\2\2q\23\3\2\2\2rs\7"+
		"\3\2\2sv\7.\2\2tu\7\6\2\2uw\7.\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\4"+
		"\2\2y\25\3\2\2\2z\u0083\7\32\2\2{\u0083\7\33\2\2|\u0083\7\34\2\2}\u0083"+
		"\7\35\2\2~\u0083\7\36\2\2\177\u0083\7\37\2\2\u0080\u0083\7 \2\2\u0081"+
		"\u0083\5\30\r\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3"+
		"\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085\t\3\2\2\u0085\31\3\2\2\2\u0086\u0087"+
		"\7\23\2\2\u0087\u0088\7\b\2\2\u0088\u0089\7\24\2\2\u0089\u008a\7\b\2\2"+
		"\u008a\u008b\7\60\2\2\u008b\u008c\7\21\2\2\u008c\u008d\7\31\2\2\u008d"+
		"\u008e\5 \21\2\u008e\u008f\7\31\2\2\u008f\u0090\5 \21\2\u0090\u0091\7"+
		"\31\2\2\u0091\u0092\5 \21\2\u0092\u0093\7\31\2\2\u0093\u0094\5 \21\2\u0094"+
		"\u0095\7\31\2\2\u0095\u0096\5 \21\2\u0096\u0097\7\31\2\2\u0097\u0098\5"+
		" \21\2\u0098\u0099\7\31\2\2\u0099\u00a5\5 \21\2\u009a\u009b\7\31\2\2\u009b"+
		"\u009c\5 \21\2\u009c\u009d\7\31\2\2\u009d\u009e\5 \21\2\u009e\u009f\7"+
		"\31\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\5 \21\2\u00a2"+
		"\u00a3\7\31\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a6\3\2\2\2\u00a5\u009a\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\31\2\2\u00a8"+
		"\u00a9\7\22\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\7\b"+
		"\2\2\u00ac\u00ad\7\25\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00af\7\60\2\2\u00af"+
		"\u00b0\7\21\2\2\u00b0\u00b1\7\31\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3"+
		"\7\31\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7\31\2\2\u00b5\u00b6\5\36"+
		"\20\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\7\31\2\2"+
		"\u00b9\u00ba\7\22\2\2\u00ba\35\3\2\2\2\u00bb\u00bd\7\b\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c5\5\2\2\2\u00c2\u00c4\7\b"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cc\7\30"+
		"\2\2\u00c9\u00cb\7\b\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\5\4\3\2\u00d0\37\3\2\2\2\u00d1\u00d3\7\b\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00db\5\26\f\2\u00d8\u00da\7"+
		"\b\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\7\30"+
		"\2\2\u00df\u00e1\7\b\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\5\n\6\2\u00e6!\3\2\2\2\u00e7\u00e8\7\26\2\2\u00e8\u00e9"+
		"\7\b\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\7\27\2\2"+
		"\u00ec\u00ed\7\b\2\2\u00ed\u00ee\7\60\2\2\u00ee#\3\2\2\2\u00ef\u00f2\5"+
		"\32\16\2\u00f0\u00f2\5\34\17\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2%\3\2\2\2\u00f3\u00f6\5$\23\2\u00f4\u00f6\5\"\22\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\31\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00fb\7\31\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fb\'\3\2\2\2\u00fc\u00fe\5&\24\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\7\2\2\3\u0102)\3\2\2\2\26\60\67AJSZ\\v\u0082\u00a5\u00be\u00c5"+
		"\u00cc\u00d4\u00db\u00e2\u00f1\u00f5\u00fa\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}