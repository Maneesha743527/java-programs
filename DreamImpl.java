class Job  {
String position = "JAVA";
}
class Dream extends Job {
String sname = "maneesha";
void display(){
System.out.println("name:"+sname);
System.out.println(super.position);
}
}
class DreamImpl {
public static void main(String args[]){
Dream d = new Dream();
d.display();
}
}