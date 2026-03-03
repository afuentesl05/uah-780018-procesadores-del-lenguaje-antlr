import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class MainMontaje {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Uso: java MainMontaje <fichero_entrada.txt>");
            System.exit(1);
        }

        String fichero = args[0];

        // 1. Leemos el fichero con la secuencia de montaje
        CharStream input = CharStreams.fromFileName(fichero);

        // 2. Ejecutamos lexer y parser generados por ANTLR
        mueble_gramaticaLexer lexer = new mueble_gramaticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mueble_gramaticaParser parser = new mueble_gramaticaParser(tokens);

        // Punto de entrada de la gramática
        ParseTree tree = parser.programa();

        // 3. Visitamos el árbol con nuestro analizador
        AnalizadorMontaje analizador = new AnalizadorMontaje();
        analizador.visit(tree);

        // 4. Mostramos por pantalla el resumen solicitado
        analizador.imprimirResumen();
    }
}
