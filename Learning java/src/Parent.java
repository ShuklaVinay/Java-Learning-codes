public class Parent
{
    void show()
    {
        System.out.println("this is parent class");
    }
}
class Child extends Parent {
    void show() {
        super.show();
        System.out.println("this is child class");
    }


}

class CheckSuper
{
    public static void main(String[] args) {
        Child myobj = new Child();
        myobj.show();
    }
}