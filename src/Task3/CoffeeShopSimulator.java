package src.Task3;

import java.util.Scanner;

public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип кофе (espresso, cappuccino, latte, americano):");
        String coffeeType = scanner.nextLine();

        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);

        while (true) {
            System.out.println("Добавить ингредиент (milk, caramel, whipped cream, chocolate) или введите 'done' для завершения:");
            String ingredient = scanner.nextLine();

            if (ingredient.equalsIgnoreCase("done")) {
                break;
            }

            switch (ingredient.toLowerCase()) {
                case "milk":
                    coffee = new MilkDecorator(coffee);
                    break;
                case "caramel":
                    coffee = new CaramelSyrupDecorator(coffee);
                    break;
                case "whipped cream":
                    coffee = new WhippedCreamDecorator(coffee);
                    break;
                case "chocolate":
                    coffee = new ChocolateSyrupDecorator(coffee);
                    break;
                default:
                    System.out.println("Неизвестный ингредиент");
            }
        }

        System.out.println("Ваш заказ: " + coffee.getDescription());
        System.out.println("Итоговая стоимость: $" + coffee.getCost());
    }
}