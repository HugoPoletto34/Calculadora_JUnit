import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.internal.runners.statements.ExpectException;

public class CalculadoraTest {

    @Test
    public void HelloWorldTest() {
        Calculadora calculadora = new Calculadora();
        System.out.println("Hello World Test");
    }

    @Test
    public void testeSoma() {
        Calculadora calculadora = new Calculadora();

        double esperado = 2;
        double resultado = calculadora.soma(1, 1);

        System.out.println("Teste Soma");
        assertEquals(esperado, resultado, "Resultado de soma não esperado!");

    }

    @Test
    public void testeDivisaoZero() {

        Calculadora calculadora = new Calculadora();

        System.out.println("Teste divisão por zero");
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class,
                () -> calculadora.divisao(1, 0));

        assertTrue(arithmeticException.getMessage().contains("O denominador não pode ser zero!"));

    }

}