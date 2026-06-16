//Method Overloading and Riding
class Parent5{
    Parent5(){
        System.out.println("hii i am a parent constructor");
    }
    Parent5(int a){
        System.out.println("hii i am a parent para constructor");
    }
    void play(int a, double b){
        System.out.println(a+b);
    }
    void play(double a, int b){
        System.out.println(a+b);
    }
     void compute(){
        System.out.println("hii parent");
    }
}
class Child5 extends Parent5{
//    private ->default->protected->public

       void compute(){
        System.out.println("hii child");
    }
    void compute1(){
        System.out.println("another");
    }
}
public class TheoryRev01 {
    public static void main(String[] args) {
        Parent5 p1=new Child5();
        p1.compute();
//        p1.play(10,10.0);

    }
}
