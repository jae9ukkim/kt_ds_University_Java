package exam;

public class Q2908 { // for, charAt, Integer.parseInt, split

	public static void main(String[] args) {
		
		String str = "734 893";
		String[] num = str.split(" ");
		String num1 = "";
		String num2 = "";
		
		for(int i=num[0].length() -1 ; i >= 0; i--) {
			
			num1 += num[0].charAt(i) + "";
		}
		for(int i=num[1].length() -1 ; i >= 0; i--) {
			
			num2 += num[1].charAt(i) + "";
		}
		
		if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
			System.out.println(num1);
		} else {
			System.out.println(num2);			
		}
		
		
		str = "221 231";
		num = str.split(" ");
		num1 = "";
		num2 = "";
		
for(int i=num[0].length() -1 ; i >= 0; i--) {
			
			num1 += num[0].charAt(i) + "";
		}
		for(int i=num[1].length() -1 ; i >= 0; i--) {
			
			num2 += num[1].charAt(i) + "";
		}
		
		if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
			System.out.println(num1);
		} else {
			System.out.println(num2);			
		}
		
		str = "839 237";
		num = str.split(" ");
		num1 = "";
		num2 = "";
		
		for(int i=num[0].length() -1 ; i >= 0; i--) {
			
			num1 += num[0].charAt(i) + "";
		}
		for(int i=num[1].length() -1 ; i >= 0; i--) {
			
			num2 += num[1].charAt(i) + "";
		}
		
		if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
			System.out.println(num1);
		} else {
			System.out.println(num2);			
		}

	}

}
