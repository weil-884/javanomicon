package ppj.training.tasks.one;

public class SmallSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] smallSum3(int[] a) {
		
		int sumaBazowa = a[0] + a[1] + a[2];
		int indeksy[] = {0,1,2};
		
		if (a.length == 3) {return indeksy;}
		
		
		for (int i = 3; i<a.length;i++) {
			
			for (int j = 0;j<3;j++) {
				if (sumaBazowa > sumaBazowa - a[j] + a[i] ) {
					
				}
			}
			
		}
		
		return a;
	}
	
}
