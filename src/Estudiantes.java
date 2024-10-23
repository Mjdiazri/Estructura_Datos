import java.util.Objects;

public class Estudiantes {
    //Variables
    private String nombre;

    //Metodos
    public Estudiantes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Estudiantes otro = (Estudiantes) obj;
        return otro.getNombre().equals(this.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}

