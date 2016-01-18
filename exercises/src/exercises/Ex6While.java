package exercises;

public class Ex6While {
	
	/* Given a string name, and an integer n, 
	 * Return a string with the name repeated n number of times
	 * 
	 * Input: "Will", 3
	 * Ouput: "WillWillWill" 
	 * */
	public static String q1_printNameNumberofTimes(String name, int n) {
		int i = 0;
		String s = "";
		while (i < n) {
			s = s + name; // Can use concat too
			i++;
		}
		return s;
	}
	
	/* Given a positive integer, return a new array with n elements,
	 * containing the numbers 0, 1, 2, ... (n-1)
	 * 
	 * Input: 4
	 * Output: {0, 1, 2, 3}
	 * */
	public static int[] q2_createArrayOfIndices(int n) {
		int i = 0;
		int[] arr = new int[n];
		while (i < n) {
			arr[i] = i;
			i++;
		}
		return arr;
	}
	
	/* Given an array of integers and an integer i, return the index
	 * of the first occurrence of integer i in the array. If i is not in the array, return -1.
	 * 
	 * Input: {0, 0, 1, 5, -3, 5, 7}, i = 5
	 * Output: 3
	 * */
	public static int q3_findIndexOfInt(int[] arr, int i) {
		int x = 0;
		while (x < arr.length) {
			if (arr[x] != i) {
				x++;
			} else {
				return x;
			}
		}
		return -1;
	}
	
	
	/* Given an array of integers, return the number of 0s at the
	 * start of the array
	 * 
	 * Input: {0, 0, 1, 5, -3}
	 * Output: 2
	 * */
	public static int q4_zerosAtStart(int[] arr) {
		int startingZeros = 0;
		int i = 0;
		while (i < arr.length && arr[i] == 0) {
			startingZeros++;
			i++;
		}
		return startingZeros;
	}
	
	/* Given an array of integers, return the sum of all the integers
	 * 
	 * Input: {1, 9, -1, 3, 5, 0}
	 * Output: 17
	 * */
	public static int q5_totalSumIntArray(int[] arr) {
		int sum = 0;
		int i = 0;
		while (i < arr.length) {
			sum += arr[i];
			i++;
		}
		return sum;
	}
	/* Given an array of positive integers, and a threshold max,
	 * sum the starting values until it reaches the threshold, 
	 * and return the number of integers summed (0, if the threshold was not reached)
	 * 
	 * Input: {1, 3, 5, 2, 10}, 9
	 * Ouput: 3 		(first 3 numbers sum to 9, 1 + 3 + 5 = 9)
	 * */
	public static int q6_sumUntilThreshold(int[] arr, int max){
		int sum = 0;
		int i = 0;
		while (sum < max) {
			if (i >= arr.length) {
				return 0;
			}
			sum += arr[i];
			i++;
		}
		return i;
	}
	
}
