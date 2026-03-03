import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {

    private final Map<String, Simbolo> tabla = new HashMap<>();
    private int siguienteSlot = 1;  // slot 0 suele reservarse o no usarse

    public boolean existe(String nombre) {
        return tabla.containsKey(nombre);
    }

    public Simbolo obtener(String nombre) {
        if (!tabla.containsKey(nombre)) {
            throw new RuntimeException("Error: variable '" + nombre + "' no declarada");
        }
        return tabla.get(nombre);
    }

    public void declarar(String nombre, Tipo tipo) {
        if (existe(nombre)) {
            throw new RuntimeException("Error: variable '" + nombre + "' ya declarada");
        }
        Simbolo s = new Simbolo(nombre, tipo, siguienteSlot++);
        tabla.put(nombre, s);
    }
}
