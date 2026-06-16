/*Type1---To create thread
Using Thread Class*/

class Thread1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("I love java");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I love JS");
        }
    }

}

public class multi {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();

        Thread2 t2=new Thread2();
        t2.start();

    }
}
