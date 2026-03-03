import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {

        // 1. Fichero de entrada E++
        String inputFile = args.length > 0 ? args[0] : "programa.epp";
        CharStream input = CharStreams.fromFileName(inputFile);

        // 2. Lexer y parser de ANTLR
        EppLexer lexer = new EppLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EppParser parser = new EppParser(tokens);

        // 3. Árbol sintáctico
        ParseTree tree = parser.program();

        // 4. Análisis semántico (tabla de símbolos + tipos)
        AnalizadorSemantico sem = new AnalizadorSemantico();
        sem.visit(tree);  // si hay errores semánticos, lanzará excepciones

        // 5. Generación de código Jasmin usando la tabla de símbolos
        GeneradorJasmin gen = new GeneradorJasmin(sem.getTabla());
        String jasmin = gen.generarPrograma(tree);

        // 6. Calcular nombre del fichero de salida .j a partir del .epp
        //    - quitamos ruta
        //    - quitamos extensión
        String baseName = inputFile;

        // Quitar ruta (funciona tanto con / como con \)
        int lastSlash = Math.max(baseName.lastIndexOf('/'), baseName.lastIndexOf('\\'));
        if (lastSlash >= 0) {
            baseName = baseName.substring(lastSlash + 1);
        }

        // Quitar extensión si la hay
        int dot = baseName.lastIndexOf('.');
        if (dot > 0) { // >0 para no petar si el nombre empieza por '.'
            baseName = baseName.substring(0, dot);
        }

        String outputFile = baseName + ".j";

        // 7. Guardar el Jasmin a fichero
        Files.write(Paths.get(outputFile), jasmin.getBytes());

        System.out.println("Código Jasmin generado en " + outputFile);
    }
}
