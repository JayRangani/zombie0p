public class FabonacciUsingFor{

	public static void main(String[] args) {
		 int previousNumber = 0;
		 int nextNumber = 1;
 
	        for (int i = 1; i <= 10; i++)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
	}
}
