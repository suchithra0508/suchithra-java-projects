class Employee
{
private int age;
public void setAge(int age)
{
if(age>100)
{
this.age=100;
}
else if(age<0)
{
this.age=0;
}
else
{
this.age=age;
}
}
public int getAge()
{
return age;
}
}