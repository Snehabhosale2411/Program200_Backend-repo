package Program200;
import java.util.Scanner;

public class div_mul {

	public static void main(String[] args) {
		//2.	Write a program to multiply and divide two numbers and print them in the form of equation (4*3=12 8/4=2)?
		Scanner sc=new Scanner(System.in);
		float a,b;
		System.out.println("Enter 2 numbers : ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Multiplication : "+a+"*"+b+"="+(a*b));
		System.out.println("Division : "+a+"/"+b+"="+(a/b));
	}
}
