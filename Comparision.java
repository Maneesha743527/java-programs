import java.util.Scanner;
class Comparision{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your subject");
String subj=sc.next();
String sch=new String("python");
if(subj.equals("java")){
  System.out.println("patience is needed");
}
else{
  System.out.println("dont waste time");
}
if(sch.equals("python")){
System.out.println("great");
}
}
}
  