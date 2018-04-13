// $ANTLR 3.5.2 Grammar.g 2018-04-13 01:21:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ANDBOOL", "ANOBLOCK", 
		"ATTRIBUTE", "BLOCK", "BOOL", "CALLFUN", "COMMENT", "DIV", "EPERLU", "EQUAL", 
		"IDF", "IF", "INT", "MAIN", "NEW", "NEXT", "OPBOOLEQ", "ORBOOL", "PREV", 
		"RES", "STAR", "STRING", "SUB", "UNAIRE", "UNISTAR", "UNISUB", "VEC", 
		"WS", "'('", "')'", "','", "'->'", "'.'", "':'", "';'", "'['", "']'", 
		"'bool'", "'break'", "'else'", "'fn'", "'i32'", "'len'", "'let'", "'loop'", 
		"'mut'", "'print'", "'return'", "'struct'", "'vec'", "'while'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int ADD=4;
	public static final int ANDBOOL=5;
	public static final int ANOBLOCK=6;
	public static final int ATTRIBUTE=7;
	public static final int BLOCK=8;
	public static final int BOOL=9;
	public static final int CALLFUN=10;
	public static final int COMMENT=11;
	public static final int DIV=12;
	public static final int EPERLU=13;
	public static final int EQUAL=14;
	public static final int IDF=15;
	public static final int IF=16;
	public static final int INT=17;
	public static final int MAIN=18;
	public static final int NEW=19;
	public static final int NEXT=20;
	public static final int OPBOOLEQ=21;
	public static final int ORBOOL=22;
	public static final int PREV=23;
	public static final int RES=24;
	public static final int STAR=25;
	public static final int STRING=26;
	public static final int SUB=27;
	public static final int UNAIRE=28;
	public static final int UNISTAR=29;
	public static final int UNISUB=30;
	public static final int VEC=31;
	public static final int WS=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Grammar.g"; }


	boolean mainFound = false;


	public static class axiom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "axiom"
	// Grammar.g:24:1: axiom : fichier EOF -> fichier ;
	public final GrammarParser.axiom_return axiom() throws RecognitionException {
		GrammarParser.axiom_return retval = new GrammarParser.axiom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope fichier1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_fichier=new RewriteRuleSubtreeStream(adaptor,"rule fichier");

		try {
			// Grammar.g:24:7: ( fichier EOF -> fichier )
			// Grammar.g:24:9: fichier EOF
			{
			pushFollow(FOLLOW_fichier_in_axiom94);
			fichier1=fichier();
			state._fsp--;

			stream_fichier.add(fichier1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_axiom96);  
			stream_EOF.add(EOF2);

			if (!mainFound){System.err.println("main not found");}
			// AST REWRITE
			// elements: fichier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 24:78: -> fichier
			{
				adaptor.addChild(root_0, stream_fichier.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "axiom"


	public static class fichier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fichier"
	// Grammar.g:27:1: fichier : ( decl )* ;
	public final GrammarParser.fichier_return fichier() throws RecognitionException {
		GrammarParser.fichier_return retval = new GrammarParser.fichier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope decl3 =null;


		try {
			// Grammar.g:27:9: ( ( decl )* )
			// Grammar.g:27:11: ( decl )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:27:11: ( decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==45||LA1_0==53) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grammar.g:27:11: decl
					{
					pushFollow(FOLLOW_decl_in_fichier112);
					decl3=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fichier"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// Grammar.g:30:1: decl : ( declFun | declStruct );
	public final GrammarParser.decl_return decl() throws RecognitionException {
		GrammarParser.decl_return retval = new GrammarParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declFun4 =null;
		ParserRuleReturnScope declStruct5 =null;


		try {
			// Grammar.g:30:6: ( declFun | declStruct )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==45) ) {
				alt2=1;
			}
			else if ( (LA2_0==53) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Grammar.g:30:8: declFun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declFun_in_decl123);
					declFun4=declFun();
					state._fsp--;

					adaptor.addChild(root_0, declFun4.getTree());

					}
					break;
				case 2 :
					// Grammar.g:31:3: declStruct
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declStruct_in_decl128);
					declStruct5=declStruct();
					state._fsp--;

					adaptor.addChild(root_0, declStruct5.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class declStruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declStruct"
	// Grammar.g:34:1: declStruct : 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) ;
	public final GrammarParser.declStruct_return declStruct() throws RecognitionException {
		GrammarParser.declStruct_return retval = new GrammarParser.declStruct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		Token IDF7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope args9 =null;

		CommonTree string_literal6_tree=null;
		CommonTree IDF7_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree char_literal10_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");

		try {
			// Grammar.g:34:12: ( 'struct' IDF '{' ( args )? '}' -> ^( 'struct' IDF ( args )? ) )
			// Grammar.g:34:14: 'struct' IDF '{' ( args )? '}'
			{
			string_literal6=(Token)match(input,53,FOLLOW_53_in_declStruct137);  
			stream_53.add(string_literal6);

			IDF7=(Token)match(input,IDF,FOLLOW_IDF_in_declStruct139);  
			stream_IDF.add(IDF7);

			char_literal8=(Token)match(input,56,FOLLOW_56_in_declStruct141);  
			stream_56.add(char_literal8);

			// Grammar.g:34:31: ( args )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDF) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Grammar.g:34:31: args
					{
					pushFollow(FOLLOW_args_in_declStruct143);
					args9=args();
					state._fsp--;

					stream_args.add(args9.getTree());
					}
					break;

			}

			char_literal10=(Token)match(input,57,FOLLOW_57_in_declStruct146);  
			stream_57.add(char_literal10);

			// AST REWRITE
			// elements: 53, IDF, args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 34:41: -> ^( 'struct' IDF ( args )? )
			{
				// Grammar.g:34:44: ^( 'struct' IDF ( args )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_53.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDF.nextNode());
				// Grammar.g:34:59: ( args )?
				if ( stream_args.hasNext() ) {
					adaptor.addChild(root_1, stream_args.nextTree());
				}
				stream_args.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declStruct"


	public static class args_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "args"
	// Grammar.g:37:1: args : IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* ;
	public final GrammarParser.args_return args() throws RecognitionException {
		GrammarParser.args_return retval = new GrammarParser.args_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF11=null;
		Token char_literal12=null;
		Token char_literal14=null;
		Token IDF15=null;
		Token char_literal16=null;
		ParserRuleReturnScope type13 =null;
		ParserRuleReturnScope type17 =null;

		CommonTree IDF11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree IDF15_tree=null;
		CommonTree char_literal16_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:37:6: ( IDF ':' type ( ',' IDF ':' type )* -> ( ^( IDF type ) )* )
			// Grammar.g:37:8: IDF ':' type ( ',' IDF ':' type )*
			{
			IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_args167);  
			stream_IDF.add(IDF11);

			char_literal12=(Token)match(input,38,FOLLOW_38_in_args169);  
			stream_38.add(char_literal12);

			pushFollow(FOLLOW_type_in_args171);
			type13=type();
			state._fsp--;

			stream_type.add(type13.getTree());
			// Grammar.g:37:21: ( ',' IDF ':' type )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==35) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Grammar.g:37:22: ',' IDF ':' type
					{
					char_literal14=(Token)match(input,35,FOLLOW_35_in_args174);  
					stream_35.add(char_literal14);

					IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_args176);  
					stream_IDF.add(IDF15);

					char_literal16=(Token)match(input,38,FOLLOW_38_in_args178);  
					stream_38.add(char_literal16);

					pushFollow(FOLLOW_type_in_args180);
					type17=type();
					state._fsp--;

					stream_type.add(type17.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: type, IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 37:41: -> ( ^( IDF type ) )*
			{
				// Grammar.g:37:44: ( ^( IDF type ) )*
				while ( stream_type.hasNext()||stream_IDF.hasNext() ) {
					// Grammar.g:37:45: ^( IDF type )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_1);
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_type.reset();
				stream_IDF.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "args"


	public static class declFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declFun"
	// Grammar.g:40:1: declFun : 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) ;
	public final GrammarParser.declFun_return declFun() throws RecognitionException {
		GrammarParser.declFun_return retval = new GrammarParser.declFun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal18=null;
		Token IDF19=null;
		Token char_literal20=null;
		Token char_literal22=null;
		Token string_literal23=null;
		Token MAIN26=null;
		Token char_literal27=null;
		Token char_literal28=null;
		ParserRuleReturnScope args21 =null;
		ParserRuleReturnScope type24 =null;
		ParserRuleReturnScope block25 =null;
		ParserRuleReturnScope block29 =null;

		CommonTree string_literal18_tree=null;
		CommonTree IDF19_tree=null;
		CommonTree char_literal20_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree MAIN26_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:40:9: ( 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) ) )
			// Grammar.g:40:11: 'fn' ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			{
			string_literal18=(Token)match(input,45,FOLLOW_45_in_declFun202);  
			stream_45.add(string_literal18);

			// Grammar.g:40:16: ( IDF '(' ( args )? ')' ( '->' type )? block -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block ) | MAIN '(' ')' block -> ^( 'fn' MAIN block ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IDF) ) {
				alt7=1;
			}
			else if ( (LA7_0==MAIN) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Grammar.g:40:17: IDF '(' ( args )? ')' ( '->' type )? block
					{
					IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_declFun205);  
					stream_IDF.add(IDF19);

					char_literal20=(Token)match(input,33,FOLLOW_33_in_declFun207);  
					stream_33.add(char_literal20);

					// Grammar.g:40:25: ( args )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDF) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Grammar.g:40:25: args
							{
							pushFollow(FOLLOW_args_in_declFun209);
							args21=args();
							state._fsp--;

							stream_args.add(args21.getTree());
							}
							break;

					}

					char_literal22=(Token)match(input,34,FOLLOW_34_in_declFun212);  
					stream_34.add(char_literal22);

					// Grammar.g:40:35: ( '->' type )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==36) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Grammar.g:40:36: '->' type
							{
							string_literal23=(Token)match(input,36,FOLLOW_36_in_declFun215);  
							stream_36.add(string_literal23);

							pushFollow(FOLLOW_type_in_declFun217);
							type24=type();
							state._fsp--;

							stream_type.add(type24.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_block_in_declFun221);
					block25=block();
					state._fsp--;

					stream_block.add(block25.getTree());
					// AST REWRITE
					// elements: args, 36, block, type, 45, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 40:54: -> ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
					{
						// Grammar.g:40:57: ^( 'fn' IDF ( ^( '->' type ) )? ( args )? block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDF.nextNode());
						// Grammar.g:40:68: ( ^( '->' type ) )?
						if ( stream_36.hasNext()||stream_type.hasNext() ) {
							// Grammar.g:40:68: ^( '->' type )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_36.nextNode(), root_2);
							adaptor.addChild(root_2, stream_type.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_36.reset();
						stream_type.reset();

						// Grammar.g:40:82: ( args )?
						if ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:41:4: MAIN '(' ')' block
					{
					mainFound = true;
					MAIN26=(Token)match(input,MAIN,FOLLOW_MAIN_in_declFun248);  
					stream_MAIN.add(MAIN26);

					char_literal27=(Token)match(input,33,FOLLOW_33_in_declFun250);  
					stream_33.add(char_literal27);

					char_literal28=(Token)match(input,34,FOLLOW_34_in_declFun252);  
					stream_34.add(char_literal28);

					pushFollow(FOLLOW_block_in_declFun254);
					block29=block();
					state._fsp--;

					stream_block.add(block29.getTree());
					// AST REWRITE
					// elements: MAIN, 45, block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 41:42: -> ^( 'fn' MAIN block )
					{
						// Grammar.g:41:45: ^( 'fn' MAIN block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
						adaptor.addChild(root_1, stream_MAIN.nextNode());
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declFun"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Grammar.g:44:1: type : (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) );
	public final GrammarParser.type_return type() throws RecognitionException {
		GrammarParser.type_return retval = new GrammarParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal30=null;
		Token string_literal31=null;
		Token IDF32=null;
		Token string_literal33=null;
		Token char_literal34=null;
		Token char_literal36=null;
		Token char_literal37=null;
		ParserRuleReturnScope type35 =null;
		ParserRuleReturnScope type38 =null;

		CommonTree string_literal30_tree=null;
		CommonTree string_literal31_tree=null;
		CommonTree IDF32_tree=null;
		CommonTree string_literal33_tree=null;
		CommonTree char_literal34_tree=null;
		CommonTree char_literal36_tree=null;
		CommonTree char_literal37_tree=null;
		RewriteRuleTokenStream stream_PREV=new RewriteRuleTokenStream(adaptor,"token PREV");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_EPERLU=new RewriteRuleTokenStream(adaptor,"token EPERLU");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:44:6: (| 'i32' | 'bool' | IDF | 'vec' ( '<' type '>' ) -> ^( 'vec' type ) | '&' type -> ^( '&' type ) )
			int alt8=6;
			switch ( input.LA(1) ) {
			case EQUAL:
			case NEXT:
			case 34:
			case 35:
			case 56:
			case 57:
				{
				alt8=1;
				}
				break;
			case 46:
				{
				alt8=2;
				}
				break;
			case 42:
				{
				alt8=3;
				}
				break;
			case IDF:
				{
				alt8=4;
				}
				break;
			case 54:
				{
				alt8=5;
				}
				break;
			case EPERLU:
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Grammar.g:44:8: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// Grammar.g:44:10: 'i32'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal30=(Token)match(input,46,FOLLOW_46_in_type276); 
					string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
					adaptor.addChild(root_0, string_literal30_tree);

					}
					break;
				case 3 :
					// Grammar.g:45:3: 'bool'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal31=(Token)match(input,42,FOLLOW_42_in_type280); 
					string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
					adaptor.addChild(root_0, string_literal31_tree);

					}
					break;
				case 4 :
					// Grammar.g:46:2: IDF
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF32=(Token)match(input,IDF,FOLLOW_IDF_in_type283); 
					IDF32_tree = (CommonTree)adaptor.create(IDF32);
					adaptor.addChild(root_0, IDF32_tree);

					}
					break;
				case 5 :
					// Grammar.g:47:4: 'vec' ( '<' type '>' )
					{
					string_literal33=(Token)match(input,54,FOLLOW_54_in_type288);  
					stream_54.add(string_literal33);

					// Grammar.g:47:10: ( '<' type '>' )
					// Grammar.g:47:11: '<' type '>'
					{
					char_literal34=(Token)match(input,PREV,FOLLOW_PREV_in_type291);  
					stream_PREV.add(char_literal34);

					pushFollow(FOLLOW_type_in_type293);
					type35=type();
					state._fsp--;

					stream_type.add(type35.getTree());
					char_literal36=(Token)match(input,NEXT,FOLLOW_NEXT_in_type295);  
					stream_NEXT.add(char_literal36);

					}

					// AST REWRITE
					// elements: 54, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 47:25: -> ^( 'vec' type )
					{
						// Grammar.g:47:28: ^( 'vec' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_54.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:48:3: '&' type
					{
					char_literal37=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_type309);  
					stream_EPERLU.add(char_literal37);

					pushFollow(FOLLOW_type_in_type311);
					type38=type();
					state._fsp--;

					stream_type.add(type38.getTree());
					// AST REWRITE
					// elements: EPERLU, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 48:12: -> ^( '&' type )
					{
						// Grammar.g:48:15: ^( '&' type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_EPERLU.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Grammar.g:51:1: block : '{' instruct '}' -> ^( BLOCK instruct ) ;
	public final GrammarParser.block_return block() throws RecognitionException {
		GrammarParser.block_return retval = new GrammarParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope instruct40 =null;

		CommonTree char_literal39_tree=null;
		CommonTree char_literal41_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try {
			// Grammar.g:51:7: ( '{' instruct '}' -> ^( BLOCK instruct ) )
			// Grammar.g:51:9: '{' instruct '}'
			{
			char_literal39=(Token)match(input,56,FOLLOW_56_in_block328);  
			stream_56.add(char_literal39);

			pushFollow(FOLLOW_instruct_in_block330);
			instruct40=instruct();
			state._fsp--;

			stream_instruct.add(instruct40.getTree());
			char_literal41=(Token)match(input,57,FOLLOW_57_in_block331);  
			stream_57.add(char_literal41);

			// AST REWRITE
			// elements: instruct
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 51:24: -> ^( BLOCK instruct )
			{
				// Grammar.g:51:27: ^( BLOCK instruct )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_instruct.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class callFun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "callFun"
	// Grammar.g:55:1: callFun : '(' expr ( ',' expr )* ')' -> ( expr )* ;
	public final GrammarParser.callFun_return callFun() throws RecognitionException {
		GrammarParser.callFun_return retval = new GrammarParser.callFun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal42=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope expr43 =null;
		ParserRuleReturnScope expr45 =null;

		CommonTree char_literal42_tree=null;
		CommonTree char_literal44_tree=null;
		CommonTree char_literal46_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:55:9: ( '(' expr ( ',' expr )* ')' -> ( expr )* )
			// Grammar.g:55:11: '(' expr ( ',' expr )* ')'
			{
			char_literal42=(Token)match(input,33,FOLLOW_33_in_callFun350);  
			stream_33.add(char_literal42);

			pushFollow(FOLLOW_expr_in_callFun352);
			expr43=expr();
			state._fsp--;

			stream_expr.add(expr43.getTree());
			// Grammar.g:55:20: ( ',' expr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==35) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Grammar.g:55:21: ',' expr
					{
					char_literal44=(Token)match(input,35,FOLLOW_35_in_callFun355);  
					stream_35.add(char_literal44);

					pushFollow(FOLLOW_expr_in_callFun357);
					expr45=expr();
					state._fsp--;

					stream_expr.add(expr45.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			char_literal46=(Token)match(input,34,FOLLOW_34_in_callFun361);  
			stream_34.add(char_literal46);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 55:36: -> ( expr )*
			{
				// Grammar.g:55:39: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_0, stream_expr.nextTree());
				}
				stream_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callFun"


	public static class newStruc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newStruc"
	// Grammar.g:57:1: newStruc : '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) ;
	public final GrammarParser.newStruc_return newStruc() throws RecognitionException {
		GrammarParser.newStruc_return retval = new GrammarParser.newStruc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal47=null;
		Token IDF48=null;
		Token char_literal49=null;
		Token char_literal51=null;
		Token IDF52=null;
		Token char_literal53=null;
		Token char_literal55=null;
		ParserRuleReturnScope bigExpr50 =null;
		ParserRuleReturnScope bigExpr54 =null;

		CommonTree char_literal47_tree=null;
		CommonTree IDF48_tree=null;
		CommonTree char_literal49_tree=null;
		CommonTree char_literal51_tree=null;
		CommonTree IDF52_tree=null;
		CommonTree char_literal53_tree=null;
		CommonTree char_literal55_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");

		try {
			// Grammar.g:57:10: ( '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}' -> ^( NEW ( ^( IDF bigExpr ) )* ) )
			// Grammar.g:57:12: '{' IDF ':' bigExpr ( ',' IDF ':' bigExpr )* '}'
			{
			char_literal47=(Token)match(input,56,FOLLOW_56_in_newStruc374);  
			stream_56.add(char_literal47);

			IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc376);  
			stream_IDF.add(IDF48);

			char_literal49=(Token)match(input,38,FOLLOW_38_in_newStruc378);  
			stream_38.add(char_literal49);

			pushFollow(FOLLOW_bigExpr_in_newStruc380);
			bigExpr50=bigExpr();
			state._fsp--;

			stream_bigExpr.add(bigExpr50.getTree());
			// Grammar.g:57:32: ( ',' IDF ':' bigExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==35) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Grammar.g:57:33: ',' IDF ':' bigExpr
					{
					char_literal51=(Token)match(input,35,FOLLOW_35_in_newStruc383);  
					stream_35.add(char_literal51);

					IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_newStruc385);  
					stream_IDF.add(IDF52);

					char_literal53=(Token)match(input,38,FOLLOW_38_in_newStruc387);  
					stream_38.add(char_literal53);

					pushFollow(FOLLOW_bigExpr_in_newStruc389);
					bigExpr54=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr54.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			char_literal55=(Token)match(input,57,FOLLOW_57_in_newStruc393);  
			stream_57.add(char_literal55);

			// AST REWRITE
			// elements: bigExpr, IDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 57:59: -> ^( NEW ( ^( IDF bigExpr ) )* )
			{
				// Grammar.g:57:62: ^( NEW ( ^( IDF bigExpr ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);
				// Grammar.g:57:68: ( ^( IDF bigExpr ) )*
				while ( stream_bigExpr.hasNext()||stream_IDF.hasNext() ) {
					// Grammar.g:57:68: ^( IDF bigExpr )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);
					adaptor.addChild(root_2, stream_bigExpr.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_bigExpr.reset();
				stream_IDF.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "newStruc"


	public static class instrBoucle_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instrBoucle"
	// Grammar.g:59:1: instrBoucle : ( ';' ( instruct )? -> ( instruct )? | -> RES );
	public final GrammarParser.instrBoucle_return instrBoucle() throws RecognitionException {
		GrammarParser.instrBoucle_return retval = new GrammarParser.instrBoucle_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal56=null;
		ParserRuleReturnScope instruct57 =null;

		CommonTree char_literal56_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");

		try {
			// Grammar.g:60:2: ( ';' ( instruct )? -> ( instruct )? | -> RES )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==39) ) {
				alt12=1;
			}
			else if ( (LA12_0==57) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Grammar.g:60:4: ';' ( instruct )?
					{
					char_literal56=(Token)match(input,39,FOLLOW_39_in_instrBoucle416);  
					stream_39.add(char_literal56);

					// Grammar.g:60:8: ( instruct )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==BOOL||LA11_0==EPERLU||(LA11_0 >= IDF && LA11_0 <= INT)||LA11_0==STAR||(LA11_0 >= SUB && LA11_0 <= UNAIRE)||LA11_0==33||LA11_0==39||LA11_0==43||(LA11_0 >= 48 && LA11_0 <= 49)||(LA11_0 >= 51 && LA11_0 <= 52)||(LA11_0 >= 54 && LA11_0 <= 56)) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// Grammar.g:60:8: instruct
							{
							pushFollow(FOLLOW_instruct_in_instrBoucle418);
							instruct57=instruct();
							state._fsp--;

							stream_instruct.add(instruct57.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: instruct
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 60:18: -> ( instruct )?
					{
						// Grammar.g:60:21: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:61:4: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 61:4: -> RES
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(RES, "RES"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instrBoucle"


	public static class instruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruct"
	// Grammar.g:63:1: instruct : ( expr instrBoucle | ';' ( instruct )? -> ( instruct )? | 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' ( instruct )? -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) ( instruct )? | 'while' expr block ( instruct )? -> ^( 'while' expr block ) ( instruct )? | 'return' ( expr )? ';' ( instruct )? -> ^( 'return' ( expr )? ) ( instruct )? | 'loop' block ( instruct )? -> ^( 'loop' block ) ( instruct )? | 'break' ';' ( instruct )? -> 'break' ( instruct )? | ifExpr ( instruct )? );
	public final GrammarParser.instruct_return instruct() throws RecognitionException {
		GrammarParser.instruct_return retval = new GrammarParser.instruct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal60=null;
		Token string_literal62=null;
		Token string_literal63=null;
		Token char_literal65=null;
		Token char_literal67=null;
		Token char_literal69=null;
		Token string_literal71=null;
		Token string_literal75=null;
		Token char_literal77=null;
		Token string_literal79=null;
		Token string_literal82=null;
		Token char_literal83=null;
		ParserRuleReturnScope expr58 =null;
		ParserRuleReturnScope instrBoucle59 =null;
		ParserRuleReturnScope instruct61 =null;
		ParserRuleReturnScope dotIDF64 =null;
		ParserRuleReturnScope type66 =null;
		ParserRuleReturnScope bigExpr68 =null;
		ParserRuleReturnScope instruct70 =null;
		ParserRuleReturnScope expr72 =null;
		ParserRuleReturnScope block73 =null;
		ParserRuleReturnScope instruct74 =null;
		ParserRuleReturnScope expr76 =null;
		ParserRuleReturnScope instruct78 =null;
		ParserRuleReturnScope block80 =null;
		ParserRuleReturnScope instruct81 =null;
		ParserRuleReturnScope instruct84 =null;
		ParserRuleReturnScope ifExpr85 =null;
		ParserRuleReturnScope instruct86 =null;

		CommonTree char_literal60_tree=null;
		CommonTree string_literal62_tree=null;
		CommonTree string_literal63_tree=null;
		CommonTree char_literal65_tree=null;
		CommonTree char_literal67_tree=null;
		CommonTree char_literal69_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree string_literal75_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree string_literal79_tree=null;
		CommonTree string_literal82_tree=null;
		CommonTree char_literal83_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_instruct=new RewriteRuleSubtreeStream(adaptor,"rule instruct");
		RewriteRuleSubtreeStream stream_dotIDF=new RewriteRuleSubtreeStream(adaptor,"rule dotIDF");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Grammar.g:63:10: ( expr instrBoucle | ';' ( instruct )? -> ( instruct )? | 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' ( instruct )? -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) ( instruct )? | 'while' expr block ( instruct )? -> ^( 'while' expr block ) ( instruct )? | 'return' ( expr )? ';' ( instruct )? -> ^( 'return' ( expr )? ) ( instruct )? | 'loop' block ( instruct )? -> ^( 'loop' block ) ( instruct )? | 'break' ';' ( instruct )? -> 'break' ( instruct )? | ifExpr ( instruct )? )
			int alt23=8;
			switch ( input.LA(1) ) {
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 33:
			case 51:
			case 54:
			case 56:
				{
				alt23=1;
				}
				break;
			case 39:
				{
				alt23=2;
				}
				break;
			case 48:
				{
				alt23=3;
				}
				break;
			case 55:
				{
				alt23=4;
				}
				break;
			case 52:
				{
				alt23=5;
				}
				break;
			case 49:
				{
				alt23=6;
				}
				break;
			case 43:
				{
				alt23=7;
				}
				break;
			case IF:
				{
				alt23=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// Grammar.g:64:3: expr instrBoucle
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expr_in_instruct442);
					expr58=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr58.getTree());

					pushFollow(FOLLOW_instrBoucle_in_instruct444);
					instrBoucle59=instrBoucle();
					state._fsp--;

					adaptor.addChild(root_0, instrBoucle59.getTree());

					}
					break;
				case 2 :
					// Grammar.g:65:3: ';' ( instruct )?
					{
					char_literal60=(Token)match(input,39,FOLLOW_39_in_instruct448);  
					stream_39.add(char_literal60);

					// Grammar.g:65:7: ( instruct )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==BOOL||LA13_0==EPERLU||(LA13_0 >= IDF && LA13_0 <= INT)||LA13_0==STAR||(LA13_0 >= SUB && LA13_0 <= UNAIRE)||LA13_0==33||LA13_0==39||LA13_0==43||(LA13_0 >= 48 && LA13_0 <= 49)||(LA13_0 >= 51 && LA13_0 <= 52)||(LA13_0 >= 54 && LA13_0 <= 56)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// Grammar.g:65:7: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct450);
							instruct61=instruct();
							state._fsp--;

							stream_instruct.add(instruct61.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: instruct
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 65:16: -> ( instruct )?
					{
						// Grammar.g:65:19: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:66:3: 'let' ( 'mut' )? dotIDF ( ':' type )? '=' bigExpr ';' ( instruct )?
					{
					string_literal62=(Token)match(input,48,FOLLOW_48_in_instruct459);  
					stream_48.add(string_literal62);

					// Grammar.g:66:9: ( 'mut' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==50) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Grammar.g:66:9: 'mut'
							{
							string_literal63=(Token)match(input,50,FOLLOW_50_in_instruct461);  
							stream_50.add(string_literal63);

							}
							break;

					}

					pushFollow(FOLLOW_dotIDF_in_instruct464);
					dotIDF64=dotIDF();
					state._fsp--;

					stream_dotIDF.add(dotIDF64.getTree());
					// Grammar.g:66:23: ( ':' type )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==38) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Grammar.g:66:24: ':' type
							{
							char_literal65=(Token)match(input,38,FOLLOW_38_in_instruct467);  
							stream_38.add(char_literal65);

							pushFollow(FOLLOW_type_in_instruct469);
							type66=type();
							state._fsp--;

							stream_type.add(type66.getTree());
							}
							break;

					}

					char_literal67=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instruct473);  
					stream_EQUAL.add(char_literal67);

					pushFollow(FOLLOW_bigExpr_in_instruct475);
					bigExpr68=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr68.getTree());
					char_literal69=(Token)match(input,39,FOLLOW_39_in_instruct477);  
					stream_39.add(char_literal69);

					// Grammar.g:66:51: ( instruct )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==BOOL||LA16_0==EPERLU||(LA16_0 >= IDF && LA16_0 <= INT)||LA16_0==STAR||(LA16_0 >= SUB && LA16_0 <= UNAIRE)||LA16_0==33||LA16_0==39||LA16_0==43||(LA16_0 >= 48 && LA16_0 <= 49)||(LA16_0 >= 51 && LA16_0 <= 52)||(LA16_0 >= 54 && LA16_0 <= 56)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// Grammar.g:66:51: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct479);
							instruct70=instruct();
							state._fsp--;

							stream_instruct.add(instruct70.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: type, bigExpr, instruct, EQUAL, 48, 50, dotIDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 66:60: -> ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) ) ( instruct )?
					{
						// Grammar.g:66:63: ^( 'let' ( 'mut' )? ( type )? ^( '=' dotIDF bigExpr ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
						// Grammar.g:66:71: ( 'mut' )?
						if ( stream_50.hasNext() ) {
							adaptor.addChild(root_1, stream_50.nextNode());
						}
						stream_50.reset();

						// Grammar.g:66:78: ( type )?
						if ( stream_type.hasNext() ) {
							adaptor.addChild(root_1, stream_type.nextTree());
						}
						stream_type.reset();

						// Grammar.g:66:86: ^( '=' dotIDF bigExpr )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_2);
						adaptor.addChild(root_2, stream_dotIDF.nextTree());
						adaptor.addChild(root_2, stream_bigExpr.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

						// Grammar.g:66:110: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Grammar.g:67:3: 'while' expr block ( instruct )?
					{
					string_literal71=(Token)match(input,55,FOLLOW_55_in_instruct509);  
					stream_55.add(string_literal71);

					pushFollow(FOLLOW_expr_in_instruct511);
					expr72=expr();
					state._fsp--;

					stream_expr.add(expr72.getTree());
					pushFollow(FOLLOW_block_in_instruct513);
					block73=block();
					state._fsp--;

					stream_block.add(block73.getTree());
					// Grammar.g:67:22: ( instruct )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==BOOL||LA17_0==EPERLU||(LA17_0 >= IDF && LA17_0 <= INT)||LA17_0==STAR||(LA17_0 >= SUB && LA17_0 <= UNAIRE)||LA17_0==33||LA17_0==39||LA17_0==43||(LA17_0 >= 48 && LA17_0 <= 49)||(LA17_0 >= 51 && LA17_0 <= 52)||(LA17_0 >= 54 && LA17_0 <= 56)) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// Grammar.g:67:22: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct515);
							instruct74=instruct();
							state._fsp--;

							stream_instruct.add(instruct74.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 55, instruct, block, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 67:31: -> ^( 'while' expr block ) ( instruct )?
					{
						// Grammar.g:67:34: ^( 'while' expr block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_55.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// Grammar.g:67:56: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammar.g:68:3: 'return' ( expr )? ';' ( instruct )?
					{
					string_literal75=(Token)match(input,52,FOLLOW_52_in_instruct532);  
					stream_52.add(string_literal75);

					// Grammar.g:68:12: ( expr )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==BOOL||LA18_0==EPERLU||LA18_0==IDF||LA18_0==INT||LA18_0==STAR||(LA18_0 >= SUB && LA18_0 <= UNAIRE)||LA18_0==33||LA18_0==51||LA18_0==54||LA18_0==56) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// Grammar.g:68:12: expr
							{
							pushFollow(FOLLOW_expr_in_instruct534);
							expr76=expr();
							state._fsp--;

							stream_expr.add(expr76.getTree());
							}
							break;

					}

					char_literal77=(Token)match(input,39,FOLLOW_39_in_instruct537);  
					stream_39.add(char_literal77);

					// Grammar.g:68:22: ( instruct )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==BOOL||LA19_0==EPERLU||(LA19_0 >= IDF && LA19_0 <= INT)||LA19_0==STAR||(LA19_0 >= SUB && LA19_0 <= UNAIRE)||LA19_0==33||LA19_0==39||LA19_0==43||(LA19_0 >= 48 && LA19_0 <= 49)||(LA19_0 >= 51 && LA19_0 <= 52)||(LA19_0 >= 54 && LA19_0 <= 56)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Grammar.g:68:22: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct539);
							instruct78=instruct();
							state._fsp--;

							stream_instruct.add(instruct78.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 52, instruct, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 68:31: -> ^( 'return' ( expr )? ) ( instruct )?
					{
						// Grammar.g:68:34: ^( 'return' ( expr )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_52.nextNode(), root_1);
						// Grammar.g:68:45: ( expr )?
						if ( stream_expr.hasNext() ) {
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

						// Grammar.g:68:52: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Grammar.g:69:3: 'loop' block ( instruct )?
					{
					string_literal79=(Token)match(input,49,FOLLOW_49_in_instruct555);  
					stream_49.add(string_literal79);

					pushFollow(FOLLOW_block_in_instruct557);
					block80=block();
					state._fsp--;

					stream_block.add(block80.getTree());
					// Grammar.g:69:16: ( instruct )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==BOOL||LA20_0==EPERLU||(LA20_0 >= IDF && LA20_0 <= INT)||LA20_0==STAR||(LA20_0 >= SUB && LA20_0 <= UNAIRE)||LA20_0==33||LA20_0==39||LA20_0==43||(LA20_0 >= 48 && LA20_0 <= 49)||(LA20_0 >= 51 && LA20_0 <= 52)||(LA20_0 >= 54 && LA20_0 <= 56)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Grammar.g:69:16: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct559);
							instruct81=instruct();
							state._fsp--;

							stream_instruct.add(instruct81.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: block, instruct, 49
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 69:25: -> ^( 'loop' block ) ( instruct )?
					{
						// Grammar.g:69:28: ^( 'loop' block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_49.nextNode(), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// Grammar.g:69:44: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// Grammar.g:70:3: 'break' ';' ( instruct )?
					{
					string_literal82=(Token)match(input,43,FOLLOW_43_in_instruct574);  
					stream_43.add(string_literal82);

					char_literal83=(Token)match(input,39,FOLLOW_39_in_instruct576);  
					stream_39.add(char_literal83);

					// Grammar.g:70:15: ( instruct )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==BOOL||LA21_0==EPERLU||(LA21_0 >= IDF && LA21_0 <= INT)||LA21_0==STAR||(LA21_0 >= SUB && LA21_0 <= UNAIRE)||LA21_0==33||LA21_0==39||LA21_0==43||(LA21_0 >= 48 && LA21_0 <= 49)||(LA21_0 >= 51 && LA21_0 <= 52)||(LA21_0 >= 54 && LA21_0 <= 56)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Grammar.g:70:15: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct578);
							instruct84=instruct();
							state._fsp--;

							stream_instruct.add(instruct84.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 43, instruct
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 70:24: -> 'break' ( instruct )?
					{
						adaptor.addChild(root_0, stream_43.nextNode());
						// Grammar.g:70:35: ( instruct )?
						if ( stream_instruct.hasNext() ) {
							adaptor.addChild(root_0, stream_instruct.nextTree());
						}
						stream_instruct.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// Grammar.g:71:3: ifExpr ( instruct )?
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifExpr_in_instruct589);
					ifExpr85=ifExpr();
					state._fsp--;

					adaptor.addChild(root_0, ifExpr85.getTree());

					// Grammar.g:71:10: ( instruct )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==BOOL||LA22_0==EPERLU||(LA22_0 >= IDF && LA22_0 <= INT)||LA22_0==STAR||(LA22_0 >= SUB && LA22_0 <= UNAIRE)||LA22_0==33||LA22_0==39||LA22_0==43||(LA22_0 >= 48 && LA22_0 <= 49)||(LA22_0 >= 51 && LA22_0 <= 52)||(LA22_0 >= 54 && LA22_0 <= 56)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// Grammar.g:71:10: instruct
							{
							pushFollow(FOLLOW_instruct_in_instruct591);
							instruct86=instruct();
							state._fsp--;

							adaptor.addChild(root_0, instruct86.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruct"


	public static class dotIDF_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotIDF"
	// Grammar.g:74:1: dotIDF : IDF ( '.' ^ IDF )? ;
	public final GrammarParser.dotIDF_return dotIDF() throws RecognitionException {
		GrammarParser.dotIDF_return retval = new GrammarParser.dotIDF_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDF87=null;
		Token char_literal88=null;
		Token IDF89=null;

		CommonTree IDF87_tree=null;
		CommonTree char_literal88_tree=null;
		CommonTree IDF89_tree=null;

		try {
			// Grammar.g:74:9: ( IDF ( '.' ^ IDF )? )
			// Grammar.g:75:1: IDF ( '.' ^ IDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			IDF87=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF603); 
			IDF87_tree = (CommonTree)adaptor.create(IDF87);
			adaptor.addChild(root_0, IDF87_tree);

			// Grammar.g:75:5: ( '.' ^ IDF )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==37) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Grammar.g:75:6: '.' ^ IDF
					{
					char_literal88=(Token)match(input,37,FOLLOW_37_in_dotIDF606); 
					char_literal88_tree = (CommonTree)adaptor.create(char_literal88);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal88_tree, root_0);

					IDF89=(Token)match(input,IDF,FOLLOW_IDF_in_dotIDF609); 
					IDF89_tree = (CommonTree)adaptor.create(IDF89);
					adaptor.addChild(root_0, IDF89_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotIDF"


	public static class ifExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifExpr"
	// Grammar.g:77:1: ifExpr : 'if' expr block ( 'else' block )? -> ^( 'if' expr block ) ( ^( 'else' block ) )? ;
	public final GrammarParser.ifExpr_return ifExpr() throws RecognitionException {
		GrammarParser.ifExpr_return retval = new GrammarParser.ifExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal90=null;
		Token string_literal93=null;
		ParserRuleReturnScope expr91 =null;
		ParserRuleReturnScope block92 =null;
		ParserRuleReturnScope block94 =null;

		CommonTree string_literal90_tree=null;
		CommonTree string_literal93_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// Grammar.g:77:8: ( 'if' expr block ( 'else' block )? -> ^( 'if' expr block ) ( ^( 'else' block ) )? )
			// Grammar.g:77:10: 'if' expr block ( 'else' block )?
			{
			string_literal90=(Token)match(input,IF,FOLLOW_IF_in_ifExpr619);  
			stream_IF.add(string_literal90);

			pushFollow(FOLLOW_expr_in_ifExpr621);
			expr91=expr();
			state._fsp--;

			stream_expr.add(expr91.getTree());
			pushFollow(FOLLOW_block_in_ifExpr623);
			block92=block();
			state._fsp--;

			stream_block.add(block92.getTree());
			// Grammar.g:77:26: ( 'else' block )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==44) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Grammar.g:77:27: 'else' block
					{
					string_literal93=(Token)match(input,44,FOLLOW_44_in_ifExpr626);  
					stream_44.add(string_literal93);

					pushFollow(FOLLOW_block_in_ifExpr628);
					block94=block();
					state._fsp--;

					stream_block.add(block94.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: block, IF, 44, block, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:43: -> ^( 'if' expr block ) ( ^( 'else' block ) )?
			{
				// Grammar.g:77:46: ^( 'if' expr block )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

				// Grammar.g:77:65: ( ^( 'else' block ) )?
				if ( stream_block.hasNext()||stream_44.hasNext() ) {
					// Grammar.g:77:65: ^( 'else' block )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);
					adaptor.addChild(root_1, stream_block.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_block.reset();
				stream_44.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifExpr"


	public static class binExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr1"
	// Grammar.g:79:1: binExpr1 : binExpr2 ( EQUAL ^ binExpr2 )* ;
	public final GrammarParser.binExpr1_return binExpr1() throws RecognitionException {
		GrammarParser.binExpr1_return retval = new GrammarParser.binExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL96=null;
		ParserRuleReturnScope binExpr295 =null;
		ParserRuleReturnScope binExpr297 =null;

		CommonTree EQUAL96_tree=null;

		try {
			// Grammar.g:79:10: ( binExpr2 ( EQUAL ^ binExpr2 )* )
			// Grammar.g:79:12: binExpr2 ( EQUAL ^ binExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr2_in_binExpr1656);
			binExpr295=binExpr2();
			state._fsp--;

			adaptor.addChild(root_0, binExpr295.getTree());

			// Grammar.g:79:21: ( EQUAL ^ binExpr2 )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==EQUAL) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Grammar.g:79:22: EQUAL ^ binExpr2
					{
					EQUAL96=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_binExpr1659); 
					EQUAL96_tree = (CommonTree)adaptor.create(EQUAL96);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL96_tree, root_0);

					pushFollow(FOLLOW_binExpr2_in_binExpr1662);
					binExpr297=binExpr2();
					state._fsp--;

					adaptor.addChild(root_0, binExpr297.getTree());

					}
					break;

				default :
					break loop26;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binExpr1"


	public static class binExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr2"
	// Grammar.g:81:1: binExpr2 : binExpr3 ( ORBOOL ^ binExpr3 )* ;
	public final GrammarParser.binExpr2_return binExpr2() throws RecognitionException {
		GrammarParser.binExpr2_return retval = new GrammarParser.binExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL99=null;
		ParserRuleReturnScope binExpr398 =null;
		ParserRuleReturnScope binExpr3100 =null;

		CommonTree ORBOOL99_tree=null;

		try {
			// Grammar.g:81:10: ( binExpr3 ( ORBOOL ^ binExpr3 )* )
			// Grammar.g:81:12: binExpr3 ( ORBOOL ^ binExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr3_in_binExpr2673);
			binExpr398=binExpr3();
			state._fsp--;

			adaptor.addChild(root_0, binExpr398.getTree());

			// Grammar.g:81:20: ( ORBOOL ^ binExpr3 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==ORBOOL) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Grammar.g:81:21: ORBOOL ^ binExpr3
					{
					ORBOOL99=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_binExpr2675); 
					ORBOOL99_tree = (CommonTree)adaptor.create(ORBOOL99);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL99_tree, root_0);

					pushFollow(FOLLOW_binExpr3_in_binExpr2678);
					binExpr3100=binExpr3();
					state._fsp--;

					adaptor.addChild(root_0, binExpr3100.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binExpr2"


	public static class binExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr3"
	// Grammar.g:83:1: binExpr3 : binExpr4 ( ANDBOOL ^ binExpr4 )* ;
	public final GrammarParser.binExpr3_return binExpr3() throws RecognitionException {
		GrammarParser.binExpr3_return retval = new GrammarParser.binExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL102=null;
		ParserRuleReturnScope binExpr4101 =null;
		ParserRuleReturnScope binExpr4103 =null;

		CommonTree ANDBOOL102_tree=null;

		try {
			// Grammar.g:83:10: ( binExpr4 ( ANDBOOL ^ binExpr4 )* )
			// Grammar.g:83:12: binExpr4 ( ANDBOOL ^ binExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr4_in_binExpr3689);
			binExpr4101=binExpr4();
			state._fsp--;

			adaptor.addChild(root_0, binExpr4101.getTree());

			// Grammar.g:83:20: ( ANDBOOL ^ binExpr4 )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==ANDBOOL) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Grammar.g:83:21: ANDBOOL ^ binExpr4
					{
					ANDBOOL102=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_binExpr3691); 
					ANDBOOL102_tree = (CommonTree)adaptor.create(ANDBOOL102);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL102_tree, root_0);

					pushFollow(FOLLOW_binExpr4_in_binExpr3694);
					binExpr4103=binExpr4();
					state._fsp--;

					adaptor.addChild(root_0, binExpr4103.getTree());

					}
					break;

				default :
					break loop28;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binExpr3"


	public static class binExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr4"
	// Grammar.g:85:1: binExpr4 : binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* ;
	public final GrammarParser.binExpr4_return binExpr4() throws RecognitionException {
		GrammarParser.binExpr4_return retval = new GrammarParser.binExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV105=null;
		Token OPBOOLEQ106=null;
		Token NEXT107=null;
		ParserRuleReturnScope binExpr5104 =null;
		ParserRuleReturnScope binExpr5108 =null;

		CommonTree PREV105_tree=null;
		CommonTree OPBOOLEQ106_tree=null;
		CommonTree NEXT107_tree=null;

		try {
			// Grammar.g:85:10: ( binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )* )
			// Grammar.g:85:12: binExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr5_in_binExpr4705);
			binExpr5104=binExpr5();
			state._fsp--;

			adaptor.addChild(root_0, binExpr5104.getTree());

			// Grammar.g:85:20: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5 )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= NEXT && LA30_0 <= OPBOOLEQ)||LA30_0==PREV) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// Grammar.g:85:21: ( PREV ^| OPBOOLEQ ^| NEXT ^) binExpr5
					{
					// Grammar.g:85:21: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt29=3;
					switch ( input.LA(1) ) {
					case PREV:
						{
						alt29=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt29=2;
						}
						break;
					case NEXT:
						{
						alt29=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// Grammar.g:85:22: PREV ^
							{
							PREV105=(Token)match(input,PREV,FOLLOW_PREV_in_binExpr4708); 
							PREV105_tree = (CommonTree)adaptor.create(PREV105);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV105_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:85:28: OPBOOLEQ ^
							{
							OPBOOLEQ106=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_binExpr4711); 
							OPBOOLEQ106_tree = (CommonTree)adaptor.create(OPBOOLEQ106);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ106_tree, root_0);

							}
							break;
						case 3 :
							// Grammar.g:85:38: NEXT ^
							{
							NEXT107=(Token)match(input,NEXT,FOLLOW_NEXT_in_binExpr4714); 
							NEXT107_tree = (CommonTree)adaptor.create(NEXT107);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT107_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_binExpr5_in_binExpr4718);
					binExpr5108=binExpr5();
					state._fsp--;

					adaptor.addChild(root_0, binExpr5108.getTree());

					}
					break;

				default :
					break loop30;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binExpr4"


	public static class binExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr5"
	// Grammar.g:87:1: binExpr5 : binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* ;
	public final GrammarParser.binExpr5_return binExpr5() throws RecognitionException {
		GrammarParser.binExpr5_return retval = new GrammarParser.binExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ADD110=null;
		Token SUB111=null;
		ParserRuleReturnScope binExpr6109 =null;
		ParserRuleReturnScope binExpr6112 =null;

		CommonTree ADD110_tree=null;
		CommonTree SUB111_tree=null;

		try {
			// Grammar.g:87:10: ( binExpr6 ( ( ADD ^| SUB ^) binExpr6 )* )
			// Grammar.g:87:12: binExpr6 ( ( ADD ^| SUB ^) binExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_binExpr6_in_binExpr5729);
			binExpr6109=binExpr6();
			state._fsp--;

			adaptor.addChild(root_0, binExpr6109.getTree());

			// Grammar.g:87:20: ( ( ADD ^| SUB ^) binExpr6 )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==ADD||LA32_0==SUB) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// Grammar.g:87:21: ( ADD ^| SUB ^) binExpr6
					{
					// Grammar.g:87:21: ( ADD ^| SUB ^)
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ADD) ) {
						alt31=1;
					}
					else if ( (LA31_0==SUB) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// Grammar.g:87:22: ADD ^
							{
							ADD110=(Token)match(input,ADD,FOLLOW_ADD_in_binExpr5732); 
							ADD110_tree = (CommonTree)adaptor.create(ADD110);
							root_0 = (CommonTree)adaptor.becomeRoot(ADD110_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:87:27: SUB ^
							{
							SUB111=(Token)match(input,SUB,FOLLOW_SUB_in_binExpr5735); 
							SUB111_tree = (CommonTree)adaptor.create(SUB111);
							root_0 = (CommonTree)adaptor.becomeRoot(SUB111_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_binExpr6_in_binExpr5740);
					binExpr6112=binExpr6();
					state._fsp--;

					adaptor.addChild(root_0, binExpr6112.getTree());

					}
					break;

				default :
					break loop32;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binExpr5"


	public static class binExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binExpr6"
	// Grammar.g:89:1: binExpr6 : unExpr ( ( STAR ^| DIV ^) unExpr )* ;
	public final GrammarParser.binExpr6_return binExpr6() throws RecognitionException {
		GrammarParser.binExpr6_return retval = new GrammarParser.binExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR114=null;
		Token DIV115=null;
		ParserRuleReturnScope unExpr113 =null;
		ParserRuleReturnScope unExpr116 =null;

		CommonTree STAR114_tree=null;
		CommonTree DIV115_tree=null;

		try {
			// Grammar.g:89:10: ( unExpr ( ( STAR ^| DIV ^) unExpr )* )
			// Grammar.g:89:12: unExpr ( ( STAR ^| DIV ^) unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unExpr_in_binExpr6751);
			unExpr113=unExpr();
			state._fsp--;

			adaptor.addChild(root_0, unExpr113.getTree());

			// Grammar.g:89:19: ( ( STAR ^| DIV ^) unExpr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==DIV||LA34_0==STAR) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Grammar.g:89:20: ( STAR ^| DIV ^) unExpr
					{
					// Grammar.g:89:20: ( STAR ^| DIV ^)
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==STAR) ) {
						alt33=1;
					}
					else if ( (LA33_0==DIV) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// Grammar.g:89:21: STAR ^
							{
							STAR114=(Token)match(input,STAR,FOLLOW_STAR_in_binExpr6755); 
							STAR114_tree = (CommonTree)adaptor.create(STAR114);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR114_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:89:27: DIV ^
							{
							DIV115=(Token)match(input,DIV,FOLLOW_DIV_in_binExpr6758); 
							DIV115_tree = (CommonTree)adaptor.create(DIV115);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV115_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unExpr_in_binExpr6762);
					unExpr116=unExpr();
					state._fsp--;

					adaptor.addChild(root_0, unExpr116.getTree());

					}
					break;

				default :
					break loop34;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binExpr6"


	public static class vectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vectExpr"
	// Grammar.g:91:1: vectExpr : starExpr ( '[' ^ expr ']' !)* ;
	public final GrammarParser.vectExpr_return vectExpr() throws RecognitionException {
		GrammarParser.vectExpr_return retval = new GrammarParser.vectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal118=null;
		Token char_literal120=null;
		ParserRuleReturnScope starExpr117 =null;
		ParserRuleReturnScope expr119 =null;

		CommonTree char_literal118_tree=null;
		CommonTree char_literal120_tree=null;

		try {
			// Grammar.g:91:10: ( starExpr ( '[' ^ expr ']' !)* )
			// Grammar.g:91:12: starExpr ( '[' ^ expr ']' !)*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_starExpr_in_vectExpr773);
			starExpr117=starExpr();
			state._fsp--;

			adaptor.addChild(root_0, starExpr117.getTree());

			// Grammar.g:91:21: ( '[' ^ expr ']' !)*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==40) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Grammar.g:91:22: '[' ^ expr ']' !
					{
					char_literal118=(Token)match(input,40,FOLLOW_40_in_vectExpr776); 
					char_literal118_tree = (CommonTree)adaptor.create(char_literal118);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal118_tree, root_0);

					pushFollow(FOLLOW_expr_in_vectExpr779);
					expr119=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr119.getTree());

					char_literal120=(Token)match(input,41,FOLLOW_41_in_vectExpr781); 
					}
					break;

				default :
					break loop35;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vectExpr"


	public static class starExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "starExpr"
	// Grammar.g:93:1: starExpr : ( STAR moinsExpr -> ^( UNISTAR moinsExpr ) | moinsExpr );
	public final GrammarParser.starExpr_return starExpr() throws RecognitionException {
		GrammarParser.starExpr_return retval = new GrammarParser.starExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR121=null;
		ParserRuleReturnScope moinsExpr122 =null;
		ParserRuleReturnScope moinsExpr123 =null;

		CommonTree STAR121_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleSubtreeStream stream_moinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule moinsExpr");

		try {
			// Grammar.g:94:2: ( STAR moinsExpr -> ^( UNISTAR moinsExpr ) | moinsExpr )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==STAR) ) {
				alt36=1;
			}
			else if ( (LA36_0==BOOL||LA36_0==IDF||LA36_0==INT||LA36_0==SUB||LA36_0==33||LA36_0==56) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// Grammar.g:94:5: STAR moinsExpr
					{
					STAR121=(Token)match(input,STAR,FOLLOW_STAR_in_starExpr795);  
					stream_STAR.add(STAR121);

					pushFollow(FOLLOW_moinsExpr_in_starExpr797);
					moinsExpr122=moinsExpr();
					state._fsp--;

					stream_moinsExpr.add(moinsExpr122.getTree());
					// AST REWRITE
					// elements: moinsExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 94:20: -> ^( UNISTAR moinsExpr )
					{
						// Grammar.g:94:23: ^( UNISTAR moinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISTAR, "UNISTAR"), root_1);
						adaptor.addChild(root_1, stream_moinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:95:4: moinsExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_moinsExpr_in_starExpr810);
					moinsExpr123=moinsExpr();
					state._fsp--;

					adaptor.addChild(root_0, moinsExpr123.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "starExpr"


	public static class moinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "moinsExpr"
	// Grammar.g:97:1: moinsExpr : ( SUB atom -> ^( UNISUB atom ) | atom );
	public final GrammarParser.moinsExpr_return moinsExpr() throws RecognitionException {
		GrammarParser.moinsExpr_return retval = new GrammarParser.moinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB124=null;
		ParserRuleReturnScope atom125 =null;
		ParserRuleReturnScope atom126 =null;

		CommonTree SUB124_tree=null;
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// Grammar.g:98:2: ( SUB atom -> ^( UNISUB atom ) | atom )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==SUB) ) {
				alt37=1;
			}
			else if ( (LA37_0==BOOL||LA37_0==IDF||LA37_0==INT||LA37_0==33||LA37_0==56) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Grammar.g:98:5: SUB atom
					{
					SUB124=(Token)match(input,SUB,FOLLOW_SUB_in_moinsExpr822);  
					stream_SUB.add(SUB124);

					pushFollow(FOLLOW_atom_in_moinsExpr824);
					atom125=atom();
					state._fsp--;

					stream_atom.add(atom125.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 98:14: -> ^( UNISUB atom )
					{
						// Grammar.g:98:17: ^( UNISUB atom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISUB, "UNISUB"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:99:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_moinsExpr837);
					atom126=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom126.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "moinsExpr"


	public static class dotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dotExpr"
	// Grammar.g:102:1: dotExpr : vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.dotExpr_return dotExpr() throws RecognitionException {
		GrammarParser.dotExpr_return retval = new GrammarParser.dotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal128=null;
		Token IDF129=null;
		Token string_literal130=null;
		Token char_literal131=null;
		Token char_literal132=null;
		ParserRuleReturnScope vectExpr127 =null;

		CommonTree char_literal128_tree=null;
		CommonTree IDF129_tree=null;
		CommonTree string_literal130_tree=null;
		CommonTree char_literal131_tree=null;
		CommonTree char_literal132_tree=null;

		try {
			// Grammar.g:102:9: ( vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			// Grammar.g:102:11: vectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_vectExpr_in_dotExpr846);
			vectExpr127=vectExpr();
			state._fsp--;

			adaptor.addChild(root_0, vectExpr127.getTree());

			// Grammar.g:102:20: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==37) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Grammar.g:102:21: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					char_literal128=(Token)match(input,37,FOLLOW_37_in_dotExpr849); 
					char_literal128_tree = (CommonTree)adaptor.create(char_literal128);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal128_tree, root_0);

					// Grammar.g:102:26: ( IDF | 'len' '(' ! ')' !)
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==IDF) ) {
						alt38=1;
					}
					else if ( (LA38_0==47) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// Grammar.g:102:27: IDF
							{
							IDF129=(Token)match(input,IDF,FOLLOW_IDF_in_dotExpr853); 
							IDF129_tree = (CommonTree)adaptor.create(IDF129);
							adaptor.addChild(root_0, IDF129_tree);

							}
							break;
						case 2 :
							// Grammar.g:102:33: 'len' '(' ! ')' !
							{
							string_literal130=(Token)match(input,47,FOLLOW_47_in_dotExpr857); 
							string_literal130_tree = (CommonTree)adaptor.create(string_literal130);
							adaptor.addChild(root_0, string_literal130_tree);

							char_literal131=(Token)match(input,33,FOLLOW_33_in_dotExpr859); 
							char_literal132=(Token)match(input,34,FOLLOW_34_in_dotExpr861); 
							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotExpr"


	public static class unExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unExpr"
	// Grammar.g:104:1: unExpr : ( UNAIRE ^| EPERLU ^)? dotExpr ;
	public final GrammarParser.unExpr_return unExpr() throws RecognitionException {
		GrammarParser.unExpr_return retval = new GrammarParser.unExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE133=null;
		Token EPERLU134=null;
		ParserRuleReturnScope dotExpr135 =null;

		CommonTree UNAIRE133_tree=null;
		CommonTree EPERLU134_tree=null;

		try {
			// Grammar.g:104:8: ( ( UNAIRE ^| EPERLU ^)? dotExpr )
			// Grammar.g:104:10: ( UNAIRE ^| EPERLU ^)? dotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:104:10: ( UNAIRE ^| EPERLU ^)?
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==UNAIRE) ) {
				alt40=1;
			}
			else if ( (LA40_0==EPERLU) ) {
				alt40=2;
			}
			switch (alt40) {
				case 1 :
					// Grammar.g:104:11: UNAIRE ^
					{
					UNAIRE133=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_unExpr875); 
					UNAIRE133_tree = (CommonTree)adaptor.create(UNAIRE133);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE133_tree, root_0);

					}
					break;
				case 2 :
					// Grammar.g:104:19: EPERLU ^
					{
					EPERLU134=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_unExpr878); 
					EPERLU134_tree = (CommonTree)adaptor.create(EPERLU134);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU134_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_dotExpr_in_unExpr883);
			dotExpr135=dotExpr();
			state._fsp--;

			adaptor.addChild(root_0, dotExpr135.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// Grammar.g:106:1: atom : ( INT | BOOL | IDF ^ ( ( callFun ) )? | block -> ^( ANOBLOCK block ) | '(' expr ')' -> expr );
	public final GrammarParser.atom_return atom() throws RecognitionException {
		GrammarParser.atom_return retval = new GrammarParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT136=null;
		Token BOOL137=null;
		Token IDF138=null;
		Token char_literal141=null;
		Token char_literal143=null;
		ParserRuleReturnScope callFun139 =null;
		ParserRuleReturnScope block140 =null;
		ParserRuleReturnScope expr142 =null;

		CommonTree INT136_tree=null;
		CommonTree BOOL137_tree=null;
		CommonTree IDF138_tree=null;
		CommonTree char_literal141_tree=null;
		CommonTree char_literal143_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:106:6: ( INT | BOOL | IDF ^ ( ( callFun ) )? | block -> ^( ANOBLOCK block ) | '(' expr ')' -> expr )
			int alt42=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt42=1;
				}
				break;
			case BOOL:
				{
				alt42=2;
				}
				break;
			case IDF:
				{
				alt42=3;
				}
				break;
			case 56:
				{
				alt42=4;
				}
				break;
			case 33:
				{
				alt42=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// Grammar.g:106:8: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT136=(Token)match(input,INT,FOLLOW_INT_in_atom891); 
					INT136_tree = (CommonTree)adaptor.create(INT136);
					adaptor.addChild(root_0, INT136_tree);

					}
					break;
				case 2 :
					// Grammar.g:107:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL137=(Token)match(input,BOOL,FOLLOW_BOOL_in_atom895); 
					BOOL137_tree = (CommonTree)adaptor.create(BOOL137);
					adaptor.addChild(root_0, BOOL137_tree);

					}
					break;
				case 3 :
					// Grammar.g:108:4: IDF ^ ( ( callFun ) )?
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF138=(Token)match(input,IDF,FOLLOW_IDF_in_atom900); 
					IDF138_tree = (CommonTree)adaptor.create(IDF138);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF138_tree, root_0);

					// Grammar.g:108:9: ( ( callFun ) )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==33) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// Grammar.g:108:10: ( callFun )
							{
							// Grammar.g:108:10: ( callFun )
							// Grammar.g:108:11: callFun
							{
							pushFollow(FOLLOW_callFun_in_atom905);
							callFun139=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun139.getTree());

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammar.g:109:3: block
					{
					pushFollow(FOLLOW_block_in_atom912);
					block140=block();
					state._fsp--;

					stream_block.add(block140.getTree());
					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 109:9: -> ^( ANOBLOCK block )
					{
						// Grammar.g:109:12: ^( ANOBLOCK block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANOBLOCK, "ANOBLOCK"), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammar.g:110:3: '(' expr ')'
					{
					char_literal141=(Token)match(input,33,FOLLOW_33_in_atom924);  
					stream_33.add(char_literal141);

					pushFollow(FOLLOW_expr_in_atom925);
					expr142=expr();
					state._fsp--;

					stream_expr.add(expr142.getTree());
					char_literal143=(Token)match(input,34,FOLLOW_34_in_atom926);  
					stream_34.add(char_literal143);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 110:13: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Grammar.g:112:1: expr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | binExpr1 );
	public final GrammarParser.expr_return expr() throws RecognitionException {
		GrammarParser.expr_return retval = new GrammarParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal144=null;
		Token char_literal145=null;
		Token char_literal146=null;
		Token char_literal148=null;
		Token char_literal150=null;
		Token string_literal151=null;
		Token char_literal152=null;
		Token char_literal153=null;
		Token char_literal155=null;
		ParserRuleReturnScope expr147 =null;
		ParserRuleReturnScope expr149 =null;
		ParserRuleReturnScope expr154 =null;
		ParserRuleReturnScope binExpr1156 =null;

		CommonTree string_literal144_tree=null;
		CommonTree char_literal145_tree=null;
		CommonTree char_literal146_tree=null;
		CommonTree char_literal148_tree=null;
		CommonTree char_literal150_tree=null;
		CommonTree string_literal151_tree=null;
		CommonTree char_literal152_tree=null;
		CommonTree char_literal153_tree=null;
		CommonTree char_literal155_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:112:6: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | binExpr1 )
			int alt44=3;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt44=1;
				}
				break;
			case 51:
				{
				alt44=2;
				}
				break;
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 33:
			case 56:
				{
				alt44=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// Grammar.g:112:8: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					string_literal144=(Token)match(input,54,FOLLOW_54_in_expr938);  
					stream_54.add(string_literal144);

					char_literal145=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr940);  
					stream_UNAIRE.add(char_literal145);

					char_literal146=(Token)match(input,40,FOLLOW_40_in_expr942);  
					stream_40.add(char_literal146);

					pushFollow(FOLLOW_expr_in_expr944);
					expr147=expr();
					state._fsp--;

					stream_expr.add(expr147.getTree());
					// Grammar.g:112:26: ( ',' expr )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==35) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// Grammar.g:112:27: ',' expr
							{
							char_literal148=(Token)match(input,35,FOLLOW_35_in_expr946);  
							stream_35.add(char_literal148);

							pushFollow(FOLLOW_expr_in_expr948);
							expr149=expr();
							state._fsp--;

							stream_expr.add(expr149.getTree());
							}
							break;

						default :
							break loop43;
						}
					}

					char_literal150=(Token)match(input,41,FOLLOW_41_in_expr952);  
					stream_41.add(char_literal150);

					// AST REWRITE
					// elements: 54, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 112:42: -> ^( 'vec' ( expr )* )
					{
						// Grammar.g:112:45: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_54.nextNode(), root_1);
						// Grammar.g:112:53: ( expr )*
						while ( stream_expr.hasNext() ) {
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:113:3: 'print' '!' '(' expr ')'
					{
					string_literal151=(Token)match(input,51,FOLLOW_51_in_expr965);  
					stream_51.add(string_literal151);

					char_literal152=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_expr967);  
					stream_UNAIRE.add(char_literal152);

					char_literal153=(Token)match(input,33,FOLLOW_33_in_expr969);  
					stream_33.add(char_literal153);

					pushFollow(FOLLOW_expr_in_expr971);
					expr154=expr();
					state._fsp--;

					stream_expr.add(expr154.getTree());
					char_literal155=(Token)match(input,34,FOLLOW_34_in_expr973);  
					stream_34.add(char_literal155);

					// AST REWRITE
					// elements: 51, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 113:28: -> ^( 'print' expr )
					{
						// Grammar.g:113:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:114:3: binExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binExpr1_in_expr985);
					binExpr1156=binExpr1();
					state._fsp--;

					adaptor.addChild(root_0, binExpr1156.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class bigbinExpr1_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr1"
	// Grammar.g:117:1: bigbinExpr1 : bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* ;
	public final GrammarParser.bigbinExpr1_return bigbinExpr1() throws RecognitionException {
		GrammarParser.bigbinExpr1_return retval = new GrammarParser.bigbinExpr1_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL158=null;
		ParserRuleReturnScope bigbinExpr2157 =null;
		ParserRuleReturnScope bigbinExpr2159 =null;

		CommonTree EQUAL158_tree=null;

		try {
			// Grammar.g:117:13: ( bigbinExpr2 ( EQUAL ^ bigbinExpr2 )* )
			// Grammar.g:117:15: bigbinExpr2 ( EQUAL ^ bigbinExpr2 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr1994);
			bigbinExpr2157=bigbinExpr2();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr2157.getTree());

			// Grammar.g:117:27: ( EQUAL ^ bigbinExpr2 )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==EQUAL) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// Grammar.g:117:28: EQUAL ^ bigbinExpr2
					{
					EQUAL158=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bigbinExpr1997); 
					EQUAL158_tree = (CommonTree)adaptor.create(EQUAL158);
					root_0 = (CommonTree)adaptor.becomeRoot(EQUAL158_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr2_in_bigbinExpr11000);
					bigbinExpr2159=bigbinExpr2();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr2159.getTree());

					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigbinExpr1"


	public static class bigbinExpr2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr2"
	// Grammar.g:119:1: bigbinExpr2 : bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* ;
	public final GrammarParser.bigbinExpr2_return bigbinExpr2() throws RecognitionException {
		GrammarParser.bigbinExpr2_return retval = new GrammarParser.bigbinExpr2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ORBOOL161=null;
		ParserRuleReturnScope bigbinExpr3160 =null;
		ParserRuleReturnScope bigbinExpr3162 =null;

		CommonTree ORBOOL161_tree=null;

		try {
			// Grammar.g:119:13: ( bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )* )
			// Grammar.g:119:15: bigbinExpr3 ( ORBOOL ^ bigbinExpr3 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr21011);
			bigbinExpr3160=bigbinExpr3();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr3160.getTree());

			// Grammar.g:119:26: ( ORBOOL ^ bigbinExpr3 )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==ORBOOL) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// Grammar.g:119:27: ORBOOL ^ bigbinExpr3
					{
					ORBOOL161=(Token)match(input,ORBOOL,FOLLOW_ORBOOL_in_bigbinExpr21013); 
					ORBOOL161_tree = (CommonTree)adaptor.create(ORBOOL161);
					root_0 = (CommonTree)adaptor.becomeRoot(ORBOOL161_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr3_in_bigbinExpr21016);
					bigbinExpr3162=bigbinExpr3();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr3162.getTree());

					}
					break;

				default :
					break loop46;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigbinExpr2"


	public static class bigbinExpr3_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr3"
	// Grammar.g:121:1: bigbinExpr3 : bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* ;
	public final GrammarParser.bigbinExpr3_return bigbinExpr3() throws RecognitionException {
		GrammarParser.bigbinExpr3_return retval = new GrammarParser.bigbinExpr3_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANDBOOL164=null;
		ParserRuleReturnScope bigbinExpr4163 =null;
		ParserRuleReturnScope bigbinExpr4165 =null;

		CommonTree ANDBOOL164_tree=null;

		try {
			// Grammar.g:121:13: ( bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )* )
			// Grammar.g:121:15: bigbinExpr4 ( ANDBOOL ^ bigbinExpr4 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr31026);
			bigbinExpr4163=bigbinExpr4();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr4163.getTree());

			// Grammar.g:121:26: ( ANDBOOL ^ bigbinExpr4 )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==ANDBOOL) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// Grammar.g:121:27: ANDBOOL ^ bigbinExpr4
					{
					ANDBOOL164=(Token)match(input,ANDBOOL,FOLLOW_ANDBOOL_in_bigbinExpr31028); 
					ANDBOOL164_tree = (CommonTree)adaptor.create(ANDBOOL164);
					root_0 = (CommonTree)adaptor.becomeRoot(ANDBOOL164_tree, root_0);

					pushFollow(FOLLOW_bigbinExpr4_in_bigbinExpr31031);
					bigbinExpr4165=bigbinExpr4();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr4165.getTree());

					}
					break;

				default :
					break loop47;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigbinExpr3"


	public static class bigbinExpr4_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr4"
	// Grammar.g:123:1: bigbinExpr4 : bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* ;
	public final GrammarParser.bigbinExpr4_return bigbinExpr4() throws RecognitionException {
		GrammarParser.bigbinExpr4_return retval = new GrammarParser.bigbinExpr4_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PREV167=null;
		Token OPBOOLEQ168=null;
		Token NEXT169=null;
		ParserRuleReturnScope bigbinExpr5166 =null;
		ParserRuleReturnScope bigbinExpr5170 =null;

		CommonTree PREV167_tree=null;
		CommonTree OPBOOLEQ168_tree=null;
		CommonTree NEXT169_tree=null;

		try {
			// Grammar.g:123:13: ( bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )* )
			// Grammar.g:123:15: bigbinExpr5 ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr41042);
			bigbinExpr5166=bigbinExpr5();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr5166.getTree());

			// Grammar.g:123:26: ( ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5 )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( ((LA49_0 >= NEXT && LA49_0 <= OPBOOLEQ)||LA49_0==PREV) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Grammar.g:123:27: ( PREV ^| OPBOOLEQ ^| NEXT ^) bigbinExpr5
					{
					// Grammar.g:123:27: ( PREV ^| OPBOOLEQ ^| NEXT ^)
					int alt48=3;
					switch ( input.LA(1) ) {
					case PREV:
						{
						alt48=1;
						}
						break;
					case OPBOOLEQ:
						{
						alt48=2;
						}
						break;
					case NEXT:
						{
						alt48=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}
					switch (alt48) {
						case 1 :
							// Grammar.g:123:28: PREV ^
							{
							PREV167=(Token)match(input,PREV,FOLLOW_PREV_in_bigbinExpr41045); 
							PREV167_tree = (CommonTree)adaptor.create(PREV167);
							root_0 = (CommonTree)adaptor.becomeRoot(PREV167_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:123:34: OPBOOLEQ ^
							{
							OPBOOLEQ168=(Token)match(input,OPBOOLEQ,FOLLOW_OPBOOLEQ_in_bigbinExpr41048); 
							OPBOOLEQ168_tree = (CommonTree)adaptor.create(OPBOOLEQ168);
							root_0 = (CommonTree)adaptor.becomeRoot(OPBOOLEQ168_tree, root_0);

							}
							break;
						case 3 :
							// Grammar.g:123:44: NEXT ^
							{
							NEXT169=(Token)match(input,NEXT,FOLLOW_NEXT_in_bigbinExpr41051); 
							NEXT169_tree = (CommonTree)adaptor.create(NEXT169);
							root_0 = (CommonTree)adaptor.becomeRoot(NEXT169_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_bigbinExpr5_in_bigbinExpr41055);
					bigbinExpr5170=bigbinExpr5();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr5170.getTree());

					}
					break;

				default :
					break loop49;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigbinExpr4"


	public static class bigbinExpr5_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr5"
	// Grammar.g:125:1: bigbinExpr5 : bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* ;
	public final GrammarParser.bigbinExpr5_return bigbinExpr5() throws RecognitionException {
		GrammarParser.bigbinExpr5_return retval = new GrammarParser.bigbinExpr5_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set172=null;
		ParserRuleReturnScope bigbinExpr6171 =null;
		ParserRuleReturnScope bigbinExpr6173 =null;

		CommonTree set172_tree=null;

		try {
			// Grammar.g:125:13: ( bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )* )
			// Grammar.g:125:15: bigbinExpr6 ( ( ADD | SUB ) ^ bigbinExpr6 )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr51066);
			bigbinExpr6171=bigbinExpr6();
			state._fsp--;

			adaptor.addChild(root_0, bigbinExpr6171.getTree());

			// Grammar.g:125:26: ( ( ADD | SUB ) ^ bigbinExpr6 )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==ADD||LA50_0==SUB) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// Grammar.g:125:27: ( ADD | SUB ) ^ bigbinExpr6
					{
					set172=input.LT(1);
					set172=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set172), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_bigbinExpr6_in_bigbinExpr51075);
					bigbinExpr6173=bigbinExpr6();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr6173.getTree());

					}
					break;

				default :
					break loop50;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigbinExpr5"


	public static class bigbinExpr6_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigbinExpr6"
	// Grammar.g:127:1: bigbinExpr6 : bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* ;
	public final GrammarParser.bigbinExpr6_return bigbinExpr6() throws RecognitionException {
		GrammarParser.bigbinExpr6_return retval = new GrammarParser.bigbinExpr6_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR175=null;
		Token DIV176=null;
		ParserRuleReturnScope bigunExpr174 =null;
		ParserRuleReturnScope bigunExpr177 =null;

		CommonTree STAR175_tree=null;
		CommonTree DIV176_tree=null;

		try {
			// Grammar.g:127:13: ( bigunExpr ( ( STAR ^| DIV ^) bigunExpr )* )
			// Grammar.g:127:15: bigunExpr ( ( STAR ^| DIV ^) bigunExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigunExpr_in_bigbinExpr61086);
			bigunExpr174=bigunExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigunExpr174.getTree());

			// Grammar.g:127:25: ( ( STAR ^| DIV ^) bigunExpr )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==DIV||LA52_0==STAR) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// Grammar.g:127:26: ( STAR ^| DIV ^) bigunExpr
					{
					// Grammar.g:127:26: ( STAR ^| DIV ^)
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==STAR) ) {
						alt51=1;
					}
					else if ( (LA51_0==DIV) ) {
						alt51=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}

					switch (alt51) {
						case 1 :
							// Grammar.g:127:27: STAR ^
							{
							STAR175=(Token)match(input,STAR,FOLLOW_STAR_in_bigbinExpr61090); 
							STAR175_tree = (CommonTree)adaptor.create(STAR175);
							root_0 = (CommonTree)adaptor.becomeRoot(STAR175_tree, root_0);

							}
							break;
						case 2 :
							// Grammar.g:127:33: DIV ^
							{
							DIV176=(Token)match(input,DIV,FOLLOW_DIV_in_bigbinExpr61093); 
							DIV176_tree = (CommonTree)adaptor.create(DIV176);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV176_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_bigunExpr_in_bigbinExpr61097);
					bigunExpr177=bigunExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigunExpr177.getTree());

					}
					break;

				default :
					break loop52;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigbinExpr6"


	public static class bigvectExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigvectExpr"
	// Grammar.g:129:1: bigvectExpr : bigstarExpr ( '[' ^ bigExpr ']' !)* ;
	public final GrammarParser.bigvectExpr_return bigvectExpr() throws RecognitionException {
		GrammarParser.bigvectExpr_return retval = new GrammarParser.bigvectExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal179=null;
		Token char_literal181=null;
		ParserRuleReturnScope bigstarExpr178 =null;
		ParserRuleReturnScope bigExpr180 =null;

		CommonTree char_literal179_tree=null;
		CommonTree char_literal181_tree=null;

		try {
			// Grammar.g:129:13: ( bigstarExpr ( '[' ^ bigExpr ']' !)* )
			// Grammar.g:129:15: bigstarExpr ( '[' ^ bigExpr ']' !)*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigstarExpr_in_bigvectExpr1107);
			bigstarExpr178=bigstarExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigstarExpr178.getTree());

			// Grammar.g:129:27: ( '[' ^ bigExpr ']' !)*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==40) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// Grammar.g:129:28: '[' ^ bigExpr ']' !
					{
					char_literal179=(Token)match(input,40,FOLLOW_40_in_bigvectExpr1110); 
					char_literal179_tree = (CommonTree)adaptor.create(char_literal179);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal179_tree, root_0);

					pushFollow(FOLLOW_bigExpr_in_bigvectExpr1113);
					bigExpr180=bigExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigExpr180.getTree());

					char_literal181=(Token)match(input,41,FOLLOW_41_in_bigvectExpr1115); 
					}
					break;

				default :
					break loop53;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigvectExpr"


	public static class bigstarExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigstarExpr"
	// Grammar.g:131:1: bigstarExpr : ( STAR bigmoinsExpr -> ^( UNISTAR bigmoinsExpr ) | bigmoinsExpr );
	public final GrammarParser.bigstarExpr_return bigstarExpr() throws RecognitionException {
		GrammarParser.bigstarExpr_return retval = new GrammarParser.bigstarExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR182=null;
		ParserRuleReturnScope bigmoinsExpr183 =null;
		ParserRuleReturnScope bigmoinsExpr184 =null;

		CommonTree STAR182_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleSubtreeStream stream_bigmoinsExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigmoinsExpr");

		try {
			// Grammar.g:132:2: ( STAR bigmoinsExpr -> ^( UNISTAR bigmoinsExpr ) | bigmoinsExpr )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==STAR) ) {
				alt54=1;
			}
			else if ( (LA54_0==BOOL||LA54_0==IDF||LA54_0==INT||LA54_0==SUB||LA54_0==33||LA54_0==56) ) {
				alt54=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// Grammar.g:132:5: STAR bigmoinsExpr
					{
					STAR182=(Token)match(input,STAR,FOLLOW_STAR_in_bigstarExpr1129);  
					stream_STAR.add(STAR182);

					pushFollow(FOLLOW_bigmoinsExpr_in_bigstarExpr1131);
					bigmoinsExpr183=bigmoinsExpr();
					state._fsp--;

					stream_bigmoinsExpr.add(bigmoinsExpr183.getTree());
					// AST REWRITE
					// elements: bigmoinsExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:23: -> ^( UNISTAR bigmoinsExpr )
					{
						// Grammar.g:132:26: ^( UNISTAR bigmoinsExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISTAR, "UNISTAR"), root_1);
						adaptor.addChild(root_1, stream_bigmoinsExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:133:4: bigmoinsExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bigmoinsExpr_in_bigstarExpr1144);
					bigmoinsExpr184=bigmoinsExpr();
					state._fsp--;

					adaptor.addChild(root_0, bigmoinsExpr184.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigstarExpr"


	public static class bigmoinsExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigmoinsExpr"
	// Grammar.g:135:1: bigmoinsExpr : ( SUB bigatom -> ^( UNISUB bigatom ) | bigatom );
	public final GrammarParser.bigmoinsExpr_return bigmoinsExpr() throws RecognitionException {
		GrammarParser.bigmoinsExpr_return retval = new GrammarParser.bigmoinsExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB185=null;
		ParserRuleReturnScope bigatom186 =null;
		ParserRuleReturnScope bigatom187 =null;

		CommonTree SUB185_tree=null;
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleSubtreeStream stream_bigatom=new RewriteRuleSubtreeStream(adaptor,"rule bigatom");

		try {
			// Grammar.g:136:2: ( SUB bigatom -> ^( UNISUB bigatom ) | bigatom )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==SUB) ) {
				alt55=1;
			}
			else if ( (LA55_0==BOOL||LA55_0==IDF||LA55_0==INT||LA55_0==33||LA55_0==56) ) {
				alt55=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// Grammar.g:136:5: SUB bigatom
					{
					SUB185=(Token)match(input,SUB,FOLLOW_SUB_in_bigmoinsExpr1156);  
					stream_SUB.add(SUB185);

					pushFollow(FOLLOW_bigatom_in_bigmoinsExpr1158);
					bigatom186=bigatom();
					state._fsp--;

					stream_bigatom.add(bigatom186.getTree());
					// AST REWRITE
					// elements: bigatom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 136:17: -> ^( UNISUB bigatom )
					{
						// Grammar.g:136:20: ^( UNISUB bigatom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNISUB, "UNISUB"), root_1);
						adaptor.addChild(root_1, stream_bigatom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:137:4: bigatom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bigatom_in_bigmoinsExpr1171);
					bigatom187=bigatom();
					state._fsp--;

					adaptor.addChild(root_0, bigatom187.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigmoinsExpr"


	public static class bigdotExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigdotExpr"
	// Grammar.g:140:1: bigdotExpr : bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? ;
	public final GrammarParser.bigdotExpr_return bigdotExpr() throws RecognitionException {
		GrammarParser.bigdotExpr_return retval = new GrammarParser.bigdotExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal189=null;
		Token IDF190=null;
		Token string_literal191=null;
		Token char_literal192=null;
		Token char_literal193=null;
		ParserRuleReturnScope bigvectExpr188 =null;

		CommonTree char_literal189_tree=null;
		CommonTree IDF190_tree=null;
		CommonTree string_literal191_tree=null;
		CommonTree char_literal192_tree=null;
		CommonTree char_literal193_tree=null;

		try {
			// Grammar.g:140:12: ( bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )? )
			// Grammar.g:140:14: bigvectExpr ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bigvectExpr_in_bigdotExpr1180);
			bigvectExpr188=bigvectExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigvectExpr188.getTree());

			// Grammar.g:140:26: ( '.' ^ ( IDF | 'len' '(' ! ')' !) )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==37) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Grammar.g:140:27: '.' ^ ( IDF | 'len' '(' ! ')' !)
					{
					char_literal189=(Token)match(input,37,FOLLOW_37_in_bigdotExpr1183); 
					char_literal189_tree = (CommonTree)adaptor.create(char_literal189);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal189_tree, root_0);

					// Grammar.g:140:32: ( IDF | 'len' '(' ! ')' !)
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==IDF) ) {
						alt56=1;
					}
					else if ( (LA56_0==47) ) {
						alt56=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 56, 0, input);
						throw nvae;
					}

					switch (alt56) {
						case 1 :
							// Grammar.g:140:33: IDF
							{
							IDF190=(Token)match(input,IDF,FOLLOW_IDF_in_bigdotExpr1187); 
							IDF190_tree = (CommonTree)adaptor.create(IDF190);
							adaptor.addChild(root_0, IDF190_tree);

							}
							break;
						case 2 :
							// Grammar.g:140:39: 'len' '(' ! ')' !
							{
							string_literal191=(Token)match(input,47,FOLLOW_47_in_bigdotExpr1191); 
							string_literal191_tree = (CommonTree)adaptor.create(string_literal191);
							adaptor.addChild(root_0, string_literal191_tree);

							char_literal192=(Token)match(input,33,FOLLOW_33_in_bigdotExpr1193); 
							char_literal193=(Token)match(input,34,FOLLOW_34_in_bigdotExpr1195); 
							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigdotExpr"


	public static class bigunExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigunExpr"
	// Grammar.g:142:1: bigunExpr : ( UNAIRE ^| EPERLU ^)? bigdotExpr ;
	public final GrammarParser.bigunExpr_return bigunExpr() throws RecognitionException {
		GrammarParser.bigunExpr_return retval = new GrammarParser.bigunExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAIRE194=null;
		Token EPERLU195=null;
		ParserRuleReturnScope bigdotExpr196 =null;

		CommonTree UNAIRE194_tree=null;
		CommonTree EPERLU195_tree=null;

		try {
			// Grammar.g:142:11: ( ( UNAIRE ^| EPERLU ^)? bigdotExpr )
			// Grammar.g:142:13: ( UNAIRE ^| EPERLU ^)? bigdotExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// Grammar.g:142:13: ( UNAIRE ^| EPERLU ^)?
			int alt58=3;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==UNAIRE) ) {
				alt58=1;
			}
			else if ( (LA58_0==EPERLU) ) {
				alt58=2;
			}
			switch (alt58) {
				case 1 :
					// Grammar.g:142:14: UNAIRE ^
					{
					UNAIRE194=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigunExpr1209); 
					UNAIRE194_tree = (CommonTree)adaptor.create(UNAIRE194);
					root_0 = (CommonTree)adaptor.becomeRoot(UNAIRE194_tree, root_0);

					}
					break;
				case 2 :
					// Grammar.g:142:22: EPERLU ^
					{
					EPERLU195=(Token)match(input,EPERLU,FOLLOW_EPERLU_in_bigunExpr1212); 
					EPERLU195_tree = (CommonTree)adaptor.create(EPERLU195);
					root_0 = (CommonTree)adaptor.becomeRoot(EPERLU195_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_bigdotExpr_in_bigunExpr1217);
			bigdotExpr196=bigdotExpr();
			state._fsp--;

			adaptor.addChild(root_0, bigdotExpr196.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigunExpr"


	public static class bigExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigExpr"
	// Grammar.g:144:1: bigExpr : ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | bigbinExpr1 );
	public final GrammarParser.bigExpr_return bigExpr() throws RecognitionException {
		GrammarParser.bigExpr_return retval = new GrammarParser.bigExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal197=null;
		Token char_literal198=null;
		Token char_literal199=null;
		Token char_literal201=null;
		Token char_literal203=null;
		Token string_literal204=null;
		Token char_literal205=null;
		Token char_literal206=null;
		Token char_literal208=null;
		ParserRuleReturnScope expr200 =null;
		ParserRuleReturnScope expr202 =null;
		ParserRuleReturnScope expr207 =null;
		ParserRuleReturnScope bigbinExpr1209 =null;

		CommonTree string_literal197_tree=null;
		CommonTree char_literal198_tree=null;
		CommonTree char_literal199_tree=null;
		CommonTree char_literal201_tree=null;
		CommonTree char_literal203_tree=null;
		CommonTree string_literal204_tree=null;
		CommonTree char_literal205_tree=null;
		CommonTree char_literal206_tree=null;
		CommonTree char_literal208_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_UNAIRE=new RewriteRuleTokenStream(adaptor,"token UNAIRE");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammar.g:145:3: ( 'vec' '!' '[' expr ( ',' expr )* ']' -> ^( 'vec' ( expr )* ) | 'print' '!' '(' expr ')' -> ^( 'print' expr ) | bigbinExpr1 )
			int alt60=3;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt60=1;
				}
				break;
			case 51:
				{
				alt60=2;
				}
				break;
			case BOOL:
			case EPERLU:
			case IDF:
			case INT:
			case STAR:
			case SUB:
			case UNAIRE:
			case 33:
			case 56:
				{
				alt60=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// Grammar.g:145:3: 'vec' '!' '[' expr ( ',' expr )* ']'
					{
					string_literal197=(Token)match(input,54,FOLLOW_54_in_bigExpr1227);  
					stream_54.add(string_literal197);

					char_literal198=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1229);  
					stream_UNAIRE.add(char_literal198);

					char_literal199=(Token)match(input,40,FOLLOW_40_in_bigExpr1231);  
					stream_40.add(char_literal199);

					pushFollow(FOLLOW_expr_in_bigExpr1233);
					expr200=expr();
					state._fsp--;

					stream_expr.add(expr200.getTree());
					// Grammar.g:145:22: ( ',' expr )*
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==35) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// Grammar.g:145:23: ',' expr
							{
							char_literal201=(Token)match(input,35,FOLLOW_35_in_bigExpr1236);  
							stream_35.add(char_literal201);

							pushFollow(FOLLOW_expr_in_bigExpr1238);
							expr202=expr();
							state._fsp--;

							stream_expr.add(expr202.getTree());
							}
							break;

						default :
							break loop59;
						}
					}

					char_literal203=(Token)match(input,41,FOLLOW_41_in_bigExpr1241);  
					stream_41.add(char_literal203);

					// AST REWRITE
					// elements: expr, 54
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 145:37: -> ^( 'vec' ( expr )* )
					{
						// Grammar.g:145:40: ^( 'vec' ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_54.nextNode(), root_1);
						// Grammar.g:145:48: ( expr )*
						while ( stream_expr.hasNext() ) {
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammar.g:146:3: 'print' '!' '(' expr ')'
					{
					string_literal204=(Token)match(input,51,FOLLOW_51_in_bigExpr1254);  
					stream_51.add(string_literal204);

					char_literal205=(Token)match(input,UNAIRE,FOLLOW_UNAIRE_in_bigExpr1256);  
					stream_UNAIRE.add(char_literal205);

					char_literal206=(Token)match(input,33,FOLLOW_33_in_bigExpr1258);  
					stream_33.add(char_literal206);

					pushFollow(FOLLOW_expr_in_bigExpr1260);
					expr207=expr();
					state._fsp--;

					stream_expr.add(expr207.getTree());
					char_literal208=(Token)match(input,34,FOLLOW_34_in_bigExpr1262);  
					stream_34.add(char_literal208);

					// AST REWRITE
					// elements: expr, 51
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 146:28: -> ^( 'print' expr )
					{
						// Grammar.g:146:31: ^( 'print' expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammar.g:147:3: bigbinExpr1
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bigbinExpr1_in_bigExpr1274);
					bigbinExpr1209=bigbinExpr1();
					state._fsp--;

					adaptor.addChild(root_0, bigbinExpr1209.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigExpr"


	public static class bigatom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bigatom"
	// Grammar.g:149:1: bigatom : ( INT | BOOL | IDF ^ ( newStruc | callFun )? | block -> ^( ANOBLOCK block ) | '(' bigExpr ')' -> bigExpr );
	public final GrammarParser.bigatom_return bigatom() throws RecognitionException {
		GrammarParser.bigatom_return retval = new GrammarParser.bigatom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT210=null;
		Token BOOL211=null;
		Token IDF212=null;
		Token char_literal216=null;
		Token char_literal218=null;
		ParserRuleReturnScope newStruc213 =null;
		ParserRuleReturnScope callFun214 =null;
		ParserRuleReturnScope block215 =null;
		ParserRuleReturnScope bigExpr217 =null;

		CommonTree INT210_tree=null;
		CommonTree BOOL211_tree=null;
		CommonTree IDF212_tree=null;
		CommonTree char_literal216_tree=null;
		CommonTree char_literal218_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_bigExpr=new RewriteRuleSubtreeStream(adaptor,"rule bigExpr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// Grammar.g:149:9: ( INT | BOOL | IDF ^ ( newStruc | callFun )? | block -> ^( ANOBLOCK block ) | '(' bigExpr ')' -> bigExpr )
			int alt62=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt62=1;
				}
				break;
			case BOOL:
				{
				alt62=2;
				}
				break;
			case IDF:
				{
				alt62=3;
				}
				break;
			case 56:
				{
				alt62=4;
				}
				break;
			case 33:
				{
				alt62=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// Grammar.g:149:11: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT210=(Token)match(input,INT,FOLLOW_INT_in_bigatom1282); 
					INT210_tree = (CommonTree)adaptor.create(INT210);
					adaptor.addChild(root_0, INT210_tree);

					}
					break;
				case 2 :
					// Grammar.g:150:3: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL211=(Token)match(input,BOOL,FOLLOW_BOOL_in_bigatom1286); 
					BOOL211_tree = (CommonTree)adaptor.create(BOOL211);
					adaptor.addChild(root_0, BOOL211_tree);

					}
					break;
				case 3 :
					// Grammar.g:151:4: IDF ^ ( newStruc | callFun )?
					{
					root_0 = (CommonTree)adaptor.nil();


					IDF212=(Token)match(input,IDF,FOLLOW_IDF_in_bigatom1291); 
					IDF212_tree = (CommonTree)adaptor.create(IDF212);
					root_0 = (CommonTree)adaptor.becomeRoot(IDF212_tree, root_0);

					// Grammar.g:151:9: ( newStruc | callFun )?
					int alt61=3;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==56) ) {
						alt61=1;
					}
					else if ( (LA61_0==33) ) {
						alt61=2;
					}
					switch (alt61) {
						case 1 :
							// Grammar.g:151:10: newStruc
							{
							pushFollow(FOLLOW_newStruc_in_bigatom1295);
							newStruc213=newStruc();
							state._fsp--;

							adaptor.addChild(root_0, newStruc213.getTree());

							}
							break;
						case 2 :
							// Grammar.g:151:19: callFun
							{
							pushFollow(FOLLOW_callFun_in_bigatom1297);
							callFun214=callFun();
							state._fsp--;

							adaptor.addChild(root_0, callFun214.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammar.g:152:3: block
					{
					pushFollow(FOLLOW_block_in_bigatom1303);
					block215=block();
					state._fsp--;

					stream_block.add(block215.getTree());
					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 152:9: -> ^( ANOBLOCK block )
					{
						// Grammar.g:152:12: ^( ANOBLOCK block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANOBLOCK, "ANOBLOCK"), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammar.g:153:2: '(' bigExpr ')'
					{
					char_literal216=(Token)match(input,33,FOLLOW_33_in_bigatom1314);  
					stream_33.add(char_literal216);

					pushFollow(FOLLOW_bigExpr_in_bigatom1315);
					bigExpr217=bigExpr();
					state._fsp--;

					stream_bigExpr.add(bigExpr217.getTree());
					char_literal218=(Token)match(input,34,FOLLOW_34_in_bigatom1316);  
					stream_34.add(char_literal218);

					// AST REWRITE
					// elements: bigExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 153:16: -> bigExpr
					{
						adaptor.addChild(root_0, stream_bigExpr.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bigatom"

	// Delegated rules



	public static final BitSet FOLLOW_fichier_in_axiom94 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_axiom96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_fichier112 = new BitSet(new long[]{0x0020200000000002L});
	public static final BitSet FOLLOW_declFun_in_decl123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declStruct_in_decl128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_declStruct137 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_declStruct139 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_declStruct141 = new BitSet(new long[]{0x0200000000008000L});
	public static final BitSet FOLLOW_args_in_declStruct143 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_declStruct146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_args167 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_args169 = new BitSet(new long[]{0x004044080000A000L});
	public static final BitSet FOLLOW_type_in_args171 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_args174 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_args176 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_args178 = new BitSet(new long[]{0x004044080000A000L});
	public static final BitSet FOLLOW_type_in_args180 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_45_in_declFun202 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_IDF_in_declFun205 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_declFun207 = new BitSet(new long[]{0x0000000400008000L});
	public static final BitSet FOLLOW_args_in_declFun209 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_declFun212 = new BitSet(new long[]{0x0100001000000000L});
	public static final BitSet FOLLOW_36_in_declFun215 = new BitSet(new long[]{0x014044000000A000L});
	public static final BitSet FOLLOW_type_in_declFun217 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_block_in_declFun221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_declFun248 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_declFun250 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_declFun252 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_block_in_declFun254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_type276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_type280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_type283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_type288 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_PREV_in_type291 = new BitSet(new long[]{0x004044000010A000L});
	public static final BitSet FOLLOW_type_in_type293 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_NEXT_in_type295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPERLU_in_type309 = new BitSet(new long[]{0x004044000000A000L});
	public static final BitSet FOLLOW_type_in_type311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_block328 = new BitSet(new long[]{0x01DB08821A03A200L});
	public static final BitSet FOLLOW_instruct_in_block330 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_block331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_callFun350 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_callFun352 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_callFun355 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_callFun357 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_callFun361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_newStruc374 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_newStruc376 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_newStruc378 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc380 = new BitSet(new long[]{0x0200000800000000L});
	public static final BitSet FOLLOW_35_in_newStruc383 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_newStruc385 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_newStruc387 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_newStruc389 = new BitSet(new long[]{0x0200000800000000L});
	public static final BitSet FOLLOW_57_in_newStruc393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_instrBoucle416 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instrBoucle418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_instruct442 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_instrBoucle_in_instruct444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_instruct448 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_instruct459 = new BitSet(new long[]{0x0004000000008000L});
	public static final BitSet FOLLOW_50_in_instruct461 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dotIDF_in_instruct464 = new BitSet(new long[]{0x0000004000004000L});
	public static final BitSet FOLLOW_38_in_instruct467 = new BitSet(new long[]{0x004044000000E000L});
	public static final BitSet FOLLOW_type_in_instruct469 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EQUAL_in_instruct473 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_instruct475 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instruct477 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_instruct509 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_instruct511 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_block_in_instruct513 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_instruct532 = new BitSet(new long[]{0x014800821A02A200L});
	public static final BitSet FOLLOW_expr_in_instruct534 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instruct537 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_instruct555 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_block_in_instruct557 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_instruct574 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instruct576 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_instruct589 = new BitSet(new long[]{0x01DB08821A03A202L});
	public static final BitSet FOLLOW_instruct_in_instruct591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_dotIDF603 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_dotIDF606 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDF_in_dotIDF609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifExpr619 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_ifExpr621 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr623 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ifExpr626 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_block_in_ifExpr628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1656 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_EQUAL_in_binExpr1659 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_binExpr2_in_binExpr1662 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2673 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ORBOOL_in_binExpr2675 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_binExpr3_in_binExpr2678 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3689 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_binExpr3691 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_binExpr4_in_binExpr3694 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4705 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_PREV_in_binExpr4708 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_binExpr4711 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_NEXT_in_binExpr4714 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_binExpr5_in_binExpr4718 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5729 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_ADD_in_binExpr5732 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_SUB_in_binExpr5735 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_binExpr6_in_binExpr5740 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6751 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_STAR_in_binExpr6755 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_DIV_in_binExpr6758 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_unExpr_in_binExpr6762 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_starExpr_in_vectExpr773 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_vectExpr776 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_vectExpr779 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_vectExpr781 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_STAR_in_starExpr795 = new BitSet(new long[]{0x0100000208028200L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moinsExpr_in_starExpr810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_moinsExpr822 = new BitSet(new long[]{0x0100000200028200L});
	public static final BitSet FOLLOW_atom_in_moinsExpr824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_moinsExpr837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectExpr_in_dotExpr846 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_dotExpr849 = new BitSet(new long[]{0x0000800000008000L});
	public static final BitSet FOLLOW_IDF_in_dotExpr853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_dotExpr857 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_dotExpr859 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_dotExpr861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_unExpr875 = new BitSet(new long[]{0x010000020A028200L});
	public static final BitSet FOLLOW_EPERLU_in_unExpr878 = new BitSet(new long[]{0x010000020A028200L});
	public static final BitSet FOLLOW_dotExpr_in_unExpr883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_atom895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_atom900 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_callFun_in_atom905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_atom912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_atom924 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_atom925 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_atom926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_expr938 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr940 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_expr942 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_expr944 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_35_in_expr946 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_expr948 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_41_in_expr952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_expr965 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_expr967 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_expr969 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_expr971 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_expr973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binExpr1_in_expr985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr1994 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_EQUAL_in_bigbinExpr1997 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr2_in_bigbinExpr11000 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr21011 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ORBOOL_in_bigbinExpr21013 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr3_in_bigbinExpr21016 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr31026 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ANDBOOL_in_bigbinExpr31028 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr4_in_bigbinExpr31031 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr41042 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_PREV_in_bigbinExpr41045 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_OPBOOLEQ_in_bigbinExpr41048 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_NEXT_in_bigbinExpr41051 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr5_in_bigbinExpr41055 = new BitSet(new long[]{0x0000000000B00002L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr51066 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_set_in_bigbinExpr51068 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_bigbinExpr6_in_bigbinExpr51075 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr61086 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_STAR_in_bigbinExpr61090 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_DIV_in_bigbinExpr61093 = new BitSet(new long[]{0x010000021A02A200L});
	public static final BitSet FOLLOW_bigunExpr_in_bigbinExpr61097 = new BitSet(new long[]{0x0000000002001002L});
	public static final BitSet FOLLOW_bigstarExpr_in_bigvectExpr1107 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_bigvectExpr1110 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_bigvectExpr1113 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_bigvectExpr1115 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_STAR_in_bigstarExpr1129 = new BitSet(new long[]{0x0100000208028200L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigstarExpr1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigmoinsExpr_in_bigstarExpr1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_bigmoinsExpr1156 = new BitSet(new long[]{0x0100000200028200L});
	public static final BitSet FOLLOW_bigatom_in_bigmoinsExpr1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigatom_in_bigmoinsExpr1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigvectExpr_in_bigdotExpr1180 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_bigdotExpr1183 = new BitSet(new long[]{0x0000800000008000L});
	public static final BitSet FOLLOW_IDF_in_bigdotExpr1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_bigdotExpr1191 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigdotExpr1193 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_bigdotExpr1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAIRE_in_bigunExpr1209 = new BitSet(new long[]{0x010000020A028200L});
	public static final BitSet FOLLOW_EPERLU_in_bigunExpr1212 = new BitSet(new long[]{0x010000020A028200L});
	public static final BitSet FOLLOW_bigdotExpr_in_bigunExpr1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_bigExpr1227 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1229 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_bigExpr1231 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1233 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_35_in_bigExpr1236 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1238 = new BitSet(new long[]{0x0000020800000000L});
	public static final BitSet FOLLOW_41_in_bigExpr1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_bigExpr1254 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_UNAIRE_in_bigExpr1256 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_bigExpr1258 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_expr_in_bigExpr1260 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_bigExpr1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bigbinExpr1_in_bigExpr1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_bigatom1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bigatom1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_bigatom1291 = new BitSet(new long[]{0x0100000200000002L});
	public static final BitSet FOLLOW_newStruc_in_bigatom1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callFun_in_bigatom1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_bigatom1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_bigatom1314 = new BitSet(new long[]{0x014800021A02A200L});
	public static final BitSet FOLLOW_bigExpr_in_bigatom1315 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_bigatom1316 = new BitSet(new long[]{0x0000000000000002L});
}