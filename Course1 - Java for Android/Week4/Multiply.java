package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int num1 = 0;
    private int num2 = 0;

    //constructor
    public Multiply(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    //prints out result
    public String toString() {
        return String.valueOf(num1 * num2);
    }
}
