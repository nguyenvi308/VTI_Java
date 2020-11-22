package assignment_5.exercise1;

import java.util.Scanner;

/**
 * Project: Extra_Assignment_2
 * Package: assignment_5
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 11:26 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class SequenceNumber {
    private int n;
    private int[] arr;
    private static final Scanner input = new Scanner(System.in);

    public SequenceNumber(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void input()
    {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
    }
    public void print()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
