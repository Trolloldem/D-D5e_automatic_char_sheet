// Generated from C:/Users/gianl/IdeaProjects/d_and_d_auto\digits4.g4 by ANTLR 4.8

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
		CREATE=17, PLAYER=18, EQUIPMENT=19, COLON=20, BL=21, RACE=22, HP=23, ARCHTYPE=24, 
		ABILITY=25, ALIGN=26, SKILLSID=27, LANG=28, ARMOR=29, WEAPON=30, SHIELD=31, 
		CONSUMABLES=32, ARMORTYPE=33, WEAPONTYPE=34, SHIELDPRESENCE=35, NONE=36, 
		CONSUMABLE=37, ALIGNMENT=38, PGCLASS=39, SUBCLASS=40, SKILL=41, LANGUAGE=42, 
		RACES=43, LETTER=44;
	public static final int
		RULE_piece = 0, RULE_pieceValue = 1, RULE_consumableVector = 2, RULE_consumableVectorElem = 3, 
		RULE_value = 4, RULE_classVector = 5, RULE_classVectorElem = 6, RULE_abilities = 7, 
		RULE_skills = 8, RULE_languages = 9, RULE_mandatory = 10, RULE_statID = 11, 
		RULE_pgDefition = 12, RULE_equipDefinition = 13, RULE_equipPiece = 14, 
		RULE_property = 15, RULE_entity = 16, RULE_start = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"piece", "pieceValue", "consumableVector", "consumableVectorElem", "value", 
			"classVector", "classVectorElem", "abilities", "skills", "languages", 
			"mandatory", "statID", "pgDefition", "equipDefinition", "equipPiece", 
			"property", "entity", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "','", "'->'", "' '", null, null, null, null, 
			null, null, null, null, "'{'", "'}'", "'create'", "'Player'", "'Equipment'", 
			"':'", null, null, null, null, null, null, null, null, "'armor'", "'weapon'", 
			"'shield'", "'consumables'", null, null, null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BLANKSPACE", "WS", "DIGIT", "STR", 
			"DEX", "CHA", "INT", "CON", "WIS", "STARTENTITY", "ENDENTITY", "CREATE", 
			"PLAYER", "EQUIPMENT", "COLON", "BL", "RACE", "HP", "ARCHTYPE", "ABILITY", 
			"ALIGN", "SKILLSID", "LANG", "ARMOR", "WEAPON", "SHIELD", "CONSUMABLES", 
			"ARMORTYPE", "WEAPONTYPE", "SHIELDPRESENCE", "NONE", "CONSUMABLE", "ALIGNMENT", 
			"PGCLASS", "SUBCLASS", "SKILL", "LANGUAGE", "RACES", "LETTER"
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
			setState(36);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARMORTYPE:
				{
				setState(38);
				match(ARMORTYPE);
				}
				break;
			case WEAPONTYPE:
				{
				setState(39);
				match(WEAPONTYPE);
				}
				break;
			case SHIELDPRESENCE:
				{
				setState(40);
				match(SHIELDPRESENCE);
				}
				break;
			case T__0:
			case NONE:
				{
				setState(41);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(NONE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(45);
				match(T__0);
				setState(46);
				consumableVectorElem();
				setState(47);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(51);
				match(CONSUMABLE);
				setState(52);
				match(T__2);
				setState(53);
				match(DIGIT);
				setState(54);
				match(T__3);
				setState(55);
				consumableVectorElem();
				}
				break;
			case 2:
				{
				setState(56);
				match(CONSUMABLE);
				setState(57);
				match(T__2);
				setState(58);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(61);
				match(RACES);
				}
				break;
			case 2:
				{
				setState(62);
				match(DIGIT);
				}
				break;
			case 3:
				{
				setState(63);
				classVector();
				}
				break;
			case 4:
				{
				setState(64);
				abilities();
				}
				break;
			case 5:
				{
				setState(65);
				match(ALIGNMENT);
				}
				break;
			case 6:
				{
				setState(66);
				skills();
				}
				break;
			case 7:
				{
				setState(67);
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
			setState(70);
			match(T__0);
			setState(71);
			classVectorElem();
			setState(72);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(74);
				match(PGCLASS);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(75);
					match(T__4);
					setState(76);
					match(SUBCLASS);
					}
				}

				setState(79);
				match(T__3);
				setState(80);
				classVectorElem();
				}
				break;
			case 2:
				{
				setState(81);
				match(PGCLASS);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(82);
					match(T__4);
					setState(83);
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
			setState(88);
			match(T__0);
			setState(89);
			match(DIGIT);
			setState(90);
			match(T__3);
			setState(91);
			match(DIGIT);
			setState(92);
			match(T__3);
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
			setState(102);
			match(T__0);
			setState(103);
			match(SKILL);
			setState(104);
			match(T__3);
			setState(105);
			match(SKILL);
			setState(106);
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
			setState(108);
			match(T__0);
			setState(109);
			match(LANGUAGE);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(110);
				match(T__3);
				setState(111);
				match(LANGUAGE);
				}
			}

			setState(114);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACE:
				{
				setState(116);
				match(RACE);
				}
				break;
			case HP:
				{
				setState(117);
				match(HP);
				}
				break;
			case ARCHTYPE:
				{
				setState(118);
				match(ARCHTYPE);
				}
				break;
			case ABILITY:
				{
				setState(119);
				match(ABILITY);
				}
				break;
			case ALIGN:
				{
				setState(120);
				match(ALIGN);
				}
				break;
			case SKILLSID:
				{
				setState(121);
				match(SKILLSID);
				}
				break;
			case LANG:
				{
				setState(122);
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
				setState(123);
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
			setState(126);
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
		public TerminalNode ENDENTITY() { return getToken(digits4Parser.ENDENTITY, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
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
			setState(128);
			match(CREATE);
			setState(129);
			match(BLANKSPACE);
			setState(130);
			match(PLAYER);
			setState(131);
			match(BLANKSPACE);
			setState(132);
			match(LETTER);
			setState(133);
			match(STARTENTITY);
			setState(134);
			match(BL);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(135);
				property();
				setState(136);
				match(BL);
				setState(137);
				property();
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
				}
				}
				break;
			case 2:
				{
				{
				setState(149);
				property();
				setState(150);
				match(BL);
				setState(151);
				property();
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
				}
				}
				break;
			}
			setState(175);
			match(BL);
			setState(176);
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
			setState(178);
			match(CREATE);
			setState(179);
			match(BLANKSPACE);
			setState(180);
			match(EQUIPMENT);
			setState(181);
			match(BLANKSPACE);
			setState(182);
			match(LETTER);
			setState(183);
			match(STARTENTITY);
			setState(184);
			match(BL);
			setState(185);
			equipPiece();
			setState(186);
			match(BL);
			setState(187);
			equipPiece();
			setState(188);
			match(BL);
			setState(189);
			equipPiece();
			setState(190);
			match(BL);
			setState(191);
			equipPiece();
			setState(192);
			match(BL);
			setState(193);
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(195);
				match(BLANKSPACE);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			piece();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(202);
				match(BLANKSPACE);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(COLON);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(209);
				match(BLANKSPACE);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
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
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(217);
				match(BLANKSPACE);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			mandatory();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(224);
				match(BLANKSPACE);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(COLON);
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
		enterRule(_localctx, 32, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(239);
				pgDefition();
				}
				break;
			case 2:
				{
				setState(240);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(digits4Parser.EOF, 0); }
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<TerminalNode> BL() { return getTokens(digits4Parser.BL); }
		public TerminalNode BL(int i) {
			return getToken(digits4Parser.BL, i);
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
		enterRule(_localctx, 34, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				entity();
				setState(244);
				match(BL);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CREATE );
			setState(250);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bP\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bW\n\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13s\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\177\n\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00b0\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\7\20\u00c7\n\20\f\20"+
		"\16\20\u00ca\13\20\3\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3"+
		"\20\3\20\7\20\u00d5\n\20\f\20\16\20\u00d8\13\20\3\20\3\20\3\21\7\21\u00dd"+
		"\n\21\f\21\16\21\u00e0\13\21\3\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7"+
		"\13\21\3\21\3\21\7\21\u00eb\n\21\f\21\16\21\u00ee\13\21\3\21\3\21\3\22"+
		"\3\22\5\22\u00f4\n\22\3\23\3\23\3\23\6\23\u00f9\n\23\r\23\16\23\u00fa"+
		"\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4"+
		"\3\2\37\"\3\2\13\20\2\u010b\2&\3\2\2\2\4,\3\2\2\2\6\63\3\2\2\2\b=\3\2"+
		"\2\2\nF\3\2\2\2\fH\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22h\3\2\2\2\24n\3\2"+
		"\2\2\26~\3\2\2\2\30\u0080\3\2\2\2\32\u0082\3\2\2\2\34\u00b4\3\2\2\2\36"+
		"\u00c8\3\2\2\2 \u00de\3\2\2\2\"\u00f3\3\2\2\2$\u00f8\3\2\2\2&\'\t\2\2"+
		"\2\'\3\3\2\2\2(-\7#\2\2)-\7$\2\2*-\7%\2\2+-\5\6\4\2,(\3\2\2\2,)\3\2\2"+
		"\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\64\7&\2\2/\60\7\3\2\2\60\61\5\b\5\2"+
		"\61\62\7\4\2\2\62\64\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\64\7\3\2\2\2\65\66"+
		"\7\'\2\2\66\67\7\5\2\2\678\7\n\2\289\7\6\2\29>\5\b\5\2:;\7\'\2\2;<\7\5"+
		"\2\2<>\7\n\2\2=\65\3\2\2\2=:\3\2\2\2>\t\3\2\2\2?G\7-\2\2@G\7\n\2\2AG\5"+
		"\f\7\2BG\5\20\t\2CG\7(\2\2DG\5\22\n\2EG\5\24\13\2F?\3\2\2\2F@\3\2\2\2"+
		"FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\13\3\2\2\2HI\7\3\2"+
		"\2IJ\5\16\b\2JK\7\4\2\2K\r\3\2\2\2LO\7)\2\2MN\7\7\2\2NP\7*\2\2OM\3\2\2"+
		"\2OP\3\2\2\2PQ\3\2\2\2QR\7\6\2\2RY\5\16\b\2SV\7)\2\2TU\7\7\2\2UW\7*\2"+
		"\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XL\3\2\2\2XS\3\2\2\2Y\17\3\2\2\2Z[\7\3"+
		"\2\2[\\\7\n\2\2\\]\7\6\2\2]^\7\n\2\2^_\7\6\2\2_`\7\n\2\2`a\7\6\2\2ab\7"+
		"\n\2\2bc\7\6\2\2cd\7\n\2\2de\7\6\2\2ef\7\n\2\2fg\7\4\2\2g\21\3\2\2\2h"+
		"i\7\3\2\2ij\7+\2\2jk\7\6\2\2kl\7+\2\2lm\7\4\2\2m\23\3\2\2\2no\7\3\2\2"+
		"or\7,\2\2pq\7\6\2\2qs\7,\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\4\2\2u"+
		"\25\3\2\2\2v\177\7\30\2\2w\177\7\31\2\2x\177\7\32\2\2y\177\7\33\2\2z\177"+
		"\7\34\2\2{\177\7\35\2\2|\177\7\36\2\2}\177\5\30\r\2~v\3\2\2\2~w\3\2\2"+
		"\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\27"+
		"\3\2\2\2\u0080\u0081\t\3\2\2\u0081\31\3\2\2\2\u0082\u0083\7\23\2\2\u0083"+
		"\u0084\7\b\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7\b\2\2\u0086\u0087\7"+
		".\2\2\u0087\u0088\7\21\2\2\u0088\u00af\7\27\2\2\u0089\u008a\5 \21\2\u008a"+
		"\u008b\7\27\2\2\u008b\u008c\5 \21\2\u008c\u008d\7\27\2\2\u008d\u008e\5"+
		" \21\2\u008e\u008f\7\27\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\27\2\2\u0091"+
		"\u0092\5 \21\2\u0092\u0093\7\27\2\2\u0093\u0094\5 \21\2\u0094\u0095\7"+
		"\27\2\2\u0095\u0096\5 \21\2\u0096\u00b0\3\2\2\2\u0097\u0098\5 \21\2\u0098"+
		"\u0099\7\27\2\2\u0099\u009a\5 \21\2\u009a\u009b\7\27\2\2\u009b\u009c\5"+
		" \21\2\u009c\u009d\7\27\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\27\2\2\u009f"+
		"\u00a0\5 \21\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\7"+
		"\27\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\5 \21\2\u00a6"+
		"\u00a7\7\27\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\5"+
		" \21\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\7\27\2\2\u00ad"+
		"\u00ae\5 \21\2\u00ae\u00b0\3\2\2\2\u00af\u0089\3\2\2\2\u00af\u0097\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\7\22\2\2\u00b3"+
		"\33\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\7\25"+
		"\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\7.\2\2\u00b9\u00ba\7\21\2\2\u00ba"+
		"\u00bb\7\27\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\7\27\2\2\u00bd\u00be"+
		"\5\36\20\2\u00be\u00bf\7\27\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\7\27"+
		"\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\7\27\2\2\u00c3\u00c4\7\22\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c7\7\b\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2"+
		"\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cf\5\2\2\2\u00cc\u00ce\7\b\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\7\26\2\2\u00d3\u00d5\7\b\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5\4\3\2\u00da"+
		"\37\3\2\2\2\u00db\u00dd\7\b\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e5\5\26\f\2\u00e2\u00e4\7\b\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ec\7\26\2\2\u00e9\u00eb\7\b\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5\n\6\2\u00f0"+
		"!\3\2\2\2\u00f1\u00f4\5\32\16\2\u00f2\u00f4\5\34\17\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7"+
		"\7\27\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\7\2\2\3\u00fd%\3\2\2\2\24,\63=FOVXr~\u00af\u00c8\u00cf\u00d6\u00de\u00e5"+
		"\u00ec\u00f3\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}