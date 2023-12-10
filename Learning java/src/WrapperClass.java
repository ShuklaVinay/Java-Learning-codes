public class WrapperClass
{
    public static void main(String[] args)
    {
     Integer myInt=30;
     Double myDouble=5.69;
     Character myChar='V';
      /*  System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar); */

        //wrapper class methods
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}
