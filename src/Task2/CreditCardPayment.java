package src.Task2;


public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String status = "Pending";

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        boolean paymentSuccess = ExternalCreditCardAPI.validateCard(cardNumber, expiryDate, cvv);
        if (paymentSuccess) {
            status = "Completed";
            return true;
        } else {
            status = "Failed";
            return false;
        }
    }

    @Override
    public String getStatus() {
        return status;
    }
}