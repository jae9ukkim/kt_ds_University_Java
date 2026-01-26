package exam;

public class Q11720 { //for, charAt(), Integer.parseInt()

	public static void main(String[] args) {
		int idx = 1;
		String numbers = "1";
		int sum = 0;
		
		for(int i=0; i < numbers.length(); i++) {
			sum += Integer.parseInt(numbers.charAt(i)+"");
		}
		System.out.println(sum);
		
		sum = 0;
		idx = 5;
		numbers = "54321";
		for(int i=0; i < numbers.length(); i++) {
			sum += Integer.parseInt(numbers.charAt(i)+"");
		}
		System.out.println(sum);

		sum = 0;
		idx = 25;
		numbers = "7000000000000000000000000";
		for(int i=0; i < numbers.length(); i++) {
			sum += Integer.parseInt(numbers.charAt(i)+"");
		}
		System.out.println(sum);

		sum = 0;
		idx = 11;
		numbers = "10987654321";
		for(int i=0; i < numbers.length(); i++) {
			sum += Integer.parseInt(numbers.charAt(i)+"");
		}
		System.out.println(sum);

	}

}
