abstract class Animal1 //abstract clss
{
    public abstract void animalSound();  //abstract method
    public void sleep()
    {
        System.out.println("Animal sleep: Zzzzzz");
    }
}
class Dog1 extends Animal1
{
    public void animalSound()
    {
        System.out.println("the Dog says: wou wou");
    }
}
class MainAbs
{
    public static void main(String[] args)
    {
    Dog1 myDog=new Dog1();
    myDog.animalSound();
    myDog.sleep();
    }
}
