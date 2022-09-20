package OOPRepetition;

import java.util.Scanner;

public class Frac {

    public int numerator, denominator;

    public Frac(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    Frac sum(Frac a) {
        int myNumerator = this.numerator * a.denominator + a.numerator * this.denominator;
        int myDenominator = this.denominator * a.denominator;
        return new Frac(myNumerator, myDenominator);
    }

    Frac sum(int a) {
        int myNumerator = this.numerator + a * this.denominator;
        return new Frac(myNumerator, this.denominator);
    }

    Frac mult(Frac a) {
        int myNumerator = this.numerator * a.numerator;
        int myDenominator = this.denominator * a.denominator;
        return new Frac(myNumerator, myDenominator);
    }

    Frac mult(int a) {
        int myNumerator = this.numerator * a;
        return new Frac(myNumerator, this.denominator);
    }

    Frac div(int a) {
        int myDenominator = this.denominator * a;
        return new Frac(this.numerator, myDenominator);
    }

    Frac inv() {
        return new Frac(this.denominator, this.numerator);
    }

    boolean isDenumeratorZero() {
        return this.denominator == 0;
    }

    private int gcd(int a, int b) {
        if (b > a) {
            int c = a;
            a = b;
            b = c;
        }
        return b != 0 ? gcd(b, a % b) : a;
    }

    boolean isShorten() {
        return gcd(this.numerator, this.denominator) != 1;
    }

    Frac doShort() {
        int c = gcd(this.numerator, this.denominator);
        int myNumerator = this.numerator / c;
        int myDenominator = this.denominator / c;
        return new Frac(myNumerator, myDenominator);
    }

    int compareTo(Frac a) {
        int first = this.numerator * a.denominator, second = a.numerator * this.denominator;
        return Integer.compare(second, first);
    }

    boolean isEqual(Frac a) {
        return this.compareTo(a) == 0;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b = read.nextInt(), a1 = read.nextInt(), b1 = read.nextInt();
        Frac frac1 = new Frac(a, b), frac2 = new Frac(a1, b1);
        Frac frac3 = frac1.sum(frac2);

        switch (frac1.compareTo(frac2)) {
            case (1):
                System.out.println("Less");
                break;
            case (0):
                System.out.println("Equal");
                break;
            case (-1):
                System.out.println("Bigger");
                break;
        }

        Frac frac4 = (frac3.mult(3)).sum(frac2.inv()).sum(-2);
        System.out.println(frac4);
        System.out.println(frac4.isShorten() ? "YES" : "NO");

        Frac shortfrac4 = frac4.doShort();
        System.out.println(shortfrac4);

        System.out.println(frac3.isEqual(frac4) ? "YES" : "NO");

        System.out.println(frac1);
        System.out.println(frac2);
        System.out.println(frac3);
        System.out.println(frac4);
    }
}