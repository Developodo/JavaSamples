package Estatico;

public class Persona {
    public static int numeroPersonas=0;
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + "]";
    }
}
