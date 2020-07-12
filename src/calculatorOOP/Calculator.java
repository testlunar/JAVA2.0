package calculatorOOP;
/**
 * @author Diana Umudova
 * Калькулятор ООП
 */

import static calculatorOOP.GetData.getDouble;
import static calculatorOOP.GetData.getOperator;

public class Calculator {


    public static void main(String[] args) throws Exception{

        double num1 = getDouble();
        double num2 = getDouble();
        char operator = getOperator();

        try {
            switch (operator) {
                case '+':
                    System.out.printf("Результат = "+num1 + " " + operator + " " + num2 + " = "+"%.2f",(num1 + num2));
                    break;
                case '-':
                    System.out.printf("Результат = "+num1 + " " + operator + " " + num2 + " = "+"%.2f",(num1 - num2));
                    break;
                case '*':
                    System.out.printf("Результат = "+num1 + " " + operator + " " + num2 + " = "+"%.2f",(num1 * num2));
                    break;
                case '/':
                    if (num2==0){
                        throw new Exception("Нельзя делить на ноль");
                    }
                    System.out.printf("Результат = "+num1 + " " + operator + " " + num2 + " = "+"%.2f",(num1 / num2));
                    break;
                default:
                    return;
            }

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}


