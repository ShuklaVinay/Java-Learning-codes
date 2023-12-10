public class TryCatchClass
{
    public static void main(String[] args)
    {
        try {
            int[] myNumbers = {1, 2, 4, 6, 7, 9};
            System.out.println(myNumbers[8]);

        }catch (Exception e)
        {
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("the 'try catch' is finished.");
        }
    }
}
