package myfirstproject1;
import java.util.Scanner;

public class Demo1 {
	   public static void main(String[] args) {
		  
	   
	      System.out.println("Integer Datatype values...");
	      System.out.println("Min = " + Integer.MIN_VALUE);
	      System.out.println("Max = " + Integer.MAX_VALUE);


	      System.out.println("Float Datatype values...");
	      System.out.println("Min = " + Float.MIN_VALUE);
	      System.out.println("Max = " + Float.MAX_VALUE);

	      System.out.println("Double Datatype values...");
	      System.out.println("Min = " + Double.MIN_VALUE);
	      System.out.println("Max = " + Double.MAX_VALUE);

	      System.out.println("Byte Datatype values...");
	      System.out.println("Min = " + Byte.MIN_VALUE);
	      System.out.println("Max = " + Byte.MAX_VALUE);
	      Scanner sc = new Scanner(System.in);
	      byte v;
	      
	    	  System.out.println("enter the value of v");
	    	  v = sc.nextByte();
	    	  
	    	  System.out.println("value" +v);
	    	  if (v> Byte.MAX_VALUE)
	    		  System.out.println("error");
	      

	      System.out.println("Short Datatype values...");
	      System.out.println("Min = " + Short.MIN_VALUE);
	      System.out.println("Max = " + Short.MAX_VALUE);
	   }
	}