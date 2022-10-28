import java.sql.SQLOutput;

public class Calculator {

    public void calculator() {

    }
    public int add(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }
    public int subtract(int a, int b) {
        int diff = 0;
        diff = a - b;
        return diff;
    }

    public int multiply(int a, int b) {
        int product = 0;
        product = a * b;
        return product;
    }

    public int divide(int a, int b) {
        int div = a / b;
        return div;
    }

    public int modulo(int a, int b) {
        int mod = a % b;
        return mod;
    }
    public String toString() {
        return "The final value is " + add(8,0) + " with addition and " + subtract(23,12) + " with subtraction";
    }



    public static void main(String[] args) {
//        Calculator myCalc = new Calculator();
//        System.out.println(myCalc.add(5,7));
//        System.out.println(myCalc.subtract(45,11));
//        System.out.println(myCalc);
//
//        Calculator myCalc1 = new Calculator();
//        System.out.println(myCalc1);
        }

    }


