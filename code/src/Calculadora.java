import java.util.List;

public class Calculadora {
    private List<Double> inputs;

    public double soma(double a, double b){
        return a + b;
    }

    public double subtracao(double a, double b){
        return a - b;
    }

    public double multiplicacao(double a, double b){
        return a * b;
    }

    public double divisao(double a, double b){
        
        if(b == 0)
            throw new ArithmeticException("O denominador não pode ser zero!");
        
        return a / b;
    }

}
