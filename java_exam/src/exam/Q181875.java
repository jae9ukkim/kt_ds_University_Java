package exam;

public class Q181875 {

	public static void main(String[] args) {
		String[] strArr = {"AAA","BBB","CCC","DDD"};
		
		for(int i=0; i< strArr.length;i++) {
			if(i % 2 == 0) {
				strArr[i] = strArr[i].toLowerCase();
			} else {
				strArr[i] = strArr[i].toUpperCase();				
			}
			System.out.println(strArr[i]);			
		}
		

		String[] strArr2 = {"aBc","AbC"};
		for(int i=0; i< strArr2.length;i++) {
			if(i % 2 == 0) {
				strArr2[i] = strArr2[i].toLowerCase();
			} else {
				strArr2[i] = strArr2[i].toUpperCase();				
			}
			System.out.println(strArr2[i]);
		}

	}

}
