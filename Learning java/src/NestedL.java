public class NestedL
{
    public static void main(String[] args)
    {
     for(int i=1;i<=3;i++)   //outer loop
     {
         System.out.println("this is outer loop" + i);
         for (int j=1;j<=2;j++) //inner loop
         {
             System.out.println("this is inner loop" + j);
         }
     }
    }
}
