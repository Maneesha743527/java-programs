class Student
{
String name;
int rno;
Student()
{
name = "maneesha";
rno = 107;
}
Student(String str,int n)
{
name = str;
rno = n;
}
public static void main(String args[])
{
Student s1 = new Student();
Student s2 = new Student("shekar",19);
System.out.println(s1.name);
System.out.println(s1.rno);
System.out.println(s2.name);
System.out.println(s2.rno);
}
}