class A
{
void main()
{
System.out.println("hello");
}
static void main2()
{
System.out.println("world");
}
public static void main(String []args)
{
A obj = new A();
obj.main();
main2();
}
}