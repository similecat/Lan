// Generated from constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class constraintParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, LET=14, APP=15, UNION=16, ASSERT=17, 
		EITHER=18, PERM=19, LIMITING=20, ACTION=21, OWN_FLOWS=22, OTHERS_FLOWS=23, 
		ALL_FLOWS=24, MAX_PRIORITY=25, EVENT_INTERCEPTION=26, MODIFY_EVENT_ORDER=27, 
		FLOW_LEVEL=28, PORT_LEVEL=29, SWITCH_LEVEL=30, IP_SRC=31, IP_DST=32, TCP_SRC=33, 
		TCP_DST=34, VLAN_ID=35, INT=36, FLOAT=37, IP=38, WITH=39, MASK=40, IP_FORMAT=41, 
		SWITCH=42, LINK=43, ALL_SWITCHES=44, BORDER_SWITCHES=45, ALL_DIRECT_LINKS=46, 
		ALL_PATHS_AS_LINKS=47, VIRTUAL=48, SINGLE_BIG_SWITCH=49, DROP=50, FORWARD=51, 
		MODIFY=52, FIELD=53, AND=54, OR=55, NOT=56, AS=57, RULE_COUNT_PER_SWITCH=58, 
		SIZE_PERCENTAGE_PER_SWITCH=59, STRING=60, WS=61;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'-'", "'('", "':'", "'<'", "'='", "';'", "'<='", 
		"'>'", "'{'", "'>='", "'}'", "'LET'", "'APP'", "'UNION'", "'ASSERT'", 
		"'EITHER'", "'PERM'", "'LIMITING'", "'ACTION'", "'OWN_FLOWS'", "'OTHERS_FLOWS'", 
		"'ALL_FLOWS'", "'MAX_PRIORITY'", "'EVENT_INTERCEPTION'", "'MODIFY_EVENT_ORDER'", 
		"'FLOW_LEVEL'", "'PORT_LEVEL'", "'SWITCH_LEVEL'", "'IP_SRC'", "'IP_DST'", 
		"'TCP_SRC'", "'TCP_DST'", "'VLAN_ID'", "INT", "FLOAT", "'IP'", "'WITH'", 
		"'MASK'", "IP_FORMAT", "'SWITCH'", "'LINK'", "'ALL_SWITCHES'", "'BORDER_SWITCHES'", 
		"'ALL_DIRECT_LINKS'", "'ALL_PATHS_AS_LINKS'", "'VIRTUAL'", "'SINGLE_BIG_SWITCH'", 
		"'DROP'", "'FORWARD'", "'MODIFY'", "'FIELD'", "'AND'", "'OR'", "'NOT'", 
		"'AS'", "'RULE_COUNT_PER_SWITCH'", "'SIZE_PERCENTAGE_PER_SWITCH'", "STRING", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_binding = 1, RULE_var_perm = 2, RULE_app_name = 3, 
		RULE_perm_expr = 4, RULE_assert_list = 5, RULE_assert_stmt = 6, RULE_assert_expr = 7, 
		RULE_boolean_expr = 8, RULE_cmp_operator = 9, RULE_exclusive = 10, RULE_perm_list = 11, 
		RULE_perm = 12, RULE_filter_expr = 13, RULE_filter_term = 14, RULE_filter_factor = 15, 
		RULE_filter_not_factor = 16, RULE_flow_predicate = 17, RULE_field = 18, 
		RULE_value_list = 19, RULE_value_range = 20, RULE_ip_range = 21, RULE_ip_format = 22, 
		RULE_topo = 23, RULE_physical_topo = 24, RULE_switch_set = 25, RULE_sw_idx_list = 26, 
		RULE_sw_idx = 27, RULE_link_set = 28, RULE_link_list = 29, RULE_link = 30, 
		RULE_path = 31, RULE_link_idx = 32, RULE_virtual_topo = 33, RULE_switch_mapping = 34, 
		RULE_virtual_switch_set = 35, RULE_action = 36, RULE_field_list = 37, 
		RULE_ownership = 38, RULE_max_priority = 39, RULE_flow_table = 40, RULE_notification = 41, 
		RULE_statistics = 42, RULE_perm_name = 43;
	public static final String[] ruleNames = {
		"program", "binding", "var_perm", "app_name", "perm_expr", "assert_list", 
		"assert_stmt", "assert_expr", "boolean_expr", "cmp_operator", "exclusive", 
		"perm_list", "perm", "filter_expr", "filter_term", "filter_factor", "filter_not_factor", 
		"flow_predicate", "field", "value_list", "value_range", "ip_range", "ip_format", 
		"topo", "physical_topo", "switch_set", "sw_idx_list", "sw_idx", "link_set", 
		"link_list", "link", "path", "link_idx", "virtual_topo", "switch_mapping", 
		"virtual_switch_set", "action", "field_list", "ownership", "max_priority", 
		"flow_table", "notification", "statistics", "perm_name"
	};

	@Override
	public String getGrammarFileName() { return "constraint.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public constraintParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_list_Context extends ProgramContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Assert_listContext assert_list() {
			return getRuleContext(Assert_listContext.class,0);
		}
		public Assert_list_Context(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_list_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_list_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_list_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bind_Context extends ProgramContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public Bind_Context(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyContext extends ProgramContext {
		public EmptyContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new Bind_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88); binding();
				setState(89); program();
				}
				break;
			case ASSERT:
				_localctx = new Assert_list_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91); assert_list();
				setState(92); program();
				}
				break;
			case 8:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94); match(8);
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

	public static class BindingContext extends ParserRuleContext {
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
	 
		public BindingContext() { }
		public void copyFrom(BindingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bind_exprContext extends BindingContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_exprContext perm_expr() {
			return getRuleContext(Perm_exprContext.class,0);
		}
		public TerminalNode LET() { return getToken(constraintParser.LET, 0); }
		public Bind_exprContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bind_listContext extends BindingContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public TerminalNode LET() { return getToken(constraintParser.LET, 0); }
		public Bind_listContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_list(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bind_appContext extends BindingContext {
		public TerminalNode APP() { return getToken(constraintParser.APP, 0); }
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public TerminalNode LET() { return getToken(constraintParser.LET, 0); }
		public App_nameContext app_name() {
			return getRuleContext(App_nameContext.class,0);
		}
		public Bind_appContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_app(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_app(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_binding);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Bind_listContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(LET);
				setState(98); var_perm();
				setState(99); match(7);
				setState(100); match(11);
				setState(101); perm_list();
				setState(102); match(13);
				}
				break;

			case 2:
				_localctx = new Bind_appContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(LET);
				setState(105); var_perm();
				setState(106); match(7);
				setState(107); match(APP);
				setState(108); app_name();
				}
				break;

			case 3:
				_localctx = new Bind_exprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110); match(LET);
				setState(111); var_perm();
				setState(112); match(7);
				setState(113); perm_expr();
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

	public static class Var_permContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(constraintParser.STRING, 0); }
		public Var_permContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_perm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVar_perm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVar_perm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVar_perm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_permContext var_perm() throws RecognitionException {
		Var_permContext _localctx = new Var_permContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_perm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(STRING);
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

	public static class App_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(constraintParser.STRING, 0); }
		public App_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterApp_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitApp_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitApp_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final App_nameContext app_name() throws RecognitionException {
		App_nameContext _localctx = new App_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_app_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(STRING);
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

	public static class Perm_exprContext extends ParserRuleContext {
		public Perm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_expr; }
	 
		public Perm_exprContext() { }
		public void copyFrom(Perm_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Perm_expr_unionContext extends Perm_exprContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_exprContext perm_expr() {
			return getRuleContext(Perm_exprContext.class,0);
		}
		public TerminalNode UNION() { return getToken(constraintParser.UNION, 0); }
		public Perm_expr_unionContext(Perm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Perm_expr__woContext extends Perm_exprContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_expr__woContext(Perm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_expr__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_expr__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_expr__wo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_exprContext perm_expr() throws RecognitionException {
		Perm_exprContext _localctx = new Perm_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_perm_expr);
		try {
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Perm_expr__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121); var_perm();
				}
				break;

			case 2:
				_localctx = new Perm_expr_unionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122); var_perm();
				setState(123); match(UNION);
				setState(124); perm_expr();
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

	public static class Assert_listContext extends ParserRuleContext {
		public Assert_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_list; }
	 
		public Assert_listContext() { }
		public void copyFrom(Assert_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_stmt__woContext extends Assert_listContext {
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Assert_stmt__woContext(Assert_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_stmt__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_stmt__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_stmt__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_stmt__wContext extends Assert_listContext {
		public Assert_listContext assert_list() {
			return getRuleContext(Assert_listContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Assert_stmt__wContext(Assert_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_stmt__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_stmt__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_stmt__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_listContext assert_list() throws RecognitionException {
		Assert_listContext _localctx = new Assert_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assert_list);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Assert_stmt__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128); assert_stmt();
				}
				break;

			case 2:
				_localctx = new Assert_stmt__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129); assert_stmt();
				setState(130); assert_list();
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

	public static class Assert_stmtContext extends ParserRuleContext {
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
	 
		public Assert_stmtContext() { }
		public void copyFrom(Assert_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_st_exprContext extends Assert_stmtContext {
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(constraintParser.ASSERT, 0); }
		public Assert_st_exprContext(Assert_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_st_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_st_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_st_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_st_excContext extends Assert_stmtContext {
		public ExclusiveContext exclusive() {
			return getRuleContext(ExclusiveContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(constraintParser.ASSERT, 0); }
		public Assert_st_excContext(Assert_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_st_exc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_st_exc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_st_exc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assert_stmt);
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Assert_st_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134); match(ASSERT);
				setState(135); assert_expr();
				}
				break;

			case 2:
				_localctx = new Assert_st_excContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(ASSERT);
				setState(137); exclusive();
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

	public static class Assert_exprContext extends ParserRuleContext {
		public Assert_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_expr; }
	 
		public Assert_exprContext() { }
		public void copyFrom(Assert_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_andContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public Assert_andContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_notContext extends Assert_exprContext {
		public TerminalNode NOT() { return getToken(constraintParser.NOT, 0); }
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public Assert_notContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_boolContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Assert_boolContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_orContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public TerminalNode OR() { return getToken(constraintParser.OR, 0); }
		public Assert_orContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_exprContext assert_expr() throws RecognitionException {
		Assert_exprContext _localctx = new Assert_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assert_expr);
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Assert_notContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(NOT);
				setState(141); assert_expr();
				}
				break;

			case 2:
				_localctx = new Assert_orContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142); boolean_expr();
				setState(143); match(OR);
				setState(144); assert_expr();
				}
				break;

			case 3:
				_localctx = new Assert_andContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146); boolean_expr();
				setState(147); match(AND);
				setState(148); assert_expr();
				}
				break;

			case 4:
				_localctx = new Assert_boolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150); boolean_expr();
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

	public static class Boolean_exprContext extends ParserRuleContext {
		public List<Perm_exprContext> perm_expr() {
			return getRuleContexts(Perm_exprContext.class);
		}
		public Perm_exprContext perm_expr(int i) {
			return getRuleContext(Perm_exprContext.class,i);
		}
		public Cmp_operatorContext cmp_operator() {
			return getRuleContext(Cmp_operatorContext.class,0);
		}
		public Boolean_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBoolean_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBoolean_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBoolean_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolean_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); perm_expr();
			setState(154); cmp_operator();
			setState(155); perm_expr();
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

	public static class Cmp_operatorContext extends ParserRuleContext {
		public Cmp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterCmp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitCmp_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitCmp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_operatorContext cmp_operator() throws RecognitionException {
		Cmp_operatorContext _localctx = new Cmp_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 9) | (1L << 10) | (1L << 12))) != 0)) ) {
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

	public static class ExclusiveContext extends ParserRuleContext {
		public List<Perm_exprContext> perm_expr() {
			return getRuleContexts(Perm_exprContext.class);
		}
		public TerminalNode EITHER() { return getToken(constraintParser.EITHER, 0); }
		public Perm_exprContext perm_expr(int i) {
			return getRuleContext(Perm_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(constraintParser.OR, 0); }
		public ExclusiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterExclusive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitExclusive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitExclusive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveContext exclusive() throws RecognitionException {
		ExclusiveContext _localctx = new ExclusiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exclusive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(EITHER);
			setState(160); perm_expr();
			setState(161); match(OR);
			setState(162); perm_expr();
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

	public static class Perm_listContext extends ParserRuleContext {
		public Perm_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_list; }
	 
		public Perm_listContext() { }
		public void copyFrom(Perm_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Perm_list__woContext extends Perm_listContext {
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public Perm_list__woContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_list__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_list__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_list__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Perm_list__wContext extends Perm_listContext {
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public Perm_list__wContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_list__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_listContext perm_list() throws RecognitionException {
		Perm_listContext _localctx = new Perm_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_perm_list);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Perm_list__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164); perm();
				}
				break;

			case 2:
				_localctx = new Perm_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165); perm();
				setState(166); perm_list();
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

	public static class PermContext extends ParserRuleContext {
		public PermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm; }
	 
		public PermContext() { }
		public void copyFrom(PermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Perm__wContext extends PermContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public TerminalNode LIMITING() { return getToken(constraintParser.LIMITING, 0); }
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(constraintParser.PERM, 0); }
		public Perm__wContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm__w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Perm__woContext extends PermContext {
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(constraintParser.PERM, 0); }
		public Perm__woContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm__wo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermContext perm() throws RecognitionException {
		PermContext _localctx = new PermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_perm);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Perm__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170); match(PERM);
				setState(171); perm_name();
				}
				break;

			case 2:
				_localctx = new Perm__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172); match(PERM);
				setState(173); perm_name();
				setState(174); match(LIMITING);
				setState(175); filter_expr(0);
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

	public static class Filter_exprContext extends ParserRuleContext {
		public int _p;
		public Filter_exprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_exprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_expr; }
	 
		public Filter_exprContext() { }
		public void copyFrom(Filter_exprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Filter_expr__termContext extends Filter_exprContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public Filter_expr__termContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_expr__term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_expr__term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_expr__term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_expr__expr_and_termContext extends Filter_exprContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public Filter_expr__expr_and_termContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_expr__expr_and_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_expr__expr_and_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_expr__expr_and_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_exprContext filter_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_exprContext _localctx = new Filter_exprContext(_ctx, _parentState, _p);
		Filter_exprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_filter_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Filter_expr__termContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(180); filter_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Filter_expr__expr_and_termContext(new Filter_exprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_expr);
					setState(182);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(183); match(AND);
					setState(184); filter_term(0);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Filter_termContext extends ParserRuleContext {
		public int _p;
		public Filter_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_termContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_term; }
	 
		public Filter_termContext() { }
		public void copyFrom(Filter_termContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Filter_term__factorContext extends Filter_termContext {
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public Filter_term__factorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_term__factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_term__factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_term__factor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_term__term_or_factorContext extends Filter_termContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public TerminalNode OR() { return getToken(constraintParser.OR, 0); }
		public Filter_term__term_or_factorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_term__term_or_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_term__term_or_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_term__term_or_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_termContext filter_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_termContext _localctx = new Filter_termContext(_ctx, _parentState, _p);
		Filter_termContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_filter_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Filter_term__factorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(191); filter_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Filter_term__term_or_factorContext(new Filter_termContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_term);
					setState(193);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(194); match(OR);
					setState(195); filter_factor();
					}
					} 
				}
				setState(200);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Filter_factorContext extends ParserRuleContext {
		public Filter_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_factor; }
	 
		public Filter_factorContext() { }
		public void copyFrom(Filter_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filter_factor__NOTContext extends Filter_factorContext {
		public TerminalNode NOT() { return getToken(constraintParser.NOT, 0); }
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public Filter_factor__NOTContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_factor__NOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_factor__NOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_factor__NOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_factor__not_factorContext extends Filter_factorContext {
		public Filter_not_factorContext filter_not_factor() {
			return getRuleContext(Filter_not_factorContext.class,0);
		}
		public Filter_factor__not_factorContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_factor__not_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_factor__not_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_factor__not_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_factorContext filter_factor() throws RecognitionException {
		Filter_factorContext _localctx = new Filter_factorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filter_factor);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case 4:
			case ACTION:
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
			case MAX_PRIORITY:
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case IP:
			case SWITCH:
			case VIRTUAL:
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new Filter_factor__not_factorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201); filter_not_factor();
				}
				break;
			case NOT:
				_localctx = new Filter_factor__NOTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202); match(NOT);
				setState(203); filter_factor();
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

	public static class Filter_not_factorContext extends ParserRuleContext {
		public Filter_not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_not_factor; }
	 
		public Filter_not_factorContext() { }
		public void copyFrom(Filter_not_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statistics_Context extends Filter_not_factorContext {
		public StatisticsContext statistics() {
			return getRuleContext(StatisticsContext.class,0);
		}
		public Statistics_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterStatistics_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitStatistics_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitStatistics_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Max_priority_Context extends Filter_not_factorContext {
		public Max_priorityContext max_priority() {
			return getRuleContext(Max_priorityContext.class,0);
		}
		public Max_priority_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterMax_priority_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitMax_priority_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitMax_priority_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Topo_Context extends Filter_not_factorContext {
		public TopoContext topo() {
			return getRuleContext(TopoContext.class,0);
		}
		public Topo_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterTopo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitTopo_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitTopo_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Flow_table_Context extends Filter_not_factorContext {
		public Flow_tableContext flow_table() {
			return getRuleContext(Flow_tableContext.class,0);
		}
		public Flow_table_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_table_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_table_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_table_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_expr_Context extends Filter_not_factorContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public Filter_expr_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_expr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_expr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_expr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Flow_predicate_Context extends Filter_not_factorContext {
		public Flow_predicateContext flow_predicate() {
			return getRuleContext(Flow_predicateContext.class,0);
		}
		public Flow_predicate_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_predicate_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_predicate_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_predicate_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Notification_Context extends Filter_not_factorContext {
		public NotificationContext notification() {
			return getRuleContext(NotificationContext.class,0);
		}
		public Notification_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterNotification_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitNotification_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitNotification_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Action_Context extends Filter_not_factorContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(constraintParser.ACTION, 0); }
		public Action_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAction_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ownership_Context extends Filter_not_factorContext {
		public OwnershipContext ownership() {
			return getRuleContext(OwnershipContext.class,0);
		}
		public Ownership_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterOwnership_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitOwnership_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitOwnership_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_not_factorContext filter_not_factor() throws RecognitionException {
		Filter_not_factorContext _localctx = new Filter_not_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_filter_not_factor);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new Filter_expr_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206); match(4);
				setState(207); filter_expr(0);
				setState(208); match(1);
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case IP:
				_localctx = new Flow_predicate_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210); flow_predicate();
				}
				break;
			case SWITCH:
			case VIRTUAL:
				_localctx = new Topo_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211); topo();
				}
				break;
			case ACTION:
				_localctx = new Action_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(212); match(ACTION);
				setState(213); action();
				}
				break;
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
				_localctx = new Ownership_Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214); ownership();
				}
				break;
			case MAX_PRIORITY:
				_localctx = new Max_priority_Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(215); max_priority();
				}
				break;
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new Flow_table_Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(216); flow_table();
				}
				break;
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
				_localctx = new Notification_Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(217); notification();
				}
				break;
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
				_localctx = new Statistics_Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(218); statistics();
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

	public static class Flow_predicateContext extends ParserRuleContext {
		public Flow_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_predicate; }
	 
		public Flow_predicateContext() { }
		public void copyFrom(Flow_predicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Field_Context extends Flow_predicateContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public Field_Context(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterField_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitField_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitField_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ip_range_Context extends Flow_predicateContext {
		public Ip_rangeContext ip_range() {
			return getRuleContext(Ip_rangeContext.class,0);
		}
		public Ip_range_Context(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterIp_range_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitIp_range_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitIp_range_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_predicateContext flow_predicate() throws RecognitionException {
		Flow_predicateContext _localctx = new Flow_predicateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_flow_predicate);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case IP:
				_localctx = new Ip_range_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221); ip_range();
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
				_localctx = new Field_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222); field();
				setState(223); match(11);
				setState(224); value_list();
				setState(225); match(13);
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IP_SRC() { return getToken(constraintParser.IP_SRC, 0); }
		public TerminalNode TCP_DST() { return getToken(constraintParser.TCP_DST, 0); }
		public TerminalNode VLAN_ID() { return getToken(constraintParser.VLAN_ID, 0); }
		public TerminalNode TCP_SRC() { return getToken(constraintParser.TCP_SRC, 0); }
		public TerminalNode IP_DST() { return getToken(constraintParser.IP_DST, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IP_SRC) | (1L << IP_DST) | (1L << TCP_SRC) | (1L << TCP_DST) | (1L << VLAN_ID))) != 0)) ) {
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

	public static class Value_listContext extends ParserRuleContext {
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
	 
		public Value_listContext() { }
		public void copyFrom(Value_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Value_list__wContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public Value_list__wContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_list__w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_list__sContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public Value_list__sContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_list__s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_list__s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_list__s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value_list);
		try {
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Value_list__sContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231); value_range();
				}
				break;

			case 2:
				_localctx = new Value_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232); value_range();
				setState(233); match(2);
				setState(234); value_list();
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

	public static class Value_rangeContext extends ParserRuleContext {
		public Value_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_range; }
	 
		public Value_rangeContext() { }
		public void copyFrom(Value_rangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Value_range_wContext extends Value_rangeContext {
		public List<TerminalNode> INT() { return getTokens(constraintParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(constraintParser.INT, i);
		}
		public Value_range_wContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_range_w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_range_w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_range_w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_range_sContext extends Value_rangeContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Value_range_sContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_range_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_range_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_range_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_rangeContext value_range() throws RecognitionException {
		Value_rangeContext _localctx = new Value_rangeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value_range);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Value_range_sContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238); match(INT);
				}
				break;

			case 2:
				_localctx = new Value_range_wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(INT);
				setState(240); match(3);
				setState(241); match(INT);
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

	public static class Ip_rangeContext extends ParserRuleContext {
		public TerminalNode MASK() { return getToken(constraintParser.MASK, 0); }
		public Ip_formatContext ip_format(int i) {
			return getRuleContext(Ip_formatContext.class,i);
		}
		public List<Ip_formatContext> ip_format() {
			return getRuleContexts(Ip_formatContext.class);
		}
		public TerminalNode IP() { return getToken(constraintParser.IP, 0); }
		public TerminalNode WITH() { return getToken(constraintParser.WITH, 0); }
		public Ip_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterIp_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitIp_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitIp_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_rangeContext ip_range() throws RecognitionException {
		Ip_rangeContext _localctx = new Ip_rangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ip_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(IP);
			setState(245); ip_format();
			setState(246); match(WITH);
			setState(247); match(MASK);
			setState(248); ip_format();
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

	public static class Ip_formatContext extends ParserRuleContext {
		public TerminalNode IP_FORMAT() { return getToken(constraintParser.IP_FORMAT, 0); }
		public Ip_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterIp_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitIp_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitIp_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_formatContext ip_format() throws RecognitionException {
		Ip_formatContext _localctx = new Ip_formatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ip_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(IP_FORMAT);
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

	public static class TopoContext extends ParserRuleContext {
		public TopoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topo; }
	 
		public TopoContext() { }
		public void copyFrom(TopoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Physical_topo_Context extends TopoContext {
		public Physical_topoContext physical_topo() {
			return getRuleContext(Physical_topoContext.class,0);
		}
		public Physical_topo_Context(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPhysical_topo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPhysical_topo_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPhysical_topo_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Virtual_topo_Context extends TopoContext {
		public Virtual_topoContext virtual_topo() {
			return getRuleContext(Virtual_topoContext.class,0);
		}
		public Virtual_topo_Context(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_topo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_topo_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_topo_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopoContext topo() throws RecognitionException {
		TopoContext _localctx = new TopoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_topo);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case SWITCH:
				_localctx = new Physical_topo_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252); physical_topo();
				}
				break;
			case VIRTUAL:
				_localctx = new Virtual_topo_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253); virtual_topo();
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

	public static class Physical_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(constraintParser.LINK, 0); }
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public TerminalNode SWITCH() { return getToken(constraintParser.SWITCH, 0); }
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Physical_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPhysical_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPhysical_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPhysical_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_topoContext physical_topo() throws RecognitionException {
		Physical_topoContext _localctx = new Physical_topoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_physical_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(SWITCH);
			setState(257); switch_set();
			setState(258); match(AND);
			setState(259); match(LINK);
			setState(260); link_set();
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

	public static class Switch_setContext extends ParserRuleContext {
		public Switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_set; }
	 
		public Switch_setContext() { }
		public void copyFrom(Switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class All_switches_Context extends Switch_setContext {
		public TerminalNode ALL_SWITCHES() { return getToken(constraintParser.ALL_SWITCHES, 0); }
		public All_switches_Context(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_switches_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_switches_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_switches_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sw_idx_list_Context extends Switch_setContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public Sw_idx_list_Context(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx_list_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx_list_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx_list_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Border_switches_Context extends Switch_setContext {
		public TerminalNode BORDER_SWITCHES() { return getToken(constraintParser.BORDER_SWITCHES, 0); }
		public Border_switches_Context(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBorder_switches_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBorder_switches_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBorder_switches_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_setContext switch_set() throws RecognitionException {
		Switch_setContext _localctx = new Switch_setContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switch_set);
		try {
			setState(268);
			switch (_input.LA(1)) {
			case ALL_SWITCHES:
				_localctx = new All_switches_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262); match(ALL_SWITCHES);
				}
				break;
			case BORDER_SWITCHES:
				_localctx = new Border_switches_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263); match(BORDER_SWITCHES);
				}
				break;
			case 11:
				_localctx = new Sw_idx_list_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264); match(11);
				setState(265); sw_idx_list();
				setState(266); match(13);
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

	public static class Sw_idx_listContext extends ParserRuleContext {
		public Sw_idx_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx_list; }
	 
		public Sw_idx_listContext() { }
		public void copyFrom(Sw_idx_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sw_idx_list__woContext extends Sw_idx_listContext {
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Sw_idx_list__woContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx_list__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx_list__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx_list__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sw_idx_list__wContext extends Sw_idx_listContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Sw_idx_list__wContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx_list__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idx_listContext sw_idx_list() throws RecognitionException {
		Sw_idx_listContext _localctx = new Sw_idx_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sw_idx_list);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Sw_idx_list__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270); sw_idx();
				}
				break;

			case 2:
				_localctx = new Sw_idx_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271); sw_idx();
				setState(272); match(2);
				setState(273); sw_idx_list();
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

	public static class Sw_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Sw_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idxContext sw_idx() throws RecognitionException {
		Sw_idxContext _localctx = new Sw_idxContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sw_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(INT);
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

	public static class Link_setContext extends ParserRuleContext {
		public Link_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_set; }
	 
		public Link_setContext() { }
		public void copyFrom(Link_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class All_driect_links_Context extends Link_setContext {
		public TerminalNode ALL_DIRECT_LINKS() { return getToken(constraintParser.ALL_DIRECT_LINKS, 0); }
		public All_driect_links_Context(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_driect_links_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_driect_links_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_driect_links_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class All_paths_as_links_Context extends Link_setContext {
		public TerminalNode ALL_PATHS_AS_LINKS() { return getToken(constraintParser.ALL_PATHS_AS_LINKS, 0); }
		public All_paths_as_links_Context(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_paths_as_links_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_paths_as_links_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_paths_as_links_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Link_list_Context extends Link_setContext {
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public Link_list_Context(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_list_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_list_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_list_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_setContext link_set() throws RecognitionException {
		Link_setContext _localctx = new Link_setContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_link_set);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case ALL_DIRECT_LINKS:
				_localctx = new All_driect_links_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(ALL_DIRECT_LINKS);
				}
				break;
			case ALL_PATHS_AS_LINKS:
				_localctx = new All_paths_as_links_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(ALL_PATHS_AS_LINKS);
				}
				break;
			case 4:
			case INT:
				_localctx = new Link_list_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281); link_list();
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

	public static class Link_listContext extends ParserRuleContext {
		public Link_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_list; }
	 
		public Link_listContext() { }
		public void copyFrom(Link_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Link_list__woContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Link_list__woContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_list__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_list__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_list__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Link_list__wContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public Link_list__wContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_list__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_listContext link_list() throws RecognitionException {
		Link_listContext _localctx = new Link_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_link_list);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Link_list__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284); link();
				}
				break;

			case 2:
				_localctx = new Link_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285); link();
				setState(286); match(2);
				setState(287); link_list();
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

	public static class LinkContext extends ParserRuleContext {
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
	 
		public LinkContext() { }
		public void copyFrom(LinkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Link__woContext extends LinkContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public Link__woContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Link__wContext extends LinkContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Link__wContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_link);
		try {
			setState(296);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new Link__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291); link_idx();
				}
				break;
			case 4:
				_localctx = new Link__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(4);
				setState(293); path();
				setState(294); match(1);
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

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Path__wContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Path__wContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPath__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPath__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPath__w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Path__woContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public Path__woContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPath__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPath__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPath__wo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_path);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Path__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298); link_idx();
				}
				break;

			case 2:
				_localctx = new Path__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299); link_idx();
				setState(300); match(5);
				setState(301); path();
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

	public static class Link_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Link_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_idxContext link_idx() throws RecognitionException {
		Link_idxContext _localctx = new Link_idxContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_link_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(INT);
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

	public static class Virtual_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(constraintParser.LINK, 0); }
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public Switch_mappingContext switch_mapping() {
			return getRuleContext(Switch_mappingContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(constraintParser.VIRTUAL, 0); }
		public TerminalNode SWITCH() { return getToken(constraintParser.SWITCH, 0); }
		public Virtual_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_topoContext virtual_topo() throws RecognitionException {
		Virtual_topoContext _localctx = new Virtual_topoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_virtual_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(VIRTUAL);
			setState(308); match(SWITCH);
			setState(309); switch_mapping();
			setState(310); match(AND);
			setState(311); match(LINK);
			setState(312); link_set();
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

	public static class Switch_mappingContext extends ParserRuleContext {
		public Switch_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_mapping; }
	 
		public Switch_mappingContext() { }
		public void copyFrom(Switch_mappingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single_big_switch_Context extends Switch_mappingContext {
		public TerminalNode SINGLE_BIG_SWITCH() { return getToken(constraintParser.SINGLE_BIG_SWITCH, 0); }
		public Single_big_switch_Context(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSingle_big_switch_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSingle_big_switch_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSingle_big_switch_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Virtual_switch_set_Context extends Switch_mappingContext {
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public Virtual_switch_set_Context(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_switch_set_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_switch_set_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_switch_set_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_mappingContext switch_mapping() throws RecognitionException {
		Switch_mappingContext _localctx = new Switch_mappingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switch_mapping);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case SINGLE_BIG_SWITCH:
				_localctx = new Single_big_switch_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314); match(SINGLE_BIG_SWITCH);
				}
				break;
			case 11:
				_localctx = new Virtual_switch_set_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(11);
				setState(316); virtual_switch_set();
				setState(317); match(13);
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

	public static class Virtual_switch_setContext extends ParserRuleContext {
		public Virtual_switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_switch_set; }
	 
		public Virtual_switch_setContext() { }
		public void copyFrom(Virtual_switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Virtual_switch_set__woContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(constraintParser.AS, 0); }
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Virtual_switch_set__woContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_switch_set__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_switch_set__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_switch_set__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Virtual_switch_set__wContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(constraintParser.AS, 0); }
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Virtual_switch_set__wContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_switch_set__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_switch_set__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_switch_set__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_switch_setContext virtual_switch_set() throws RecognitionException {
		Virtual_switch_setContext _localctx = new Virtual_switch_setContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_virtual_switch_set);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Virtual_switch_set__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321); switch_set();
				setState(322); match(AS);
				setState(323); sw_idx();
				}
				break;

			case 2:
				_localctx = new Virtual_switch_set__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325); switch_set();
				setState(326); match(AS);
				setState(327); sw_idx();
				setState(328); match(2);
				setState(329); virtual_switch_set();
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Modify_Context extends ActionContext {
		public TerminalNode MODIFY() { return getToken(constraintParser.MODIFY, 0); }
		public Modify_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterModify_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitModify_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitModify_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Modify_field_Context extends ActionContext {
		public TerminalNode MODIFY() { return getToken(constraintParser.MODIFY, 0); }
		public TerminalNode FIELD() { return getToken(constraintParser.FIELD, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Modify_field_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterModify_field_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitModify_field_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitModify_field_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_Context extends ActionContext {
		public TerminalNode FORWARD() { return getToken(constraintParser.FORWARD, 0); }
		public Forward_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterForward_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitForward_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitForward_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Drop_Context extends ActionContext {
		public TerminalNode DROP() { return getToken(constraintParser.DROP, 0); }
		public Drop_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterDrop_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitDrop_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitDrop_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_action);
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Drop_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333); match(DROP);
				}
				break;

			case 2:
				_localctx = new Forward_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334); match(FORWARD);
				}
				break;

			case 3:
				_localctx = new Modify_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(335); match(MODIFY);
				}
				break;

			case 4:
				_localctx = new Modify_field_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(336); match(MODIFY);
				setState(337); match(FIELD);
				setState(338); field_list();
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

	public static class Field_listContext extends ParserRuleContext {
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
	 
		public Field_listContext() { }
		public void copyFrom(Field_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filed__woContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Filed__woContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFiled__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFiled__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFiled__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Field__wContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Field__wContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterField__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitField__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitField__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_field_list);
		try {
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Filed__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341); field();
				}
				break;

			case 2:
				_localctx = new Field__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342); field();
				setState(343); match(2);
				setState(344); field_list();
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

	public static class OwnershipContext extends ParserRuleContext {
		public OwnershipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownership; }
	 
		public OwnershipContext() { }
		public void copyFrom(OwnershipContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Own_flows_Context extends OwnershipContext {
		public TerminalNode OWN_FLOWS() { return getToken(constraintParser.OWN_FLOWS, 0); }
		public Own_flows_Context(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterOwn_flows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitOwn_flows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitOwn_flows_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class All_flows_Context extends OwnershipContext {
		public TerminalNode ALL_FLOWS() { return getToken(constraintParser.ALL_FLOWS, 0); }
		public All_flows_Context(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_flows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_flows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_flows_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Others_flows_Context extends OwnershipContext {
		public TerminalNode OTHERS_FLOWS() { return getToken(constraintParser.OTHERS_FLOWS, 0); }
		public Others_flows_Context(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterOthers_flows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitOthers_flows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitOthers_flows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnershipContext ownership() throws RecognitionException {
		OwnershipContext _localctx = new OwnershipContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ownership);
		try {
			setState(351);
			switch (_input.LA(1)) {
			case OWN_FLOWS:
				_localctx = new Own_flows_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348); match(OWN_FLOWS);
				}
				break;
			case OTHERS_FLOWS:
				_localctx = new Others_flows_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349); match(OTHERS_FLOWS);
				}
				break;
			case ALL_FLOWS:
				_localctx = new All_flows_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(350); match(ALL_FLOWS);
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

	public static class Max_priorityContext extends ParserRuleContext {
		public TerminalNode MAX_PRIORITY() { return getToken(constraintParser.MAX_PRIORITY, 0); }
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Max_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterMax_priority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitMax_priority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitMax_priority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_priorityContext max_priority() throws RecognitionException {
		Max_priorityContext _localctx = new Max_priorityContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_max_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(MAX_PRIORITY);
			setState(354); match(INT);
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

	public static class Flow_tableContext extends ParserRuleContext {
		public Flow_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_table; }
	 
		public Flow_tableContext() { }
		public void copyFrom(Flow_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Flow_table_2Context extends Flow_tableContext {
		public TerminalNode SIZE_PERCENTAGE_PER_SWITCH() { return getToken(constraintParser.SIZE_PERCENTAGE_PER_SWITCH, 0); }
		public TerminalNode FLOAT() { return getToken(constraintParser.FLOAT, 0); }
		public Flow_table_2Context(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_table_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_table_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_table_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Flow_table__1Context extends Flow_tableContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public TerminalNode RULE_COUNT_PER_SWITCH() { return getToken(constraintParser.RULE_COUNT_PER_SWITCH, 0); }
		public Flow_table__1Context(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_table__1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_table__1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_table__1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_tableContext flow_table() throws RecognitionException {
		Flow_tableContext _localctx = new Flow_tableContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_flow_table);
		try {
			setState(360);
			switch (_input.LA(1)) {
			case RULE_COUNT_PER_SWITCH:
				_localctx = new Flow_table__1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356); match(RULE_COUNT_PER_SWITCH);
				setState(357); match(INT);
				}
				break;
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new Flow_table_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358); match(SIZE_PERCENTAGE_PER_SWITCH);
				setState(359); match(FLOAT);
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

	public static class NotificationContext extends ParserRuleContext {
		public NotificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notification; }
	 
		public NotificationContext() { }
		public void copyFrom(NotificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Modify_event_order_Context extends NotificationContext {
		public TerminalNode MODIFY_EVENT_ORDER() { return getToken(constraintParser.MODIFY_EVENT_ORDER, 0); }
		public Modify_event_order_Context(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterModify_event_order_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitModify_event_order_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitModify_event_order_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Event_interception_Context extends NotificationContext {
		public TerminalNode EVENT_INTERCEPTION() { return getToken(constraintParser.EVENT_INTERCEPTION, 0); }
		public Event_interception_Context(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterEvent_interception_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitEvent_interception_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitEvent_interception_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationContext notification() throws RecognitionException {
		NotificationContext _localctx = new NotificationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_notification);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case EVENT_INTERCEPTION:
				_localctx = new Event_interception_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362); match(EVENT_INTERCEPTION);
				}
				break;
			case MODIFY_EVENT_ORDER:
				_localctx = new Modify_event_order_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363); match(MODIFY_EVENT_ORDER);
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

	public static class StatisticsContext extends ParserRuleContext {
		public StatisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics; }
	 
		public StatisticsContext() { }
		public void copyFrom(StatisticsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Flow_level_Context extends StatisticsContext {
		public TerminalNode FLOW_LEVEL() { return getToken(constraintParser.FLOW_LEVEL, 0); }
		public Flow_level_Context(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_level_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_level_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_level_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Switch_level_Context extends StatisticsContext {
		public TerminalNode SWITCH_LEVEL() { return getToken(constraintParser.SWITCH_LEVEL, 0); }
		public Switch_level_Context(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSwitch_level_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSwitch_level_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSwitch_level_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Port_level_Context extends StatisticsContext {
		public TerminalNode PORT_LEVEL() { return getToken(constraintParser.PORT_LEVEL, 0); }
		public Port_level_Context(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPort_level_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPort_level_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPort_level_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsContext statistics() throws RecognitionException {
		StatisticsContext _localctx = new StatisticsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_statistics);
		try {
			setState(369);
			switch (_input.LA(1)) {
			case FLOW_LEVEL:
				_localctx = new Flow_level_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366); match(FLOW_LEVEL);
				}
				break;
			case PORT_LEVEL:
				_localctx = new Port_level_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(367); match(PORT_LEVEL);
				}
				break;
			case SWITCH_LEVEL:
				_localctx = new Switch_level_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(368); match(SWITCH_LEVEL);
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

	public static class Perm_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(constraintParser.STRING, 0); }
		public Perm_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_nameContext perm_name() throws RecognitionException {
		Perm_nameContext _localctx = new Perm_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_perm_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(STRING);
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
		case 13: return filter_expr_sempred((Filter_exprContext)_localctx, predIndex);

		case 14: return filter_term_sempred((Filter_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_expr_sempred(Filter_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean filter_term_sempred(Filter_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3?\u0178\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2b\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3v\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3\7"+
		"\3\7\5\7\u0087\n\7\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00b4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bc\n\17"+
		"\f\17\16\17\u00bf\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c7\n\20"+
		"\f\20\16\20\u00ca\13\20\3\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00de\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00e6\n\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00ef\n\25\3\26\3\26\3\26\3\26\5\26\u00f5\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0101\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010f\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0116\n\34\3\35\3\35\3\36\3\36\3\36\5\36\u011d\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u0124\n\37\3 \3 \3 \3 \3 \5 \u012b\n"+
		" \3!\3!\3!\3!\3!\5!\u0132\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\5$\u0142\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u014e\n%\3&\3&\3&\3&"+
		"\3&\3&\5&\u0156\n&\3\'\3\'\3\'\3\'\3\'\5\'\u015d\n\'\3(\3(\3(\5(\u0162"+
		"\n(\3)\3)\3)\3*\3*\3*\3*\5*\u016b\n*\3+\3+\5+\u016f\n+\3,\3,\3,\5,\u0174"+
		"\n,\3-\3-\3-\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVX\2\4\5\b\t\13\f\16\16\3!%\u017a\2a\3\2\2\2\4u\3"+
		"\2\2\2\6w\3\2\2\2\by\3\2\2\2\n\u0080\3\2\2\2\f\u0086\3\2\2\2\16\u008c"+
		"\3\2\2\2\20\u0099\3\2\2\2\22\u009b\3\2\2\2\24\u009f\3\2\2\2\26\u00a1\3"+
		"\2\2\2\30\u00aa\3\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2\2\36\u00c0\3\2"+
		"\2\2 \u00ce\3\2\2\2\"\u00dd\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00ee"+
		"\3\2\2\2*\u00f4\3\2\2\2,\u00f6\3\2\2\2.\u00fc\3\2\2\2\60\u0100\3\2\2\2"+
		"\62\u0102\3\2\2\2\64\u010e\3\2\2\2\66\u0115\3\2\2\28\u0117\3\2\2\2:\u011c"+
		"\3\2\2\2<\u0123\3\2\2\2>\u012a\3\2\2\2@\u0131\3\2\2\2B\u0133\3\2\2\2D"+
		"\u0135\3\2\2\2F\u0141\3\2\2\2H\u014d\3\2\2\2J\u0155\3\2\2\2L\u015c\3\2"+
		"\2\2N\u0161\3\2\2\2P\u0163\3\2\2\2R\u016a\3\2\2\2T\u016e\3\2\2\2V\u0173"+
		"\3\2\2\2X\u0175\3\2\2\2Z[\5\4\3\2[\\\5\2\2\2\\b\3\2\2\2]^\5\f\7\2^_\5"+
		"\2\2\2_b\3\2\2\2`b\7\n\2\2aZ\3\2\2\2a]\3\2\2\2a`\3\2\2\2b\3\3\2\2\2cd"+
		"\7\20\2\2de\5\6\4\2ef\7\t\2\2fg\7\r\2\2gh\5\30\r\2hi\7\17\2\2iv\3\2\2"+
		"\2jk\7\20\2\2kl\5\6\4\2lm\7\t\2\2mn\7\21\2\2no\5\b\5\2ov\3\2\2\2pq\7\20"+
		"\2\2qr\5\6\4\2rs\7\t\2\2st\5\n\6\2tv\3\2\2\2uc\3\2\2\2uj\3\2\2\2up\3\2"+
		"\2\2v\5\3\2\2\2wx\7>\2\2x\7\3\2\2\2yz\7>\2\2z\t\3\2\2\2{\u0081\5\6\4\2"+
		"|}\5\6\4\2}~\7\22\2\2~\177\5\n\6\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0080"+
		"|\3\2\2\2\u0081\13\3\2\2\2\u0082\u0087\5\16\b\2\u0083\u0084\5\16\b\2\u0084"+
		"\u0085\5\f\7\2\u0085\u0087\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2"+
		"\2\2\u0087\r\3\2\2\2\u0088\u0089\7\23\2\2\u0089\u008d\5\20\t\2\u008a\u008b"+
		"\7\23\2\2\u008b\u008d\5\26\f\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008d\17\3\2\2\2\u008e\u008f\7:\2\2\u008f\u009a\5\20\t\2\u0090\u0091"+
		"\5\22\n\2\u0091\u0092\79\2\2\u0092\u0093\5\20\t\2\u0093\u009a\3\2\2\2"+
		"\u0094\u0095\5\22\n\2\u0095\u0096\78\2\2\u0096\u0097\5\20\t\2\u0097\u009a"+
		"\3\2\2\2\u0098\u009a\5\22\n\2\u0099\u008e\3\2\2\2\u0099\u0090\3\2\2\2"+
		"\u0099\u0094\3\2\2\2\u0099\u0098\3\2\2\2\u009a\21\3\2\2\2\u009b\u009c"+
		"\5\n\6\2\u009c\u009d\5\24\13\2\u009d\u009e\5\n\6\2\u009e\23\3\2\2\2\u009f"+
		"\u00a0\t\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\5\n\6"+
		"\2\u00a3\u00a4\79\2\2\u00a4\u00a5\5\n\6\2\u00a5\27\3\2\2\2\u00a6\u00ab"+
		"\5\32\16\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\5\30\r\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad"+
		"\7\25\2\2\u00ad\u00b4\5X-\2\u00ae\u00af\7\25\2\2\u00af\u00b0\5X-\2\u00b0"+
		"\u00b1\7\26\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac"+
		"\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\b\17\1\2\u00b6"+
		"\u00b7\5\36\20\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\6\17\2\3\u00b9\u00ba"+
		"\78\2\2\u00ba\u00bc\5\36\20\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c1\b\20\1\2\u00c1\u00c2\5 \21\2\u00c2\u00c8\3\2\2\2"+
		"\u00c3\u00c4\6\20\3\3\u00c4\u00c5\79\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c3"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\37\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\5\"\22\2\u00cc\u00cd\7:\2"+
		"\2\u00cd\u00cf\5 \21\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf!"+
		"\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d3\7\3\2\2"+
		"\u00d3\u00de\3\2\2\2\u00d4\u00de\5$\23\2\u00d5\u00de\5\60\31\2\u00d6\u00d7"+
		"\7\27\2\2\u00d7\u00de\5J&\2\u00d8\u00de\5N(\2\u00d9\u00de\5P)\2\u00da"+
		"\u00de\5R*\2\u00db\u00de\5T+\2\u00dc\u00de\5V,\2\u00dd\u00d0\3\2\2\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d8\3\2"+
		"\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de#\3\2\2\2\u00df\u00e6\5,\27\2\u00e0\u00e1\5&\24\2"+
		"\u00e1\u00e2\7\r\2\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\7\17\2\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e6%\3\2\2\2\u00e7"+
		"\u00e8\t\3\2\2\u00e8\'\3\2\2\2\u00e9\u00ef\5*\26\2\u00ea\u00eb\5*\26\2"+
		"\u00eb\u00ec\7\4\2\2\u00ec\u00ed\5(\25\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9"+
		"\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00f5\7&\2\2\u00f1\u00f2"+
		"\7&\2\2\u00f2\u00f3\7\5\2\2\u00f3\u00f5\7&\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f5+\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f8\5.\30\2\u00f8"+
		"\u00f9\7)\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\5.\30\2\u00fb-\3\2\2\2\u00fc"+
		"\u00fd\7+\2\2\u00fd/\3\2\2\2\u00fe\u0101\5\62\32\2\u00ff\u0101\5D#\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\61\3\2\2\2\u0102\u0103\7,\2\2"+
		"\u0103\u0104\5\64\33\2\u0104\u0105\78\2\2\u0105\u0106\7-\2\2\u0106\u0107"+
		"\5:\36\2\u0107\63\3\2\2\2\u0108\u010f\7.\2\2\u0109\u010f\7/\2\2\u010a"+
		"\u010b\7\r\2\2\u010b\u010c\5\66\34\2\u010c\u010d\7\17\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010f"+
		"\65\3\2\2\2\u0110\u0116\58\35\2\u0111\u0112\58\35\2\u0112\u0113\7\4\2"+
		"\2\u0113\u0114\5\66\34\2\u0114\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0116\67\3\2\2\2\u0117\u0118\7&\2\2\u01189\3\2\2\2\u0119"+
		"\u011d\7\60\2\2\u011a\u011d\7\61\2\2\u011b\u011d\5<\37\2\u011c\u0119\3"+
		"\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d;\3\2\2\2\u011e\u0124"+
		"\5> \2\u011f\u0120\5> \2\u0120\u0121\7\4\2\2\u0121\u0122\5<\37\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0124=\3\2\2\2"+
		"\u0125\u012b\5B\"\2\u0126\u0127\7\6\2\2\u0127\u0128\5@!\2\u0128\u0129"+
		"\7\3\2\2\u0129\u012b\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012b"+
		"?\3\2\2\2\u012c\u0132\5B\"\2\u012d\u012e\5B\"\2\u012e\u012f\7\7\2\2\u012f"+
		"\u0130\5@!\2\u0130\u0132\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u012d\3\2\2"+
		"\2\u0132A\3\2\2\2\u0133\u0134\7&\2\2\u0134C\3\2\2\2\u0135\u0136\7\62\2"+
		"\2\u0136\u0137\7,\2\2\u0137\u0138\5F$\2\u0138\u0139\78\2\2\u0139\u013a"+
		"\7-\2\2\u013a\u013b\5:\36\2\u013bE\3\2\2\2\u013c\u0142\7\63\2\2\u013d"+
		"\u013e\7\r\2\2\u013e\u013f\5H%\2\u013f\u0140\7\17\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0142G\3\2\2\2\u0143\u0144"+
		"\5\64\33\2\u0144\u0145\7;\2\2\u0145\u0146\58\35\2\u0146\u014e\3\2\2\2"+
		"\u0147\u0148\5\64\33\2\u0148\u0149\7;\2\2\u0149\u014a\58\35\2\u014a\u014b"+
		"\7\4\2\2\u014b\u014c\5H%\2\u014c\u014e\3\2\2\2\u014d\u0143\3\2\2\2\u014d"+
		"\u0147\3\2\2\2\u014eI\3\2\2\2\u014f\u0156\7\64\2\2\u0150\u0156\7\65\2"+
		"\2\u0151\u0156\7\66\2\2\u0152\u0153\7\66\2\2\u0153\u0154\7\67\2\2\u0154"+
		"\u0156\5L\'\2\u0155\u014f\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2"+
		"\2\2\u0155\u0152\3\2\2\2\u0156K\3\2\2\2\u0157\u015d\5&\24\2\u0158\u0159"+
		"\5&\24\2\u0159\u015a\7\4\2\2\u015a\u015b\5L\'\2\u015b\u015d\3\2\2\2\u015c"+
		"\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015dM\3\2\2\2\u015e\u0162\7\30\2\2"+
		"\u015f\u0162\7\31\2\2\u0160\u0162\7\32\2\2\u0161\u015e\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0160\3\2\2\2\u0162O\3\2\2\2\u0163\u0164\7\33\2\2\u0164"+
		"\u0165\7&\2\2\u0165Q\3\2\2\2\u0166\u0167\7<\2\2\u0167\u016b\7&\2\2\u0168"+
		"\u0169\7=\2\2\u0169\u016b\7\'\2\2\u016a\u0166\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016bS\3\2\2\2\u016c\u016f\7\34\2\2\u016d\u016f\7\35\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016d\3\2\2\2\u016fU\3\2\2\2\u0170\u0174\7\36\2\2\u0171"+
		"\u0174\7\37\2\2\u0172\u0174\7 \2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0172\3\2\2\2\u0174W\3\2\2\2\u0175\u0176\7>\2\2\u0176Y\3\2"+
		"\2\2 au\u0080\u0086\u008c\u0099\u00aa\u00b3\u00bd\u00c8\u00ce\u00dd\u00e5"+
		"\u00ee\u00f4\u0100\u010e\u0115\u011c\u0123\u012a\u0131\u0141\u014d\u0155"+
		"\u015c\u0161\u016a\u016e\u0173";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}