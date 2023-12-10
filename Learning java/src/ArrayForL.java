public class ArrayForL
{
    public static void main(String[] args)
    {
        int[] arrayNum={2,4,6,8,10,12};
        System.out.println("display an array elements by using for loop:");
        for (int i=0;i<arrayNum.length;i++)
        {
            System.out.println(arrayNum[i]);
        }
        System.out.println("display an array elements by using foreach loop");
        for (int result:arrayNum)
        {
            System.out.println(result);
        }
    }
}
