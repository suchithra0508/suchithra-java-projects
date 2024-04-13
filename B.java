class B Extends Thread{
public void run()
{
System.out.println("hello");
}
public static void main(String args[])
{
B obj=new B();
Thread obj=new B();
Thread obj=new Thread(new B());
obj.start();
System.Out.Println(Thread.currentThread().getPriority());
}
}