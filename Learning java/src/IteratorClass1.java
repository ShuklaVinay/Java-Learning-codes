import java.util.ArrayList;
import java.util.Iterator;
public class IteratorClass1
{
    public static void main(String[] args)
    {
        //make a collection
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(12);
        //get iterator
        Iterator<Integer> it=numbers.iterator();
        while (it.hasNext())
        {
            //System.out.println(it.next());
            Integer i= it.next();
            if (i<5)
            {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
