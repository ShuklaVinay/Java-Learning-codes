public class Logic
{
    public static void main(String[] args)
    {
        //logical operator
        int x=10;
        System.out.println("logical and operator returns true if both conditions are true");
        System.out.println(x >5  && x < 20);
        System.out.println("logical or operator returns true if one of the condition is true");
        System.out.println(x<5 || x<20);
        System.out.println("logical not operator reverse the result, return false if the result is true");
        System.out.println(!(x>5 && x<20));
    }
}
