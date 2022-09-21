import java.util.Scanner;

// Basic calculator

public class Calc {

    // Methods
    public static int add(int x, int y) {
        // addition code
        return x + y;
    }

    public static int sub() {
        // subtraction code
        return 0;
    }

    public static int mul() {
        // multiplication code
        return 0;
    }

    public static int div() {
        // division code
        return 0;
    }

    public static void main(String args[]) {
        // initialize Scanner
        Scanner scan = new Scanner(System.in);

        // control variables
        int result = 0;
        int num1;
        int num2;
        int sel;

        System.out.println("Enter your first number: ");
        num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        num2 = scan.nextInt();

        System.out.println("Select an operation:\n[1] ADD\n[2] SUB\n[3] MUL\n[4] DIV\nSelection: ");
        sel = scan.nextInt();

        switch (sel) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub();
                break;
            case 3:
                result = mul();
                break;
            case 4:
                result = div();
                break;
        }

        System.out.println("Result: " + result);

        scan.close();
    }
}