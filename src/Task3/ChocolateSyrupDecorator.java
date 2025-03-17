package src.Task3;

public class ChocolateSyrupDecorator extends CoffeeDecorator {
    public ChocolateSyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Шоколадный сироп";
    }
}