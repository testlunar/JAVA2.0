package com.company;
/**
 * @author Diana Umudova
 * Калькулятор
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите первое число");
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        double num1 = Double.parseDouble(s.readLine());
        System.out.println("Введите второе число");
        double num2 = Double.parseDouble(s.readLine());
        System.out.println("Введите оператор:+, -, *, /");
        Scanner reader = new Scanner(System.in);
        char op = reader.next().charAt(0); // для считывания одного символа
        double res=0;
        switch(op) {
            case '+': res = num1 + num2;
                break;
            case '-': res = num1 - num2;
                break;
            case '*': res = num1 * num2;
                break;
            case '/': res = num1 / num2;
                break;
            default:  System.out.printf("Некорректный оператор");
                return;
        }

        System.out.print("Результат = ");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + "%.4f",res);

    }
}
