package exam;

public class Q181849 { // split, for, Interger.parseInt

	public static void main(String[] args) {
		String num_str = "123456789";
		String[] numArr = num_str.split("");
		int sum = 0;
		
		for(int i = 0; i < numArr.length; i++)
		{
			sum += Integer.parseInt(numArr[i]);
		}
		System.out.println(sum);
			
		num_str = "1000000";
		numArr = num_str.split("");
		sum = 0;
		
		for(int i = 0; i < numArr.length; i++)
		{
			sum += Integer.parseInt(numArr[i]);
		}
		System.out.println(sum);

	}

}
