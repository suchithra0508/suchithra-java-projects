import java.util.*;
class Stackdemo
{
public static void main(String []args)
{
Stack s=new Stack();
s.push(10);
s.push("suchi");
s.push(69);
System.out.println(s);
Enumeration e=s.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
}
}