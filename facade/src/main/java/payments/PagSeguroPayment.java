package src.main.java.payments;

public class PagSeguroPayment {
  public void makePayment(double valor) {
    System.out.println("Processando pagamento via PagSeguro: R$" + valor);
    System.out.println("Pagamento via PagSeguro concluído.");
  }
}
