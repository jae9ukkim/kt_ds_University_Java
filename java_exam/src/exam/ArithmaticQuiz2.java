package exam;

public class ArithmaticQuiz2 {

	public static void main(String[] args) {
		int processTime = 145;
		int minutes = processTime / 60;
		int seconds = processTime % 60;
//		minutes = processTime / 60;
//		seconds = processTime - (minutes * 60);
		
		System.out.println(processTime + "초는 " + minutes + "분 " + seconds + "초 입니다.");
	}

}
