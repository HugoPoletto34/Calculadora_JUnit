import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora;

	@BeforeEach
	void setUp() throws Exception {
		calculadora = new Calculadora();
	}

    @Test
    public void HelloWorldTest() {
        System.out.println("Hello World Test");
    }

    @Test
    public void testeSoma() {
        double esperado = 2;
        double resultado = calculadora.soma(1, 1);

        System.out.println("Teste Soma");
        assertEquals(esperado, resultado, "Resultado de soma não esperado!");
    }

    @Test
    public void testeSubtracao() {
        double esperado = 1.9;
        double resultado = calculadora.subtracao(5.5, 3.6);

        System.out.println("Teste Subtração");
        assertEquals(esperado, resultado, "Resultado de subtração não esperado!");
    }

    @Test
    public void testeDivisao() {
        double esperado = 6.8;
        double resultado = calculadora.divisao(34, 5);

        System.out.println("Teste Divisão");
        assertEquals(esperado, resultado, "Resultado de divisão não esperado!");
    }

    @Test
    public void testeMultiplicacao() {
        double esperado = 143;
        double resultado = calculadora.multiplicacao(13, 11);

        System.out.println("Teste Multiplicação");
        assertEquals(esperado, resultado, "Resultado de multiplicacao não esperado!");
    }

    @Test
    public void testeDivisaoZero() {
        System.out.println("Teste divisão por zero");
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class,
                () -> calculadora.divisao(1, 0));

        assertTrue(arithmeticException.getMessage().contains("O denominador não pode ser zero!"));
    }

}