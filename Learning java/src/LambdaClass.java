import java.util.ArrayList;
public class LambdaClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myNumber=new ArrayList<Integer>();
        myNumber.add(8);
        myNumber.add(2);
        myNumber.add(6);
        myNumber.add(1);
        myNumber.add(10);
        myNumber.forEach((n)-> {System.out.println(n);});
    }
}
