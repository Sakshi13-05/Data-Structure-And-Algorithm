//Constructors of Thread class
class MyThr implements Runnable{
	MyThr(String name){
	//calls the constructor of Thread Class that takes "name" parameter
		super(name);
	}
	
	public void run(){
	int i=1;
	while(i<=10){
		System.out.println("HELLO THREAD");
		i++;
	}
	}
}
class MyThr2 implements Runnable{
	MyThr2(String name){
	//calls the constructor of Thread Class that takes "name" parameter
		super(name);
	}
	
	public void run(){
	int i=1;
	while(i<=20){
		System.out.println("WELCOME TO GOOGLE");
		i++;
	}
	}
}
class MultiThreading3{
	public static void main(String[] args){
		MyThr t1=new MyThr("Chavan");
		Thread put=new Thread(t1);
		MyThr2 t2=new MyThr2("Microsoft");
		Thread put2=new Thread(t2);
		put.start();
		put2.start();
		System.out.println("The ID of Thread is "+put.getId());
		System.out.println("The NAME of Thread is "+put.getName());
		System.out.println("The ID of Thread is "+put2.getId());
		System.out.println("The NAME of Thread is "+put2.getName());
	}
}