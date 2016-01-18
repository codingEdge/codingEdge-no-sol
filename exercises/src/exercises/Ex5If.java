package exercises;

public class Ex5If {
	
	public Ex5If() {}
	
	/* Given an integer i, return the String "zero" if the integer
	 * is 0, otherwise return the String "non-zero".
	 * 
	 * Input: 0
	 * Output: "zero"
	 * */
	public static String q1_isZero(int i) {
		if (i == 0) {
			return "zero";
		}
		return "non-zero";
	}
	
	/* Given an integer x, return it absolute value (convert
	 * negative integers to positive integers by dropping the 
	 * negative sign).
	 * 
	 * Input: -4
	 * Output: 4
	 * */
	public static int q2_absoluteValue(int x) {
		if (x > 0) {
			return x;
		} else {
			return -1*x;
		}
	}
	
	/* Given two integers x and y, return the larger integer.
	 * 
	 * Input: x = 3, y = 5
	 * Output: 5
	 * */
	public static int q3_getMax(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	
	
	
	/* Given an integer between 1 and 7, return the name
	 * of the corresponding day of the week.  Assume that
	 * "Monday" is corresponds to the number 1.
	 * 
	 * (If the integer is not between 1 and 7, you may return
	 * "Invalid day")
	 * 
	 * Input: 2
	 * Output: "Tuesday"
	 * */
	public static String q4_getDayOfWeek(int day) {
		if (day == 1) {
			return "Monday";
		} else if (day == 2) {
			return "Tuesday";
		} else if (day == 3) {
			return "Wednesday";
		} else if (day == 4) {
			return "Thursday";
		} else if (day == 5) {
			return "Friday";
		} else if (day == 6) {
			return "Saturday";
		} else if (day == 7) {
			return "Sunday";
		} else {
			return "Invalid day";
		}
	}
	
	/* Given an integer grade between 0 and 100, return the
	 * corresponding letter grade.
	 * 
	 * "A" = 86-100
	 * "B" = 70-85
	 * "C" = 60-69
	 * "D" = 50-59
	 * "F" = 0-49
	 * 
	 * Input: 85
	 * Output: "B"
	 * */
	public static String q5_getLetterGrade(int grade) {
		String letter;
		if (grade >= 86) {
			letter = "A";
		} else if (grade >= 70) {
			letter = "B";
		} else if (grade >= 60) {
			letter = "C";
		} else if (grade >= 50) {
			letter = "D";
		} else {
			letter = "F";
		}
		return letter;
	}
	
	/* Given an integer, return whether or not the integer
	 * is positive or negative, and even or odd. If the number 
	 * is zero, return "zero"
	 * 
	 * Input: -251 
	 * Output: "negative odd"
	 * */
	public static String q6_getPosNegOddEven(int n) {
		if (n == 0) {
			return "zero";
		}
		
		String str = "";
		if (n > 0) {
			str += "positive ";
		} else {
			str += "negative ";
		}
		
		if (n % 2 == 0) {
			str += "even";
		} else {
			str += "odd";
		}
		
		return str;
	}
	
	/* Given a students current grade and an integer n representing the change 
	 * in the students, return the student's new letter grade. When n=1, the student's
	 * grade goes up by 1. When n=0, the student's grade doesn't change. When n=-1, 
	 * the student's grade goes down by 1.
	 * 
	 * The grades from highest to lowest are "A", "B", "C", "D", "F". Grades cannot
	 * go lower than "F" or higher than "A".
	 * 
	 * Input: "B", 1 
	 * Output: "A"
	 * */
	public static String q7_changeLetterGrade(String currentGrade, int n) {
		if (n == 0) {
			return currentGrade;
		} else if (n > 0) {
			if (currentGrade == "A") {
				return "A";
			} else if (currentGrade == "B") {
				return "A";
			} else if (currentGrade == "C") {
				return "B";
			} else if (currentGrade == "D") {
				return "C";
			} else {
				return "D";
			}
		} else {
			if (currentGrade == "A") {
				return "B";
			} else if (currentGrade == "B") {
				return "C";
			} else if (currentGrade == "C") {
				return "D";
			} else if (currentGrade == "D") {
				return "E";
			} else {
				return "F";
			}
		}
	}
}
