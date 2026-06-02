import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {

        String code = Files.readString(Path.of("src/hash_tester.txt"));

        CharStream input = CharStreams.fromString(code);

        HashLexer lexer = new HashLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HashParser parser = new HashParser(tokens);
        ParseTree tree = parser.startState();

        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticChecker checker = new SemanticChecker();

        walker.walk(checker, tree);

        if (checker.hasErrors()) {
            System.out.println("Checking finished with semantic errors.");
        } else {
            System.out.println("Everything is fine!");
        }

    }
}