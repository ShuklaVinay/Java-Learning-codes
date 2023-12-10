public class MethodOvrL
{
    static int plusMethod(int x,int y)
    {
        return x+y;
    }
    static double plusMethod(double x,double y)
    {
        return x+y;
    }

    public static void main(String[] args)
    {

     int num1=plusMethod(20,30);
     double num2=plusMethod(34.5,30.6);
        System.out.println("sum of two int no.:"+" "+ num1);
        System.out.println("sum of two double no.:"+" "+num2);
        //second type to pass the argument in the method
        System.out.println("sum of int:"+" "+plusMethod(20,10));
        System.out.println("sum of double:"+" "+plusMethod(20.6,55.8));
    }
}
