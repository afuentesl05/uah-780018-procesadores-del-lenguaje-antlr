import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainAstListener {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Uso: java MainAstListener <entrada.epp> <salida.txt>");
            return;
        }
        CharStream input = CharStreams.fromPath(Paths.get(args[0]));
        EppLexer lexer = new EppLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EppParser parser = new EppParser(tokens);

        ParseTree tree = parser.program();

        AstPrinterListener listener = new AstPrinterListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        Files.writeString(Paths.get(args[1]), listener.getText());
        System.out.println("AST guardado en: " + Paths.get(args[1]).toAbsolutePath());
    }
}
