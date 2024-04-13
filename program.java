public static void main(String args[])
{
String s = "hello people";
try
{
FileOutputStream fout = new FileOutputStream;
byte[] b = s.getBytes();
fout.write(b);
fout.flush();
fout.close();
System.out.println("happy...");
}
catch(Exception e)
{
System.out.println(e);
}
}
}