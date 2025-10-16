package week1.day2;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		System.out.println("Fibonacci numbers:");
		
		for(int i = 1; i<=10; i++ ) 
		{
			System.out.print(a + "  ");
			c = a + b;
			a = b;
			b = c;
			
		}
			
		}
	}

