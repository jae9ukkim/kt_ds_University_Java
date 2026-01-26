package exam;

public class Q27866 { //charAt() or substring()

	public static void main(String[] args) {
		String word = "Sprout";
		int idx = 3;
		System.out.println(word.substring(idx-1, idx));
		
		word = "shiftpsh";
		idx = 6;
		System.out.println(word.substring(idx-1, idx));

		word = "Baekjoon";
		idx = 4;
		System.out.println(word.charAt(idx-1));
	}

}
