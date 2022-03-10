package Ejercicio1;

public class Test {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta("Carlos");
        cuenta.ingresa(1000);
        System.out.println(cuenta.getCantidad());
        cuenta.retira(2000);
        System.out.println(cuenta.getCantidad());
    }
}
