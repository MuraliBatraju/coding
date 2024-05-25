import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a = 1;
	        int b = 2;
	        double c = 3;
	        // Simple assignment
	        System.out.println("Simple assignment: a = " + b);
	        a = b;
	        System.out.println("a after simple assignment: " + a);
	     // Addition assignment
	        System.out.println("\nAddition assignment: a= c");
	       a += c;

	        System.out.println("a after addition assignment: " + a);
	        a=a+b;
	        System.out.println("a after addition assignment: "+a);

	    // Subtraction assignment
	        System.out.println("\nSubtraction assignment: b -= a");
	        b -= a;
	        System.out.println("b after subtraction assignment: " + b);

	   //Multiplication assignment
	        System.out.println("\n Multiplication assignment: b *= a");
	        b=a*b;
	        System.out.println("b after Multiplication assignment: " + b);

	    //Division assignment
	        System.out.println("\n Division assignment: b /= a");
	        b=a/b;
	        System.out.println("b after Division assignment: " + b);


	}
}
