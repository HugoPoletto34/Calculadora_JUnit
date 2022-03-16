import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Teste Calculadora ");

        Calculadora c = new Calculadora();

        Scanner menu = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.print("\n\nCalculadora\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Soma              |\n");
            System.out.print("| Opção 2 - Subtração         |\n");
            System.out.print("| Opção 3 - Multiplicação     |\n");
            System.out.print("| Opção 4 - Divisão           |\n");
            System.out.print("| Opção 0 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            opcao = menu.nextInt();

            double a;
            double b;

            switch (opcao) {
                case 1:
                    System.out.print("\nInsira os valores para soma:\n");
                    System.out.print("Valor 1: ");
                    a = menu.nextDouble();
                    System.out.print("Valor 2: ");
                    b = menu.nextDouble();
                    System.out.print(a + " + " + b + " = " + c.soma(a, b));
                    break;

                case 2:
                    System.out.print("\nInsira os valores para subtração:\n");
                    System.out.print("Valor 1: ");
                    a = menu.nextDouble();
                    System.out.print("Valor 2: ");
                    b = menu.nextDouble();
                    System.out.print(a + " - " + b + " = " + c.subtracao(a, b));
                    break;

                case 3:
                    System.out.print("\nInsira os valores para multiplicação:\n");
                    System.out.print("Valor 1: ");
                    a = menu.nextDouble();
                    System.out.print("Valor 2: ");
                    b = menu.nextDouble();
                    System.out.print(a + " x " + b + " = " + c.multiplicacao(a, b));
                    break;

                case 4:
                    System.out.print("\nInsira os valores para divisão:\n");
                    System.out.print("Valor 1: ");
                    a = menu.nextDouble();
                    System.out.print("Valor 2: ");
                    b = menu.nextDouble();
                    System.out.print(a + " / " + b + " = " + c.divisao(a, b));
                    break;

                default:
                    break;
            }
        }

        if (opcao == 0) {
            System.out.print("\nAté logo!");
            menu.close();
        }

    }
}
