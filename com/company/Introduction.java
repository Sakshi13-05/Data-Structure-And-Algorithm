package com.company;


//public class Introduction {
//    public static void main(String[] args) {
//        System.out.println("WELCOME BACK JAVA!!!");
//    }
//}
//package--function--classes--public--static

//difference between print and println:

public class Introduction {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("10"+"20");

        Trial t1=new Trial();
        t1.trial_function();
    }

    public void greet(){
        String name="Sakshi";
        System.out.println("hello "+ name);
    }

}
class Trial{
    Introduction i1=new Introduction();
    void trial_function(){
        i1.greet();
    }
}

