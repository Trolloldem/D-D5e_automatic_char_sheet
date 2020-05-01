// Generated from /home/oldem/IdeaProjects/D_and_D_Compiler/digits4.g4 by ANTLR 4.8

	package myLex;
	//import util.checkStats;
        //import util.classChecker; //util è il nome del mio package, chiamalo come vuoi te


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
		CONSUMABLE=37, PGCLASS=38, SUBCLASS=39, ALIGNMENT=40, SKILL=41, LANGUAGE=42, 
		RACES=43, LETTER=44, CLASS=45;
	public static final int
		RULE_piece = 0, RULE_pieceValue = 1, RULE_consumableVector = 2, RULE_consumableVectorElem = 3, 
		RULE_value = 4, RULE_classVector = 5, RULE_classVectorElem = 6, RULE_abilities = 7, 
		RULE_skills = 8, RULE_languages = 9, RULE_mandatory = 10, RULE_statID = 11, 
		RULE_stats = 12, RULE_stat_line = 13, RULE_sclass = 14, RULE_pgDefition = 15, 
		RULE_equipDefinition = 16, RULE_equipPiece = 17, RULE_property = 18, RULE_entity = 19, 
		RULE_start = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"piece", "pieceValue", "consumableVector", "consumableVectorElem", "value", 
			"classVector", "classVectorElem", "abilities", "skills", "languages", 
			"mandatory", "statID", "stats", "stat_line", "sclass", "pgDefition", 
			"equipDefinition", "equipPiece", "property", "entity", "start"
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
			"ARMORTYPE", "WEAPONTYPE", "SHIELDPRESENCE", "NONE", "CONSUMABLE", "PGCLASS", 
			"SUBCLASS", "ALIGNMENT", "SKILL", "LANGUAGE", "RACES", "LETTER", "CLASS"
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
			setState(42);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARMORTYPE:
				{
				setState(44);
				match(ARMORTYPE);
				}
				break;
			case WEAPONTYPE:
				{
				setState(45);
				match(WEAPONTYPE);
				}
				break;
			case SHIELDPRESENCE:
				{
				setState(46);
				match(SHIELDPRESENCE);
				}
				break;
			case T__0:
			case NONE:
				{
				setState(47);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(NONE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				consumableVectorElem();
				setState(53);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(57);
				match(CONSUMABLE);
				setState(58);
				match(T__2);
				setState(59);
				match(DIGIT);
				setState(60);
				match(T__3);
				setState(61);
				consumableVectorElem();
				}
				break;
			case 2:
				{
				setState(62);
				match(CONSUMABLE);
				setState(63);
				match(T__2);
				setState(64);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(67);
				match(RACES);
				}
				break;
			case 2:
				{
				setState(68);
				match(DIGIT);
				}
				break;
			case 3:
				{
				setState(69);
				classVector();
				}
				break;
			case 4:
				{
				setState(70);
				abilities();
				}
				break;
			case 5:
				{
				setState(71);
				match(ALIGNMENT);
				}
				break;
			case 6:
				{
				setState(72);
				skills();
				}
				break;
			case 7:
				{
				setState(73);
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
			setState(76);
			match(T__0);
			setState(77);
			classVectorElem();
			setState(78);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(80);
				match(PGCLASS);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(81);
					match(T__4);
					setState(82);
					match(SUBCLASS);
					}
				}

				setState(85);
				match(T__3);
				setState(86);
				classVectorElem();
				}
				break;
			case 2:
				{
				setState(87);
				match(PGCLASS);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(88);
					match(T__4);
					setState(89);
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
			setState(94);
			match(T__0);
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
			match(T__3);
			setState(105);
			match(DIGIT);
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
			setState(108);
			match(T__0);
			setState(109);
			match(SKILL);
			setState(110);
			match(T__3);
			setState(111);
			match(SKILL);
			setState(112);
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
			setState(114);
			match(T__0);
			setState(115);
			match(LANGUAGE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(116);
				match(T__3);
				setState(117);
				match(LANGUAGE);
				}
			}

			setState(120);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACE:
				{
				setState(122);
				match(RACE);
				}
				break;
			case HP:
				{
				setState(123);
				match(HP);
				}
				break;
			case ARCHTYPE:
				{
				setState(124);
				match(ARCHTYPE);
				}
				break;
			case ABILITY:
				{
				setState(125);
				match(ABILITY);
				}
				break;
			case ALIGN:
				{
				setState(126);
				match(ALIGN);
				}
				break;
			case SKILLSID:
				{
				setState(127);
				match(SKILLSID);
				}
				break;
			case LANG:
				{
				setState(128);
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
				setState(129);
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
			setState(132);
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

	public static class StatsContext extends ParserRuleContext {
		public List<Stat_lineContext> stat_line() {
			return getRuleContexts(Stat_lineContext.class);
		}
		public Stat_lineContext stat_line(int i) {
			return getRuleContext(Stat_lineContext.class,i);
		}
		public List<TerminalNode> BL() { return getTokens(digits4Parser.BL); }
		public TerminalNode BL(int i) {
			return getToken(digits4Parser.BL, i);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitStats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			stat_line();
			setState(135);
			match(BL);
			setState(136);
			stat_line();
			setState(137);
			match(BL);
			setState(138);
			stat_line();
			setState(139);
			match(BL);
			setState(140);
			stat_line();
			setState(141);
			match(BL);
			setState(142);
			stat_line();
			setState(143);
			match(BL);
			setState(144);
			stat_line();
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

	public static class Stat_lineContext extends ParserRuleContext {
		public StatIDContext no;
		public Token valore;
		public TerminalNode COLON() { return getToken(digits4Parser.COLON, 0); }
		public StatIDContext statID() {
			return getRuleContext(StatIDContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(digits4Parser.DIGIT, 0); }
		public Stat_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitStat_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_lineContext stat_line() throws RecognitionException {
		Stat_lineContext _localctx = new Stat_lineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stat_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((Stat_lineContext)_localctx).no = statID();
			setState(147);
			match(COLON);
			setState(148);
			((Stat_lineContext)_localctx).valore = match(DIGIT);
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

	public static class SclassContext extends ParserRuleContext {
		public Token cl;
		public TerminalNode CLASS() { return getToken(digits4Parser.CLASS, 0); }
		public TerminalNode COLON() { return getToken(digits4Parser.COLON, 0); }
		public TerminalNode LETTER() { return getToken(digits4Parser.LETTER, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public SclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitSclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SclassContext sclass() throws RecognitionException {
		SclassContext _localctx = new SclassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(CLASS);
			setState(151);
			match(COLON);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(152);
				match(BLANKSPACE);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			((SclassContext)_localctx).cl = match(LETTER);
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
		enterRule(_localctx, 30, RULE_pgDefition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CREATE);
			setState(161);
			match(BLANKSPACE);
			setState(162);
			match(PLAYER);
			setState(163);
			match(BLANKSPACE);
			setState(164);
			match(LETTER);
			setState(165);
			match(STARTENTITY);
			setState(166);
			match(BL);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
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
				}
				}
				break;
			case 2:
				{
				{
				setState(181);
				property();
				setState(182);
				match(BL);
				setState(183);
				property();
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
				}
				}
				break;
			}
			setState(207);
			match(BL);
			setState(208);
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
		enterRule(_localctx, 32, RULE_equipDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CREATE);
			setState(211);
			match(BLANKSPACE);
			setState(212);
			match(EQUIPMENT);
			setState(213);
			match(BLANKSPACE);
			setState(214);
			match(LETTER);
			setState(215);
			match(STARTENTITY);
			setState(216);
			match(BL);
			setState(217);
			equipPiece();
			setState(218);
			match(BL);
			setState(219);
			equipPiece();
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
		enterRule(_localctx, 34, RULE_equipPiece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			piece();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(228);
				match(BLANKSPACE);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(COLON);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(235);
				match(BLANKSPACE);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
		public ValueContext valore;
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
		enterRule(_localctx, 36, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			mandatory();
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
			match(COLON);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(251);
				match(BLANKSPACE);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			((PropertyContext)_localctx).valore = value();
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
		enterRule(_localctx, 38, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
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

	public static class StartContext extends ParserRuleContext {
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
		enterRule(_localctx, 40, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				entity();
				setState(264);
				match(BL);
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CREATE );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"D\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\5\bV\n\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\5\13y\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0085"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u009c\n\20\f\20\16\20\u009f"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d0\n\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\7\23\u00e8\n\23\f\23\16\23\u00eb\13\23\3\23\3\23\7\23"+
		"\u00ef\n\23\f\23\16\23\u00f2\13\23\3\23\3\23\3\24\3\24\7\24\u00f8\n\24"+
		"\f\24\16\24\u00fb\13\24\3\24\3\24\7\24\u00ff\n\24\f\24\16\24\u0102\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u0108\n\25\3\26\3\26\3\26\6\26\u010d\n\26"+
		"\r\26\16\26\u010e\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*\2\4\3\2\37\"\3\2\13\20\2\u0119\2,\3\2\2\2\4\62\3\2\2\2\69\3\2\2"+
		"\2\bC\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22n\3\2\2"+
		"\2\24t\3\2\2\2\26\u0084\3\2\2\2\30\u0086\3\2\2\2\32\u0088\3\2\2\2\34\u0094"+
		"\3\2\2\2\36\u0098\3\2\2\2 \u00a2\3\2\2\2\"\u00d4\3\2\2\2$\u00e5\3\2\2"+
		"\2&\u00f5\3\2\2\2(\u0107\3\2\2\2*\u010c\3\2\2\2,-\t\2\2\2-\3\3\2\2\2."+
		"\63\7#\2\2/\63\7$\2\2\60\63\7%\2\2\61\63\5\6\4\2\62.\3\2\2\2\62/\3\2\2"+
		"\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64:\7&\2\2\65\66\7\3\2\2\66"+
		"\67\5\b\5\2\678\7\4\2\28:\3\2\2\29\64\3\2\2\29\65\3\2\2\2:\7\3\2\2\2;"+
		"<\7\'\2\2<=\7\5\2\2=>\7\n\2\2>?\7\6\2\2?D\5\b\5\2@A\7\'\2\2AB\7\5\2\2"+
		"BD\7\n\2\2C;\3\2\2\2C@\3\2\2\2D\t\3\2\2\2EM\7-\2\2FM\7\n\2\2GM\5\f\7\2"+
		"HM\5\20\t\2IM\7*\2\2JM\5\22\n\2KM\5\24\13\2LE\3\2\2\2LF\3\2\2\2LG\3\2"+
		"\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NO\7\3\2\2OP\5"+
		"\16\b\2PQ\7\4\2\2Q\r\3\2\2\2RU\7(\2\2ST\7\7\2\2TV\7)\2\2US\3\2\2\2UV\3"+
		"\2\2\2VW\3\2\2\2WX\7\6\2\2X_\5\16\b\2Y\\\7(\2\2Z[\7\7\2\2[]\7)\2\2\\Z"+
		"\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^R\3\2\2\2^Y\3\2\2\2_\17\3\2\2\2`a\7\3\2"+
		"\2ab\7\n\2\2bc\7\6\2\2cd\7\n\2\2de\7\6\2\2ef\7\n\2\2fg\7\6\2\2gh\7\n\2"+
		"\2hi\7\6\2\2ij\7\n\2\2jk\7\6\2\2kl\7\n\2\2lm\7\4\2\2m\21\3\2\2\2no\7\3"+
		"\2\2op\7+\2\2pq\7\6\2\2qr\7+\2\2rs\7\4\2\2s\23\3\2\2\2tu\7\3\2\2ux\7,"+
		"\2\2vw\7\6\2\2wy\7,\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\4\2\2{\25\3"+
		"\2\2\2|\u0085\7\30\2\2}\u0085\7\31\2\2~\u0085\7\32\2\2\177\u0085\7\33"+
		"\2\2\u0080\u0085\7\34\2\2\u0081\u0085\7\35\2\2\u0082\u0085\7\36\2\2\u0083"+
		"\u0085\5\30\r\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\177"+
		"\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086\u0087\t\3\2\2\u0087\31\3\2\2\2\u0088"+
		"\u0089\5\34\17\2\u0089\u008a\7\27\2\2\u008a\u008b\5\34\17\2\u008b\u008c"+
		"\7\27\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\27\2\2\u008e\u008f\5\34"+
		"\17\2\u008f\u0090\7\27\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7\27\2\2"+
		"\u0092\u0093\5\34\17\2\u0093\33\3\2\2\2\u0094\u0095\5\30\r\2\u0095\u0096"+
		"\7\26\2\2\u0096\u0097\7\n\2\2\u0097\35\3\2\2\2\u0098\u0099\7/\2\2\u0099"+
		"\u009d\7\26\2\2\u009a\u009c\7\b\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1\37\3\2\2\2\u00a2\u00a3\7\23\2"+
		"\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6\7\b\2\2\u00a6"+
		"\u00a7\7.\2\2\u00a7\u00a8\7\21\2\2\u00a8\u00cf\7\27\2\2\u00a9\u00aa\5"+
		"&\24\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7\27\2\2\u00ad"+
		"\u00ae\5&\24\2\u00ae\u00af\7\27\2\2\u00af\u00b0\5&\24\2\u00b0\u00b1\7"+
		"\27\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3\7\27\2\2\u00b3\u00b4\5&\24\2\u00b4"+
		"\u00b5\7\27\2\2\u00b5\u00b6\5&\24\2\u00b6\u00d0\3\2\2\2\u00b7\u00b8\5"+
		"&\24\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\5&\24\2\u00ba\u00bb\7\27\2\2\u00bb"+
		"\u00bc\5&\24\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7"+
		"\27\2\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\5&\24\2\u00c2"+
		"\u00c3\7\27\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5\7\27\2\2\u00c5\u00c6\5"+
		"&\24\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9\7\27\2\2\u00c9"+
		"\u00ca\5&\24\2\u00ca\u00cb\7\27\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\7"+
		"\27\2\2\u00cd\u00ce\5&\24\2\u00ce\u00d0\3\2\2\2\u00cf\u00a9\3\2\2\2\u00cf"+
		"\u00b7\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3\7"+
		"\22\2\2\u00d3!\3\2\2\2\u00d4\u00d5\7\23\2\2\u00d5\u00d6\7\b\2\2\u00d6"+
		"\u00d7\7\25\2\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\7.\2\2\u00d9\u00da\7\21"+
		"\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7\27\2\2\u00dd"+
		"\u00de\5$\23\2\u00de\u00df\7\27\2\2\u00df\u00e0\5$\23\2\u00e0\u00e1\7"+
		"\27\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\7\22\2\2"+
		"\u00e4#\3\2\2\2\u00e5\u00e9\5\2\2\2\u00e6\u00e8\7\b\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\7\26\2\2\u00ed\u00ef\7"+
		"\b\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\5\4"+
		"\3\2\u00f4%\3\2\2\2\u00f5\u00f9\5\26\f\2\u00f6\u00f8\7\b\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0100\7\26\2\2\u00fd\u00ff\7"+
		"\b\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\5\n"+
		"\6\2\u0104\'\3\2\2\2\u0105\u0108\5 \21\2\u0106\u0108\5\"\22\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u0108)\3\2\2\2\u0109\u010a\5(\25\2\u010a"+
		"\u010b\7\27\2\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f+\3\2\2\2\23\629C"+
		"LU\\^x\u0084\u009d\u00cf\u00e9\u00f0\u00f9\u0100\u0107\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}