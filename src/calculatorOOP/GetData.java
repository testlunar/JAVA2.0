package calculatorOOP;
/**
 * @author Diana Umudova
 * Калькулятор ООП
 */
import java.util.Scanner;
public class GetData {


    public static double getInt() {
        System.out.println("Введите число:");
        double num;
        Scanner reader = new Scanner(System.in);
        if (reader.hasNextDouble()) {
            num = reader.nextDouble();
        } else {
            System.out.println("Вы ввели не число! Введите еще раз: ");
            reader.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperator() {
        System.out.println("Введите оператор: +, -, *, / ");
        Scanner reader = new Scanner(System.in);
        char operator=reader.next().charAt(0);
        if(operator=='+'||operator=='-'||operator=='/'||operator=='*') {
            return operator;
        }else {
            System.out.println("Не верный оператор!\n");
            operator = getOperator();
        }
        return operator;

    }
}



