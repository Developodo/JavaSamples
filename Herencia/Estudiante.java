package Herencia;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String dni, String curso) {
        super(nombre, dni);
        this.curso = curso;
    }

    public Estudiante() {
        this("","","");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+"  --> Estudiante [curso=" + curso + "]";
    }
    

}
