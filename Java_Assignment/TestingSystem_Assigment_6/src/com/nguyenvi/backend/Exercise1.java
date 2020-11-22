package com.nguyenvi.backend;

import com.nguyenvi.entity.QLCB;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        int[] numbers = { -1, 1, 3, 5, -5, -8 };
        int maxValue = getMaxValue(numbers);
        int minValue = getMinValue(numbers);

        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);
        // question 1. Value at 4
        // question 2
        // question 3
        System.out.println("Max Value In Correct Version: " + getMaxValueCorrect(numbers));
        System.out.println("Min Value In Correct Version: " + getMinValueCorrect(numbers));
         */
        question1_2();
    }

    // Error Version
    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < maxValue) {
                maxValue = numbers[i];
            }
            if (i == 4)
            {

                System.out.println("Value at 4 is: " + numbers[i]);
                System.out.println("Set max value = 5 ");
                maxValue = 5;

            }
        }
        return maxValue;
    }
    public static int getMaxValueCorrect(int[] numbers)
    {
        int max = numbers[0];
        for (int i = 1; i< numbers.length ; i++)
        {
            if (max < numbers[i])
            {
                max = numbers[i];
            }
        }
        return max;
    }

    //  Error Version
    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
    public static int getMinValueCorrect(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
           if (numbers[i] < minValue)
           {
               minValue = numbers[i];
           }
        }
        return minValue;
    }
    public static void question1_2() {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        System.out.println("Mời bạn nhập vào chức năng muốn dùng\n" +
                "1.Thêm mới cán bộ\n" +
                "2.Tìm kiếm theo họ tên\n"
                + "3.Hiện thị thông tin về danh sách các cán bộ.\n"
                + "4.Nhập vào tên của cán bộ và delete cán bộ đó\n"
                + "5.Thoát khỏi chương trình.");


        while (true) {
            // Correction Version

            System.out.print("Mời bạn chọn chức năng: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    qlcb.addCanBo();
                    break;
                case 2:
                    qlcb.findByName();
                    break;
                case 3:
                    qlcb.printListCanBo();
                    break;
                case 4:
                    qlcb.deleteCanBo();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Bạn đã nhập sai. Bạn chỉ được nhập từ 1 tới 5 thôi!");
                    break;
            }
        }
    }

}
