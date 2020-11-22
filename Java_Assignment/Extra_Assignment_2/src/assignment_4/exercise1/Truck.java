package assignment_4.exercise1;

/**
 * Project: Extra_Assignment_2
 * Package: assignment_4.exercise1
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 11:17 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }


    @Override
    public double getSalePrice() {
        if (weight > 2000)
        {
            return (super.getSalePrice()*0.1);

        }else
        {
            return (super.getSalePrice()*0.2);
        }

    }
}
