public class Array1
{
    public static void main(String[] args)
    {
     String[] cars={"bmw","kia","ford","zeep","toyota"};
        for(String result:cars)  //for each loop used by an Array
        {
            System.out.println(result);

        }
        cars[1]="Swift";
        System.out.println("Length of an array : " + " " +cars.length); //to find the length of an array
        System.out.println(cars[4] +" " + cars[0]);  //access to the array elements
        System.out.println(cars[1]); //Change an array elements
    }
}
