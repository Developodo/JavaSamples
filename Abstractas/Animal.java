package Abstractas;

public abstract class Animal {
    private int edad;
    private String nombre;
    
    public Animal(int edad,String nombre){
        this.edad=edad;
        this.nombre=nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal [edad=" + edad + ", nombre=" + nombre + "]";
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=false;
        if(obj!=null){
            if(this!=obj){
                if(getClass()==obj.getClass()){
                    Animal a=(Animal)obj;
                    if(a.nombre!=null && nombre!=null){
                        if(nombre.equals(a.nombre)){
                            result=true;
                        }
                    }
                }
            }else{
                //this==obj
                result=true;
            }
        }
        return false;
    }

   abstract public String getDieta();
}
