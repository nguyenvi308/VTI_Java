package assignment_4.exercise1;

/**
 * Project: Extra_Assignment_2
 * Package: assignment_4.exercise1
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 11:20 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        // Get sale price from car then subtract by manufacturerDiscount
        return (super.getSalePrice() - manufacturerDiscount);
    }

}
