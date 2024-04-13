import java.io.FileOutputStream;
public class FileOutputStreamExample
{
public static void main(String[]args)
{
try{
FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
fout.write(65);
fout.flush();
fout.close();
System.out.println("sandy");
}catch(Exception e){
System.out.println(e);}
}
}
