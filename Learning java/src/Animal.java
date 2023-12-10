public class Animal
{
    public void animalSound()
    {
        System.out.println("the animal makes a sound");
    }
}
class Cow extends Animal
{
    public void animalSound()
    {
        System.out.println("The cow says : Mehaha");
    }
}
class Cat extends Animal
{
    public void animalSound()
    {
        System.out.println("the cat says: Meows");
    }
}
class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The Dog says: bow bow");
    }
}
class PolyMain
{
    public static void main(String[] args)
    {
     Animal myAnimal=new Animal();
     Cow mycow=new Cow();
     Cat myCat=new Cat();
     Dog myDog=new Dog();
     myAnimal.animalSound();
     mycow.animalSound();
     myCat.animalSound();
     myDog.animalSound();

    }
}
