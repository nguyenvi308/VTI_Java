package assignment_4.exercise1;

/**
 * Project: Extra_Assignment_2
 * Package: assignment_4.exercise1
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 11:15 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Car {

    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSalePrice()
    {
        return regularPrice;
    }

}
