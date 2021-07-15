import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Main {
    // создаем логгер log4j
    private static final Logger log = LogManager.getLogger(Main.class);

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // записываем логи действий пользователя
        log.info("Program started");

        System.out.println("Enter the numbers separated by a space: ");

        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();


        switch (operation) {
            case '+':
                System.out.println(getSum(operand1, operand2));
                log.info("Adding");
                break;
            case '-':
                System.out.println(getSub(operand1, operand2));
                break;
            case '*':
                System.out.println(getMultipl(operand1, operand2));
                log.info("Multiplication");
                break;
            case '/':
                System.out.println(getDivide(operand1, operand2));
                break;
            default:
                System.out.println("Invalid operator!");
                log.error("Invalid operator!");
        }
        log.info("Program finished\n");
    }


    public static int getSum(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public static int getSub(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public static int getMultipl(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public static int getDivide(int operand1, int operand2) {
        if (operand2 == 0) {
            System.out.println("Division by zero!");
            log.fatal("Division by zero!");
            return 0;
        } else {
            log.info("Division");
            return operand1 / operand2;

        }


    }
}


