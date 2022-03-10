package Abstractas;

public class Carnivoro extends Animal{
    private int color;
    
    public Carnivoro(int edad, String nombre,int color){
        super(edad,nombre);
        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carnivoro [color=" + color + "]"+super.toString();
    }

    @Override
    public String getDieta() {
        
        return "Carne a mogollón";
    }

    

}
