package org.example;

public class SquareEquation {
    private final double a;
    private final double b;
    private final double c;

    public SquareEquation(double a, double b, double c) throws Exception {
        if (a == 0) {
            throw new Exception("The leading coefficient cannot be double 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // i = sqrt(-1)
    // sqrt(ab) = sqrt(a)sqrt(b)
    // sqrt(D) = sqrt(-1 * -D) = sqrt(-1)*sqrt(-D) = isqrt(-D)
    //x1 = (-b + sqrt(D))/2a = -b/2a + sqrt(D)/2a = -b/2a + isqrt(-D)/2a

    public Complex[] solve() {
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D < 0) {
            Complex x1 = new Complex(-b / (2 * a), Math.sqrt(-D) / (2 * a));
            Complex x2 = new Complex(-b / (2 * a), -Math.sqrt(-D) / (2 * a));
            System.out.println(String.format("x1 = %s", x1.toString()));
            System.out.println(String.format("x2 = %s", x2.toString()));
            return new Complex[]{x1, x2};
        } else if (D > 0) {
            double x1 = -b / (2 * a) + Math.sqrt(D) / (2 * a);
            double x2 = -b / (2 * a) - Math.sqrt(D) / (2 * a);
            System.out.println(String.format("x1 = %s", x1));
            System.out.println(String.format("x2 = %s", x2));
            return new Complex[]{new Complex(x1), new Complex(x2)};
        } else {
            double x = -b / (2 * a);
            System.out.println(String.format("x = %s", x));
            return new Complex[]{new Complex(x)};
        }
    }


}
