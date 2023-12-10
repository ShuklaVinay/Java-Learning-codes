public class Resursion4
{
    public static int numFact(int n)
    {
        if (n==1 || n==0)
        {
            return 1;
        }
      int fact1=numFact(n-1);
      return n*fact1;
      //return fact2;
    }

    public static void main(String[] args) {
        int result=numFact(5);
        System.out.println(result);
    }
}
