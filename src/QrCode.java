public class QrCode extends FormaDePagamento {
    @Override
    public void realizarPagamento(float valor) {
        System.out.printf("Pagamento de R$%.2f realizado via QR Code.\n", valor);
        System.out.println("Gerando QR Code:");

        //"QR Code" fictício no terminal
        String qrCode =
                        "█████████████████████████████████████\n" +
                        "██████████████████░░░░░░█████████████\n" +
                        "██████░░░░░░██████░░░░░░████░░░░░░███\n" +
                        "██████░░░░░░██████░░░░░░████░░░░░░███\n" +
                        "██████░░░░░░██████░░░░░░████░░░░░░███\n" +
                        "█████████████████████████████████████\n" +
                        "█████████████████████████████████████\n" +
                        "████░░░░░░██████░░░░░░██████░░░░░░███\n" +
                        "████░░░░░░██████░░░░░░██████░░░░░░███\n" +
                        "████░░░░░░██████░░░░░░██████░░░░░░███\n" +
                        "█████████████████████████████████████\n";

        System.out.println(qrCode);

        System.out.println("Processando...");
        try {
            Thread.sleep(2000); // Simula um atraso no processamento
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pagamento realizado com sucesso!");
    }
}
