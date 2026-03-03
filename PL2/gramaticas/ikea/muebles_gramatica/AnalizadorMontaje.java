import java.util.*;


public class AnalizadorMontaje extends mueble_gramaticaBaseVisitor<Void> {

    // ==== Acumulado global ====
    private final Map<String, Integer> contadorHerrajes = new LinkedHashMap<>();
    private final Set<String> herramientasUsadas = new LinkedHashSet<>();

    // ==== Acumulado por paso ====
    private Map<String, Integer> herrajesPasoActual = null;
    private Set<String> herramientasPasoActual = null;

    // Getters opcionales
    public Map<String, Integer> getContadorHerrajes() { return contadorHerrajes; }
    public Set<String> getHerramientasUsadas() { return herramientasUsadas; }

    // ----------------- Utilidades -----------------

    private String quitarComillas(String s) {
        if (s == null) return null;
        if (s.length() >= 2 && s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    private String extraerNombre(mueble_gramaticaParser.NombreContext ctx) {
        if (ctx.CADENA() != null) {
            return quitarComillas(ctx.CADENA().getText());
        } else {
            return ctx.ID().getText();
        }
    }

    // ----------------------------------------------
    // PROGRAMA
    // ----------------------------------------------

    @Override
    public Void visitPrograma(mueble_gramaticaParser.ProgramaContext ctx) {
        return visitChildren(ctx);
    }

    // ----------------------------------------------
    // USO HERRAMIENTAS (sección superior)
    // ----------------------------------------------

    @Override
    public Void visitUsoHerramienta(mueble_gramaticaParser.UsoHerramientaContext ctx) {
        String raw = ctx.CADENA().getText();
        String nombre = quitarComillas(raw);
        herramientasUsadas.add(nombre);
        return null;
    }

    // ----------------------------------------------
    // PASO MONTAJE con REPETIR
    // ----------------------------------------------

    @Override
    public Void visitPasoMontaje(mueble_gramaticaParser.PasoMontajeContext ctx) {
        // 1. Preparamos acumuladores locales del paso
        herrajesPasoActual = new LinkedHashMap<>();
        herramientasPasoActual = new LinkedHashSet<>();

        // 2. Visitamos la lista de acciones del paso
        visit(ctx.accionLista());

        // 3. Calculamos el factor de repetición
        int factor = 1;  // el paso se hace al menos 1 vez
        if (ctx.REPETIR() != null) {
            int repeticiones = Integer.parseInt(ctx.NUM(ctx.NUM().size() - 1).getText());
            factor = repeticiones; 
        }

        // 4. Volcamos el paso al acumulado global, multiplicando los herrajes
        for (Map.Entry<String, Integer> e : herrajesPasoActual.entrySet()) {
            int totalPaso = e.getValue() * factor;
            contadorHerrajes.merge(e.getKey(), totalPaso, Integer::sum);
        }

        // 5. Las herramientas: basta con añadirlas (set evita duplicados)
        herramientasUsadas.addAll(herramientasPasoActual);

        // 6. Limpiamos referencias locales (por claridad)
        herrajesPasoActual = null;
        herramientasPasoActual = null;

        return null;
    }

    // ----------------------------------------------
    // HERRAJES DENTRO DEL PASO
    // ----------------------------------------------

    @Override
    public Void visitHerrajeItem(mueble_gramaticaParser.HerrajeItemContext ctx) {
        // herrajeRef: nombre | NUM ;
        mueble_gramaticaParser.HerrajeRefContext ref = ctx.herrajeRef();

        String id;
        if (ref.nombre() != null) {
            id = extraerNombre(ref.nombre());
        } else {
            id = ref.NUM().getText(); // por ejemplo "104"
        }

        int cantidad = 1;
        if (ctx.NUM() != null) {
            cantidad = Integer.parseInt(ctx.NUM().getText());
        }

        // Si estamos dentro de un paso, acumulamos en el mapa local del paso;
        // si no, por seguridad, acumulamos directamente en el global.
        if (herrajesPasoActual != null) {
            herrajesPasoActual.merge(id, cantidad, Integer::sum);
        } else {
            contadorHerrajes.merge(id, cantidad, Integer::sum);
        }

        return null;
    }

    // ----------------------------------------------
    // HERRAMIENTAS DENTRO DEL PASO
    // ----------------------------------------------

    @Override
    public Void visitHerramientaRef(mueble_gramaticaParser.HerramientaRefContext ctx) {
        String nombre = extraerNombre(ctx.nombre());

        if (herramientasPasoActual != null) {
            herramientasPasoActual.add(nombre);
        } else {
            herramientasUsadas.add(nombre);
        }

        return null;
    }

    // ----------------------------------------------
    // IMPRESIÓN DEL RESUMEN
    // ----------------------------------------------

    public void imprimirResumen() {
        System.out.println("==== RESUMEN DEL MONTAJE ====\n");

        System.out.println(">> Herrajes utilizados:");
        if (contadorHerrajes.isEmpty()) {
            System.out.println("   (No se han encontrado herrajes)");
        } else {
            for (Map.Entry<String, Integer> e : contadorHerrajes.entrySet()) {
                System.out.printf("   - %s: %d%n", e.getKey(), e.getValue());
            }
        }

        System.out.println("\n>> Herramientas utilizadas:");
        if (herramientasUsadas.isEmpty()) {
            System.out.println("   (No se han encontrado herramientas)");
        } else {
            for (String h : herramientasUsadas) {
                System.out.println("   - " + h);
            }
        }
    }
}
