package src.Task2;

public interface PaymentMethod {
    boolean processPayment(double amount);
    String getStatus();
}