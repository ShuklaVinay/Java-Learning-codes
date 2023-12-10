import java.util.ArrayList;
import java.util.Collections;
public class ArrayListIntType
{
    public static void main(String[] args)
    {
     ArrayList<Integer> myNumber=new ArrayList<Integer>();
     myNumber.add(5);
     myNumber.add(8);
     myNumber.add(22);
     myNumber.add(20);
     myNumber.add(18);
        System.out.println(myNumber);
        Collections.sort(myNumber);  //sort myNumbers
        for (int i:myNumber)
        {
            System.out.println(i);
        }
    }
}
