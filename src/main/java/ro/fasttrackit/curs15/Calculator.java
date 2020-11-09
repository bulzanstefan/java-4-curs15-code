package ro.fasttrackit.curs15;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public String divString(int a, int b) {
        if (b != 0) {
            return a / b + " rest: " + a % b;
        } else {
            return "NaN";
        }
    }
}
