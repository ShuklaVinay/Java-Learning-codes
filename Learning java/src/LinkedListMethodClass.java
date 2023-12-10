import java.util.LinkedList;
import java.util.Collections;
public class LinkedListMethodClass
{
    public static void main(String[] args)
    {
     LinkedList<String> userName=new LinkedList<String>();
     userName.add("Vinay");
     userName.add("Amit");
     userName.add("Ram");
     userName.add("Shyam");
     userName.add("Umesh");
        System.out.println(userName);
     //to add the item beginning of list use addFirst() method
        userName.addFirst("Praveen");
        System.out.println(userName);
        //to add item last of the list use addLast() method
        userName.addLast("Deepak");
        System.out.println(userName);
        //to remove item beginning form the list use removeFirst() method
        userName.removeFirst();
        System.out.println(userName);
        //to remove last item from the list use removeLast() method
        userName.removeLast();
        System.out.println(userName);
      //get the item at beginning from the list use getFirst()
        System.out.println(userName.getFirst());
        //get the item at last from the list use getLast() method
        System.out.println(userName.getLast());
        //to find the size of the list use size() method
        System.out.println(userName.size());
        //sort the list items by using sort() method available in Collections class
        System.out.println("sorting of List items");
        Collections.sort(userName);
        for (String i:userName)
        {
            System.out.println(i);
        }
    }
}
