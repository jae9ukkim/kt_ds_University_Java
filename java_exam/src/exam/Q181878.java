package exam;

public class Q181878 {

	public static void main(String[] args) {
		String myString = "AbCdEfG";
		String pat = "aBc";
		if(myString.toLowerCase().contains(pat.toLowerCase())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		myString = "aaAA";
		pat = "aaaaa";
		if(myString.toLowerCase().contains(pat.toLowerCase())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
