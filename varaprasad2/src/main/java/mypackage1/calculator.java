package mypackage1;
import Package2.*;
import java.util.*;
public class calculator 
{
    //public static void main( String[] args )
	public calculator()
    {
    	System.out.println("Enter two numbers");
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	System.out.println("Enter 1 to add\nEnter 2 to Divide\nEnter 3 to Subtract\nEnter 4 to Multiply");
    	int k=sc.nextInt();
    	switch(k) {
    	case 1:System.out.println("The addition of "+a+" and "+b+" is :");
    			System.out.println(a+b);
    			break;
    	case 2:System.out.println("The Division of "+a+" and "+b+" is :");
    		    System.out.println(a/b);
    		    break;
    	case 3:System.out.println("The Subtraction of "+a+" and "+b+" is :");
    			System.out.println(a-b);
    			break;
    	case 4:System.out.println("The Multiplication of "+a+" and "+b+" is :");
    			System.out.println(a*b);
    			break;
    	default:System.out.println("enter correct values for a,b and k");
    	
    	}
    	
    }
}