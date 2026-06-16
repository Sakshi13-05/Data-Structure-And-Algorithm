class Laptop{
    private String brand,ram;

    Laptop(){
        brand="HP";
        ram="360 GB";
    }
    void printDetails(){
        System.out.println(brand);
        System.out.println(ram);
    }
}
public class Oops {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.printDetails();
    }
}
