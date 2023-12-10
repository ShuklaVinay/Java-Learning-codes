import java.util.HashMap;
public class HashMap1
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> people=new HashMap<String,Integer>();
        people.put("vinay",34);
        people.put("Praveen",32);
        people.put("Deepak",32);
        people.put("Amit",28);
        people.put("Akshay",30);
        System.out.println(people);
        for (String i:people.keySet())
        {
            System.out.println(i+" "+people.get(i));
        }
    }
}
