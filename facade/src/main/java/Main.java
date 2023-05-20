package src.main.java;

public class Main {
  public static void main(String[] args) {
    PaymentFacade paymentFacade = new PaymentFacade();

    paymentFacade.pay(100.00, "Pix");
    paymentFacade.pay(50.00, "PayPal");
    paymentFacade.pay(75.00, "PagSeguro");
  }
}
