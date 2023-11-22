/*
A constructor which does not have any
parameter.
*/
//Default Constructor 
class Student
{
int id;
String name;
Student ()
{
System.out.println("student details");
}
void display()
{
System.out.println("Id="+id+"\t"+"Name="+name);
}
}
class mc
{
public static void main(String args[])
{
Student ob=new Student();
ob.display();
}
}
