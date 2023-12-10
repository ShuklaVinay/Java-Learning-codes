import java.util.HashSet;
public class HashSetClass
{
    public static void main(String[] args)
    {
     HashSet<String> cars=new HashSet<String>();
     cars.add("Ford");
     cars.add("BMW");
     cars.add("KIA");
     cars.add("TATA");
     cars.add("Maruti");
     cars.add("KIA");
        System.out.println(cars);
        System.out.println(cars.contains("TATA"));
        cars.remove("KIA");
        System.out.println(cars);
        System.out.println(cars.size());
        for (String i:cars)
        {
            System.out.println(i);
        }
    }
}
