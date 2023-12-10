public class MyThread1 implements Runnable {
    public void run() {
        System.out.println("this code is running in the thread");
    }

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        Thread t2 = new Thread(t1);
        t2.start();
        System.out.println("this code is running out of thread");
    }
}