import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test{
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        apronLexer lexer = new apronLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        apronParser parser = new apronParser(tokens);
        ParseTree tree = parser.program(); // parse

        EvalVisitor eval = new EvalVisitor();
        eval.perm_req.setapp("pkt_in_event");
        //eval.visit(tree);
        Boolean ret = false;
        ret = eval.visit(tree);
        if(ret == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
