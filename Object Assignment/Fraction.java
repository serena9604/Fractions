
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Fraction
     */
    public Fraction()
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

    public static Fraction multiply (Fraction f) {
        int numerator = a.n * b.n;
        int denominator = a.d * b.d;
        Fraction f = new Fraction(numerator, denominator);
        return f;
        
    }
}
