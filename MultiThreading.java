/*Type1---To create thread
Using Thread Class*/

/*class MyThread1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("I love java");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I love JS");
        }
    }

}
*/

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("You study");
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run(){
        System.out.println("You dont study");
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        /*MyThread1 t1=new MyThread1();
        t1.start();

        MyThread2 t2=new MyThread2();
        t2.start();
        */
        Thread t1=new Thread(new MyRunnable1());
        t1.start();
        Thread t2=new Thread(new MyRunnable2());
        t2.start();
    }
}
