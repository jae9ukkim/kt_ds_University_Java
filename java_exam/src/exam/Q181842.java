package exam;

public class Q181842 { //contains

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "aabcc";
		if(str2.contains(str1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

		str1 = "tbt";
		str2 = "tbbttb";
		if(str2.contains(str1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
