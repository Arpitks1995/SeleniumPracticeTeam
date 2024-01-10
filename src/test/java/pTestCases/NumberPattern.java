package pTestCases;

public class NumberPattern {

	public static void main(String[] args) {
		/* 1
		  2 2
		 3 3 3
		4 4 4 4
		 */
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			System.out.print(i);
			System.out.println();
			
		}
		

	}

}
