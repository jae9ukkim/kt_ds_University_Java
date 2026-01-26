package exam;

public class Q1152 { // split

	public static void main(String[] args) {
		
		String str = "The Curious Case of Benjamin Button";
		System.out.println(str.split(" ").length);
		
		str = "The first character is a blank";
		System.out.println(str.split(" ").length);

		str = "The last character is a blank";
		System.out.println(str.split(" ").length);

	}

}
