package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex8Algorithms;


public class Ex8AlgorithmsTest {
	
	@Test
	public void findMaxTest() {
		assertEquals(4, Ex8Algorithms.findMax(new int[] {1, 2, 3, 4}));
		assertEquals(10, Ex8Algorithms.findMax(new int[] {10}));
		assertEquals(-1, Ex8Algorithms.findMax(new int[] {-1, -2, -3, -4}));
		assertEquals(-10, Ex8Algorithms.findMax(new int[] {-10}));
	}
	
	@Test
	public void findMinTest() {
		assertEquals(1, Ex8Algorithms.findMin(new int[] {1, 2, 3, 4}));
		assertEquals(10, Ex8Algorithms.findMin(new int[] {10}));
		assertEquals(-4, Ex8Algorithms.findMin(new int[] {-1, -2, -3, -4}));
		assertEquals(-10, Ex8Algorithms.findMin(new int[] {-10}));
	}
	
	@Test
	public void isSortedTest() {
		assertTrue(Ex8Algorithms.isSorted(new int[] {-1, 0, 1, 2, 3, 4}));
		assertTrue(Ex8Algorithms.isSorted(new int[] {10}));
		assertTrue(Ex8Algorithms.isSorted(new int[] {}));
		assertFalse(Ex8Algorithms.isSorted(new int[] {-1, -2, -3, -4}));
	}
	
	@Test
	public void sortIntsTest() {
		int[] input = {3, 1, 2, 0, -2, -1};
		int[] output = {-2, -1, 0, 1, 2, 3};
		int[] ans = Ex8Algorithms.sortInts(input);
		
		for (int i = 0; i < ans.length; i++ ) {
			assertEquals(output[i], ans[i]);
		}
	}
	
	@Test
	public void numTriplesTest() {
		assertEquals(0, Ex8Algorithms.numTriples(""));
		assertEquals(0, Ex8Algorithms.numTriples("a"));
		assertEquals(0, Ex8Algorithms.numTriples("aa"));
		assertEquals(1, Ex8Algorithms.numTriples("aaa"));
		assertEquals(3, Ex8Algorithms.numTriples("aaaxxbbbyyccc"));
		assertEquals(2, Ex8Algorithms.numTriples("aaaa"));
		assertEquals(3, Ex8Algorithms.numTriples("aaaabbbccd"));
	}
	
	@Test
	public void fourInARowTest() {
		assertEquals(1, Ex8Algorithms.fourInARow(new int[] {1, 1, 1, 1, 2, 1, 1}));
		assertEquals(2, Ex8Algorithms.fourInARow(new int[] {1, 2, 2, 2, 2, 1, 1}));
		assertEquals(0, Ex8Algorithms.fourInARow(new int[] {1, 1, 1, 2, 2, 2, 1}));
		assertEquals(0, Ex8Algorithms.fourInARow(new int[] {1, 1, 1}));
	}
}
