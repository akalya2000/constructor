/*
A constructor which has a specific numberb of
parameters is called parameter constructor.
It is used to provide different values to distinct objects.
you can also provide same values.
*/
//Parameter Constructor 
class Student
{
int id;
String name;
Student (int i,String n)
{
id=i;
name=n;
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
Student ob=new Student(101,"ram");
ob.display();
}
}
