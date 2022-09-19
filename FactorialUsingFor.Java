import java.util.Scanner;

public class FactorialUsingFor{

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter The Number");
	int num = scn.nextInt();//5
	int factorial = 1;
	for (int tnum =num ;tnum>0;tnum--) {
		factorial =factorial * tnum;
	}
		System.out.println(factorial);
	}
}
