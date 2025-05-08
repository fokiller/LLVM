// Generated from JuliaSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JuliaSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, STRING=44, ID=45, INT=46, 
		LINE_COMMENT=47, WS=48;
	public static final int
		RULE_program = 0, RULE_interfaceDecl = 1, RULE_interfaceBody = 2, RULE_methodSignature = 3, 
		RULE_classDecl = 4, RULE_classBody = 5, RULE_fieldDecl = 6, RULE_constructorDecl = 7, 
		RULE_destructorDecl = 8, RULE_methodDecl = 9, RULE_funcDecl = 10, RULE_objectDecl = 11, 
		RULE_methodCall = 12, RULE_printStmt = 13, RULE_inputStmt = 14, RULE_assignmentStmt = 15, 
		RULE_deleteStmt = 16, RULE_breakStmt = 17, RULE_continueStmt = 18, RULE_whileStmt = 19, 
		RULE_forStmt = 20, RULE_paramList = 21, RULE_argList = 22, RULE_block = 23, 
		RULE_returnStmt = 24, RULE_ifStmt = 25, RULE_funcCallStmt = 26, RULE_statement = 27, 
		RULE_expr = 28, RULE_visibility = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "interfaceDecl", "interfaceBody", "methodSignature", "classDecl", 
			"classBody", "fieldDecl", "constructorDecl", "destructorDecl", "methodDecl", 
			"funcDecl", "objectDecl", "methodCall", "printStmt", "inputStmt", "assignmentStmt", 
			"deleteStmt", "breakStmt", "continueStmt", "whileStmt", "forStmt", "paramList", 
			"argList", "block", "returnStmt", "ifStmt", "funcCallStmt", "statement", 
			"expr", "visibility"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'interface'", "'{'", "'}'", "'function'", "'('", "')'", "';'", 
			"'class'", "'extends'", "'implements'", "':'", "'Int'", "'constructor'", 
			"'end'", "'destructor'", "'='", "'new'", "'.'", "'print'", "'input'", 
			"'this'", "'delete'", "'break'", "'continue'", "'while'", "'do'", "'for'", 
			"','", "'return'", "'if'", "'then'", "'*'", "'/'", "'+'", "'-'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'public'", "'private'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "STRING", "ID", "INT", 
			"LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "JuliaSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuliaSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JuliaSubsetParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185645584656L) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
	public static class InterfaceDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclContext interfaceDecl() throws RecognitionException {
		InterfaceDeclContext _localctx = new InterfaceDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interfaceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(ID);
			setState(70);
			match(T__1);
			setState(71);
			interfaceBody();
			setState(72);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<MethodSignatureContext> methodSignature() {
			return getRuleContexts(MethodSignatureContext.class);
		}
		public MethodSignatureContext methodSignature(int i) {
			return getRuleContext(MethodSignatureContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(74);
				methodSignature();
				}
				}
				setState(79);
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
	public static class MethodSignatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitMethodSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitMethodSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__3);
			setState(81);
			match(ID);
			setState(82);
			match(T__4);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(83);
				paramList();
				}
			}

			setState(86);
			match(T__5);
			setState(87);
			match(T__6);
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
	public static class ClassDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JuliaSubsetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaSubsetParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__7);
			setState(90);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(91);
				match(T__8);
				setState(92);
				match(ID);
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(95);
				match(T__9);
				setState(96);
				match(ID);
				}
			}

			setState(99);
			match(T__1);
			setState(100);
			classBody();
			setState(101);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<ConstructorDeclContext> constructorDecl() {
			return getRuleContexts(ConstructorDeclContext.class);
		}
		public ConstructorDeclContext constructorDecl(int i) {
			return getRuleContext(ConstructorDeclContext.class,i);
		}
		public List<DestructorDeclContext> destructorDecl() {
			return getRuleContexts(DestructorDeclContext.class);
		}
		public DestructorDeclContext destructorDecl(int i) {
			return getRuleContext(DestructorDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194139574288L) != 0)) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__41:
				case T__42:
					{
					setState(103);
					fieldDecl();
					}
					break;
				case T__12:
					{
					setState(104);
					constructorDecl();
					}
					break;
				case T__14:
					{
					setState(105);
					destructorDecl();
					}
					break;
				case T__3:
					{
					setState(106);
					methodDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
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
	public static class FieldDeclContext extends ParserRuleContext {
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			visibility();
			setState(113);
			match(ID);
			setState(114);
			match(T__10);
			setState(115);
			match(T__11);
			setState(116);
			match(T__6);
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
	public static class ConstructorDeclContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitConstructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__12);
			setState(119);
			match(T__4);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(120);
				paramList();
				}
			}

			setState(123);
			match(T__5);
			setState(124);
			block();
			setState(125);
			match(T__13);
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
	public static class DestructorDeclContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DestructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterDestructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitDestructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitDestructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructorDeclContext destructorDecl() throws RecognitionException {
		DestructorDeclContext _localctx = new DestructorDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_destructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__14);
			setState(128);
			match(T__4);
			setState(129);
			match(T__5);
			setState(130);
			block();
			setState(131);
			match(T__13);
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
	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__3);
			setState(134);
			match(ID);
			setState(135);
			match(T__4);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(136);
				paramList();
				}
			}

			setState(139);
			match(T__5);
			setState(140);
			block();
			setState(141);
			match(T__13);
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
	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__3);
			setState(144);
			match(ID);
			setState(145);
			match(T__4);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(146);
				paramList();
				}
			}

			setState(149);
			match(T__5);
			setState(150);
			block();
			setState(151);
			match(T__13);
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
	public static class ObjectDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JuliaSubsetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaSubsetParser.ID, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ObjectDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterObjectDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitObjectDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitObjectDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclContext objectDecl() throws RecognitionException {
		ObjectDeclContext _localctx = new ObjectDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(T__15);
			setState(155);
			match(T__16);
			setState(156);
			match(ID);
			setState(157);
			match(T__4);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145304408096L) != 0)) {
				{
				setState(158);
				argList();
				}
			}

			setState(161);
			match(T__5);
			setState(162);
			match(T__6);
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
	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JuliaSubsetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaSubsetParser.ID, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			setState(165);
			match(T__17);
			setState(166);
			match(ID);
			setState(167);
			match(T__4);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145304408096L) != 0)) {
				{
				setState(168);
				argList();
				}
			}

			setState(171);
			match(T__5);
			setState(172);
			match(T__6);
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
	public static class PrintStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__18);
			setState(175);
			match(T__4);
			setState(176);
			expr(0);
			setState(177);
			match(T__5);
			setState(178);
			match(T__6);
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
	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(T__15);
			setState(182);
			match(T__19);
			setState(183);
			match(T__4);
			setState(184);
			match(T__5);
			setState(185);
			match(T__6);
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
	public static class AssignmentStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(187);
				match(T__20);
				setState(188);
				match(T__17);
				setState(189);
				match(ID);
				}
				break;
			case ID:
				{
				setState(190);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			match(T__15);
			setState(194);
			expr(0);
			setState(195);
			match(T__6);
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
	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterDeleteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitDeleteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_deleteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__21);
			setState(198);
			match(ID);
			setState(199);
			match(T__6);
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
	public static class BreakStmtContext extends ParserRuleContext {
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__22);
			setState(202);
			match(T__6);
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
	public static class ContinueStmtContext extends ParserRuleContext {
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__23);
			setState(205);
			match(T__6);
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
	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__24);
			setState(208);
			expr(0);
			setState(209);
			match(T__25);
			setState(210);
			block();
			setState(211);
			match(T__13);
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
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__26);
			setState(214);
			match(ID);
			setState(215);
			match(T__15);
			setState(216);
			expr(0);
			setState(217);
			match(T__10);
			setState(218);
			expr(0);
			setState(219);
			match(T__25);
			setState(220);
			block();
			setState(221);
			match(T__13);
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
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JuliaSubsetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaSubsetParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(224);
				match(T__27);
				setState(225);
				match(ID);
				}
				}
				setState(230);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			expr(0);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(232);
				match(T__27);
				setState(233);
				expr(0);
				}
				}
				setState(238);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__1);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185645584656L) != 0)) {
				{
				{
				setState(240);
				statement();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(246);
				returnStmt();
				}
			}

			setState(249);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__28);
			setState(252);
			expr(0);
			setState(253);
			match(T__6);
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
	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__29);
			setState(256);
			expr(0);
			setState(257);
			match(T__30);
			setState(258);
			block();
			setState(259);
			match(T__13);
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
	public static class FuncCallStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterFuncCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitFuncCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitFuncCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallStmtContext funcCallStmt() throws RecognitionException {
		FuncCallStmtContext _localctx = new FuncCallStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcCallStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(T__4);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145304408096L) != 0)) {
				{
				setState(263);
				argList();
				}
			}

			setState(266);
			match(T__5);
			setState(267);
			match(T__6);
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
	public static class StatementContext extends ParserRuleContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public ObjectDeclContext objectDecl() {
			return getRuleContext(ObjectDeclContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public FuncCallStmtContext funcCallStmt() {
			return getRuleContext(FuncCallStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				forStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				ifStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				classDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				funcDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				objectDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				methodCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				funcCallStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				printStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				inputStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(278);
				assignmentStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(279);
				deleteStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(280);
				breakStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(281);
				continueStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(282);
				whileStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(JuliaSubsetParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisFieldExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public ThisFieldExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterThisFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitThisFieldExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitThisFieldExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessExprContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(JuliaSubsetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaSubsetParser.ID, i);
		}
		public FieldAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterFieldAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitFieldAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitFieldAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(JuliaSubsetParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(JuliaSubsetParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallExprContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(JuliaSubsetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaSubsetParser.ID, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public MethodCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(286);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(ID);
				setState(290);
				match(T__4);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145304408096L) != 0)) {
					{
					setState(291);
					argList();
					}
				}

				setState(294);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new FieldAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(ID);
				setState(296);
				match(T__17);
				setState(297);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(ID);
				setState(299);
				match(T__17);
				setState(300);
				match(ID);
				setState(301);
				match(T__4);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145304408096L) != 0)) {
					{
					setState(302);
					argList();
					}
				}

				setState(305);
				match(T__5);
				}
				break;
			case 7:
				{
				_localctx = new ThisFieldExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(T__20);
				setState(307);
				match(T__17);
				setState(308);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(T__4);
				setState(310);
				expr(0);
				setState(311);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(316);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(319);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						((ComparisonExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) ) {
							((ComparisonExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VisibilityContext extends ParserRuleContext {
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaSubsetListener ) ((JuliaSubsetListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaSubsetVisitor ) return ((JuliaSubsetVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u014c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"^\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0094\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00a0\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00aa\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c0\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00e3\b\u0015\n\u0015"+
		"\f\u0015\u00e6\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u00eb\b\u0016\n\u0016\f\u0016\u00ee\t\u0016\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00f2\b\u0017\n\u0017\f\u0017\u00f5\t\u0017\u0001\u0017\u0003\u0017"+
		"\u00f8\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0109\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u011c\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0125\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0130\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u013a\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0145\b\u001c"+
		"\n\u001c\f\u001c\u0148\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000"+
		"\u00018\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0004\u0001\u0000 !\u0001"+
		"\u0000\"#\u0001\u0000$)\u0001\u0000*+\u015a\u0000?\u0001\u0000\u0000\u0000"+
		"\u0002D\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006P"+
		"\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000"+
		"\u0000\fp\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010"+
		"\u007f\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014"+
		"\u008f\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000\u0000\u0000\u0018"+
		"\u00a4\u0001\u0000\u0000\u0000\u001a\u00ae\u0001\u0000\u0000\u0000\u001c"+
		"\u00b4\u0001\u0000\u0000\u0000\u001e\u00bf\u0001\u0000\u0000\u0000 \u00c5"+
		"\u0001\u0000\u0000\u0000\"\u00c9\u0001\u0000\u0000\u0000$\u00cc\u0001"+
		"\u0000\u0000\u0000&\u00cf\u0001\u0000\u0000\u0000(\u00d5\u0001\u0000\u0000"+
		"\u0000*\u00df\u0001\u0000\u0000\u0000,\u00e7\u0001\u0000\u0000\u0000."+
		"\u00ef\u0001\u0000\u0000\u00000\u00fb\u0001\u0000\u0000\u00002\u00ff\u0001"+
		"\u0000\u0000\u00004\u0105\u0001\u0000\u0000\u00006\u011b\u0001\u0000\u0000"+
		"\u00008\u0139\u0001\u0000\u0000\u0000:\u0149\u0001\u0000\u0000\u0000<"+
		">\u00036\u001b\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000BC\u0005\u0000\u0000\u0001C\u0001\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0005-\u0000\u0000FG\u0005"+
		"\u0002\u0000\u0000GH\u0003\u0004\u0002\u0000HI\u0005\u0003\u0000\u0000"+
		"I\u0003\u0001\u0000\u0000\u0000JL\u0003\u0006\u0003\u0000KJ\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u0004\u0000\u0000QR\u0005-\u0000\u0000RT\u0005\u0005\u0000"+
		"\u0000SU\u0003*\u0015\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0006\u0000\u0000WX\u0005\u0007"+
		"\u0000\u0000X\u0007\u0001\u0000\u0000\u0000YZ\u0005\b\u0000\u0000Z]\u0005"+
		"-\u0000\u0000[\\\u0005\t\u0000\u0000\\^\u0005-\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_`\u0005"+
		"\n\u0000\u0000`b\u0005-\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0002\u0000\u0000"+
		"de\u0003\n\u0005\u0000ef\u0005\u0003\u0000\u0000f\t\u0001\u0000\u0000"+
		"\u0000gl\u0003\f\u0006\u0000hl\u0003\u000e\u0007\u0000il\u0003\u0010\b"+
		"\u0000jl\u0003\u0012\t\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000b"+
		"\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0003:\u001d\u0000"+
		"qr\u0005-\u0000\u0000rs\u0005\u000b\u0000\u0000st\u0005\f\u0000\u0000"+
		"tu\u0005\u0007\u0000\u0000u\r\u0001\u0000\u0000\u0000vw\u0005\r\u0000"+
		"\u0000wy\u0005\u0005\u0000\u0000xz\u0003*\u0015\u0000yx\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u0006"+
		"\u0000\u0000|}\u0003.\u0017\u0000}~\u0005\u000e\u0000\u0000~\u000f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0081\u0005"+
		"\u0005\u0000\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0003"+
		".\u0017\u0000\u0083\u0084\u0005\u000e\u0000\u0000\u0084\u0011\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086\u0087\u0005-\u0000"+
		"\u0000\u0087\u0089\u0005\u0005\u0000\u0000\u0088\u008a\u0003*\u0015\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0006\u0000\u0000"+
		"\u008c\u008d\u0003.\u0017\u0000\u008d\u008e\u0005\u000e\u0000\u0000\u008e"+
		"\u0013\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090"+
		"\u0091\u0005-\u0000\u0000\u0091\u0093\u0005\u0005\u0000\u0000\u0092\u0094"+
		"\u0003*\u0015\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0006\u0000\u0000\u0096\u0097\u0003.\u0017\u0000\u0097\u0098\u0005\u000e"+
		"\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009a\u0005-\u0000"+
		"\u0000\u009a\u009b\u0005\u0010\u0000\u0000\u009b\u009c\u0005\u0011\u0000"+
		"\u0000\u009c\u009d\u0005-\u0000\u0000\u009d\u009f\u0005\u0005\u0000\u0000"+
		"\u009e\u00a0\u0003,\u0016\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0006\u0000\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3"+
		"\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005-\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0012\u0000\u0000\u00a6\u00a7\u0005-\u0000\u0000\u00a7\u00a9\u0005"+
		"\u0005\u0000\u0000\u00a8\u00aa\u0003,\u0016\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac\u00ad\u0005\u0007"+
		"\u0000\u0000\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0013"+
		"\u0000\u0000\u00af\u00b0\u0005\u0005\u0000\u0000\u00b0\u00b1\u00038\u001c"+
		"\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b3\u0005\u0007\u0000"+
		"\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005-\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6\u00b7\u0005\u0014\u0000\u0000"+
		"\u00b7\u00b8\u0005\u0005\u0000\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000"+
		"\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00bd\u0005\u0012\u0000\u0000"+
		"\u00bd\u00c0\u0005-\u0000\u0000\u00be\u00c0\u0005-\u0000\u0000\u00bf\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000\u00c2\u00c3"+
		"\u00038\u001c\u0000\u00c3\u00c4\u0005\u0007\u0000\u0000\u00c4\u001f\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\u0016\u0000\u0000\u00c6\u00c7\u0005"+
		"-\u0000\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000\u00c8!\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\u0017\u0000\u0000\u00ca\u00cb\u0005\u0007\u0000"+
		"\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0018\u0000\u0000"+
		"\u00cd\u00ce\u0005\u0007\u0000\u0000\u00ce%\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0019\u0000\u0000\u00d0\u00d1\u00038\u001c\u0000\u00d1\u00d2"+
		"\u0005\u001a\u0000\u0000\u00d2\u00d3\u0003.\u0017\u0000\u00d3\u00d4\u0005"+
		"\u000e\u0000\u0000\u00d4\'\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u001b"+
		"\u0000\u0000\u00d6\u00d7\u0005-\u0000\u0000\u00d7\u00d8\u0005\u0010\u0000"+
		"\u0000\u00d8\u00d9\u00038\u001c\u0000\u00d9\u00da\u0005\u000b\u0000\u0000"+
		"\u00da\u00db\u00038\u001c\u0000\u00db\u00dc\u0005\u001a\u0000\u0000\u00dc"+
		"\u00dd\u0003.\u0017\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de)\u0001"+
		"\u0000\u0000\u0000\u00df\u00e4\u0005-\u0000\u0000\u00e0\u00e1\u0005\u001c"+
		"\u0000\u0000\u00e1\u00e3\u0005-\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5+\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ec\u00038\u001c\u0000\u00e8"+
		"\u00e9\u0005\u001c\u0000\u0000\u00e9\u00eb\u00038\u001c\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed-\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f3\u0005"+
		"\u0002\u0000\u0000\u00f0\u00f2\u00036\u001b\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f8\u00030\u0018"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0003\u0000"+
		"\u0000\u00fa/\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u001d\u0000\u0000"+
		"\u00fc\u00fd\u00038\u001c\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000\u00fe"+
		"1\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u001e\u0000\u0000\u0100\u0101"+
		"\u00038\u001c\u0000\u0101\u0102\u0005\u001f\u0000\u0000\u0102\u0103\u0003"+
		".\u0017\u0000\u0103\u0104\u0005\u000e\u0000\u0000\u01043\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005-\u0000\u0000\u0106\u0108\u0005\u0005\u0000\u0000"+
		"\u0107\u0109\u0003,\u0016\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005\u0006\u0000\u0000\u010b\u010c\u0005\u0007\u0000\u0000\u010c"+
		"5\u0001\u0000\u0000\u0000\u010d\u011c\u0003(\u0014\u0000\u010e\u011c\u0003"+
		"2\u0019\u0000\u010f\u011c\u0003\b\u0004\u0000\u0110\u011c\u0003\u0014"+
		"\n\u0000\u0111\u011c\u0003\u0016\u000b\u0000\u0112\u011c\u0003\u0018\f"+
		"\u0000\u0113\u011c\u00034\u001a\u0000\u0114\u011c\u0003\u001a\r\u0000"+
		"\u0115\u011c\u0003\u001c\u000e\u0000\u0116\u011c\u0003\u001e\u000f\u0000"+
		"\u0117\u011c\u0003 \u0010\u0000\u0118\u011c\u0003\"\u0011\u0000\u0119"+
		"\u011c\u0003$\u0012\u0000\u011a\u011c\u0003&\u0013\u0000\u011b\u010d\u0001"+
		"\u0000\u0000\u0000\u011b\u010e\u0001\u0000\u0000\u0000\u011b\u010f\u0001"+
		"\u0000\u0000\u0000\u011b\u0110\u0001\u0000\u0000\u0000\u011b\u0111\u0001"+
		"\u0000\u0000\u0000\u011b\u0112\u0001\u0000\u0000\u0000\u011b\u0113\u0001"+
		"\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000\u0000\u011b\u0115\u0001"+
		"\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011b\u0117\u0001"+
		"\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c7\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0006\u001c\uffff\uffff\u0000\u011e\u013a\u0005"+
		",\u0000\u0000\u011f\u013a\u0005.\u0000\u0000\u0120\u013a\u0005-\u0000"+
		"\u0000\u0121\u0122\u0005-\u0000\u0000\u0122\u0124\u0005\u0005\u0000\u0000"+
		"\u0123\u0125\u0003,\u0016\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u013a\u0005\u0006\u0000\u0000\u0127\u0128\u0005-\u0000\u0000\u0128\u0129"+
		"\u0005\u0012\u0000\u0000\u0129\u013a\u0005-\u0000\u0000\u012a\u012b\u0005"+
		"-\u0000\u0000\u012b\u012c\u0005\u0012\u0000\u0000\u012c\u012d\u0005-\u0000"+
		"\u0000\u012d\u012f\u0005\u0005\u0000\u0000\u012e\u0130\u0003,\u0016\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u013a\u0005\u0006\u0000\u0000"+
		"\u0132\u0133\u0005\u0015\u0000\u0000\u0133\u0134\u0005\u0012\u0000\u0000"+
		"\u0134\u013a\u0005-\u0000\u0000\u0135\u0136\u0005\u0005\u0000\u0000\u0136"+
		"\u0137\u00038\u001c\u0000\u0137\u0138\u0005\u0006\u0000\u0000\u0138\u013a"+
		"\u0001\u0000\u0000\u0000\u0139\u011d\u0001\u0000\u0000\u0000\u0139\u011f"+
		"\u0001\u0000\u0000\u0000\u0139\u0120\u0001\u0000\u0000\u0000\u0139\u0121"+
		"\u0001\u0000\u0000\u0000\u0139\u0127\u0001\u0000\u0000\u0000\u0139\u012a"+
		"\u0001\u0000\u0000\u0000\u0139\u0132\u0001\u0000\u0000\u0000\u0139\u0135"+
		"\u0001\u0000\u0000\u0000\u013a\u0146\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\n\u0004\u0000\u0000\u013c\u013d\u0007\u0000\u0000\u0000\u013d\u0145\u0003"+
		"8\u001c\u0005\u013e\u013f\n\u0003\u0000\u0000\u013f\u0140\u0007\u0001"+
		"\u0000\u0000\u0140\u0145\u00038\u001c\u0004\u0141\u0142\n\u0002\u0000"+
		"\u0000\u0142\u0143\u0007\u0002\u0000\u0000\u0143\u0145\u00038\u001c\u0003"+
		"\u0144\u013b\u0001\u0000\u0000\u0000\u0144\u013e\u0001\u0000\u0000\u0000"+
		"\u0144\u0141\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u01479\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0007\u0003\u0000\u0000\u014a;\u0001\u0000\u0000\u0000\u0018?M"+
		"T]akmy\u0089\u0093\u009f\u00a9\u00bf\u00e4\u00ec\u00f3\u00f7\u0108\u011b"+
		"\u0124\u012f\u0139\u0144\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}