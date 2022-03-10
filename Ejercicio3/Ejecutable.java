package Ejercicio3;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Inserte el número de contraseñas a crear: ");
        int nContrasenas;
        try{
            nContrasenas=teclado.nextInt();
        }catch(Exception ex){
            nContrasenas=3;
            teclado.next();
        }
        Password[] passwords=new Password[nContrasenas];

        for(int i=0;i<passwords.length;i++){
            System.out.print("Cuál es la longitud del password "+(i+1)+": ");
            int l=teclado.nextInt();
            passwords[i]=new Password(l);
        }

        for(Password iesimo:passwords){
            System.out.println("La contraseña es: "+iesimo.getContrasena()+" ¿Es fuerte? "+iesimo.esFuerte());
        }
    }
}
