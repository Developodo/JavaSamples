package Estatico;

import Abstractas.Ejecutable;

public class Ejcutable {
    public static void main(String[] args) {
        Utilidades.P("Hola Mundo");
        System.out.println(Persona.numeroPersonas);

        Persona p1=new Persona("JUan");
        Persona.numeroPersonas++;
        System.out.println(p1.numeroPersonas);
        p1.numeroPersonas++;

        System.out.println(Persona.numeroPersonas);

        Persona p2=new Persona("Carlos");
        System.out.println(p2.numeroPersonas);
    }
}
