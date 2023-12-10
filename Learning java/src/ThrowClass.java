public class ThrowClass
{
    static void age(int x)
    {
        if(x<18)
        {
            throw new ArithmeticException("Access Denied : you must be 18 year old");
        }
        else
        {
            System.out.println("Access granted : you are old enough");
        }
    }

    public static void main(String[] args) {
        age(16);
    }
}
