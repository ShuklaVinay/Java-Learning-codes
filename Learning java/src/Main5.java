public class Main5
{
    public static void main(String[] args)
    {
     //widening type costing
     int x=25;
     double y=x;//automatic type costing int to double
        System.out.println("widening type costing");
        System.out.println(x);
        System.out.println(y);
        //narrowing type costing
        double myDouble=35.5d;
        int myInt=(int)myDouble; //manually type costing double to int
        System.out.println("narrowing type costing");
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
