import java.sql.SQLOutput;

//Java Math class methods
public class Greeting5
{
    public static void main(String[] args)
    {
       int x=20;
       int y=30;
       int z=64;
       float a=-23.5f;
        System.out.println("Math.max(x,y) method find largest value :");
        System.out.println(Math.max(x,y));
        System.out.println("Math.min(x,y) method find the lowest value :");
        System.out.println(Math.min(x,y));
        System.out.println("Math.sqrt(x) method returns the square root of z");
        System.out.println(Math.sqrt(z));
        System.out.println("Math.abs(x) method returns the absolute (positive) value of x");
        System.out.println(Math.abs(a));
        System.out.println("Math.random() method returns the random numbers between 0.0(inclusive) & 1.0(exclusive)");
        System.out.println(Math.random());
        int randomNum=(int) (Math.random()*101);
        System.out.println("Random number between 0 to 100 :" +randomNum);
    }
}
