abstract class A
{
abstract void show();

  void print()
  {
  System.out.println("print() method");
  }
}
class Main extends A
{
   void show() {
 System.out.println("welcome");
}
   void suchi()
 {
 System.out.println("display() method");
 }
 public static void main (String[] args)
 {
   Main obj = new Main();
   obj.show();
   obj.print();
   obj.suchi();
 }
}