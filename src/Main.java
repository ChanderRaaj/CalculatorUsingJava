import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long value1, value2;
        int value;
        System.out.println("------ Welcome to Calculator -------");
        System.out.println("Enter Any Number \n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Multiplication\n" +
                "4 - Divide\n");

        value = input.nextInt();

        switch (value) {
            case 1:
                System.out.println("You Choose : " + value + " For Addition\n");
                System.out.println("Enter Num1: ");
                value1 = input.nextLong();
                System.out.println("Enter Num2: ");
                value2 = input.nextLong();
                long add = value1 + value2;
                System.out.println("Addition of (Num1 = " + value1 + ") and (Num2 = " + value2 + ") is = " + add);
                break;
            case 2:
                System.out.println("You Choose : " + value + " For Subtraction\n");
                System.out.println("Enter Num1: ");
                value1 = input.nextLong();
                System.out.println("Enter Num2: ");
                value2 = input.nextLong();
                long sub = value1 - value2;
                System.out.println("Subtraction of (Num1 = " + value1 + ") and (Num2 = " + value2 + ") is = " + sub);
                break;
            case 3:
                System.out.println("You Choose : " + value + " For Multiplication\n");
                System.out.println("Enter Num1: ");
                value1 = input.nextLong();
                System.out.println("Enter Num2: ");
                value2 = input.nextLong();
                long mul = value1 * value2;
                System.out.println("Multiplication of (Num1 = " + value1 + ") and (Num2 = " + value2 + ") is = " + mul);
                break;
            case 4:
                System.out.println("You Choose : " + value + " For Division \n");
                System.out.println("Enter Num1: ");
                value1 = input.nextLong();
                System.out.println("Enter Num2: ");
                value2 = input.nextLong();
                long div = value1 / value2;
                System.out.println("Division of (Num1 = " + value1 + ") and (Num2 = " + value2 + ") is = " + div);
                break;
            default:
                System.out.println("You Entered Invalid Number: ");
                break;
        }
    }
}