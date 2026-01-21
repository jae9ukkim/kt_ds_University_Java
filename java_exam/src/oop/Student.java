package oop;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	double getAverage() {
//		double average = getSumAllScores() / (double)4;
//		average = Math.round(average * 100);
//		average /= 100;
//		return average;
		int average = (int)(getSumAllScores() / 4.0 * 100);
		return average / 100.0;
	}
	
	double getCourseCredit() {
//		double courceCredit = (getAverage() - 55) / 10;
//		courceCredit = Math.round(courceCredit * 100) / (double) 100; 
//		return courceCredit;
		int courceCredit = (int)((getAverage() - 55) / 10.0 * 100);
		return courceCredit / 100.0;
	}
	
	String getABCDF() {
		double courceCredit = getCourseCredit();
		if(courceCredit > 4.0) {
			return "A+";
		}
		else if(courceCredit > 3.5) {
			return "A";
		} 
		else if(courceCredit > 3.0) {
			return "B+";
		} 
		else if(courceCredit > 2.5) {
			return "B";
		} 
		else if(courceCredit > 1.5) {
			return "C";
		} 
		else if(courceCredit > 0.5) {
			return "D";
		} 
		return "F";
	}
	
}
