// Generated from D:/ehsan/university/term4/language & machin theorem/hash_language/Hash_language_proje/src/Hash.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HashParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, IMPORT=2, CLASS=3, THIS=4, NEW=5, DEFINE=6, RETURN=7, INT=8, 
		FLOAT=9, BOOLEAN=10, STRING=11, CHAR=12, VOID=13, NULL=14, TRUE=15, FALSE=16, 
		IF=17, IS=18, ELSE=19, WHILE=20, FOR=21, BREAK=22, CONTINUE=23, SWITCH=24, 
		CASE=25, DEFAULT=26, TRY=27, CATCH=28, FINALLY=29, THROWS=30, PRINT=31, 
		INPUT=32, OP=33, CP=34, OB=35, CB=36, PLUS=37, MINUS=38, SEMICOLEN=39, 
		ASSIGNMENT=40, DIVISION=41, MULTIPLICATION=42, NOT=43, DOT=44, COMMA=45, 
		MODULO=46, POWER=47, EQUALITY=48, COMPARITIONAL=49, LOGICAL_OR=50, LOGICAL_AND=51, 
		INCREEMENT=52, DECREEMENT=53, INT_LITERAL=54, FLOAT_LITERAL=55, STRING_LITERAL=56, 
		CHAR_LITERAL=57, IDENTIFIER=58, LINE_COMMENT=59, BLOCK_COMMENT=60, WS=61;
	public static final int
		RULE_startState = 0, RULE_supportedStatements = 1, RULE_functionStatemnets = 2, 
		RULE_functionTypesApproaches = 3, RULE_intReturn = 4, RULE_floatReturn = 5, 
		RULE_boolReturn = 6, RULE_charReturn = 7, RULE_stringReturn = 8, RULE_voidReturn = 9, 
		RULE_functionParameters = 10, RULE_intFunctionBody = 11, RULE_floatFunctionBody = 12, 
		RULE_boolFunctionBody = 13, RULE_charFunctionBody = 14, RULE_stringFunctionBody = 15, 
		RULE_voidFunctionBody = 16, RULE_intFunctionStatement = 17, RULE_floatFunctionStatement = 18, 
		RULE_boolFunctionStatement = 19, RULE_charFunctionStatement = 20, RULE_stringFunctionStatement = 21, 
		RULE_voidFunctionStatement = 22, RULE_intReturnStatement = 23, RULE_floatReturnStatement = 24, 
		RULE_boolReturnStatement = 25, RULE_charReturnStatement = 26, RULE_stringReturnStatement = 27, 
		RULE_voidReturnStatement = 28, RULE_switchStatements = 29, RULE_caseStatements = 30, 
		RULE_loopStatements = 31, RULE_forStatement = 32, RULE_whileStatement = 33, 
		RULE_goToStatements = 34, RULE_importStatements = 35, RULE_moduleStatements = 36, 
		RULE_assignmentsStatemetns = 37, RULE_ifElseStatments = 38, RULE_condition = 39, 
		RULE_loopBodyStatement = 40, RULE_ifElseStatmentsInLoop = 41, RULE_update = 42, 
		RULE_expression = 43, RULE_logicalOrExpression = 44, RULE_logicalAndExpression = 45, 
		RULE_equalityExpression = 46, RULE_comparitioanlExpression = 47, RULE_additiveExpression = 48, 
		RULE_multiplicativeExpression = 49, RULE_unaryExpression = 50, RULE_powerExpression = 51, 
		RULE_postfixExpression = 52, RULE_primaryExpression = 53, RULE_type = 54, 
		RULE_literal = 55, RULE_packageName = 56, RULE_moduleName = 57, RULE_booleanLiteral = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"startState", "supportedStatements", "functionStatemnets", "functionTypesApproaches", 
			"intReturn", "floatReturn", "boolReturn", "charReturn", "stringReturn", 
			"voidReturn", "functionParameters", "intFunctionBody", "floatFunctionBody", 
			"boolFunctionBody", "charFunctionBody", "stringFunctionBody", "voidFunctionBody", 
			"intFunctionStatement", "floatFunctionStatement", "boolFunctionStatement", 
			"charFunctionStatement", "stringFunctionStatement", "voidFunctionStatement", 
			"intReturnStatement", "floatReturnStatement", "boolReturnStatement", 
			"charReturnStatement", "stringReturnStatement", "voidReturnStatement", 
			"switchStatements", "caseStatements", "loopStatements", "forStatement", 
			"whileStatement", "goToStatements", "importStatements", "moduleStatements", 
			"assignmentsStatemetns", "ifElseStatments", "condition", "loopBodyStatement", 
			"ifElseStatmentsInLoop", "update", "expression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "comparitioanlExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"powerExpression", "postfixExpression", "primaryExpression", "type", 
			"literal", "packageName", "moduleName", "booleanLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'baste'", "'biar'", "'klass'", "'in'", "'jadid'", "'bebin'", "'bede'", 
			"'adad'", "'ashari'", "'boole'", "'matn'", "'harf'", "'hich'", "'khali'", 
			"'dorost'", "'ghalat'", "'age'", "'bood'", "'vagarna'", "'ta'", "'baraye'", 
			"'shekan'", "'edame'", "'entekhab'", "'halat'", "'digar'", "'emtehan'", 
			"'gereftar'", "'akhar'", "'bendaz'", "'bechap'", "'bekhan'", "'('", "')'", 
			"'{'", "'}'", "'+'", "'-'", "';'", null, "'/'", "'*'", "'!'", "'.'", 
			"','", "'%'", "'**'", null, null, "'||'", "'&&'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODULE", "IMPORT", "CLASS", "THIS", "NEW", "DEFINE", "RETURN", 
			"INT", "FLOAT", "BOOLEAN", "STRING", "CHAR", "VOID", "NULL", "TRUE", 
			"FALSE", "IF", "IS", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "SWITCH", 
			"CASE", "DEFAULT", "TRY", "CATCH", "FINALLY", "THROWS", "PRINT", "INPUT", 
			"OP", "CP", "OB", "CB", "PLUS", "MINUS", "SEMICOLEN", "ASSIGNMENT", "DIVISION", 
			"MULTIPLICATION", "NOT", "DOT", "COMMA", "MODULO", "POWER", "EQUALITY", 
			"COMPARITIONAL", "LOGICAL_OR", "LOGICAL_AND", "INCREEMENT", "DECREEMENT", 
			"INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "IDENTIFIER", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "Hash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartStateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HashParser.EOF, 0); }
		public List<SupportedStatementsContext> supportedStatements() {
			return getRuleContexts(SupportedStatementsContext.class);
		}
		public SupportedStatementsContext supportedStatements(int i) {
			return getRuleContext(SupportedStatementsContext.class,i);
		}
		public StartStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterStartState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitStartState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitStartState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartStateContext startState() throws RecognitionException {
		StartStateContext _localctx = new StartStateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062022L) != 0)) {
				{
				{
				setState(118);
				supportedStatements();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SupportedStatementsContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public ModuleStatementsContext moduleStatements() {
			return getRuleContext(ModuleStatementsContext.class,0);
		}
		public ImportStatementsContext importStatements() {
			return getRuleContext(ImportStatementsContext.class,0);
		}
		public IfElseStatmentsContext ifElseStatments() {
			return getRuleContext(IfElseStatmentsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public SwitchStatementsContext switchStatements() {
			return getRuleContext(SwitchStatementsContext.class,0);
		}
		public FunctionStatemnetsContext functionStatemnets() {
			return getRuleContext(FunctionStatemnetsContext.class,0);
		}
		public SupportedStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportedStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterSupportedStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitSupportedStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitSupportedStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportedStatementsContext supportedStatements() throws RecognitionException {
		SupportedStatementsContext _localctx = new SupportedStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_supportedStatements);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				assignmentsStatemetns();
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				moduleStatements();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				importStatements();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				ifElseStatments();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				loopStatements();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				switchStatements();
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				functionStatemnets();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatemnetsContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(HashParser.DEFINE, 0); }
		public FunctionTypesApproachesContext functionTypesApproaches() {
			return getRuleContext(FunctionTypesApproachesContext.class,0);
		}
		public FunctionStatemnetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatemnets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFunctionStatemnets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFunctionStatemnets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFunctionStatemnets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatemnetsContext functionStatemnets() throws RecognitionException {
		FunctionStatemnetsContext _localctx = new FunctionStatemnetsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionStatemnets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(DEFINE);
			setState(136);
			functionTypesApproaches();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypesApproachesContext extends ParserRuleContext {
		public IntReturnContext intReturn() {
			return getRuleContext(IntReturnContext.class,0);
		}
		public FloatReturnContext floatReturn() {
			return getRuleContext(FloatReturnContext.class,0);
		}
		public BoolReturnContext boolReturn() {
			return getRuleContext(BoolReturnContext.class,0);
		}
		public CharReturnContext charReturn() {
			return getRuleContext(CharReturnContext.class,0);
		}
		public StringReturnContext stringReturn() {
			return getRuleContext(StringReturnContext.class,0);
		}
		public VoidReturnContext voidReturn() {
			return getRuleContext(VoidReturnContext.class,0);
		}
		public FunctionTypesApproachesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypesApproaches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFunctionTypesApproaches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFunctionTypesApproaches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFunctionTypesApproaches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypesApproachesContext functionTypesApproaches() throws RecognitionException {
		FunctionTypesApproachesContext _localctx = new FunctionTypesApproachesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionTypesApproaches);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				intReturn();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				floatReturn();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				boolReturn();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				charReturn();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				stringReturn();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				voidReturn();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntReturnContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HashParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public IntFunctionBodyContext intFunctionBody() {
			return getRuleContext(IntFunctionBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public IntReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIntReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIntReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIntReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntReturnContext intReturn() throws RecognitionException {
		IntReturnContext _localctx = new IntReturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(INT);
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(OP);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(149);
				functionParameters();
				}
			}

			setState(152);
			match(CP);
			setState(153);
			match(OB);
			setState(154);
			intFunctionBody();
			setState(155);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatReturnContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(HashParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public FloatFunctionBodyContext floatFunctionBody() {
			return getRuleContext(FloatFunctionBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FloatReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFloatReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFloatReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFloatReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatReturnContext floatReturn() throws RecognitionException {
		FloatReturnContext _localctx = new FloatReturnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(FLOAT);
			setState(158);
			match(IDENTIFIER);
			setState(159);
			match(OP);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(160);
				functionParameters();
				}
			}

			setState(163);
			match(CP);
			setState(164);
			match(OB);
			setState(165);
			floatFunctionBody();
			setState(166);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolReturnContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(HashParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public BoolFunctionBodyContext boolFunctionBody() {
			return getRuleContext(BoolFunctionBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public BoolReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterBoolReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitBoolReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitBoolReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolReturnContext boolReturn() throws RecognitionException {
		BoolReturnContext _localctx = new BoolReturnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(BOOLEAN);
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(OP);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(171);
				functionParameters();
				}
			}

			setState(174);
			match(CP);
			setState(175);
			match(OB);
			setState(176);
			boolFunctionBody();
			setState(177);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharReturnContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(HashParser.CHAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public CharFunctionBodyContext charFunctionBody() {
			return getRuleContext(CharFunctionBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public CharReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCharReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCharReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCharReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharReturnContext charReturn() throws RecognitionException {
		CharReturnContext _localctx = new CharReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_charReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CHAR);
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(OP);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(182);
				functionParameters();
				}
			}

			setState(185);
			match(CP);
			setState(186);
			match(OB);
			setState(187);
			charFunctionBody();
			setState(188);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringReturnContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HashParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public StringFunctionBodyContext stringFunctionBody() {
			return getRuleContext(StringFunctionBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public StringReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterStringReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitStringReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitStringReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringReturnContext stringReturn() throws RecognitionException {
		StringReturnContext _localctx = new StringReturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(STRING);
			setState(191);
			match(IDENTIFIER);
			setState(192);
			match(OP);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(193);
				functionParameters();
				}
			}

			setState(196);
			match(CP);
			setState(197);
			match(OB);
			setState(198);
			stringFunctionBody();
			setState(199);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidReturnContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(HashParser.VOID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public VoidFunctionBodyContext voidFunctionBody() {
			return getRuleContext(VoidFunctionBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public VoidReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterVoidReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitVoidReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitVoidReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidReturnContext voidReturn() throws RecognitionException {
		VoidReturnContext _localctx = new VoidReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_voidReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(VOID);
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(OP);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(204);
				functionParameters();
				}
			}

			setState(207);
			match(CP);
			setState(208);
			match(OB);
			setState(209);
			voidFunctionBody();
			setState(210);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HashParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HashParser.COMMA, i);
		}
		public List<FunctionParametersContext> functionParameters() {
			return getRuleContexts(FunctionParametersContext.class);
		}
		public FunctionParametersContext functionParameters(int i) {
			return getRuleContext(FunctionParametersContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			type();
			setState(213);
			match(IDENTIFIER);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(COMMA);
					setState(215);
					functionParameters();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntFunctionBodyContext extends ParserRuleContext {
		public IntReturnStatementContext intReturnStatement() {
			return getRuleContext(IntReturnStatementContext.class,0);
		}
		public List<IntFunctionStatementContext> intFunctionStatement() {
			return getRuleContexts(IntFunctionStatementContext.class);
		}
		public IntFunctionStatementContext intFunctionStatement(int i) {
			return getRuleContext(IntFunctionStatementContext.class,i);
		}
		public IntFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIntFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIntFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIntFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntFunctionBodyContext intFunctionBody() throws RecognitionException {
		IntFunctionBodyContext _localctx = new IntFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intFunctionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					intFunctionStatement();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(227);
			intReturnStatement();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062080L) != 0)) {
				{
				{
				setState(228);
				intFunctionStatement();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatFunctionBodyContext extends ParserRuleContext {
		public FloatReturnStatementContext floatReturnStatement() {
			return getRuleContext(FloatReturnStatementContext.class,0);
		}
		public List<FloatFunctionStatementContext> floatFunctionStatement() {
			return getRuleContexts(FloatFunctionStatementContext.class);
		}
		public FloatFunctionStatementContext floatFunctionStatement(int i) {
			return getRuleContext(FloatFunctionStatementContext.class,i);
		}
		public FloatFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFloatFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFloatFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFloatFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatFunctionBodyContext floatFunctionBody() throws RecognitionException {
		FloatFunctionBodyContext _localctx = new FloatFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_floatFunctionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					floatFunctionStatement();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(240);
			floatReturnStatement();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062080L) != 0)) {
				{
				{
				setState(241);
				floatFunctionStatement();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolFunctionBodyContext extends ParserRuleContext {
		public BoolReturnStatementContext boolReturnStatement() {
			return getRuleContext(BoolReturnStatementContext.class,0);
		}
		public List<BoolFunctionStatementContext> boolFunctionStatement() {
			return getRuleContexts(BoolFunctionStatementContext.class);
		}
		public BoolFunctionStatementContext boolFunctionStatement(int i) {
			return getRuleContext(BoolFunctionStatementContext.class,i);
		}
		public BoolFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterBoolFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitBoolFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitBoolFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolFunctionBodyContext boolFunctionBody() throws RecognitionException {
		BoolFunctionBodyContext _localctx = new BoolFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolFunctionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					boolFunctionStatement();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(253);
			boolReturnStatement();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062080L) != 0)) {
				{
				{
				setState(254);
				boolFunctionStatement();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharFunctionBodyContext extends ParserRuleContext {
		public CharReturnStatementContext charReturnStatement() {
			return getRuleContext(CharReturnStatementContext.class,0);
		}
		public List<CharFunctionStatementContext> charFunctionStatement() {
			return getRuleContexts(CharFunctionStatementContext.class);
		}
		public CharFunctionStatementContext charFunctionStatement(int i) {
			return getRuleContext(CharFunctionStatementContext.class,i);
		}
		public CharFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCharFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCharFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCharFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionBodyContext charFunctionBody() throws RecognitionException {
		CharFunctionBodyContext _localctx = new CharFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_charFunctionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					charFunctionStatement();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(266);
			charReturnStatement();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062086L) != 0)) {
				{
				{
				setState(267);
				charFunctionStatement();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringFunctionBodyContext extends ParserRuleContext {
		public StringReturnStatementContext stringReturnStatement() {
			return getRuleContext(StringReturnStatementContext.class,0);
		}
		public List<StringFunctionStatementContext> stringFunctionStatement() {
			return getRuleContexts(StringFunctionStatementContext.class);
		}
		public StringFunctionStatementContext stringFunctionStatement(int i) {
			return getRuleContext(StringFunctionStatementContext.class,i);
		}
		public StringFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterStringFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitStringFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitStringFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringFunctionBodyContext stringFunctionBody() throws RecognitionException {
		StringFunctionBodyContext _localctx = new StringFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringFunctionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					stringFunctionStatement();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(279);
			stringReturnStatement();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062086L) != 0)) {
				{
				{
				setState(280);
				stringFunctionStatement();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidFunctionBodyContext extends ParserRuleContext {
		public List<VoidFunctionStatementContext> voidFunctionStatement() {
			return getRuleContexts(VoidFunctionStatementContext.class);
		}
		public VoidFunctionStatementContext voidFunctionStatement(int i) {
			return getRuleContext(VoidFunctionStatementContext.class,i);
		}
		public VoidFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterVoidFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitVoidFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitVoidFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionBodyContext voidFunctionBody() throws RecognitionException {
		VoidFunctionBodyContext _localctx = new VoidFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_voidFunctionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062086L) != 0)) {
				{
				{
				setState(286);
				voidFunctionStatement();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntFunctionStatementContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public IfElseStatmentsContext ifElseStatments() {
			return getRuleContext(IfElseStatmentsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public SwitchStatementsContext switchStatements() {
			return getRuleContext(SwitchStatementsContext.class,0);
		}
		public IntReturnStatementContext intReturnStatement() {
			return getRuleContext(IntReturnStatementContext.class,0);
		}
		public IntFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIntFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIntFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIntFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntFunctionStatementContext intFunctionStatement() throws RecognitionException {
		IntFunctionStatementContext _localctx = new IntFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_intFunctionStatement);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				assignmentsStatemetns();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				ifElseStatments();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				loopStatements();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				switchStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				intReturnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatFunctionStatementContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public IfElseStatmentsContext ifElseStatments() {
			return getRuleContext(IfElseStatmentsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public SwitchStatementsContext switchStatements() {
			return getRuleContext(SwitchStatementsContext.class,0);
		}
		public FloatReturnStatementContext floatReturnStatement() {
			return getRuleContext(FloatReturnStatementContext.class,0);
		}
		public FloatFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFloatFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFloatFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFloatFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatFunctionStatementContext floatFunctionStatement() throws RecognitionException {
		FloatFunctionStatementContext _localctx = new FloatFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_floatFunctionStatement);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				assignmentsStatemetns();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				ifElseStatments();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				loopStatements();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				switchStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				floatReturnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolFunctionStatementContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public IfElseStatmentsContext ifElseStatments() {
			return getRuleContext(IfElseStatmentsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public SwitchStatementsContext switchStatements() {
			return getRuleContext(SwitchStatementsContext.class,0);
		}
		public BoolReturnStatementContext boolReturnStatement() {
			return getRuleContext(BoolReturnStatementContext.class,0);
		}
		public BoolFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterBoolFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitBoolFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitBoolFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolFunctionStatementContext boolFunctionStatement() throws RecognitionException {
		BoolFunctionStatementContext _localctx = new BoolFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolFunctionStatement);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				assignmentsStatemetns();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				ifElseStatments();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				loopStatements();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				switchStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				boolReturnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharFunctionStatementContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public ModuleStatementsContext moduleStatements() {
			return getRuleContext(ModuleStatementsContext.class,0);
		}
		public ImportStatementsContext importStatements() {
			return getRuleContext(ImportStatementsContext.class,0);
		}
		public IfElseStatmentsContext ifElseStatments() {
			return getRuleContext(IfElseStatmentsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public SwitchStatementsContext switchStatements() {
			return getRuleContext(SwitchStatementsContext.class,0);
		}
		public CharReturnStatementContext charReturnStatement() {
			return getRuleContext(CharReturnStatementContext.class,0);
		}
		public CharFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCharFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCharFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCharFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionStatementContext charFunctionStatement() throws RecognitionException {
		CharFunctionStatementContext _localctx = new CharFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_charFunctionStatement);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				assignmentsStatemetns();
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				moduleStatements();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				importStatements();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				ifElseStatments();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				loopStatements();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				switchStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(319);
				charReturnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringFunctionStatementContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public ModuleStatementsContext moduleStatements() {
			return getRuleContext(ModuleStatementsContext.class,0);
		}
		public ImportStatementsContext importStatements() {
			return getRuleContext(ImportStatementsContext.class,0);
		}
		public IfElseStatmentsContext ifElseStatments() {
			return getRuleContext(IfElseStatmentsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public SwitchStatementsContext switchStatements() {
			return getRuleContext(SwitchStatementsContext.class,0);
		}
		public StringReturnStatementContext stringReturnStatement() {
			return getRuleContext(StringReturnStatementContext.class,0);
		}
		public StringFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterStringFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitStringFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitStringFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringFunctionStatementContext stringFunctionStatement() throws RecognitionException {
		StringFunctionStatementContext _localctx = new StringFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stringFunctionStatement);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				assignmentsStatemetns();
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				moduleStatements();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				importStatements();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				ifElseStatments();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				loopStatements();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				switchStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
				stringReturnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidFunctionStatementContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public ModuleStatementsContext moduleStatements() {
			return getRuleContext(ModuleStatementsContext.class,0);
		}
		public ImportStatementsContext importStatements() {
			return getRuleContext(ImportStatementsContext.class,0);
		}
		public IfElseStatmentsContext ifElseStatments() {
			return getRuleContext(IfElseStatmentsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public SwitchStatementsContext switchStatements() {
			return getRuleContext(SwitchStatementsContext.class,0);
		}
		public VoidReturnStatementContext voidReturnStatement() {
			return getRuleContext(VoidReturnStatementContext.class,0);
		}
		public VoidFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterVoidFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitVoidFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitVoidFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionStatementContext voidFunctionStatement() throws RecognitionException {
		VoidFunctionStatementContext _localctx = new VoidFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_voidFunctionStatement);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				assignmentsStatemetns();
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				moduleStatements();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				importStatements();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				ifElseStatments();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				loopStatements();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				switchStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
				voidReturnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HashParser.RETURN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(HashParser.INT_LITERAL, 0); }
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public IntReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIntReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIntReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIntReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntReturnStatementContext intReturnStatement() throws RecognitionException {
		IntReturnStatementContext _localctx = new IntReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(RETURN);
			setState(341);
			match(INT_LITERAL);
			setState(342);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HashParser.RETURN, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(HashParser.FLOAT_LITERAL, 0); }
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public FloatReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFloatReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFloatReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFloatReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatReturnStatementContext floatReturnStatement() throws RecognitionException {
		FloatReturnStatementContext _localctx = new FloatReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_floatReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(RETURN);
			setState(345);
			match(FLOAT_LITERAL);
			setState(346);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HashParser.RETURN, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public BoolReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterBoolReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitBoolReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitBoolReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolReturnStatementContext boolReturnStatement() throws RecognitionException {
		BoolReturnStatementContext _localctx = new BoolReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boolReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(RETURN);
			setState(349);
			booleanLiteral();
			setState(350);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HashParser.RETURN, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(HashParser.CHAR_LITERAL, 0); }
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public CharReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCharReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCharReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCharReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharReturnStatementContext charReturnStatement() throws RecognitionException {
		CharReturnStatementContext _localctx = new CharReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_charReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(RETURN);
			setState(353);
			match(CHAR_LITERAL);
			setState(354);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HashParser.RETURN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HashParser.STRING_LITERAL, 0); }
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public StringReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterStringReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitStringReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitStringReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringReturnStatementContext stringReturnStatement() throws RecognitionException {
		StringReturnStatementContext _localctx = new StringReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(RETURN);
			setState(357);
			match(STRING_LITERAL);
			setState(358);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HashParser.RETURN, 0); }
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public VoidReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterVoidReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitVoidReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitVoidReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidReturnStatementContext voidReturnStatement() throws RecognitionException {
		VoidReturnStatementContext _localctx = new VoidReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_voidReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(RETURN);
			setState(361);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementsContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(HashParser.SWITCH, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public List<TerminalNode> OB() { return getTokens(HashParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(HashParser.OB, i);
		}
		public List<TerminalNode> CB() { return getTokens(HashParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(HashParser.CB, i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public List<CaseStatementsContext> caseStatements() {
			return getRuleContexts(CaseStatementsContext.class);
		}
		public CaseStatementsContext caseStatements(int i) {
			return getRuleContext(CaseStatementsContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(HashParser.DEFAULT, 0); }
		public List<SupportedStatementsContext> supportedStatements() {
			return getRuleContexts(SupportedStatementsContext.class);
		}
		public SupportedStatementsContext supportedStatements(int i) {
			return getRuleContext(SupportedStatementsContext.class,i);
		}
		public SwitchStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterSwitchStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitSwitchStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitSwitchStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementsContext switchStatements() throws RecognitionException {
		SwitchStatementsContext _localctx = new SwitchStatementsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(SWITCH);
			setState(364);
			match(OP);
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case TRUE:
			case FALSE:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
				{
				setState(365);
				literal();
				}
				break;
			case IDENTIFIER:
				{
				setState(366);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(369);
			match(CP);
			setState(370);
			match(OB);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(371);
				caseStatements();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(377);
				match(DEFAULT);
				setState(378);
				match(OB);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062022L) != 0)) {
					{
					{
					setState(379);
					supportedStatements();
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				match(CB);
				}
			}

			setState(388);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseStatementsContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(HashParser.CASE, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public List<SupportedStatementsContext> supportedStatements() {
			return getRuleContexts(SupportedStatementsContext.class);
		}
		public SupportedStatementsContext supportedStatements(int i) {
			return getRuleContext(SupportedStatementsContext.class,i);
		}
		public CaseStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCaseStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCaseStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCaseStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementsContext caseStatements() throws RecognitionException {
		CaseStatementsContext _localctx = new CaseStatementsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_caseStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(CASE);
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case TRUE:
			case FALSE:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
				{
				setState(391);
				literal();
				}
				break;
			case IDENTIFIER:
				{
				setState(392);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
			match(OB);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062022L) != 0)) {
				{
				{
				setState(396);
				supportedStatements();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementsContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public LoopStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLoopStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLoopStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLoopStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementsContext loopStatements() throws RecognitionException {
		LoopStatementsContext _localctx = new LoopStatementsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loopStatements);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				forStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(HashParser.FOR, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public List<LoopBodyStatementContext> loopBodyStatement() {
			return getRuleContexts(LoopBodyStatementContext.class);
		}
		public LoopBodyStatementContext loopBodyStatement(int i) {
			return getRuleContext(LoopBodyStatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(FOR);
			setState(409);
			match(OP);
			setState(410);
			assignmentsStatemetns();
			setState(411);
			condition();
			setState(412);
			match(SEMICOLEN);
			setState(413);
			update();
			setState(414);
			match(CP);
			setState(415);
			match(OB);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15867654L) != 0)) {
				{
				{
				setState(416);
				loopBodyStatement();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HashParser.WHILE, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public TerminalNode OB() { return getToken(HashParser.OB, 0); }
		public TerminalNode CB() { return getToken(HashParser.CB, 0); }
		public List<LoopBodyStatementContext> loopBodyStatement() {
			return getRuleContexts(LoopBodyStatementContext.class);
		}
		public LoopBodyStatementContext loopBodyStatement(int i) {
			return getRuleContext(LoopBodyStatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(WHILE);
			setState(425);
			match(OP);
			setState(426);
			condition();
			setState(427);
			match(CP);
			setState(428);
			match(OB);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15867654L) != 0)) {
				{
				{
				setState(429);
				loopBodyStatement();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GoToStatementsContext extends ParserRuleContext {
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public TerminalNode BREAK() { return getToken(HashParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(HashParser.CONTINUE, 0); }
		public GoToStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goToStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterGoToStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitGoToStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitGoToStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoToStatementsContext goToStatements() throws RecognitionException {
		GoToStatementsContext _localctx = new GoToStatementsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_goToStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(438);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HashParser.IMPORT, 0); }
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public ImportStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterImportStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitImportStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitImportStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementsContext importStatements() throws RecognitionException {
		ImportStatementsContext _localctx = new ImportStatementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(IMPORT);
			setState(441);
			moduleName();
			setState(442);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleStatementsContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(HashParser.MODULE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public ModuleStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterModuleStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitModuleStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitModuleStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleStatementsContext moduleStatements() throws RecognitionException {
		ModuleStatementsContext _localctx = new ModuleStatementsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_moduleStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(MODULE);
			setState(445);
			packageName();
			setState(446);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentsStatemetnsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(HashParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLEN() { return getToken(HashParser.SEMICOLEN, 0); }
		public AssignmentsStatemetnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentsStatemetns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAssignmentsStatemetns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAssignmentsStatemetns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAssignmentsStatemetns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsStatemetnsContext assignmentsStatemetns() throws RecognitionException {
		AssignmentsStatemetnsContext _localctx = new AssignmentsStatemetnsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignmentsStatemetns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			type();
			setState(449);
			match(IDENTIFIER);
			setState(450);
			match(ASSIGNMENT);
			setState(451);
			expression();
			setState(452);
			match(SEMICOLEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatmentsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HashParser.IF, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public List<TerminalNode> OB() { return getTokens(HashParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(HashParser.OB, i);
		}
		public List<TerminalNode> CB() { return getTokens(HashParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(HashParser.CB, i);
		}
		public List<SupportedStatementsContext> supportedStatements() {
			return getRuleContexts(SupportedStatementsContext.class);
		}
		public SupportedStatementsContext supportedStatements(int i) {
			return getRuleContext(SupportedStatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HashParser.ELSE, 0); }
		public IfElseStatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIfElseStatments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIfElseStatments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIfElseStatments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatmentsContext ifElseStatments() throws RecognitionException {
		IfElseStatmentsContext _localctx = new IfElseStatmentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ifElseStatments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(IF);
			setState(455);
			match(OP);
			setState(456);
			condition();
			setState(457);
			match(CP);
			setState(458);
			match(OB);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062022L) != 0)) {
				{
				{
				setState(459);
				supportedStatements();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			match(CB);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(466);
				match(ELSE);
				setState(467);
				match(OB);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20062022L) != 0)) {
					{
					{
					setState(468);
					supportedStatements();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
				match(CB);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopBodyStatementContext extends ParserRuleContext {
		public AssignmentsStatemetnsContext assignmentsStatemetns() {
			return getRuleContext(AssignmentsStatemetnsContext.class,0);
		}
		public ModuleStatementsContext moduleStatements() {
			return getRuleContext(ModuleStatementsContext.class,0);
		}
		public ImportStatementsContext importStatements() {
			return getRuleContext(ImportStatementsContext.class,0);
		}
		public IfElseStatmentsInLoopContext ifElseStatmentsInLoop() {
			return getRuleContext(IfElseStatmentsInLoopContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public GoToStatementsContext goToStatements() {
			return getRuleContext(GoToStatementsContext.class,0);
		}
		public LoopBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBodyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLoopBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLoopBodyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLoopBodyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBodyStatementContext loopBodyStatement() throws RecognitionException {
		LoopBodyStatementContext _localctx = new LoopBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_loopBodyStatement);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				assignmentsStatemetns();
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				moduleStatements();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				importStatements();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				ifElseStatmentsInLoop();
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(483);
				loopStatements();
				}
				break;
			case BREAK:
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(484);
				goToStatements();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatmentsInLoopContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HashParser.IF, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public List<TerminalNode> OB() { return getTokens(HashParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(HashParser.OB, i);
		}
		public List<TerminalNode> CB() { return getTokens(HashParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(HashParser.CB, i);
		}
		public List<LoopBodyStatementContext> loopBodyStatement() {
			return getRuleContexts(LoopBodyStatementContext.class);
		}
		public LoopBodyStatementContext loopBodyStatement(int i) {
			return getRuleContext(LoopBodyStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HashParser.ELSE, 0); }
		public IfElseStatmentsInLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatmentsInLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIfElseStatmentsInLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIfElseStatmentsInLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIfElseStatmentsInLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatmentsInLoopContext ifElseStatmentsInLoop() throws RecognitionException {
		IfElseStatmentsInLoopContext _localctx = new IfElseStatmentsInLoopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifElseStatmentsInLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(IF);
			setState(488);
			match(OP);
			setState(489);
			condition();
			setState(490);
			match(CP);
			setState(491);
			match(OB);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15867654L) != 0)) {
				{
				{
				setState(492);
				loopBodyStatement();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(CB);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(499);
				match(ELSE);
				setState(500);
				match(OB);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15867654L) != 0)) {
					{
					{
					setState(501);
					loopBodyStatement();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(507);
				match(CB);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(HashParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(IDENTIFIER);
			setState(511);
			match(ASSIGNMENT);
			setState(512);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			logicalOrExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(HashParser.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(HashParser.LOGICAL_OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			logicalAndExpression();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(517);
				match(LOGICAL_OR);
				setState(518);
				logicalAndExpression();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND() { return getTokens(HashParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(HashParser.LOGICAL_AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			equalityExpression();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(525);
				match(LOGICAL_AND);
				setState(526);
				equalityExpression();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<ComparitioanlExpressionContext> comparitioanlExpression() {
			return getRuleContexts(ComparitioanlExpressionContext.class);
		}
		public ComparitioanlExpressionContext comparitioanlExpression(int i) {
			return getRuleContext(ComparitioanlExpressionContext.class,i);
		}
		public TerminalNode EQUALITY() { return getToken(HashParser.EQUALITY, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			comparitioanlExpression();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALITY) {
				{
				setState(533);
				match(EQUALITY);
				setState(534);
				comparitioanlExpression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparitioanlExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode COMPARITIONAL() { return getToken(HashParser.COMPARITIONAL, 0); }
		public ComparitioanlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparitioanlExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterComparitioanlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitComparitioanlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitComparitioanlExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparitioanlExpressionContext comparitioanlExpression() throws RecognitionException {
		ComparitioanlExpressionContext _localctx = new ComparitioanlExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_comparitioanlExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			additiveExpression();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPARITIONAL) {
				{
				setState(538);
				match(COMPARITIONAL);
				setState(539);
				additiveExpression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HashParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HashParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(HashParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(HashParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			multiplicativeExpression();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(543);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(544);
				multiplicativeExpression();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATION() { return getTokens(HashParser.MULTIPLICATION); }
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(HashParser.MULTIPLICATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(HashParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(HashParser.DIVISION, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(HashParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(HashParser.MODULO, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			unaryExpression();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76965813944320L) != 0)) {
				{
				{
				setState(551);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 76965813944320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(552);
				unaryExpression();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(HashParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(HashParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HashParser.MINUS, 0); }
		public TerminalNode INCREEMENT() { return getToken(HashParser.INCREEMENT, 0); }
		public TerminalNode DECREEMENT() { return getToken(HashParser.DECREEMENT, 0); }
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unaryExpression);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case INCREEMENT:
			case DECREEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13520007291994112L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				unaryExpression();
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case OP:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				powerExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode POWER() { return getToken(HashParser.POWER, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			postfixExpression();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(564);
				match(POWER);
				setState(565);
				unaryExpression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode INCREEMENT() { return getToken(HashParser.INCREEMENT, 0); }
		public TerminalNode DECREEMENT() { return getToken(HashParser.DECREEMENT, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			primaryExpression();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREEMENT || _la==DECREEMENT) {
				{
				setState(569);
				_la = _input.LA(1);
				if ( !(_la==INCREEMENT || _la==DECREEMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(HashParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(HashParser.CP, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_primaryExpression);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case TRUE:
			case FALSE:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(IDENTIFIER);
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(OP);
				setState(575);
				expression();
				setState(576);
				match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HashParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(HashParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(HashParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(HashParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(HashParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(HashParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(HashParser.FLOAT_LITERAL, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(HashParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(HashParser.CHAR_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(HashParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(INT_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(FLOAT_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				booleanLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				match(CHAR_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HashParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HashParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HashParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HashParser.DOT, i);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_packageName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(IDENTIFIER);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					match(DOT);
					setState(592);
					match(IDENTIFIER);
					}
					} 
				}
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleNameContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(HashParser.DOT, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(HashParser.MULTIPLICATION, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_moduleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			packageName();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(599);
				match(DOT);
				setState(600);
				match(MULTIPLICATION);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HashParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HashParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001=\u025e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0005\u0000"+
		"x\b\u0000\n\u0000\f\u0000{\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0086\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0091\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0097\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a2\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ad\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00b8\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00c3\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00ce\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d9\b\n\n\n\f\n\u00dc\t\n\u0001\u000b"+
		"\u0005\u000b\u00df\b\u000b\n\u000b\f\u000b\u00e2\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00e6\b\u000b\n\u000b\f\u000b\u00e9\t\u000b\u0001\f"+
		"\u0005\f\u00ec\b\f\n\f\f\f\u00ef\t\f\u0001\f\u0001\f\u0005\f\u00f3\b\f"+
		"\n\f\f\f\u00f6\t\f\u0001\r\u0005\r\u00f9\b\r\n\r\f\r\u00fc\t\r\u0001\r"+
		"\u0001\r\u0005\r\u0100\b\r\n\r\f\r\u0103\t\r\u0001\u000e\u0005\u000e\u0106"+
		"\b\u000e\n\u000e\f\u000e\u0109\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u010d\b\u000e\n\u000e\f\u000e\u0110\t\u000e\u0001\u000f\u0005\u000f\u0113"+
		"\b\u000f\n\u000f\f\u000f\u0116\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u011a\b\u000f\n\u000f\f\u000f\u011d\t\u000f\u0001\u0010\u0005\u0010\u0120"+
		"\b\u0010\n\u0010\f\u0010\u0123\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u012a\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0131\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0138\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0141\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014a\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0153\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0170\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0175\b\u001d\n\u001d\f\u001d\u0178\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u017d\b\u001d\n\u001d\f\u001d\u0180\t\u001d\u0001\u001d"+
		"\u0003\u001d\u0183\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u018a\b\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u018e\b\u001e\n\u001e\f\u001e\u0191\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0197\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01a2\b \n \f \u01a5\t \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01af\b!\n!"+
		"\f!\u01b2\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u01cd\b&\n&"+
		"\f&\u01d0\t&\u0001&\u0001&\u0001&\u0001&\u0005&\u01d6\b&\n&\f&\u01d9\t"+
		"&\u0001&\u0003&\u01dc\b&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01e6\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u01ee\b)\n)\f)\u01f1\t)\u0001)\u0001)\u0001)\u0001)\u0005)\u01f7\b)"+
		"\n)\f)\u01fa\t)\u0001)\u0003)\u01fd\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0005,\u0208\b,\n,\f,\u020b\t,\u0001-\u0001"+
		"-\u0001-\u0005-\u0210\b-\n-\f-\u0213\t-\u0001.\u0001.\u0001.\u0003.\u0218"+
		"\b.\u0001/\u0001/\u0001/\u0003/\u021d\b/\u00010\u00010\u00010\u00050\u0222"+
		"\b0\n0\f0\u0225\t0\u00011\u00011\u00011\u00051\u022a\b1\n1\f1\u022d\t"+
		"1\u00012\u00012\u00012\u00032\u0232\b2\u00013\u00013\u00013\u00033\u0237"+
		"\b3\u00014\u00014\u00034\u023b\b4\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00035\u0243\b5\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u024d\b7\u00018\u00018\u00018\u00058\u0252\b8\n8\f8\u0255\t8"+
		"\u00019\u00019\u00019\u00039\u025a\b9\u0001:\u0001:\u0001:\u0000\u0000"+
		";\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0007"+
		"\u0001\u0000\u0016\u0017\u0001\u0000%&\u0002\u0000)*..\u0003\u0000%&+"+
		"+45\u0001\u000045\u0001\u0000\b\f\u0001\u0000\u000f\u0010\u0284\u0000"+
		"y\u0001\u0000\u0000\u0000\u0002\u0085\u0001\u0000\u0000\u0000\u0004\u0087"+
		"\u0001\u0000\u0000\u0000\u0006\u0090\u0001\u0000\u0000\u0000\b\u0092\u0001"+
		"\u0000\u0000\u0000\n\u009d\u0001\u0000\u0000\u0000\f\u00a8\u0001\u0000"+
		"\u0000\u0000\u000e\u00b3\u0001\u0000\u0000\u0000\u0010\u00be\u0001\u0000"+
		"\u0000\u0000\u0012\u00c9\u0001\u0000\u0000\u0000\u0014\u00d4\u0001\u0000"+
		"\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00ed\u0001\u0000"+
		"\u0000\u0000\u001a\u00fa\u0001\u0000\u0000\u0000\u001c\u0107\u0001\u0000"+
		"\u0000\u0000\u001e\u0114\u0001\u0000\u0000\u0000 \u0121\u0001\u0000\u0000"+
		"\u0000\"\u0129\u0001\u0000\u0000\u0000$\u0130\u0001\u0000\u0000\u0000"+
		"&\u0137\u0001\u0000\u0000\u0000(\u0140\u0001\u0000\u0000\u0000*\u0149"+
		"\u0001\u0000\u0000\u0000,\u0152\u0001\u0000\u0000\u0000.\u0154\u0001\u0000"+
		"\u0000\u00000\u0158\u0001\u0000\u0000\u00002\u015c\u0001\u0000\u0000\u0000"+
		"4\u0160\u0001\u0000\u0000\u00006\u0164\u0001\u0000\u0000\u00008\u0168"+
		"\u0001\u0000\u0000\u0000:\u016b\u0001\u0000\u0000\u0000<\u0186\u0001\u0000"+
		"\u0000\u0000>\u0196\u0001\u0000\u0000\u0000@\u0198\u0001\u0000\u0000\u0000"+
		"B\u01a8\u0001\u0000\u0000\u0000D\u01b5\u0001\u0000\u0000\u0000F\u01b8"+
		"\u0001\u0000\u0000\u0000H\u01bc\u0001\u0000\u0000\u0000J\u01c0\u0001\u0000"+
		"\u0000\u0000L\u01c6\u0001\u0000\u0000\u0000N\u01dd\u0001\u0000\u0000\u0000"+
		"P\u01e5\u0001\u0000\u0000\u0000R\u01e7\u0001\u0000\u0000\u0000T\u01fe"+
		"\u0001\u0000\u0000\u0000V\u0202\u0001\u0000\u0000\u0000X\u0204\u0001\u0000"+
		"\u0000\u0000Z\u020c\u0001\u0000\u0000\u0000\\\u0214\u0001\u0000\u0000"+
		"\u0000^\u0219\u0001\u0000\u0000\u0000`\u021e\u0001\u0000\u0000\u0000b"+
		"\u0226\u0001\u0000\u0000\u0000d\u0231\u0001\u0000\u0000\u0000f\u0233\u0001"+
		"\u0000\u0000\u0000h\u0238\u0001\u0000\u0000\u0000j\u0242\u0001\u0000\u0000"+
		"\u0000l\u0244\u0001\u0000\u0000\u0000n\u024c\u0001\u0000\u0000\u0000p"+
		"\u024e\u0001\u0000\u0000\u0000r\u0256\u0001\u0000\u0000\u0000t\u025b\u0001"+
		"\u0000\u0000\u0000vx\u0003\u0002\u0001\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0000"+
		"\u0000\u0001}\u0001\u0001\u0000\u0000\u0000~\u0086\u0003J%\u0000\u007f"+
		"\u0086\u0003H$\u0000\u0080\u0086\u0003F#\u0000\u0081\u0086\u0003L&\u0000"+
		"\u0082\u0086\u0003>\u001f\u0000\u0083\u0086\u0003:\u001d\u0000\u0084\u0086"+
		"\u0003\u0004\u0002\u0000\u0085~\u0001\u0000\u0000\u0000\u0085\u007f\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001"+
		"\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0003\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0006\u0000\u0000\u0088\u0089\u0003"+
		"\u0006\u0003\u0000\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u0091\u0003"+
		"\b\u0004\u0000\u008b\u0091\u0003\n\u0005\u0000\u008c\u0091\u0003\f\u0006"+
		"\u0000\u008d\u0091\u0003\u000e\u0007\u0000\u008e\u0091\u0003\u0010\b\u0000"+
		"\u008f\u0091\u0003\u0012\t\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0090"+
		"\u008b\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0007\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\b\u0000\u0000\u0093\u0094\u0005:\u0000\u0000\u0094\u0096"+
		"\u0005!\u0000\u0000\u0095\u0097\u0003\u0014\n\u0000\u0096\u0095\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\"\u0000\u0000\u0099\u009a\u0005#"+
		"\u0000\u0000\u009a\u009b\u0003\u0016\u000b\u0000\u009b\u009c\u0005$\u0000"+
		"\u0000\u009c\t\u0001\u0000\u0000\u0000\u009d\u009e\u0005\t\u0000\u0000"+
		"\u009e\u009f\u0005:\u0000\u0000\u009f\u00a1\u0005!\u0000\u0000\u00a0\u00a2"+
		"\u0003\u0014\n\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\"\u0000\u0000\u00a4\u00a5\u0005#\u0000\u0000\u00a5\u00a6\u0003\u0018"+
		"\f\u0000\u00a6\u00a7\u0005$\u0000\u0000\u00a7\u000b\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00aa\u0005:\u0000\u0000"+
		"\u00aa\u00ac\u0005!\u0000\u0000\u00ab\u00ad\u0003\u0014\n\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\"\u0000\u0000\u00af\u00b0"+
		"\u0005#\u0000\u0000\u00b0\u00b1\u0003\u001a\r\u0000\u00b1\u00b2\u0005"+
		"$\u0000\u0000\u00b2\r\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\f\u0000"+
		"\u0000\u00b4\u00b5\u0005:\u0000\u0000\u00b5\u00b7\u0005!\u0000\u0000\u00b6"+
		"\u00b8\u0003\u0014\n\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\"\u0000\u0000\u00ba\u00bb\u0005#\u0000\u0000\u00bb\u00bc\u0003"+
		"\u001c\u000e\u0000\u00bc\u00bd\u0005$\u0000\u0000\u00bd\u000f\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005\u000b\u0000\u0000\u00bf\u00c0\u0005:\u0000"+
		"\u0000\u00c0\u00c2\u0005!\u0000\u0000\u00c1\u00c3\u0003\u0014\n\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\"\u0000\u0000\u00c5"+
		"\u00c6\u0005#\u0000\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7\u00c8"+
		"\u0005$\u0000\u0000\u00c8\u0011\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"\r\u0000\u0000\u00ca\u00cb\u0005:\u0000\u0000\u00cb\u00cd\u0005!\u0000"+
		"\u0000\u00cc\u00ce\u0003\u0014\n\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005\"\u0000\u0000\u00d0\u00d1\u0005#\u0000\u0000\u00d1"+
		"\u00d2\u0003 \u0010\u0000\u00d2\u00d3\u0005$\u0000\u0000\u00d3\u0013\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0003l6\u0000\u00d5\u00da\u0005:\u0000"+
		"\u0000\u00d6\u00d7\u0005-\u0000\u0000\u00d7\u00d9\u0003\u0014\n\u0000"+
		"\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u0015\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0003\"\u0011\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e7\u0003.\u0017\u0000\u00e4\u00e6"+
		"\u0003\"\u0011\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u0017\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ec\u0003$\u0012\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f4\u00030\u0018"+
		"\u0000\u00f1\u00f3\u0003$\u0012\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u0019\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f9\u0003&\u0013\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd"+
		"\u0101\u00032\u0019\u0000\u00fe\u0100\u0003&\u0013\u0000\u00ff\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u001b\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0106\u0003"+
		"(\u0014\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010e\u00034\u001a\u0000\u010b\u010d\u0003(\u0014\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u001d\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0003*\u0015\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0117\u011b\u00036\u001b\u0000\u0118\u011a"+
		"\u0003*\u0015\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u001f\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0003,\u0016\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122!\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u012a\u0003J%\u0000\u0125"+
		"\u012a\u0003L&\u0000\u0126\u012a\u0003>\u001f\u0000\u0127\u012a\u0003"+
		":\u001d\u0000\u0128\u012a\u0003.\u0017\u0000\u0129\u0124\u0001\u0000\u0000"+
		"\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a#\u0001\u0000\u0000\u0000\u012b\u0131\u0003J%\u0000\u012c"+
		"\u0131\u0003L&\u0000\u012d\u0131\u0003>\u001f\u0000\u012e\u0131\u0003"+
		":\u001d\u0000\u012f\u0131\u00030\u0018\u0000\u0130\u012b\u0001\u0000\u0000"+
		"\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131%\u0001\u0000\u0000\u0000\u0132\u0138\u0003J%\u0000\u0133"+
		"\u0138\u0003L&\u0000\u0134\u0138\u0003>\u001f\u0000\u0135\u0138\u0003"+
		":\u001d\u0000\u0136\u0138\u00032\u0019\u0000\u0137\u0132\u0001\u0000\u0000"+
		"\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\'\u0001\u0000\u0000\u0000\u0139\u0141\u0003J%\u0000\u013a"+
		"\u0141\u0003H$\u0000\u013b\u0141\u0003F#\u0000\u013c\u0141\u0003L&\u0000"+
		"\u013d\u0141\u0003>\u001f\u0000\u013e\u0141\u0003:\u001d\u0000\u013f\u0141"+
		"\u00034\u001a\u0000\u0140\u0139\u0001\u0000\u0000\u0000\u0140\u013a\u0001"+
		"\u0000\u0000\u0000\u0140\u013b\u0001\u0000\u0000\u0000\u0140\u013c\u0001"+
		"\u0000\u0000\u0000\u0140\u013d\u0001\u0000\u0000\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141)\u0001\u0000"+
		"\u0000\u0000\u0142\u014a\u0003J%\u0000\u0143\u014a\u0003H$\u0000\u0144"+
		"\u014a\u0003F#\u0000\u0145\u014a\u0003L&\u0000\u0146\u014a\u0003>\u001f"+
		"\u0000\u0147\u014a\u0003:\u001d\u0000\u0148\u014a\u00036\u001b\u0000\u0149"+
		"\u0142\u0001\u0000\u0000\u0000\u0149\u0143\u0001\u0000\u0000\u0000\u0149"+
		"\u0144\u0001\u0000\u0000\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149"+
		"\u0146\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u014a+\u0001\u0000\u0000\u0000\u014b\u0153"+
		"\u0003J%\u0000\u014c\u0153\u0003H$\u0000\u014d\u0153\u0003F#\u0000\u014e"+
		"\u0153\u0003L&\u0000\u014f\u0153\u0003>\u001f\u0000\u0150\u0153\u0003"+
		":\u001d\u0000\u0151\u0153\u00038\u001c\u0000\u0152\u014b\u0001\u0000\u0000"+
		"\u0000\u0152\u014c\u0001\u0000\u0000\u0000\u0152\u014d\u0001\u0000\u0000"+
		"\u0000\u0152\u014e\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0153-\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0007\u0000\u0000"+
		"\u0155\u0156\u00056\u0000\u0000\u0156\u0157\u0005\'\u0000\u0000\u0157"+
		"/\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u0007\u0000\u0000\u0159\u015a"+
		"\u00057\u0000\u0000\u015a\u015b\u0005\'\u0000\u0000\u015b1\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005\u0007\u0000\u0000\u015d\u015e\u0003t:\u0000"+
		"\u015e\u015f\u0005\'\u0000\u0000\u015f3\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0005\u0007\u0000\u0000\u0161\u0162\u00059\u0000\u0000\u0162\u0163"+
		"\u0005\'\u0000\u0000\u01635\u0001\u0000\u0000\u0000\u0164\u0165\u0005"+
		"\u0007\u0000\u0000\u0165\u0166\u00058\u0000\u0000\u0166\u0167\u0005\'"+
		"\u0000\u0000\u01677\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0007\u0000"+
		"\u0000\u0169\u016a\u0005\'\u0000\u0000\u016a9\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0005\u0018\u0000\u0000\u016c\u016f\u0005!\u0000\u0000\u016d"+
		"\u0170\u0003n7\u0000\u016e\u0170\u0005:\u0000\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0005\"\u0000\u0000\u0172\u0176\u0005#"+
		"\u0000\u0000\u0173\u0175\u0003<\u001e\u0000\u0174\u0173\u0001\u0000\u0000"+
		"\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0182\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u001a\u0000"+
		"\u0000\u017a\u017e\u0005#\u0000\u0000\u017b\u017d\u0003\u0002\u0001\u0000"+
		"\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0181\u0183\u0005$\u0000\u0000\u0182\u0179\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0005$\u0000\u0000\u0185;\u0001\u0000\u0000\u0000\u0186\u0189\u0005"+
		"\u0019\u0000\u0000\u0187\u018a\u0003n7\u0000\u0188\u018a\u0005:\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018f\u0005#\u0000\u0000"+
		"\u018c\u018e\u0003\u0002\u0001\u0000\u018d\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005$\u0000\u0000\u0193"+
		"=\u0001\u0000\u0000\u0000\u0194\u0197\u0003B!\u0000\u0195\u0197\u0003"+
		"@ \u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0195\u0001\u0000\u0000"+
		"\u0000\u0197?\u0001\u0000\u0000\u0000\u0198\u0199\u0005\u0015\u0000\u0000"+
		"\u0199\u019a\u0005!\u0000\u0000\u019a\u019b\u0003J%\u0000\u019b\u019c"+
		"\u0003N\'\u0000\u019c\u019d\u0005\'\u0000\u0000\u019d\u019e\u0003T*\u0000"+
		"\u019e\u019f\u0005\"\u0000\u0000\u019f\u01a3\u0005#\u0000\u0000\u01a0"+
		"\u01a2\u0003P(\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005$\u0000\u0000\u01a7A\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005\u0014\u0000\u0000\u01a9\u01aa\u0005!\u0000\u0000"+
		"\u01aa\u01ab\u0003N\'\u0000\u01ab\u01ac\u0005\"\u0000\u0000\u01ac\u01b0"+
		"\u0005#\u0000\u0000\u01ad\u01af\u0003P(\u0000\u01ae\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005$\u0000"+
		"\u0000\u01b4C\u0001\u0000\u0000\u0000\u01b5\u01b6\u0007\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0005\'\u0000\u0000\u01b7E\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0005\u0002\u0000\u0000\u01b9\u01ba\u0003r9\u0000\u01ba\u01bb\u0005"+
		"\'\u0000\u0000\u01bbG\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\u0001"+
		"\u0000\u0000\u01bd\u01be\u0003p8\u0000\u01be\u01bf\u0005\'\u0000\u0000"+
		"\u01bfI\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003l6\u0000\u01c1\u01c2"+
		"\u0005:\u0000\u0000\u01c2\u01c3\u0005(\u0000\u0000\u01c3\u01c4\u0003V"+
		"+\u0000\u01c4\u01c5\u0005\'\u0000\u0000\u01c5K\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005\u0011\u0000\u0000\u01c7\u01c8\u0005!\u0000\u0000\u01c8"+
		"\u01c9\u0003N\'\u0000\u01c9\u01ca\u0005\"\u0000\u0000\u01ca\u01ce\u0005"+
		"#\u0000\u0000\u01cb\u01cd\u0003\u0002\u0001\u0000\u01cc\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01db\u0005$\u0000"+
		"\u0000\u01d2\u01d3\u0005\u0013\u0000\u0000\u01d3\u01d7\u0005#\u0000\u0000"+
		"\u01d4\u01d6\u0003\u0002\u0001\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01dc\u0005$\u0000\u0000\u01db"+
		"\u01d2\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc"+
		"M\u0001\u0000\u0000\u0000\u01dd\u01de\u0003V+\u0000\u01deO\u0001\u0000"+
		"\u0000\u0000\u01df\u01e6\u0003J%\u0000\u01e0\u01e6\u0003H$\u0000\u01e1"+
		"\u01e6\u0003F#\u0000\u01e2\u01e6\u0003R)\u0000\u01e3\u01e6\u0003>\u001f"+
		"\u0000\u01e4\u01e6\u0003D\"\u0000\u01e5\u01df\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e0\u0001\u0000\u0000\u0000\u01e5\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6Q\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0005\u0011\u0000\u0000\u01e8\u01e9\u0005!\u0000\u0000\u01e9\u01ea"+
		"\u0003N\'\u0000\u01ea\u01eb\u0005\"\u0000\u0000\u01eb\u01ef\u0005#\u0000"+
		"\u0000\u01ec\u01ee\u0003P(\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee"+
		"\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f2\u01fc\u0005$\u0000\u0000\u01f3\u01f4"+
		"\u0005\u0013\u0000\u0000\u01f4\u01f8\u0005#\u0000\u0000\u01f5\u01f7\u0003"+
		"P(\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fd\u0005$\u0000\u0000\u01fc\u01f3\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fdS\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0005:\u0000\u0000\u01ff\u0200\u0005(\u0000\u0000\u0200\u0201\u0003"+
		"V+\u0000\u0201U\u0001\u0000\u0000\u0000\u0202\u0203\u0003X,\u0000\u0203"+
		"W\u0001\u0000\u0000\u0000\u0204\u0209\u0003Z-\u0000\u0205\u0206\u0005"+
		"2\u0000\u0000\u0206\u0208\u0003Z-\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020aY\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u0211\u0003\\.\u0000\u020d"+
		"\u020e\u00053\u0000\u0000\u020e\u0210\u0003\\.\u0000\u020f\u020d\u0001"+
		"\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001"+
		"\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212[\u0001\u0000"+
		"\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0217\u0003^/\u0000"+
		"\u0215\u0216\u00050\u0000\u0000\u0216\u0218\u0003^/\u0000\u0217\u0215"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218]\u0001"+
		"\u0000\u0000\u0000\u0219\u021c\u0003`0\u0000\u021a\u021b\u00051\u0000"+
		"\u0000\u021b\u021d\u0003`0\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0001\u0000\u0000\u0000\u021d_\u0001\u0000\u0000\u0000\u021e\u0223"+
		"\u0003b1\u0000\u021f\u0220\u0007\u0001\u0000\u0000\u0220\u0222\u0003b"+
		"1\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000"+
		"\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224a\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000"+
		"\u0226\u022b\u0003d2\u0000\u0227\u0228\u0007\u0002\u0000\u0000\u0228\u022a"+
		"\u0003d2\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000"+
		"\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000"+
		"\u0000\u0000\u022cc\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0007\u0003\u0000\u0000\u022f\u0232\u0003d2\u0000\u0230"+
		"\u0232\u0003f3\u0000\u0231\u022e\u0001\u0000\u0000\u0000\u0231\u0230\u0001"+
		"\u0000\u0000\u0000\u0232e\u0001\u0000\u0000\u0000\u0233\u0236\u0003h4"+
		"\u0000\u0234\u0235\u0005/\u0000\u0000\u0235\u0237\u0003d2\u0000\u0236"+
		"\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237"+
		"g\u0001\u0000\u0000\u0000\u0238\u023a\u0003j5\u0000\u0239\u023b\u0007"+
		"\u0004\u0000\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023a\u023b\u0001"+
		"\u0000\u0000\u0000\u023bi\u0001\u0000\u0000\u0000\u023c\u0243\u0003n7"+
		"\u0000\u023d\u0243\u0005:\u0000\u0000\u023e\u023f\u0005!\u0000\u0000\u023f"+
		"\u0240\u0003V+\u0000\u0240\u0241\u0005\"\u0000\u0000\u0241\u0243\u0001"+
		"\u0000\u0000\u0000\u0242\u023c\u0001\u0000\u0000\u0000\u0242\u023d\u0001"+
		"\u0000\u0000\u0000\u0242\u023e\u0001\u0000\u0000\u0000\u0243k\u0001\u0000"+
		"\u0000\u0000\u0244\u0245\u0007\u0005\u0000\u0000\u0245m\u0001\u0000\u0000"+
		"\u0000\u0246\u024d\u00056\u0000\u0000\u0247\u024d\u00057\u0000\u0000\u0248"+
		"\u024d\u0003t:\u0000\u0249\u024d\u00058\u0000\u0000\u024a\u024d\u0005"+
		"9\u0000\u0000\u024b\u024d\u0005\u000e\u0000\u0000\u024c\u0246\u0001\u0000"+
		"\u0000\u0000\u024c\u0247\u0001\u0000\u0000\u0000\u024c\u0248\u0001\u0000"+
		"\u0000\u0000\u024c\u0249\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000"+
		"\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024do\u0001\u0000\u0000"+
		"\u0000\u024e\u0253\u0005:\u0000\u0000\u024f\u0250\u0005,\u0000\u0000\u0250"+
		"\u0252\u0005:\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0255"+
		"\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0001\u0000\u0000\u0000\u0254q\u0001\u0000\u0000\u0000\u0255\u0253\u0001"+
		"\u0000\u0000\u0000\u0256\u0259\u0003p8\u0000\u0257\u0258\u0005,\u0000"+
		"\u0000\u0258\u025a\u0005*\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025as\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0007\u0006\u0000\u0000\u025cu\u0001\u0000\u0000\u00008y\u0085"+
		"\u0090\u0096\u00a1\u00ac\u00b7\u00c2\u00cd\u00da\u00e0\u00e7\u00ed\u00f4"+
		"\u00fa\u0101\u0107\u010e\u0114\u011b\u0121\u0129\u0130\u0137\u0140\u0149"+
		"\u0152\u016f\u0176\u017e\u0182\u0189\u018f\u0196\u01a3\u01b0\u01ce\u01d7"+
		"\u01db\u01e5\u01ef\u01f8\u01fc\u0209\u0211\u0217\u021c\u0223\u022b\u0231"+
		"\u0236\u023a\u0242\u024c\u0253\u0259";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}