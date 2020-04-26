// Generated from /home/oldem/Desktop/ANTLR/GrammarFile/digits4.g4 by ANTLR 4.1

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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, BLANKSPACE=6, DIGIT=7, STR=8, 
		DEX=9, CHA=10, INT=11, CON=12, WIS=13, CLASS=14, STARTPG=15, ENDPG=16, 
		CREATE=17, COLON=18, BL=19, RACE=20, HP=21, ARCHTYPE=22, ABILITY=23, ALIGN=24, 
		SKILLSID=25, LANG=26, PGCLASS=27, SUBCLASS=28, MORALITY=29, LEGALITY=30, 
		SKILL=31, LANGUAGE=32, RACES=33, LETTER=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'_'", "'->'", "'('", "')'", "','", "' '", "DIGIT", "STR", 
		"DEX", "CHA", "INT", "CON", "WIS", "'Class'", "'{'", "'}'", "'Create '", 
		"':'", "'\n'", "RACE", "HP", "ARCHTYPE", "ABILITY", "ALIGN", "SKILLSID", 
		"LANG", "PGCLASS", "SUBCLASS", "MORALITY", "LEGALITY", "SKILL", "LANGUAGE", 
		"RACES", "LETTER"
	};
	public static final int
		RULE_value = 0, RULE_classVector = 1, RULE_classVectorElem = 2, RULE_abilities = 3, 
		RULE_alignment = 4, RULE_skills = 5, RULE_languages = 6, RULE_mandatory = 7, 
		RULE_statID = 8, RULE_stats = 9, RULE_stat_line = 10, RULE_sclass = 11, 
		RULE_pg = 12, RULE_pgBody = 13, RULE_property = 14, RULE_start = 15;
	public static final String[] ruleNames = {
		"value", "classVector", "classVectorElem", "abilities", "alignment", "skills", 
		"languages", "mandatory", "statID", "stats", "stat_line", "sclass", "pg", 
		"pgBody", "property", "start"
	};

	@Override
	public String getGrammarFileName() { return "digits4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public digits4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode RACES() { return getToken(digits4Parser.RACES, 0); }
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public ClassVectorContext classVector() {
			return getRuleContext(ClassVectorContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(digits4Parser.DIGIT, 0); }
		public AbilitiesContext abilities() {
			return getRuleContext(AbilitiesContext.class,0);
		}
		public LanguagesContext languages() {
			return getRuleContext(LanguagesContext.class,0);
		}
		public SkillsContext skills() {
			return getRuleContext(SkillsContext.class,0);
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
		enterRule(_localctx, 0, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(32); match(RACES);
				}
				break;

			case 2:
				{
				setState(33); match(DIGIT);
				}
				break;

			case 3:
				{
				setState(34); classVector();
				}
				break;

			case 4:
				{
				setState(35); abilities();
				}
				break;

			case 5:
				{
				setState(36); alignment();
				}
				break;

			case 6:
				{
				setState(37); skills();
				}
				break;

			case 7:
				{
				setState(38); languages();
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
		enterRule(_localctx, 2, RULE_classVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41); match(3);
			setState(42); classVectorElem();
			setState(43); match(4);
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
		public TerminalNode SUBCLASS() { return getToken(digits4Parser.SUBCLASS, 0); }
		public ClassVectorElemContext classVectorElem() {
			return getRuleContext(ClassVectorElemContext.class,0);
		}
		public TerminalNode PGCLASS() { return getToken(digits4Parser.PGCLASS, 0); }
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
		enterRule(_localctx, 4, RULE_classVectorElem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(45); match(PGCLASS);
				setState(48);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(46); match(2);
					setState(47); match(SUBCLASS);
					}
				}

				setState(50); match(5);
				setState(51); classVectorElem();
				}
				break;

			case 2:
				{
				setState(52); match(PGCLASS);
				setState(55);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(53); match(2);
					setState(54); match(SUBCLASS);
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
		public TerminalNode DIGIT(int i) {
			return getToken(digits4Parser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(digits4Parser.DIGIT); }
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
		enterRule(_localctx, 6, RULE_abilities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(3);
			setState(60); match(DIGIT);
			setState(61); match(5);
			setState(62); match(DIGIT);
			setState(63); match(5);
			setState(64); match(DIGIT);
			setState(65); match(5);
			setState(66); match(DIGIT);
			setState(67); match(5);
			setState(68); match(DIGIT);
			setState(69); match(5);
			setState(70); match(DIGIT);
			setState(71); match(4);
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

	public static class AlignmentContext extends ParserRuleContext {
		public TerminalNode MORALITY() { return getToken(digits4Parser.MORALITY, 0); }
		public TerminalNode LEGALITY() { return getToken(digits4Parser.LEGALITY, 0); }
		public AlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentContext alignment() throws RecognitionException {
		AlignmentContext _localctx = new AlignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(73); match(LEGALITY);
			setState(74); match(1);
			setState(75); match(MORALITY);
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

	public static class SkillsContext extends ParserRuleContext {
		public TerminalNode SKILL(int i) {
			return getToken(digits4Parser.SKILL, i);
		}
		public List<TerminalNode> SKILL() { return getTokens(digits4Parser.SKILL); }
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
		enterRule(_localctx, 10, RULE_skills);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(3);
			setState(78); match(SKILL);
			setState(79); match(5);
			setState(80); match(SKILL);
			setState(81); match(4);
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
		public TerminalNode LANGUAGE(int i) {
			return getToken(digits4Parser.LANGUAGE, i);
		}
		public List<TerminalNode> LANGUAGE() { return getTokens(digits4Parser.LANGUAGE); }
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
		enterRule(_localctx, 12, RULE_languages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(3);
			setState(84); match(LANGUAGE);
			setState(87);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(85); match(5);
				setState(86); match(LANGUAGE);
				}
			}

			setState(89); match(4);
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
		public TerminalNode ARCHTYPE() { return getToken(digits4Parser.ARCHTYPE, 0); }
		public TerminalNode ABILITY() { return getToken(digits4Parser.ABILITY, 0); }
		public TerminalNode RACE() { return getToken(digits4Parser.RACE, 0); }
		public TerminalNode HP() { return getToken(digits4Parser.HP, 0); }
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
		enterRule(_localctx, 14, RULE_mandatory);
		int _la;
		try {
			setState(93);
			switch (_input.LA(1)) {
			case RACE:
			case HP:
			case ARCHTYPE:
			case ABILITY:
			case ALIGN:
			case SKILLSID:
			case LANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RACE) | (1L << HP) | (1L << ARCHTYPE) | (1L << ABILITY) | (1L << ALIGN) | (1L << SKILLSID) | (1L << LANG))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case STR:
			case DEX:
			case CHA:
			case INT:
			case CON:
			case WIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); statID();
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

	public static class StatIDContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(digits4Parser.STR, 0); }
		public TerminalNode CON() { return getToken(digits4Parser.CON, 0); }
		public TerminalNode DEX() { return getToken(digits4Parser.DEX, 0); }
		public TerminalNode INT() { return getToken(digits4Parser.INT, 0); }
		public TerminalNode WIS() { return getToken(digits4Parser.WIS, 0); }
		public TerminalNode CHA() { return getToken(digits4Parser.CHA, 0); }
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
		enterRule(_localctx, 16, RULE_statID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << DEX) | (1L << CHA) | (1L << INT) | (1L << CON) | (1L << WIS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public Stat_lineContext stat_line(int i) {
			return getRuleContext(Stat_lineContext.class,i);
		}
		public List<TerminalNode> BL() { return getTokens(digits4Parser.BL); }
		public TerminalNode BL(int i) {
			return getToken(digits4Parser.BL, i);
		}
		public List<Stat_lineContext> stat_line() {
			return getRuleContexts(Stat_lineContext.class);
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
		enterRule(_localctx, 18, RULE_stats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); stat_line();
			setState(98); match(BL);
			setState(99); stat_line();
			setState(100); match(BL);
			setState(101); stat_line();
			setState(102); match(BL);
			setState(103); stat_line();
			setState(104); match(BL);
			setState(105); stat_line();
			setState(106); match(BL);
			setState(107); stat_line();
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
		public TerminalNode DIGIT() { return getToken(digits4Parser.DIGIT, 0); }
		public StatIDContext statID() {
			return getRuleContext(StatIDContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_stat_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); ((Stat_lineContext)_localctx).no = statID();
			setState(110); match(COLON);
			setState(111); ((Stat_lineContext)_localctx).valore = match(DIGIT);
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
		public TerminalNode LETTER() { return getToken(digits4Parser.LETTER, 0); }
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public TerminalNode COLON() { return getToken(digits4Parser.COLON, 0); }
		public TerminalNode CLASS() { return getToken(digits4Parser.CLASS, 0); }
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
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
		enterRule(_localctx, 22, RULE_sclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(CLASS);
			setState(114); match(COLON);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(115); match(BLANKSPACE);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); ((SclassContext)_localctx).cl = match(LETTER);
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

	public static class PgContext extends ParserRuleContext {
		public StatsContext val;
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(digits4Parser.LETTER, 0); }
		public TerminalNode STARTPG() { return getToken(digits4Parser.STARTPG, 0); }
		public List<TerminalNode> BL() { return getTokens(digits4Parser.BL); }
		public TerminalNode CREATE() { return getToken(digits4Parser.CREATE, 0); }
		public TerminalNode BL(int i) {
			return getToken(digits4Parser.BL, i);
		}
		public TerminalNode ENDPG() { return getToken(digits4Parser.ENDPG, 0); }
		public PgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitPg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PgContext pg() throws RecognitionException {
		PgContext _localctx = new PgContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(CREATE);
			setState(124); match(LETTER);
			setState(126);
			_la = _input.LA(1);
			if (_la==BL) {
				{
				setState(125); match(BL);
				}
			}

			setState(128); match(STARTPG);
			setState(129); ((PgContext)_localctx).val = stats();
			setState(131);
			_la = _input.LA(1);
			if (_la==BL) {
				{
				setState(130); match(BL);
				}
			}

			setState(133); match(ENDPG);
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

	public static class PgBodyContext extends ParserRuleContext {
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> BL() { return getTokens(digits4Parser.BL); }
		public TerminalNode BL(int i) {
			return getToken(digits4Parser.BL, i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PgBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof digits4Visitor ) return ((digits4Visitor<? extends T>)visitor).visitPgBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PgBodyContext pgBody() throws RecognitionException {
		PgBodyContext _localctx = new PgBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pgBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135); property();
				setState(137);
				_la = _input.LA(1);
				if (_la==BL) {
					{
					setState(136); match(BL);
					}
				}

				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << DEX) | (1L << CHA) | (1L << INT) | (1L << CON) | (1L << WIS) | (1L << RACE) | (1L << HP) | (1L << ARCHTYPE) | (1L << ABILITY) | (1L << ALIGN) | (1L << SKILLSID) | (1L << LANG))) != 0) );
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode BLANKSPACE(int i) {
			return getToken(digits4Parser.BLANKSPACE, i);
		}
		public TerminalNode COLON() { return getToken(digits4Parser.COLON, 0); }
		public MandatoryContext mandatory() {
			return getRuleContext(MandatoryContext.class,0);
		}
		public List<TerminalNode> BLANKSPACE() { return getTokens(digits4Parser.BLANKSPACE); }
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
		enterRule(_localctx, 28, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); mandatory();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(144); match(BLANKSPACE);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(COLON);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANKSPACE) {
				{
				{
				setState(151); match(BLANKSPACE);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157); ((PropertyContext)_localctx).valore = value();
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
		public PgBodyContext pgBody() {
			return getRuleContext(PgBodyContext.class,0);
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
		enterRule(_localctx, 30, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); pgBody();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\63\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4:\n\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\5\bZ\n\b\3\b\3\b\3\t\3\t\5\t`\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r"+
		"w\n\r\f\r\16\rz\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u0081\n\16\3\16\3\16"+
		"\3\16\5\16\u0086\n\16\3\16\3\16\3\17\3\17\5\17\u008c\n\17\6\17\u008e\n"+
		"\17\r\17\16\17\u008f\3\20\3\20\7\20\u0094\n\20\f\20\16\20\u0097\13\20"+
		"\3\20\3\20\7\20\u009b\n\20\f\20\16\20\u009e\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\26\34\3\2\n"+
		"\17\u00a5\2)\3\2\2\2\4+\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nK\3\2\2\2\fO\3"+
		"\2\2\2\16U\3\2\2\2\20_\3\2\2\2\22a\3\2\2\2\24c\3\2\2\2\26o\3\2\2\2\30"+
		"s\3\2\2\2\32}\3\2\2\2\34\u008d\3\2\2\2\36\u0091\3\2\2\2 \u00a1\3\2\2\2"+
		"\"*\7#\2\2#*\7\t\2\2$*\5\4\3\2%*\5\b\5\2&*\5\n\6\2\'*\5\f\7\2(*\5\16\b"+
		"\2)\"\3\2\2\2)#\3\2\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2"+
		"\2\2*\3\3\2\2\2+,\7\5\2\2,-\5\6\4\2-.\7\6\2\2.\5\3\2\2\2/\62\7\35\2\2"+
		"\60\61\7\4\2\2\61\63\7\36\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2"+
		"\2\64\65\7\7\2\2\65<\5\6\4\2\669\7\35\2\2\678\7\4\2\28:\7\36\2\29\67\3"+
		"\2\2\29:\3\2\2\2:<\3\2\2\2;/\3\2\2\2;\66\3\2\2\2<\7\3\2\2\2=>\7\5\2\2"+
		">?\7\t\2\2?@\7\7\2\2@A\7\t\2\2AB\7\7\2\2BC\7\t\2\2CD\7\7\2\2DE\7\t\2\2"+
		"EF\7\7\2\2FG\7\t\2\2GH\7\7\2\2HI\7\t\2\2IJ\7\6\2\2J\t\3\2\2\2KL\7 \2\2"+
		"LM\7\3\2\2MN\7\37\2\2N\13\3\2\2\2OP\7\5\2\2PQ\7!\2\2QR\7\7\2\2RS\7!\2"+
		"\2ST\7\6\2\2T\r\3\2\2\2UV\7\5\2\2VY\7\"\2\2WX\7\7\2\2XZ\7\"\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\6\2\2\\\17\3\2\2\2]`\t\2\2\2^`\5\22\n\2"+
		"_]\3\2\2\2_^\3\2\2\2`\21\3\2\2\2ab\t\3\2\2b\23\3\2\2\2cd\5\26\f\2de\7"+
		"\25\2\2ef\5\26\f\2fg\7\25\2\2gh\5\26\f\2hi\7\25\2\2ij\5\26\f\2jk\7\25"+
		"\2\2kl\5\26\f\2lm\7\25\2\2mn\5\26\f\2n\25\3\2\2\2op\5\22\n\2pq\7\24\2"+
		"\2qr\7\t\2\2r\27\3\2\2\2st\7\20\2\2tx\7\24\2\2uw\7\b\2\2vu\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|\31\3\2\2\2}~"+
		"\7\23\2\2~\u0080\7$\2\2\177\u0081\7\25\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\21\2\2\u0083\u0085\5\24\13"+
		"\2\u0084\u0086\7\25\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\7\22\2\2\u0088\33\3\2\2\2\u0089\u008b\5\36"+
		"\20\2\u008a\u008c\7\25\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0089\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\35\3\2\2\2\u0091\u0095\5\20\t\2\u0092\u0094"+
		"\7\b\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009c\7\24"+
		"\2\2\u0099\u009b\7\b\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\5\2\2\2\u00a0\37\3\2\2\2\u00a1\u00a2\5\34\17\2\u00a2"+
		"!\3\2\2\2\17)\629;Y_x\u0080\u0085\u008b\u008f\u0095\u009c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}