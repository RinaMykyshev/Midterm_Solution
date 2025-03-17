package src.Task3;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "americano":
                return new Americano();
            default:
                throw new IllegalArgumentException("Неизвестный тип кофе");
        }
    }
}