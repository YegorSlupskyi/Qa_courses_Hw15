package org.example;


public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public String toString() {
        return String.format("%s + %si", real, imaginary);
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiplyBy(Complex other) {
        return new Complex(this.real * other.real - this.imaginary * other.imaginary,
                this.real * other.imaginary + this.imaginary * other.real);
    }

    public Complex getComplementary() {
        return new Complex(real, -imaginary);
    }

    public Complex divideBy(double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Cannot divide by 0");
        }
        return new Complex(real / divisor, imaginary / divisor);
    }

    public Complex divideBy(Complex other) throws Exception {
        if (other.real == 0 && other.imaginary == 0) {
            throw new Exception("Cannot divide by complex 0");
        }
        return this
                .multiplyBy(other.getComplementary())
                .divideBy(Math.pow(other.real, 2) + Math.pow(other.imaginary, 2));
    }

    public boolean equals (Complex other){
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    public boolean equals (double other){
        return this.real == other;
    }

}
