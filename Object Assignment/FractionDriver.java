
/**
 * Write a description of class FractionDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FractionDriver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FractionDriver
     */
    public FractionDriver()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    public static void main (String args[] ) {
        Fraction f1 = new Fraction();
        Fraction f12 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction("3", "4");
        Fraction f4 = f2;
        int x = f1.getNum();
        int x2 = f2.getNum();
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        Fraction.multiply(f3, f4);

    }
}
