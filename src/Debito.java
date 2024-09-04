import java.util.Scanner;

public class Debito extends FormaDePagamento {
    @Override
    public void realizarPagamento(float valor) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Pagamento de R$%.2f realizado via Cartão de Débito.\n", valor);
        System.out.println("Insira seu cartão para realizar a compra...");
        System.out.println("Pressione Enter para continuar...");
        sc.nextLine();

        // Simulação de processamento do cartão
        System.out.println("Processando...");
        try {
            Thread.sleep(2000); // Simula um atraso no processamento
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pagamento realizado com sucesso!");
    }
}
