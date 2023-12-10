interface FirstInterface
{
    public void myMethod();  //interface method
    public void firstMethod();
}

interface SecondInterface
{
    public void otherMethod();
}
interface ThirdInterface
{
    public void thirdMethod();
}

class DemoClass implements FirstInterface,SecondInterface,ThirdInterface
{
    public void myMethod()
    {
        System.out.println("First Interface");
    }

    public void firstMethod() {
        System.out.println("welcome to the world of multiple interfaces");
    }

    public void otherMethod()
    {
        System.out.println("Second Interface");
    }


    public void thirdMethod() {
        System.out.println("Third Interface");
    }
}

class MainClass {
    public static void main(String[] args) {


        DemoClass myDemo = new DemoClass();
        myDemo.firstMethod();
        myDemo.myMethod();
        myDemo.otherMethod();
        myDemo.thirdMethod();
    }
}