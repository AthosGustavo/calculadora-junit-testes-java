package org.example.Calculadora;

public class Calculadora {

    private double a;
    private double b;

    public double somar(double a, double b){
        return a + b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b){
        if(a == 0){
            throw new ArithmeticException("Divisão por 0 não é permitida");//lanca a excecaao
        }else{
            return a / b;
        }

    }

    public String comparaValor(double a, double b){
        if(a > b){
            String msg = String.format("%.1f é maior que %.1f",a,b);
            return msg;
        }else if(a == b){
            String msg = String.format("%.1f = %.1f",b,a);
            return msg;
        }else{
            String msg = String.format("%.1f é maior que %.1f",b,a);
            return msg;
        }

    }

    public boolean numeroPar(int a){
        int parOuImpar = a % 2;
        if(parOuImpar == 0){
            return true;
        }else{
            return false;
        }
    }
}
