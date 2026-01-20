package java_exam;

public class MethodExam {
	
	public static int computeAdd(int number1, int number2) {
		int computeResult = number1 + number2;
		return computeResult;
	}
	
	public static void printMyname(String name) {
		System.out.println("제 이름은 "+name+" 입니다.");
	}
	
	// 프로그램이 실행될 수 있는 메소드를 생성한다.
	public static void main(String[] args) {
		
		int resultAdd = computeAdd(22, 45);
		System.out.println(resultAdd);
//		System.out.println("제 이름은 김재국 입니다.");
//		System.out.println("제 이름은 홍길동 입니다.");
//		System.out.println("제 이름은 OOO 입니다.");
		printMyname("김재국");
		printMyname("홍길동");
		printMyname("OOO");
	}
}
