package Program200;
import java.util.Scanner;

public class sq_cube {

	public static void main(String[] args) {
		//3.	Write a program to find the square and cube of a given number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		System.out.println("Square : "+(n*n));
		System.out.println("Cube : "+(n*n*n));
	}

}
