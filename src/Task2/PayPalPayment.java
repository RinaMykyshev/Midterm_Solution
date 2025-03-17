package src.Task2;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;
    private String status = "Pending";

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean processPayment(double amount) {
        boolean paymentSuccess = PayPalAPI.authenticate(email, password);
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