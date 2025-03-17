package src.Task2;

public class PaymentFactory {
    public static PaymentMethod createPayment(String type, String... details) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(details[0], details[1], details[2]);
            case "paypal":
                return new PayPalPayment(details[0], details[1]);
            case "crypto":
                return new CryptoPayment(details[0]);
            default:
                throw new IllegalArgumentException("Неизвестный метод оплаты");
        }
    }
}