public class MyThread extends Thread
{
    public void run()
    {
        System.out.println("this code is running in the thread");
        System.out.println("this code is running in the thread");
        System.out.println("this code is running in the thread");
        System.out.println("this code is running in the thread");

    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        System.out.println("this code is outside of the thread");
        System.out.println("this code is outside of the thread");
        System.out.println("this code is outside of the thread");
        System.out.println("this code is outside of the thread");
        System.out.println("this code is outside of the thread");
        System.out.println("this code is outside of the thread");
    }
}
