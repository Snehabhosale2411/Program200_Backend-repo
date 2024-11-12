package Program200;
import java.util.*;
import java.util.Scanner;

public class sqrt_function {

	public static void main(String[] args) {
		// 4.	Write a program to find the square root of a given number (use sqrt () function)?Math.sqrt(a)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		double n=sc.nextDouble();
		System.out.println("Square root : "+(Math.sqrt(n)));
	}

}
