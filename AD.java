class AD
{
	int x = 10;
	
	void show()
	{
		System.out.println("Welcome");
	}
}

class Main extends AD
{
	int x = 20;

              Main()
              {

              }
	
	void print()
	{
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		super.show();
	}
	
	public static void main(String[] args)
	{
		Main obj = new Main();
		obj.print();

		
	}
}