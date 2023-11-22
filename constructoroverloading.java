/*
It has more than one constructor with different
parameter tasks.
It performs a different tasks.
*/
//constructor overloading
class Student
{
int id;
String name;
float salary;
Student (int i,String n,float s)
{
id=i;
name=n;
salary=s;
System.out.println("student details");
}
Student(int j,String m)
{
id=j;
name=n;
}
void display()
{
System.out.println("Id="+id+"\t"+"Name="+name+"\t"+"Salary="+salary);
}
}
class mc
{
public static void main(String args[])
{
Student ob=new Student(101,"ram",5000);
Student ob1=new Student(102,"seetha");
ob.display();
ob1.display();
}
}
