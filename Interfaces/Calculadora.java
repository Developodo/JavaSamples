package Interfaces;

public class Calculadora implements ICalculadora{

    @Override
    public double suma(double a, double b) {
        return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }
    
}
