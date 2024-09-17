package info.project_act.tessellation;

import info.project_act.tessellation.ArrayInit.ArrayInitLexer;
import info.project_act.tessellation.ArrayInit.ArrayInitParser;
import info.project_act.tessellation.html.HTMLLexer;
import info.project_act.tessellation.html.HTMLParser;
import info.project_act.tessellation.java.Java20ParserBaseListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Antlr {
    public class CommentListener extends Java20ParserBaseListener {
        private List<String> comments = new ArrayList<>();

        @Override
        public void enterEveryRule(ParserRuleContext ctx) {
//        List<Token> tokens = ctx.getTokens();
//        for (Token token : tokens) {
//            if (token.getChannel() == Token.HIDDEN_CHANNEL) {
//                comments.add(token.getText());
//            }
//        }
        }

        public List<String> getComments() {
            return comments;
        }
    }

    private static void extracted1() throws IOException {
        // Read the HTML file
        String sourceCode = new String(Files.readAllBytes(Paths.get("src/main/resources/a.html")));

        // Create a CharStream that reads from the source code
        CharStream input = CharStreams.fromString(sourceCode);

        // Create a lexer that feeds off of input CharStream
        HTMLLexer lexer = new HTMLLexer(input);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        HTMLParser parser = new HTMLParser(tokens);

        // Begin parsing at the document rule
        ParseTree tree = parser.htmlElements();

        // Print the LISP-style tree
        System.out.println(tree.toStringTree(parser));
    }

    private static void extracted() throws IOException {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream

        ArrayInitLexer lexer = new ArrayInitLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
