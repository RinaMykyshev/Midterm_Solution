package src.Task2;

public class CryptoAPI {
    public static boolean validateWallet(String walletAddress) {
        return walletAddress.startsWith("0x") && walletAddress.length() == 42;
    }
}