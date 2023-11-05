package org.example.Calculadora;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculadoraTest {

    private Calculadora calculadora;
    @BeforeEach
    public void instanciaCalculadora(){
        this.calculadora = new Calculadora();
    }
    @Test
    public void verificaValorRetonardoMetodoSoma(){
        //Calculadora calculadora = new Calculadora();

        double valorSoma = calculadora.somar(-3,2);
        Assertions.assertEquals(-1, valorSoma);
    }

    @Test
    public void verificaValorRetornadoMetodoSubtrair(){
        //Calculadora calculadora = new Calculadora();

        double valorSubtracao = calculadora.subtrair(-7, 3);
        Assertions.assertEquals(-10, valorSubtracao);
    }

    @Test
    public void verificaValorRetornadoMetodoMultiplicar(){
        //Calculadora calculadora = new Calculadora();

        double valorMultiplicacao = calculadora.multiplicar(5,-2);
        Assertions.assertEquals(-10, valorMultiplicacao);
    }

    @Test
    public void verificaValorRetornadoMetodoDividir(){

        try{
            double valorDivisao = calculadora.dividir(0, -10);
            Assertions.assertEquals(1, valorDivisao);

        }catch(ArithmeticException msgExcp){
            //Assertions.fail("Divisão por 0 não é permitida");
        }

    }

    @ParameterizedTest
    @CsvSource({
            "3, 3 , 3,0 = 3,0",
            "2, 1, 2,0 é maior que 1",
            "-4, -3, -3 é maior que -4",
            "0,0, 0 = 0"

    })
    public void verificaValorRetornadoMetodoComparaValor(){
        //Calculadora calculadora = new Calculadora();

        String valorComparado = calculadora.comparaValor(3,3);
        Assertions.assertEquals("3,0 = 3,0", valorComparado);
    }

    @ParameterizedTest
    @CsvSource({ "2,true", "3,false", "10,true", "-5,false" })
    public void verificaValorRetornadoMetodoNumeroPar(int numero, boolean expectedResult) {
        boolean valorNumeroPar = calculadora.numeroPar(numero);
        Assertions.assertEquals(expectedResult, valorNumeroPar);
    }
}
