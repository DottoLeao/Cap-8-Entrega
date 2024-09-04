import java.util.Scanner;

public class TesteFintech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int op;
        do {
            System.out.println("\n\nDigite uma opção:\n1-Executar venda\n2-Calculadora\n0-Encerrar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o valor da sua venda: ");
                    float valorVenda = sc.nextFloat();
                    System.out.println("Selecione a forma de pagamento:\n1-Pix\n2-Credito\n3-Debito\n4-Qr-code");
                    int formaPagamento = sc.nextInt();
                    FormaDePagamento pagamento = null;

                    switch (formaPagamento) {
                        case 1:
                            pagamento = new Pix();
                            break;
                        case 2:
                            pagamento = new Credito();
                            break;
                        case 3:
                            pagamento = new Debito();
                            break;
                        case 4:
                            pagamento = new QrCode();
                            break;
                        default:
                            System.out.println("Forma de pagamento inválida.");
                            break;
                    }

                    if (pagamento != null) {
                        pagamento.realizarPagamento(valorVenda); // Realiza o pagamento imediatamente
                        System.out.print("\n\nVenda realizada!\n\n");
                    }
                    break;
                case 2:
                    calculadora.start();
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}