package Program200;
import java.util.Scanner;
import java.util.*;

public class add_sub {

	public static void main(String[] args) {
		//1.	Write a program to add and subtract two numbers
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition : "+(a+b));
		System.out.println("Substraction : "+(a-b));
	}

}
