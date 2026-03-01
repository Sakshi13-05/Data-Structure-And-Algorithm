//Abstract Classes And Inheritance

interface Brake{
    int normal_acc=50;
//all methods must be without body
    void applyBrake(int your_acc);
    void doNotApplyBrake(int your_acc);
}
abstract  class Horn{
//    atleast 1 method without body
    void apply(String status){
        if ( status.equals("vehicle") )System.out.println("Apply horn");
    }
    abstract void doNotApplyHorn();
}

interface Handle{
    //    all methods must be without body
    void turnHandle();
    void doNotTurnHandle();
}
abstract  class Mirror{
    //    atleast 1 method without body
    void present(){
        System.out.println("Mirror is present");
    }
    abstract void absent();
}

/*1.Java do not allow implements before extend
2.Cannot extend multiple  abstract classes*/
class Cycle extends Mirror implements Brake,Handle  {
//    interface method must be complusory defined in the class that implentes
//    and method modifier must be complusory public
    public void applyBrake(int x){
        if(x>normal_acc) System.out.println("Now apply Brake");
    }
    public void doNotApplyBrake(int y){
        if(y<normal_acc) System.out.println("Do not apply Brake");
    }
    public void turnHandle(){
        System.out.println("Turn Handle");
    }
    public void doNotTurnHandle(){
        System.out.println("Do not Turn Handle");
    }
    public void absent(){
        System.out.println("The mirror is absent");
    }

}
/*
the methods of inheritance must be public
extends---inherit the normal class
implements---inherit the interface
multiple interface  class can be implemented
you cannot modify the property of interface as they are final
you can create properties in interface
*/

public class LecContinue {
    public static void main(String[] args) {
        Cycle c1=new Cycle();
        c1.applyBrake(56);
        c1.doNotApplyBrake(89);
//        You cannot do this as variable is final
//        Brake.normal_acc=89;
    }
}


