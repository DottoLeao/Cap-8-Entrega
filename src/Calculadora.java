import java.util.Scanner;

public class Calculadora {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
        return a / b;
    }

    public static void menuCalculadora() {
        System.out.println("Selecione uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int op;
        double num1, num2, result;

        do {
            menuCalculadora();
            op = scanner.nextInt();

            if (op >= 1 && op <= 4) {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();

                switch (op) {
                    case 1:
                        result = soma(num1, num2);
                        System.out.println("Resultado: " + result);
                        break;
                    case 2:
                        result = subtrair(num1, num2);
                        System.out.println("Resultado: " + result);
                        break;
                    case 3:
                        result = multiplicar(num1, num2);
                        System.out.println("Resultado: " + result);
                        break;
                    case 4:
                        result = dividir(num1, num2);
                        System.out.println("Resultado: " + result);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } else if (op != 5) {
                System.out.println("Opção inválida. Por favor, selecione uma opção entre 1 e 5.");
            }

        } while (op != 5);

        System.out.println("\n\nVoltando ao menu principal...");
    }
}
