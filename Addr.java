package myfirstproject1;

public class Addr {

	int a,b,c;
	String d = "apple";
	String f = "Mango";

	
static	int add( int a,int b)
	 {
		return a+b;
		 
	 }

	 static  String add(String d , String f)
	 {
		 return   d+ f;
		 
	 }
}

class MyAddr1 {
	public static void main(String args[])
	{
	
		
		System.out.println(Addr.add(10,20));
		System.out.println(Addr.add("apple" ,  "Mango"));
		
		
	}
}
