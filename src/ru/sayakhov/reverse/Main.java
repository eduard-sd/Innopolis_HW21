package ru.sayakhov.reverse;

import java.util.Arrays;

/**
 * Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
 *
 * Вывести массив в консоль до и после вызова метода по реверсу массива
 * */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,10,20,30,40,50};

        System.out.println(Arrays.toString(toReverse(numbers)));
    }

    private static int[] toReverse(int[] list) {
        int[] temp = new int[list.length];
        int length = list.length-1;
        for ( int i = 0; i < list.length ; i++ ) {
            temp[length--] = list[i];
        }
        for ( int i = 0; i < list.length ; i++ ) {
            list[i] = temp[i];
        }
        return list;
    }
}
