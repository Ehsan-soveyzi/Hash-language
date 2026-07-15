package SemanticChecker_SourceCode;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import gen.*;

public class SaveParseTreeImage {

    public static void main(String[] args) throws Exception {

        // 1. Read test code from file
        String code = Files.readString(Path.of("src/tester.txt"));

        // 2. Create lexer and parser
        CharStream input = CharStreams.fromString(code);

        HashLexer lexer = new HashLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HashParser parser = new HashParser(tokens);

        // 3. Parse from start rule
        ParseTree tree = parser.startState();

        // 4. Stop if syntax errors exist
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Syntax errors found. Parse tree image may not be reliable.");
        }

        // 5. Create TreeViewer
        TreeViewer viewer = new TreeViewer(
                Arrays.asList(parser.getRuleNames()),
                tree
        );

        // Change this if text is too small or too large
        viewer.setScale(1.5);

        // 6. Put viewer in a panel/frame to force correct layout
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(viewer, BorderLayout.CENTER);

        frame.setContentPane(panel);
        frame.pack();

        // 7. Get real preferred size after layout
        Dimension preferredSize = viewer.getPreferredSize();

        int padding = 120;
        int width = preferredSize.width + padding;
        int height = preferredSize.height + padding;

        viewer.setSize(preferredSize);
        viewer.doLayout();

        // 8. Create image
        BufferedImage image = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_ARGB
        );

        Graphics2D g2 = image.createGraphics();

        // 9. White background
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, width, height);

        // 10. Better quality rendering
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON
        );

        g2.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY
        );

        // 11. Add margin so branches are not cut
        g2.translate(padding / 2, padding / 2);

        // 12. Paint tree into image
        viewer.paint(g2);

        g2.dispose();

        // 13. Save image
        File outputFile = new File("Test_two_parse_tree.png");
        ImageIO.write(image, "png", outputFile);

        System.out.println("Parse tree image saved as: " + outputFile.getAbsolutePath());
    }
}