/* If a multiple constructor in the same class 
possess same parameters then we can copy the 
values by creating constructor object
*/
//Copy Constructor
class student
{
String name;
int reg_no;
student(String n,int r)
{
name=n;
reg_no=r;
}
student(student s)
{
name=s.name;
reg_no=s.reg_no;
}
void display()
{
System.out.println("name="+name+"\t reg_no="+reg_no);
}
}
class mc
{
public static void main(String args[])
{
student ob=new student("ram",101);
student ob1=new student(ob);
ob.display();
ob1.display();
}
}
