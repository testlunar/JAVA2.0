package com.company;
/**
 * @author Diana Umudova
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 * 3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class hw3 {

    public static void main(String[] args) throws IOException {
        System.out.println("Выберите код программы: калькулятор - 1, самое длинное слово - 2");
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int program = Integer.parseInt(s.readLine());
        if (program == 1) {
            System.out.println("Программа Калькулятор");
            System.out.println("Введите первое число");
            double num1 = Double.parseDouble(s.readLine());
            System.out.println("Введите второе число");
            double num2 = Double.parseDouble(s.readLine());
            System.out.println("Введите оператор:+, -, *, /");
            Scanner reader = new Scanner(System.in);
            char op = reader.next().charAt(0); // для считывания одного символа
            double res = 0;
            switch (op) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                default:
                    System.out.printf("Некорректный оператор");
                    return;
            }

            System.out.print("Результат = ");
            System.out.printf(num1 + " " + op + " " + num2 + " = " + "%.4f", res);

        }
        if (program == 2) {
            System.out.println("Программа - самое длинное слово в массиве");
            System.out.println("Введите размер массива");
            int size = Integer.parseInt(s.readLine());
            String[] list = new String[size];
            System.out.println("Введите "+ size+ "слов в массив");

            for (int i = 0; i < size; i++) {
                String word = s.readLine();
                list[i] = word;
            }
            int max = 0;
            for (int i = 0; i < size; i++) {   // вычисляем максимум символов в переменной
                if (list[i].length() > max) {
                    max = list[i].length();
                }
            }
            for (int i = 0; i < size; i++) {
                if (list[i].length() == max) {  //вычисляем у какого слова количество символов равно max
                    System.out.println("Самое длинное слово: "+ list[i]);
                }
            }
        }
    }
}
