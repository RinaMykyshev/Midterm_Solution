package src.Task3;

public class CaramelSyrupDecorator extends CoffeeDecorator {
    public CaramelSyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Карамельный сироп";
    }
}