import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import java.beans.Transient;
import java.util.*;

import org.junit.Test;
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

    public static int mul(int x, int y) {
        // multiplication code
        int y1=0;
        for(int i=0; i<Math.abs(x); i++)
            y1 = x>0 ? y1+y : y1-y;
        return y1;
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
                result = mul(num1, num2);
                break;
            case 4:
                result = div();
                break;
        }

        System.out.println("Result: " + result);

        scan.close();

    }

    @Test
    public void TestAdd() {
        int x = add(2, 4);
        assertEquals(2 + 4, x);
    }

    public boolean testMul(){
        return mul(-3,4)==(int)(-3*4);

    }
}