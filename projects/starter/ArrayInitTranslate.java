// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ArrayInitTranslate {
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

        // create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // print a beginning hint
        System.out.print("The translation result is: ");
        // walk the tree created by the parser, trigger callbacks
        walker.walk(new ShortToUnicodeString(), tree);
        // print a \n after translation
        System.out.println();
    }
}
