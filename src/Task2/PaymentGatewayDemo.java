package src.Task2;

import java.util.Scanner;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите метод оплаты (creditcard, paypal, crypto):");
        String paymentType = in.nextLine().trim().toLowerCase();

        PaymentMethod paymentMethod = null;

        switch (paymentType) {
            case "creditcard":
                System.out.println("Введите номер карты, срок действия и CVV (через пробел):");
                String[] cardDetails = in.nextLine().split(" ");
                if (cardDetails.length != 3) {
                    System.out.println("Ошибка: неверное количество данных.");
                    return;
                }
                paymentMethod = PaymentFactory.createPayment("creditcard", cardDetails[0], cardDetails[1], cardDetails[2]);
                break;

            case "paypal":
                System.out.println("Введите email и пароль (через пробел):");
                String[] paypalDetails = in.nextLine().split(" ");
                if (paypalDetails.length != 2) {
                    System.out.println("Ошибка: неверное количество данных.");
                    return;
                }
                paymentMethod = PaymentFactory.createPayment("paypal", paypalDetails[0], paypalDetails[1]);
                break;

            case "crypto":
                System.out.println("Введите адрес кошелька:");
                String walletAddress = in.nextLine().trim();
                paymentMethod = PaymentFactory.createPayment("crypto", walletAddress);
                break;

            default:
                System.out.println("Неизвестный метод оплаты");
                return;
        }

        System.out.println("Введите сумму платежа:");
        double amount = in.nextDouble();

        boolean paymentSuccess = paymentMethod.processPayment(amount);
        if (paymentSuccess) {
            System.out.println("Платеж успешно обработан. Статус: " + paymentMethod.getStatus());
        } else {
            System.out.println("Платеж не удался. Статус: " + paymentMethod.getStatus());
        }

        in.close();
    }
}