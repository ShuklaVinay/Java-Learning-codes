import java.util.SortedMap;

public class Vehicle
{
    protected String brandName="Maruti";
    public void horn()
    {
        System.out.println("Trin, Trin");
    }
}
class Car extends Vehicle
{
    private String ModelName="Swift";

    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.horn();
        System.out.println(myCar.brandName+" "+ myCar.ModelName);

    }
}