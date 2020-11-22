package assignment_4.exercise1;

/**
 * Project: Extra_Assignment_2
 * Package: assignment_4.exercise1
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 11:22 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return (super.getRegularPrice() * 0.05);
        }else
        {
            return (super.getRegularPrice()*0.1);
        }
    }
}
