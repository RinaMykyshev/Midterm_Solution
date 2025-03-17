package src.Task2;

public class ExternalCreditCardAPI {
    public static boolean validateCard(String cardNumber, String expiryDate, String cvv) {
        return cardNumber.length() == 16 && expiryDate.matches("\\d{2}/\\d{2}") && cvv.length() == 3;
    }
}