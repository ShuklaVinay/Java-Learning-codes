public class ConstructorClass
{
   int x;
    ConstructorClass(int x)
    {
        this.x=x;
    }

    public static void main(String[] args)
    {
     ConstructorClass myObj=new ConstructorClass(30);
        System.out.println(myObj.x);
    }
}
