package exercises;

public class Ex2Integers {
	
	/* Given an int i, return an int that is one larger
	 * 
	 * Input: 1
	 * Output: 2
	 * */
	public static int q1_addOne(int i) {
		return ++i;
	}
	
	/* Given an int i, return an int that is one smaller
	 * 
	 * Input: 1
	 * Output: 0
	 * */
	public static int q2_minusOne(int i) {
		return --i;
	}
	
	/* Given two integers a and b, return a multiplied by b
	 * 
	 * Input: a = 2, b = 4
	 * Output: 8
	 * */
	public static int q3_product(int a, int b) {
		return a * b;
	}

	/* Given two integers a and b, return the remainder of
	 * a / b (a divided by b).  Assume b is not zero.
	 * 
	 * Input: a = 5, b = 2
	 * Output: 1
	 * */
	public static int q4_remainder(int a, int b) {
		return a % b;
	}

	/* Given a string of numbers, convert it into an int
	 * 
	 * Assume the string is an actual integer.
	 * 
	 * Input: "123"
	 * Output: 123
	 * */
	public static int q5_stringToInt(String numStr) {
		return Integer.parseInt(numStr);
	}
	
	/* Given two strings, return the total length of the strings (as an int)
	 * 
	 * Input: "Hello", "World"
	 * Output: 10
	 * */
	public static int q6_totalStringsLength(String str1, String str2) {
		return str1.length() + str2.length();
	}
	
}
