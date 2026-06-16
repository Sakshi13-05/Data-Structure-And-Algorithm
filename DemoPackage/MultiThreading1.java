//Constructors of Thread class
class MyThr extends Thread{
	//1----Thread(name)==Gives name to new thread
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
class MyThr2 extends Thread{
	//1----Thread(name)==Gives name to new thread
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
class MultiThreading1{
	public static void main(String[] args){
		MyThr t1=new MyThr("Sakshi");
		MyThr2 t2=new MyThr2("GOOGLE");
		t1.start();
		t2.start();
		System.out.println("The ID of Thread is "+t1.getId());
		System.out.println("The NAME of Thread is "+t1.getName());
		System.out.println("The ID of Thread is "+t2.getId());
		System.out.println("The NAME of Thread is "+t2.getName());
	}
}