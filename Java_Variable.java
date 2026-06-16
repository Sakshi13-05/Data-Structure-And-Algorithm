/*
ANATOMY OF A JAVA PROGRAM
1--DOCUMENTATION SECTION
2--PACKAGE STATEMENT(OPTIONAL)
3--IMPORT STATEMENT (OPTIONAL)
4--INTERFACE STATMENTS (OPTIONAL)
5--CLASS DEF(ESSENTIAL)
6--MAIN METHOD CLASS
{
MAin Method Defination
}
 */

//scope of variable:
/*
local--global/instance--static
 */
public class Java_Variable {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo1 d2=new Demo1();
        d1.y=11;
        System.out.println("Global Variable in Main class: "+d1.y);
        d1.z=49;
        d2.practice();
        System.out.println("Static variable in main class: "+d1.z);
        System.out.println("To check whether the static variable value is changed for every object of that class: " );



    }
}
class Demo1{
    void practice(){
        Demo.z=50;

        System.out.println(Demo.z);
    }
}
class Demo{
    int y=6;
    static int z=44;
    void demo(){
        System.out.println("Global Variable is: "+y);
        y=5;
        System.out.println("Changed Global Variable is: "+y);
    }
    void demo1(){
        int x=10;
        System.out.println("Local Variable is: "+x);
    }
    static void demo2(){
        System.out.println("Static Variable is: "+z);
        z=45;
        System.out.println("Changed Static Variable is: "+z);
    }
}
