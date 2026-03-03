import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainPretty {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Uso: java MainPretty <entrada.txt> <salida.txt>");
            System.exit(1);
        }

        // Entrada
        CharStream input = CharStreams.fromPath(Paths.get(args[0]));

        // Léxico / Parser generados por ANTLR
        Csv_gramaticaLexer lexer = new Csv_gramaticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Csv_gramaticaParser parser = new Csv_gramaticaParser(tokens);

        // Regla inicial
        ParseTree tree = parser.prog();

        // Recorremos con nuestro listener y escribimos fichero
        PrettyCsvListener listener = new PrettyCsvListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        Files.writeString(Paths.get(args[1]), listener.getText());
        System.out.println("Árbol textual generado en: " + args[1]);
    }
}
