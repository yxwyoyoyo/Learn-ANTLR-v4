// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ArrayInitTest {
    public static void main(String[] args) throws Exception {
        System.out.print("Please enter an array initialization expression: ");

        // create a CharStream that reads from standard input
        CharStream stream = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(stream);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        // begin parsing at init rule
        ParseTree tree = parser.init();

        // print LISP-style tree
        System.out.println(tree.toStringTree(parser));
    }
}
