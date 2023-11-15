package aula08.exercicio03.src.test.java;

import aula08.exercicio03.src.main.java.Calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {
//assertEquals - método que recebe como parâmetro o resultado do método que está sendo testado e o resultado
// esperado caso o método testado esteja certo.

    @Test
    public void testAdicao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(9.0, calculadora.adicao(7.0, 2.0), 0.001);
    }

    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8.0, calculadora.subtracao(10.0, 2.0), 0.001);
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(25.0, calculadora.multiplicacao(5.0, 5.0), 0.001);
    }

    @Test
    public void testDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4.0, calculadora.divisao(8.0, 2.0), 0.001);
    }

    @Test(expected = Throwable.class)
    public void testDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.divisao(10.0, 0.0));
    }

    @Test
    public void testRaizQuadrada() {
        Calculadora calculadora = new Calculadora();
        assertEquals(9.0, calculadora.raizQuadrada(81.0), 0.001);
    }

    @Test(expected = Throwable.class)
    public void testRaizQuadradaDeNumeroNegativo() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.raizQuadrada(-2.0));
    }

    @Test
    public void testPotencia() {
        Calculadora calculadora = new Calculadora();
        assertEquals(64.0, calculadora.potencia(2.0, 6.0), 0.001);
    }


}
