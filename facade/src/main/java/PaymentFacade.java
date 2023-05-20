package src.main.java;

import src.main.java.payments.*;

public class PaymentFacade {
  private PixPayment pixPayment;
  private PayPalPayment payPalPayment;
  private PagSeguroPayment pagSeguroPayment;

  public PaymentFacade() {
    pixPayment = new PixPayment();
    payPalPayment = new PayPalPayment();
    pagSeguroPayment = new PagSeguroPayment();
  }

  public void pay(double value, String paymentMethod) {
    switch (paymentMethod) {
      case "Pix":
        pixPayment.process(value);
        break;
      case "PayPal":
        payPalPayment.executePayment(value);
        break;
      case "PagSeguro":
        pagSeguroPayment.makePayment(value);
        break;
      default:
        System.out.println("Método de pagamento inválido.");
    }
  }
}
