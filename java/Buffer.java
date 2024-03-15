class Buffer
{
public static void main(String args[]) 
{
InputStreamReader IR = new InputStreamReader(System.in);
Buffered Reader BR = new Buffered Reader(IR);
int a =Integer.parseInt(BR.readline());
String str = BR.readline();
System.out.println(a);
System.out.println(str);
}
}

