package Agenda;

public class Contacto {
    /**
     * Las propiedades del contacto -> atributos
     * Encapsulamiento
     */
    private String nombre;
    private String telefono;
    private int edad;

    public Contacto(){
        nombre="Unknown";
        telefono="Unknown";
        edad=0;
    }
    //Sobreescritura
    public Contacto(String nombre,String telefono,int edad){
        this.nombre=nombre;
        this.telefono=telefono;
        this.edad=edad;
    }
    //getter y setters
    public void setNombre(String nombre){
        /**
         * Cuando hay ambigüedad
         */
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono(String t){
        telefono=t;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setEdad(int e){
        if(e>0)
            edad=e;
    }
    public int getEdad(){
        return edad;
    }
    @Override
    public String toString() {
        return "Contacto: "+nombre+ "("+edad+") -> "+telefono;
    }
}
