public class MultiArray
{
    public static void main(String[] args)
    {
     int[][] myNumber={{1,2,3,4},{5,6,7,8}};
        System.out.println(myNumber[1][2]);
       // myNumber[0][3]=9;       //change element value
        System.out.println(myNumber[0][3]);
        System.out.println("display all the elements of multi-dimensional array");
        for(int i=0;i< myNumber.length;i++)
        {
            for(int j=0;j<myNumber[i].length;j++)
            {
                System.out.println(myNumber[i][j]);
            }
        }
    }
}
