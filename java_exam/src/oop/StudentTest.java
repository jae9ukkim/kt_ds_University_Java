package oop;

public class StudentTest {

	public static void main(String[] args) {
//		Student student = new Student();
//		
//		student.java = 100;
//		student.python = 97;
//		student.cpp = 81;
//		student.csharp = 99;

		Student student = new Student(100, 97, 81, 99);
		
		int sum = student.getSumAllScores();
		double average = student.getAverage();
		double courseCredit = student.getCourseCredit();
		String abcdf = student.getABCDF();
		
		System.out.println("합계: " + sum);
		System.out.println("합계: " + average);
		System.out.println("합계: " + courseCredit);
		System.out.println("합계: " + abcdf);
	}
}
