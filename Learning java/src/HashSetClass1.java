import java.util.HashSet;
public class HashSetClass1
{
    public static void main(String[] args)
    {
     HashSet<Integer> numbers=new HashSet<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(22);
        numbers.add(28);
        System.out.println(numbers);
        for(int i=1;i<=10;i++)
        {
            if (numbers.contains(i))
            {
                System.out.println(i+" "+ "found in the set");
            }
            else {
                System.out.println(i+" "+ "not found in the set");
            }
        }
    }
}
