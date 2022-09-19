public class ReverseNumberUsingForLoop{

	public static void main(String[] args) {
		int rem =0;
		for(int num = 8945;num!=0;) {
			int div = num%10;
			
			 rem = rem *10+div;
			 num/=10;
		}
		System.out.println(rem);
	}
}
