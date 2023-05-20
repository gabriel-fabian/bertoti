package src.main.java.payments;

public class PixPayment {
  public void process(double valor) {
    System.out.println("Processando pagamento via Pix: R$" + valor);
    System.out.println("Pagamento via Pix concluído.");
  }
}
