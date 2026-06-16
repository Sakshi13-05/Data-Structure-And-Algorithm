class Parent{
    Parent(int a){
        System.out.println("i am parent with value "+a);
        System.out.println("--------------");
    }
    Parent(){
        System.out.println("i am a parent class");
        System.out.println("--------------");
    }
    void print(){
        System.out.println("hello child i am your parent");
        System.out.println("---------------");
    }

}

class Child extends  Parent{
    int age;
    String name;
    Child(){
//        case1-- to call the parent constructor with parameter
        super(15);
        System.out.println("i am child class with no value");
        System.out.println("-----------------");
    }

    @Override
    void print(){
//        case2:to call same method from parent that does different function and to tell complier first run parent then child
        super.print();
        System.out.println("Hello parent i am your child");
        System.out.println("---------------");
    }

    void demo(int age,String name){
        //        case3- sgadcasing to distingingish between class variable and parameter
        this.name=name;
        this.age=age;
        System.out.println("I am child name is "+name+" and age is "+age);
        System.out.println("----------------");



    }

}

class GrandChild extends Parent{
    GrandChild(){
        System.out.println("hello i am grandchild");
        System.out.println("----------");
    }
    GrandChild(int age){
//        case--to call a another constructor from a constructor of same class
        this();
        System.out.println("hello i am gc with age "+age );
    }


}


class Trail{
    public static void main(String[] args) {
//      Child c1=new Child();
//      c1.print();
//      c1.demo(21,"sakshi");

        GrandChild g1=new GrandChild(5);

    }
}