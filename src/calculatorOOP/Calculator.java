package calculatorOOP;
/**
 * @author Diana Umudova
 * Калькулятор ООП
 */

import java.io.IOException;
import static calculatorOOP.GetData.getInt;
import static calculatorOOP.GetData.getOperator;

public class Calculator {


    public static void main(String[] args) throws IOException {
        double num1 = getInt();
        double num2 = getInt();
        char operator = getOperator();
        double result = calculate(num1, num2, operator);
        System.out.print("Результат = ");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + "%.2f", result);


    }

    private static double calculate(double num1, double num2, char operator) {
        double res = 0;
        switch (operator) {
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
                System.out.printf("Некорректный оператор!\n");
               res= calculate(num1,num2,getOperator());

        }
        return res;
    }
}

