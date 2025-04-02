package ppj.training.tasks.one;

public class StatFuns {

	public static void main(String[] args) {
		
		System.out.println(maxOfThree(7,4,5));
		System.out.println(greatestDivisor(32));
		System.out.println(areRelativelyPrime(27,128));
		System.out.println(isPerfect(28));
		
	}
	
	public static int maxOfThree(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	
	public static int greatestDivisor(int n) {
		for (int i = n - 1; i >=1; i--) {
			if (n % i == 0) {return i;}
		}
		return 1;
	}
	
	public static boolean areRelativelyPrime(int a, int b) {
		for (int i = (int) Math.round(Math.sqrt(Math.max(a, b))); i > 1; i--) {
			if (a % i == 0 && b%i == 0) {return false;}
		}
		return true;
	}
	
	public static boolean isPerfect(int n) {
		int divSum = 1;
		
		for (int i = 2; i<=Math.round(Math.sqrt(n)); i++) {
			if (n % i == 0) {
				divSum = divSum + i + (n/i);
			}
		}
		if (divSum == n) {return true;}
		else {return false;}
	}
	
}
