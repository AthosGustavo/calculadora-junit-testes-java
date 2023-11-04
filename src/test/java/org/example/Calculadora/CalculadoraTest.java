package org.example.Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void verificaValorRetonardoMetodoSoma(){
        Calculadora calculadora = new Calculadora();

        double valorSoma = calculadora.somar(-3,2);
        Assertions.assertEquals(-1, valorSoma);
    }

    @Test
    public void verificaValorRetornadoMetodoSubtrair(){
        Calculadora calculadora = new Calculadora();

        double valorSubtracao = calculadora.subtrair(-7, 3);
        Assertions.assertEquals(-10, valorSubtracao);
    }

    @Test
    public void verificaValorRetornadoMetodoMultiplicar(){
        Calculadora calculadora = new Calculadora();

        double valorMultiplicacao = calculadora.multiplicar(5,-2);
        Assertions.assertEquals(-10, valorMultiplicacao);
    }

    @Test
    public void verificaValorRetornadoMetodoDividir(){
        Calculadora calculadora = new Calculadora();

        double valorDivisao = calculadora.dividir(-10, -10);
        Assertions.assertEquals(1, valorDivisao);
    }

    @Test
    public void verificaValorRetornadoMetodoComparaValor(){
        Calculadora calculadora = new Calculadora();

        String valorComparado = calculadora.comparaValor(3,3);
        Assertions.assertEquals("3,0 = 3,0", valorComparado);
    }

    @Test
    public void verificaValorRetornadoMetodonNumeroPar(){
        Calculadora calculadora = new Calculadora();

        boolean valorNumeroPar = calculadora.numeroPar(5);
        Assertions.assertFalse(valorNumeroPar);
    }

}
