package dk.ek.tdd;

import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {

    }

    public int addition(int a, int b) {
        return a+b;
    }
    public int addition(String number){
        String[] stringToNumber = number.split(",");
        int result = 0;
        for (String toNumber : stringToNumber) {
            int nr = Integer.parseInt(toNumber);
            result += nr;
        }

        return result;
    }

    public int subtraction(int i, int i1) {
        return i-i1;
    }

    public int multiplication(int m, int m1) {
    return m*m1;
    }

    public float division(int p, int p1) {
    return p/p1;
    }
}
