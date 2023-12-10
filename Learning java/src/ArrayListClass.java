import java.util.ArrayList;
import java.util.Collections;
public class ArrayListClass
{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); //create an object of the ArrayList class
        //add() method is sued to add elements in ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Maruti");
        cars.add("KIA");
        cars.add("TATA");
        System.out.println(cars);
        //get() method of the ArrayLIst class
        cars.get(5);
        System.out.println(cars.get(5));
        //set() method of the ArrayList
        cars.set(0, "Honda");
        System.out.println(cars);
        //remove() method of an ArrayList class
        cars.remove(6);
        System.out.println(cars);
        //size() method is used for the ArrayList size
        System.out.println(cars.size());
        //for loop in the ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        //for each loop in the ArrayList
        for (String i:cars)
        {
            System.out.println(i);
        }
        //sort an ArrayList elements
        Collections.sort(cars);
        System.out.println("ArrayList elements after sorting");
        for (String i:cars)
        {
            System.out.println(i);
        }
    }
}
