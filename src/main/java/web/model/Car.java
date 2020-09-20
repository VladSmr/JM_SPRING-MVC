package web.model;

public class Car {

    private String name;
    private int maxSpeed;
    private int price;

    public Car(String name, int maxSpeed, int price) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car: " +
                "name = " + name +
                ", maxSpeed = " + maxSpeed +
                ", price = " + price;
    }
}