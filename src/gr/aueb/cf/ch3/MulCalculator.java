package gr.aueb.cf.ch3;

public class MulCalculator {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int result;

        result = mul(num1,num2);

        System.out.println("Mul: " + result);
    }

    public static int mul(int a, int b) {
        return a * b;
    }
}
