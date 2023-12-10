import java.util.ArrayList;
import java.util.function.Consumer;
public class LambdaClass1
{
    public static void main(String[] args) {
        ArrayList<Integer> myNumber=new ArrayList<Integer>();
        myNumber.add(11);
        myNumber.add(8);
        myNumber.add(5);
        myNumber.add(12);
        myNumber.add(7);
        myNumber.add(10);
        Consumer<Integer> result=(n) -> {System.out.println(n);};

        myNumber.forEach(result);
    }

}
