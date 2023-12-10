public class Methods4
{
    static void checkAge(int age)
    {
        if(age<18)
        {
            System.out.println("access denied - you are not old enough ");
        }
        else
        {
            System.out.println("access granted- you are old enough");
        }
    }

    public static void main(String[] args)
    {
      checkAge(17);
    }
}
