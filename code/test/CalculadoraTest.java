import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

/* import org.junit.internal.runners.statements.ExpectException; */

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
    public void testeDivisaoZero() {
        System.out.println("Teste divisão por zero");
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class,
                () -> calculadora.divisao(1, 0));

        assertTrue(arithmeticException.getMessage().contains("O denominador não pode ser zero!"));
    }

}