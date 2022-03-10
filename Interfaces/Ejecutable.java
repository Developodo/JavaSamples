package Interfaces;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {

        ICalculadora calculadora=new Calculadora();

        System.out.println("Bienvenido a la calculadora");
        int option=-1;
        Scanner teclado=new Scanner(System.in);
        do{
            muestraMenu();
            option=teclado.nextInt();
            System.out.println("Inserte operando 1: ");
            double op1=teclado.nextDouble();
            System.out.println("Inserte operando 2: ");
            double op2=teclado.nextDouble();
            double resultado;
            switch(option){
                case 1:
                        resultado=calculadora.suma(op1, op2);
                        System.out.println("El resultado es "+resultado);
                        break;
                case 2:
                        resultado=calculadora.resta(op1, op2);
                        System.out.println("El resultado es "+resultado);
                        break;
                case 3:
                        resultado=calculadora.multiplicacion(op1,op2);
                        System.out.println("El resultado es "+resultado);
                        break;
                case 4:
                        resultado=calculadora.division(op1,op2);
                        System.out.println("El resultado es "+resultado);
                        break;
                case 5: System.out.println("Bye");
                        break;
                default: System.out.println("Opción incorrecta");
            }

        }while(option!=5);
    }


    public static void muestraMenu(){
        System.out.println("1. Para sumar");
        System.out.println("2. Para retar"); 
        System.out.println("3. Para multiplicar"); 
        System.out.println("4. Para dividir");   
        System.out.println("5. Para salir"); 
    }
}
