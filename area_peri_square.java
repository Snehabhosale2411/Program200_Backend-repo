package Program200;
import java.util.*;
import java.util.Scanner;

public class area_peri_square {

	public static void main(String[] args) {
		//5.	Write a program to find the area and perimeter of a square?
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of side : ");
		int side=sc.nextInt();
		System.out.println("Area : "+(side*side));
		System.out.println("Perimeter : "+(4*side));
	}

}
