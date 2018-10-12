import java.text.DecimalFormat;

class Complex {
    public double re;
    public double img;
    public static DecimalFormat df = new DecimalFormat();
    static {
        df.setMaximumFractionDigits(8);
    }

    Complex(double re, double img) {
        this.re = re;
        this.img = img;
    }

    public String toString() {
        
        return String.format("%s + %si", df.format(this.re), df.format(this.img));
    }
}

public class Methods {
    public static Complex[] solveQuadratic(double a, double b, double c) {
        double denominator = 2*a;
        double discriminant = b*b - 4*a*c;
        double f1 = -b / denominator;
        double f2 = Math.sqrt(Math.abs(discriminant)) / denominator;
        Complex[] solutions = new Complex[2];
        if (discriminant > 0) {
            solutions = new Complex[]{new Complex(f1 + f2, 0), new Complex(f1 - f2, 0)};
        } else {
            solutions = new Complex[]{new Complex(f1, f2), new Complex(f1, -f2)};
        }
        return solutions;
    }   
    public static void main(String[] args) {
        //Ex16
        Complex[] solutions = solveQuadratic(6, 0, 2);
        System.out.println(solutions[0].toString());
        System.out.println(solutions[1].toString());
    }
}