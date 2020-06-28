package myfirstproject1;

public class base {
	void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Concatinated String - "
                           + s); 
    } 
}
 class derive  extends base{
	 void operator(int a, int b) 
	    { 
	        int c = a + b; 
	        System.out.println("Sum = " + c); 
	    } 
	} 
 class mainclass
{
	public static void main(String args[])
	{
		derive obj = new derive();
		obj.operator(2, 3); 
        obj.operator("joe", "now"); 
	}
}
