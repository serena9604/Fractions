
public class FractionDriver
{
    public static void main (String args[] ) {
        Fraction f1 = new Fraction();
        Fraction f12 = new Fraction();
        Fraction f2 = new Fraction(3, 4);
        Fraction f3 = new Fraction("5/6");
        Fraction f4 = f2;
        Fraction f5 = new Fraction(90, 100);
        int x = f1.getNum();
        int x2 = f2.getNum();
        System.out.println("f1:" + f1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("f4:" + f4);

        System.out.println(f3 + " x " + f4 + "=" + Fraction.multiply(f3, f4));
        System.out.println(f3 + " / " + f4 + "=" + Fraction.divide(f3, f4));
        System.out.println(f3 + " + " + f4 + "=" + Fraction.add(f3, f4));
        System.out.println(f3 + " - " + f4 + "=" + Fraction.subtract(f3, f4));
        System.out.println("test");

    }
}

