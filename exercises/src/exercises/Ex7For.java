package exercises;

public class Ex7For {

	/* Given a positive integer, return a new array with n elements,
	 * containing the numbers 0, 1, 2, ... (n-1)
	 * 
	 * Note: same as the question in Ex6, but use for-loops this time!
	 * 
	 * Input: 4
	 * Output: {0, 1, 2, 3}
	 * */
	public static int[] q1_createArrayOfIndices(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	/* Given an positive integer n, return a string with n number of 1's
	 * 
	 * Input: 4
	 * Output: "1111"
	 * */
	public static String q2_numberOfOnes(int n) {
		String ones = "";
		for (int i = 0; i < n; i++) {
			ones = ones + "1";
		}
		return ones;
	}
	
	/* Given an array of integers, return true if there is an
	 * integer in the array that is larger than 10
	 * 
	 * Input: {1, -3, 5, -7, 9, -11, 13};
	 * Console Output: true
	 * */
	public static boolean q3_largerThan10(int[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] > 10) {
				return true;
			}
		}
		return false;
	}
	
	/* Given a non-empty array of integers, 
	 * return the largest integer in the array
	 * 
	 * Input: {1, -4, 10, 3, 22, -30}
	 * Output: 22
	 * */
	public static int q4_getLargestInt(int[] strArr) {
		int largestSoFar = strArr[0];
		for (int i = 1; i < strArr.length; i++) {
			if (strArr[i] > largestSoFar) {
				largestSoFar = strArr[i];
			}
		}
		return largestSoFar;
	}
	
	/* Given a non-empty 2D array of integers, 
	 * return the largest integer in the 2D array
	 * 
	 * Input: {{3, 1, -5, 10, 23},
	 *         {1, 44, -2, -6, 4},
	 *         {-5, -1, 3, 43, 2}}
	 * Output: 44
	 * */
	public static int q5_getLargestIntIn2DArray(int[][] str2DArr) {
		int largestSoFar = str2DArr[0][0];
		for (int i = 0; i < str2DArr.length; i++) {
			// Note: could also call forQ3 instead
			for (int j = 0; j < str2DArr[i].length; j++) {
				if (str2DArr[i][j] > largestSoFar) {
					largestSoFar = str2DArr[i][j];
				}
			}
		}
		return largestSoFar;
	}
	
	/* Given a non-empty array of integers,
	 * return the sum of all the elements
	 * 
	 * Input:{1, 2, 3, 4, 5}
	 * Output: 15
	 * */
	public static int q6_sumOfElements(int[] strArr) {
		int sum = 0;
		for (int i = 0; i < strArr.length; i++) {
			sum += strArr[i];
		}
		return sum;
	}
	
	
	/* Given a non-empty 2D array of integers
	 * find the row that has the largest sum, and return the sum
	 *  
	 * Input: {{3, 1, -5, 10, 23},
	 *         {1, 44, -2, -6, 4},
	 *         {-5, -1, 3, 43, 2}}
	 * Output: 42
	 * */
	public static int q7_sumOfLargestRow(int[][] str2DArr) {
		int largestSum = q6_sumOfElements(str2DArr[0]);
		for (int i = 1; i < str2DArr.length; i++) {
			int rowSum = q6_sumOfElements(str2DArr[i]);
			if (rowSum > largestSum) {
				largestSum = rowSum;
			}
		}
		return largestSum;
	}
	
}
