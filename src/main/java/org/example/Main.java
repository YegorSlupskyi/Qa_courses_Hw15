package org.example;

public class Main {

    public static void main(String[] args) {
        try {
            SquareEquation theFirstEquation = new SquareEquation( 0, 6, 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("________________________________");

        try {
            SquareEquation theSecondEquation = new SquareEquation(1, -7, 10);
            printSquareEquationRoots(theSecondEquation.solve());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("________________________________");

        try {
            SquareEquation theThirdEquation = new SquareEquation(1, 0, 4);
            printSquareEquationRoots(theThirdEquation.solve());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("________________________________");

        try {
            SquareEquation theFourthEquation = new SquareEquation(1, 2, 1);
            printSquareEquationRoots(theFourthEquation.solve());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printSquareEquationRoots(Complex[] roots) {
        if (roots.length == 0) {
            return;
        }

        if (roots.length == 1) {
            System.out.println(String.format("x = %s", roots[0].toString()));
        }

        if (roots.length == 2) {
            System.out.println(String.format("x1 = %s", roots[0].toString()));
            System.out.println(String.format("x = %s", roots[1].toString()));
        }
    }
}