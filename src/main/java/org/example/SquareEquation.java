package org.example;

public class SquareEquation {
    private final double leadingCoefficient;
    private final double linearCoefficient;
    private final double constantTerm;

    public SquareEquation(double a, double b, double c) throws Exception {
        if (a == 0) {
            throw new Exception("The leading coefficient cannot be double 0");
        }
        this.leadingCoefficient = a;
        this.linearCoefficient = b;
        this.constantTerm = c;
    }

    public Complex[] solve() {
        double D = Math.pow(linearCoefficient, 2) - 4 * leadingCoefficient * constantTerm;
        if (D < 0) {
            Complex x1 = new Complex(-linearCoefficient / (2 * leadingCoefficient), Math.sqrt(-D) / (2 * leadingCoefficient));
            Complex x2 = new Complex(-linearCoefficient / (2 * leadingCoefficient), -Math.sqrt(-D) / (2 * leadingCoefficient));
            return new Complex[]{x1, x2};
        } else if (D > 0) {
            double x1 = -linearCoefficient / (2 * leadingCoefficient) + Math.sqrt(D) / (2 * leadingCoefficient);
            double x2 = -linearCoefficient / (2 * leadingCoefficient) - Math.sqrt(D) / (2 * leadingCoefficient);
            return new Complex[]{new Complex(x1), new Complex(x2)};
        } else {
            double x = -linearCoefficient / (2 * leadingCoefficient);
            return new Complex[]{new Complex(x)};
        }
    }


}
