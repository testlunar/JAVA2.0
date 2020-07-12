package calculatorOOP;
/**
 * @author Diana Umudova
 * Калькулятор ООП
 */
import java.util.Scanner;
public class GetData {


    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        Scanner reader = new Scanner(System.in);
        try {
          num = reader.nextInt();
        } catch (Exception y) {
            System.out.println("Вы ввели не число!");
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
            System.out.println("Не верный оператор!");
            operator = getOperator();
        }
        return operator;

    }
}



