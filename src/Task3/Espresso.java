package src.Task3;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Эспрессо";
    }
}