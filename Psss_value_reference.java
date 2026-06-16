public class Psss_value_reference {
    //nothing to print means void
//    static void printName(String name){
//        name="pillu";
//        System.out.println(name);
//}

//    --pass by value
//    void change(int x){
//        x=98;
//    }

//     --pass by refernce
    void change2(int arr[]){
        arr=null;
        System.out.println(arr);
    }


    public static void main(String[] args) {
        //--void demo
//        String name1="sakshi";
//        printName(name1);
//        System.out.println(name1);

//        --demo-- pass by value
       Psss_value_reference a1=new Psss_value_reference();
//        int a=56;
//        a1.change(a);
//        System.out.println(a);

//        --value a does not change in main reason here copy of value is passed not the actual value--

        //--demo--pass by refernce
//        int marks[]={65,56,98,77,12,56};
//        a1.change2(marks);
//        System.out.println(
//                "the marks of 3rd student"+ marks[2]
//        );
//        ---value changed here reason the refernce of array object is pass that overwrites the marks[2] place by the method and thus value changed

// null array demo---
        int marks[]={12,14,15,16,17};
        a1.change2(marks);

        System.out.println(marks[0]);



    }
}
