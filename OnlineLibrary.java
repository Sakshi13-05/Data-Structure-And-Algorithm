import java.util.Scanner;

class Services{
    int n=5,i=0;
    String [] booksArr=new String [n];
    Services(){
        int num;
        do{
            System.out.println("Welcome to A_Z Library");
            System.out.println("Enter the required no for the service you want:--");
            System.out.println("1.Issue Book");
            System.out.println("2.Borrow Book");
            System.out.println("3.Availability");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();

        switch(num){
            case 1:{
                System.out.println("Please tell your name and book name");
                String name=sc.next();
                String book=sc.next();
                issueBook(name,book);
            }
            break;

            case 2:{
                System.out.println("Please tell your name and book name");
                String name=sc.next();
                String book=sc.next();
                borrowBook(name,book);
            }
            break;

            case 3:avail();
            break;

            case 4:{
                stop();
                System.out.println("Thank you visit again");
                num=5;
            }
            break;

            default:
                System.out.println("you entered a worong number!!");
        }
        }while(num>0);
    }

    void issueBook(String name,String book){
        System.out.println(name +"issued "+book+" book");
        while(n>0){
            booksArr[i++]=book;
            n--;
            break;
        }
    }
    void borrowBook(String name,String book){
        System.out.println(name +"borrow "+book+" book");
        while(n>0){
            for(int j=0;j<=booksArr.length-1;i++){
                if(booksArr[j].equals(book)){
                    String temp=booksArr[j];
                    break;
                }
            }
            n++;
            break;
        }
    }
    void avail(){
        System.out.println("Books avail "+booksArr.length);
    }
    void stop(){
        return;
    }

}
public class OnlineLibrary {
    public static void main(String[] args) {
        Services s1=new Services();
    }
}
