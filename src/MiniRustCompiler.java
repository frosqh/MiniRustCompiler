import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

/**
 * Implement a compiler for MiniRust Language. <br>
 * Grammar of this language can be found <a href="../Grammar.g">here</a>.
 * @author Frosqh
 */
public class MiniRustCompiler {
    public static TDS tds;

    /*******************************************************************************************************************/

    /**
     * Compile the file passed in argument. <br>
     * Exit Code : 5 -&gt; Error while parsing <br>
     * Exit Code : 6 -&gt; Error on semantic controls
     * @param args args[0] : file path
     * @throws IOException If error on opening FileStream
     * @throws RecognitionException If error on parsing the file
     */
    public static void main(String[] args) throws IOException, RecognitionException {
        CharStream input;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.err;
        System.setErr(ps);
        if (args.length > 0){
            input = new ANTLRFileStream(args[0]);
        }
        else {
            System.out.println("Please type your program here : ");
            input = new ANTLRInputStream(System.in);
        }
        GrammarLexer lex = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GrammarParser parser = new GrammarParser(tokens);
        GrammarParser.axiom_return r = parser.axiom();
        CommonTree t = r.tree;
        if (baos.toString().length() > 0){
            System.setErr(old);
            System.err.println(baos.toString());
            System.exit(5); // -> Error on compilation
        }
        tds = new TDS();
        parseTree(t,tds,false);
        if (baos.toString().length() > 0){
            System.setErr(old);
            System.err.println(baos.toString());
            System.exit(6); // -> Error on semantic controls
        }
        System.out.println(tds);
    }

    /**
     * Parse the tree to build the Symbol Table
     * @param t Tree to parse
     * @param tds Current state of Symbol Table
     * @param b Is it a new scope ?
     * @see TDS#add(BaseTree)
     */
    private static void parseTree(CommonTree t, TDS tds, boolean b){
        int hasChanged;
        List<BaseTree> l = (List<BaseTree>) t.getChildren();
        if (l != null){
            for (BaseTree AST : l){
                hasChanged = tds.add(AST);
                tds.check(AST,t);
                parseTree((CommonTree) AST,tds,(hasChanged == 1));
            }
        }
        if (b){
            tds.back();
        }
    }
}