public class Simbolo {

    public final String nombre;
    public final Tipo tipo;
    public final int slotLocal; // posición en variables locales de la JVM

    public Simbolo(String nombre, Tipo tipo, int slotLocal) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.slotLocal = slotLocal;
    }
}
