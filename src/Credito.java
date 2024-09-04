import java.util.Scanner;

public class Credito extends FormaDePagamento {
    @Override
    public void realizarPagamento(float valor) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Pagamento de R$%.2f realizado via Cartão de Crédito.\n", valor);
        System.out.println("Insira seu cartão para realizar a compra...");
        System.out.println("Pressione Enter para continuar...");
        sc.nextLine(); // Espera o usuário pressionar Enter

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
