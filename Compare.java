import java.util.Scanner;
class Compare{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your subject");
String subj=sc.next();
String sch=new String("python");
if(subj.equalsIgnoreCase("java")){
  System.out.println("patience is needed");
}
else{
  System.out.println("dont waste time");
}
if(sch.equalsIgnoreCase("python")){
System.out.println("great");
}
}
}
  