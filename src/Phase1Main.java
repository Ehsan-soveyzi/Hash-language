import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Phase1Main {

    public static void main(String[] args) {

        // this kind of calling enable dynamic addressing of the input path and the output.
        String inputPath = args.length >= 1 ? args[0] : "src/hash_tester.txt";
        String outputPath = args.length >= 2 ? args[1] : "output.pml";

        try {
            // this line get the full text of inputPath(Hash based) to String
            String hashCode = Files.readString(Path.of(inputPath));

            CharStream input = CharStreams.fromString(hashCode);

            HashLexer lexer = new HashLexer(input);

            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

//            System.out.println(lexer);
//            System.exit(0);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            HashParser parser = new HashParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);

            HashParser.StartStateContext tree = parser.startState();

            PromelaTranslator translator = new PromelaTranslator();
            String promelaCode = translator.translate(tree);

            Path output = Path.of(outputPath);

            if (output.getParent() != null) {
                Files.createDirectories(output.getParent());
            }

            Files.writeString(output, promelaCode);

            System.out.println("Promela file generated successfully.");
            System.out.println("Input Hash file: " + inputPath);
            System.out.println("Output Promela file: " + outputPath);

        } catch (ParseCancellationException e) {
            System.err.println("Syntax error while parsing Hash file:");
            System.err.println(e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.err.println("Translation error:");
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("File error:");
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error:");
            e.printStackTrace();
        }
    }


    // this class is execption based , enable us to verify the hash with semantic checking & syntax as well
    private static class ThrowingErrorListener extends BaseErrorListener {

        static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(
                Recognizer<?, ?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String msg,
                RecognitionException e
        ) throws ParseCancellationException {
            throw new ParseCancellationException(
                    "line " + line + ":" + charPositionInLine + " " + msg
            );
        }
    }
}