package pTestCases;

public class StringReverse {

	public static void main(String[] args) {
		String s="Arpit kumar singh";//  length =17
				                     // 0-16
		
		String temp="";
		
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
		}
		System.out.println("Reverse String: "+temp);
		

	}

}
