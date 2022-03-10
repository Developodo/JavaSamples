package Herencia;

public class Profesor extends Persona{
    private String departamento;

    public Profesor(String nombre, String dni, String departamento) {
        super(nombre, dni);
        this.departamento = departamento;
    }
    public Profesor() {
        this("","","");
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return super.toString()+" -> Profesor [departamento=" + departamento + "]";
    }
    
}
