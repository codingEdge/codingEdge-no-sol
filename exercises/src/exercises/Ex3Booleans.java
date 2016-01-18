package exercises;

public class Ex3Booleans {
	
	/* Given a boolean, return true if the boolean is false, and false
	 * if the boolean is true

	 * Input: true
	 * Output: false
	 * */
	public static boolean q1_notBool(boolean bool1) {
		return !bool1;
	}
	
	/* Given two booleans, return true if and only if both are true
	 * 
	 * Input: true, true
	 * Output: true
	 * */
	public static boolean q2_bothTrue(boolean bool1, boolean bool2) {
		return bool1 && bool2;
	}
	
	/* Given two booleans, return true if and only if both are false
	 * 
	 * Input: false, false
	 * Output: true
	 * */
	public static boolean q3_noneTrue(boolean bool1, boolean bool2) {
		return !(bool1 || bool2);
	}
	
	/* Given two booleans, return true if at least 1 is true
	 * 
	 * Input: true, false
	 * Output: true
	 * */
	public static boolean q4_atLeastOneTrue(boolean bool1, boolean bool2) {
		return bool1 || bool2;
	}
	
	/* Given two booleans, return true if and only if exactly 
	 * one of them is true
	 * 
	 * Input: true, false
	 * Output: true
	 * */
	public static boolean q5_exactlyOneTrue(boolean bool1, boolean bool2) {
		return bool1 ^ bool2; // (bool1 || bool2) && !(bool1 && bool2);
	}
	
	/* Given three booleans, return true if and only if exactly 
	 * 2 of the 3 booleans are true
	 * 
	 * Input: true, false, true
	 * Output: true
	 * */
	public static boolean q6_exactlyTwoTrue(boolean bool1, boolean bool2, boolean bool3) {
		return ((bool1 ^ bool2) && bool3) 
				|| (bool1 && bool2 && !bool3);
	}
	
	/* Given 5 booleans, return true if and only if there are an odd number 
	 * of true values
	 *
	 * Input: true, false, true, true, false
	 * Output: true
	 * */
	public static boolean q7_oddNumberTrue(boolean bool1, boolean bool2, boolean bool3, boolean bool4, boolean bool5) {
		return bool1 ^ bool2 ^ bool3 ^ bool4 ^ bool5;
	}
	
	/* Given 5 booleans, return true if and only if there are an even number 
	 * of true values 
	 *
	 * Assume 0 is an even number
	 *
	 * Input: true, false, true, false, false
	 * Output: true
	 * */
	public static boolean q8_evenNumberTrue(boolean bool1, boolean bool2, boolean bool3, boolean bool4, boolean bool5) {
		return !(bool1 ^ bool2 ^ bool3 ^ bool4 ^ bool5);
		// can also do !q7_oddNumberTrue(bool1, bool2, bool3, bool4, bool5);
	}	
}
