public class presentation
{
static int a=10;
int b=12;
public static void main(String[] args)
{
Presentation obj=new Presentation();
a=25;
Presentation.a=35;
obj.a=75;
new Presentation().a=100;
System.out.println(a);
System.out.println(new Presentation().b);
}
}
class A
{
static int e=89;
}
class B
{
public static void main(String[] args)
{
System.out.println(A.e);
}
}