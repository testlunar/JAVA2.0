package com.company;

import java.io.IOException;
import java.util.Arrays;

public class hw4 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
        }
                System.out.print("Изначальный массив: "+Arrays.toString(array));
                System.out.println(" ");

            int max = 0;
            for ( int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    max = array[i];
                    break;
                }
            }
            for (int i=0; i < array.length; i++) {
                if (array[i] < 0 && array[i] > max)
                    max = array[i];
            }
            if (max == 0)
                System.out.println("Отрицательных элементов не найдено");
            else
                System.out.println("Максимально отрицательное число в массиве: "+max);
        int min = 0;
        for ( int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                min = array[i];
                break;
            }
        }
        for (int i=0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < min)
                min = array[i];
        }
        if (min == 0)
            System.out.println("Положительных элементов не найдено");
        else
            System.out.println("Минимально положительное число в массиве: "+min);
        int minnum=0;
        int maxnum=0;
        for (int i=0; i< array.length;i++) {
            if (array[i] == max) {
                maxnum = i;

            }
            if (array[i] == min) {
                minnum = i;
            }
        }
        array[maxnum]= min;
        array[minnum]=max;
        System.out.print("Измененный массив: "+Arrays.toString(array));
        }

    }


