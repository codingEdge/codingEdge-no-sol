package exercises;

public class Ex4Arrays {
	
	/* Given an array of strings, return the first string in the array
	 * You may assume the array has at least 1 string.
	 * 
	 * Input: {"abc", "def", "ghi"}
	 * Output: "def"
	 * */
	public static String q1_firstString(String[] strs) {
		if (strs.length < 1) {
			return "";
		}
		return strs[0];
	}
	
	/* Given an array of strings, return the second string in the array
	 * You may assume the array has at least 2 strings.
	 * 
	 * Input: {"abc", "def", "ghi"}
	 * Output: "def"
	 * */
	public static String q2_secondString(String[] strs) {
		if (strs.length < 2) {
			return "";
		}
		return strs[1];
	}
	
	/* Given an array of integers, return the length of the array
	 * (the number of elements in the array).
	 * 
	 * Input: {1, 2, 3, 4, 5}
	 * Output: 5
	 * */
	public static int q3_getArrayLength(int[] intArr) {
		return intArr.length;
	}
	
	/* Given an array of integers, return the last integer in the array
	 * You may assume there is at least 1 integer in the array.
	 * 
	 * Input: {-1, 5, 3, 6, 8, 10}
	 * Output: 10
	 * */
	public static int q4_getLastInteger(int[] intArr) {
		if (intArr.length == 0) {
			return 0;
		}
		return intArr[intArr.length - 1];
	}
	
	/* Given an odd length array of integers, return the middle integer.
	 * You may assume there is at least 1 integer in the array.
	 * 
	 * Note: Decimals in integers are truncated.  For example, 5/2 = 2.
	 * 
	 * Input: {-1, 5, 10, 4, -2}
	 * Output: 10
	 * */
	public static int q5_getMiddleInteger(int[] intArr) {
		if (intArr.length == 0) {
			return 0;
		}
		int middle = intArr.length / 2;
		return intArr[middle];
	}
	
	
	/* Given an array of strings, return a new array with 
	 * the first string and last string swapped. 
	 * You may assume there is at least 1 string in the array.
	 * 
	 * Input: {"a", "b", "c", "d", "e"}
	 * Output: {"e", "b", "c", "d", "a"}
	 * */
	public static String[] q6_swapStartAndEnd(String[] strArr) {
		String temp = strArr[0];
		strArr[0] = strArr[strArr.length - 1];
		strArr[strArr.length - 1] = temp;
		return strArr;
	}
}
