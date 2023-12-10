import java.util.HashMap;
public class HashMapClass
{
    public static void main(String[] args)
    {
     HashMap<String,String> capitalCities=new HashMap<String,String>();
     capitalCities.put("India","New delhi");
     capitalCities.put("England","London");
     capitalCities.put("Germany","Berlin");
     capitalCities.put("Norway","Oslo");
     capitalCities.put("USA","Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Germany"));
        //System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);
        /* capitalCities.clear();
        System.out.println(capitalCities); */
        System.out.println(capitalCities.size());
        //Loop in the HashMap
        System.out.println("use for each loop in HashMap for display keys");
        for (String i:capitalCities.keySet())
        {
            System.out.println(i);
        }
        System.out.println("use for each loop in HashMap for display values");
        for (String j: capitalCities.values())
        {
            System.out.println(j);
        }
        //to access keys & values
        for (String i:capitalCities.keySet())
        {
            System.out.println("Keys: "+" "+i+" " +"Values:"+" "+capitalCities.get(i));
        }
    }
}
