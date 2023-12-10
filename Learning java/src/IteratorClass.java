import java.util.ArrayList;
import java.util.Iterator;
public class IteratorClass
{
    public static void main(String[] args)
    {
      //make a collection
      ArrayList<String> cars=new ArrayList<String>();
      cars.add("TATA");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("KIA");
      cars.add("Toyota");
      //get iterator
        Iterator<String> it= cars.iterator();
        //print the first item
        //System.out.println(it.next());

        //looping through a collection
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
