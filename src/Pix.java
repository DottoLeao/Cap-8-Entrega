public class Pix extends FormaDePagamento {
    @Override
    public void realizarPagamento(float valor) {
        System.out.printf("Pagamento de R$%.2f realizado via Pix.\n", valor);
    }
}
