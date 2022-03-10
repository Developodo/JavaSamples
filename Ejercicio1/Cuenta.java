package Ejercicio1;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public Cuenta(String titular) {
        this(titular,0);
    }
  
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Cuenta [cantidad=" + cantidad + ", titular=" + titular + "]";
    }
    public void ingresa(double cantidad){
        if(cantidad>0){
            this.cantidad+=cantidad;
        }
    }
    public void retira(double cantidad){
        if(cantidad>0){
            this.cantidad-=cantidad;
            if(this.cantidad<0) 
                this.cantidad=0;
        }
    }
    

    
    

    
}
