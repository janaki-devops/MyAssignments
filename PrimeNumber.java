package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 19;
		int count = 0;
		
		if (number>1) {
			
			for(int i =1; i<=number; i++)
				
				{
					if (number%i==0)
					count++;
						
					}
					if (count==2) {
						System.out.println("It is a prime number");
					}
					else {
						System.out.println("It is not a prime number");
					}		
		}
		
			
		
		else {
			System.out.println("It is not a prime number");
		}
	}
}