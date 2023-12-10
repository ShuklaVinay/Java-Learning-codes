import java.util.LinkedList;
public class LinkedListClass
{
    public static void main(String[] args)
    {
     LinkedList<Integer> myNumber=new LinkedList<Integer>();
     myNumber.add(9);
     myNumber.add(6);
     myNumber.add(3);
     myNumber.add(10);
     myNumber.add(1);
        System.out.println("Display the LinkedList added elements: "+" "+myNumber);
        myNumber.set(0,7);
        System.out.println("Display first position changeable value :"+ " "+ myNumber.set(0,7));
        System.out.println("After change the value :"+" "+myNumber);
        myNumber.get(3);
        System.out.println("Access the 3rd position value :"+" "+myNumber.get(3));
        myNumber.clear();
        System.out.println("clear the LinkedList :"+" "+myNumber.clone());
    }
}
