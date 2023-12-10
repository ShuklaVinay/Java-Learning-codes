public class MyThread2 extends Thread
{
    public static int amount=0;
    public static void main(String[] args)
    {
        Thread t1=new Thread();
        t1.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run()
    {
        amount++;
    }
}
