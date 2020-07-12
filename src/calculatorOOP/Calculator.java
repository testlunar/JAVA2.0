package calculatorOOP;
/**
 * @author Diana Umudova
 * Калькулятор ООП
 */

import static calculatorOOP.GetData.getInt;
import static calculatorOOP.GetData.getOperator;

public class Calculator {


    public static void main(String[] args) {

        int num1 = getInt();
        int num2 = getInt();
        char operator = getOperator();

        try {
            switch (operator) {
                case '+':
                    System.out.println("Результат = "+num1 + " " + operator + " " + num2 + " = "+(num1 + num2));
                    break;
                case '-':
                    System.out.println("Результат = "+num1 + " " + operator + " " + num2 + " = "+(num1 - num2));
                    break;
                case '*':
                    System.out.println("Результат = "+num1 + " " + operator + " " + num2 + " = "+(num1 * num2));
                    break;
                case '/':
                    System.out.println("Результат = "+num1 + " " + operator + " " + num2 + " = "+(num1 / num2));
                    break;
                default:
                    return;
            }

        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Нельзя делить на ноль!");
        }
    }
}


