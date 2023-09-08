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
            theSecondEquation.solve();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("________________________________");

        try {
            SquareEquation theThirdEquation = new SquareEquation(1, 0, 4);
            theThirdEquation.solve();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("________________________________");

        try {
            SquareEquation theFourthEquation = new SquareEquation(1, 2, 1);
            theFourthEquation.solve();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}