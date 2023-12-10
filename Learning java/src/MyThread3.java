public class MyThread3 extends Thread
{
    public static int amount=0;

    public static void main(String[] args) {
        MyThread3 t3=new MyThread3();
        t3.start();
        //wait for the thread to finish
        while (t3.isAlive())
        {
            System.out.println("waiting. . .");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run()
    {
        amount++;
    }
}
