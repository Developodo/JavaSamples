package Agenda;

public class Ejecutable {
    public static void main(String[] args) {
        //crear un contacto
        Contacto c=new Contacto(); //instanciación
        System.out.println(c.getNombre());
        Contacto c2=new Contacto("Carlos","123",41);
        System.out.println(c2.getNombre());
   
        System.out.println(c2.toString());

    }
}
