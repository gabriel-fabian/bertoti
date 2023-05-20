package src.main.java.payments;

public class PayPalPayment {
  public void executePayment(double valor) {
    System.out.println("Processando pagamento via PayPal: R$" + valor);
    System.out.println("Pagamento via PayPal concluído.");
  }
}
