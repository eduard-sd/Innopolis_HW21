package ru.sayakhov.shiftelement;

import java.util.Arrays;

public class ShiftElement {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500}};
        int[] nums = {7, 9, 0};


        System.out.println(Arrays.toString(toLeft(nums)));
        System.out.println(Arrays.toString(toLeft(nums)));
        System.out.println(Arrays.toString(toLeft(nums)));

        toLeft2(numbers);
        toLeft2(numbers);
        toLeft2(numbers);
        toLeft2(numbers);
        toLeft2(numbers);

        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.print(Arrays.toString(numbers[i]));
        }
    }

    private static int[] toLeft(int[] numbers) {
        int numberArrayLength = numbers.length;
        for ( int i = 0; i < numberArrayLength; i++ ) {
            if (numbers[i] != 0 && i != numberArrayLength - 1) {
                numbers[i] = numbers[i + 1];
            } else {
                numbers[i] = 0;
            }

        }
        return numbers;
    }

    private static int[][] toLeft2(int[][] numbers) {
        for ( int element = 0; element < numbers.length; element++ ) {
            numbers[element] = toLeft(numbers[element]);
        }
        return numbers;
    }

}
