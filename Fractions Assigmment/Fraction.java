
public class Fraction
{
    // instance variables - replace the example below with your own
    private int n;
    private int d;

    public Fraction()
    {
        // initialise instance variables
        this.n = 1;
        this.d = 2;
    }

    public Fraction(int n, int d) {
        this.n = n;
        if (d == 0) {
            System.out.println("Error");
            d = 1;
        } else {
            this.d = d;
        }
    }

    public Fraction(String f) {
        int divideIndex = f.indexOf("/");
        String num = f.substring (0, divideIndex);
        String den = f.substring (divideIndex + 1);
        if (den.equals("0")) {
            System.out.println("Error");
            den = "1";
        }
        this.n = Integer.parseInt(num);
        this.d = Integer.parseInt(den);

    }

    public Fraction (Fraction f) {
        this.n = f.n;
        this.d = f.d;
    }

    public int getNum() {
        return this.n;
    }

    public int getDemon() {
        return this.d;
    }

    public String toString() {
        return n + "/" + d;
    }

    public double toDouble() {
        return n/d;
    }

    public int sampleMethod(int y)
    {
        return n/d;
    }

    public void reduce (Fraction f) {
        int GCF = GCF(n, d);
        this.n = n/GCF;
        this.d= d/GCF;
    }

    public void setNum(int n) {
        this.n = n;
    }

    public void setDenom(int d) {
        this.d = d;
    }

    public int GCF(int n, int d) {
        while (n != d) {
            if (n > d) {
                n = n - d;
            }
            else if (d > n) {
                d = d - n;
            }
        }
        return n;
    }

    public static Fraction multiply (Fraction a, Fraction b) {
        int numerator = a.n * b.n;
        int denominator = a.d * b.d;
        Fraction f = new Fraction(numerator, denominator); 
        f.reduce(f);
        return f;
    }

    public static Fraction divide (Fraction a, Fraction b) {
        int numerator = a.n * b.d;
        int denominator = a.d * b.n;
        Fraction f = new Fraction(numerator, denominator); 
        f.reduce(f);
        return f;
    }

    public static Fraction add (Fraction a, Fraction b) {
        int denominator = a.d * b.d;
        int numerator = a.n * b.d + b.n * a.d;
        Fraction f = new Fraction(numerator, denominator);   
        f.reduce(f);
        return f;
    }

    public static Fraction subtract (Fraction a, Fraction b) {
        int denominator = a.d * b.d;
        int numerator = a.n * b.d - b.n * a.d;
        Fraction f = new Fraction(numerator, denominator);  
        f.reduce(f);
        return f;
    }

}
