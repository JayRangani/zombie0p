import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Number You Want To Check");
		int num = scn.nextInt();
		int tnum = num;
		int cube = 0;
while (num != 0) {
	int div = num%10;
	num/=10;
	cube = cube +(div * div * div);
}
System.out.println(cube);
if (cube==tnum) {
	System.out.println("This Is Armstrong Number");
}else {
	System.out.println("This is Number is Not Armstrong Number");
}
	}
}
