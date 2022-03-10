package Abstractas;

public class Herviboro extends Animal{
    private int sexo;
    
    public Herviboro(int edad, String nombre,int sexo){
        super(edad,nombre);
        this.sexo=sexo;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Herviboro [sexo=" + sexo + "]"+super.toString();
    }

    @Override
    public String getDieta() {
        // TODO Auto-generated method stub
        return "Plantas no aromáticas";
    }

}