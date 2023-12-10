public class Array2
{
    public static void main(String[] args)
    {
        int[] arrayNum={10,20,30,40,50};
        System.out.println("display all integer no.");
        for (int number:arrayNum)
        {
            System.out.println(number);
        }
        System.out.println("length of integer type array :" + " " + arrayNum.length);
        arrayNum[4]=100;
        System.out.println(arrayNum[0]+" "+arrayNum[4]);

    }
}
