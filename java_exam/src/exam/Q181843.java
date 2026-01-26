package exam;

public class Q181843 {

	public static void main(String[] args) {
		String my_string = "banana";
		String target = "ana";
		if(my_string.contains(target)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		my_string = "banana";
		target = "wxyz";
		if(my_string.contains(target)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		

	}

}
