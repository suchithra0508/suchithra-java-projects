public class Demo10
{
int a=10;
int b=12;
public static void main(String[] args)
{
Demo10 obj=new Demo10();
obj.a=25;
new Demo10().b=35;
new Demo10().a=75;
new Demo10().b=35;
System.out.println(obj.a);
System.out.println(new Demo10().b);
System.out.println(new Demo10().a);
}
}
