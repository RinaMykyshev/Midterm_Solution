package src.Task2;

public class CryptoPayment implements PaymentMethod {
    private String walletAddress;
    private String status = "Pending";

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean processPayment(double amount) {
        boolean paymentSuccess = CryptoAPI.validateWallet(walletAddress);
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
