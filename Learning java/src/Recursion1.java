//print numbers 10 to 1 by using recursive function
public class Recursion1
{
    public static void printNum(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        printNum(n-1);

    }

    public static void main(String[] args) {
        printNum(10);
    }

}
