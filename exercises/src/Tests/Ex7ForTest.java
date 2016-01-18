package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex7For;


public class Ex7ForTest {
	
	@Test
	public void q1_createArrayOfIndicesTest() {
		assertArrayEquals(new int[]{}, Ex7For.q1_createArrayOfIndices(0));
		assertArrayEquals(new int[]{0}, Ex7For.q1_createArrayOfIndices(1));
		assertArrayEquals(new int[]{0, 1, 2, 3}, Ex7For.q1_createArrayOfIndices(4));
	}
	
	@Test
	public void q2_numberOfOnesTest() {
		assertEquals("", Ex7For.q2_numberOfOnes(-1));
		assertEquals("", Ex7For.q2_numberOfOnes(0));
		assertEquals("1", Ex7For.q2_numberOfOnes(1));
		assertEquals("111", Ex7For.q2_numberOfOnes(3));
		assertEquals("11111", Ex7For.q2_numberOfOnes(5));
	}
	
	@Test
	public void q3_largerThan10Test() {
		assertTrue(Ex7For.q3_largerThan10(new int[] {1, 2, 3, 11}));
		assertTrue(Ex7For.q3_largerThan10(new int[] {100}));
		assertFalse(Ex7For.q3_largerThan10(new int[] {}));
		assertFalse(Ex7For.q3_largerThan10(new int[] {-100}));
	}
	
	@Test
	public void q4_getLargestIntTest() {
		assertEquals(22, Ex7For.q4_getLargestInt(new int[] {1, -4, 10, 3, 22, -30}));
		assertEquals(-44, Ex7For.q4_getLargestInt(new int[] {-44}));
		assertEquals(3000000, Ex7For.q4_getLargestInt(new int[] {1, -4, 3000000, -100000000, 3}));
		assertEquals(-12, Ex7For.q4_getLargestInt(new int[] {-44, -12, -33}));
	}
	
	@Test
	public void q5_getLargestIntIn2DArrayTest() {
		assertEquals(-33, Ex7For.q5_getLargestIntIn2DArray(new int[][] {{-33}}));
		assertEquals(9, Ex7For.q5_getLargestIntIn2DArray(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
		assertEquals(44, Ex7For.q5_getLargestIntIn2DArray(new int[][] {{3, 1, -5, 10, 23}, {1, 44, -2, -6, 4}, {-5, -1, 3, 43, 2}}));
		assertEquals(10, Ex7For.q5_getLargestIntIn2DArray(new int[][] {{1,2}, {3, 4, 5, 6}, {7, 8, 9}, {10}}));
	}
	
	@Test
	public void q6_sumOfElementsTest() {
		assertEquals(1, Ex7For.q6_sumOfElements(new int[] {1}));
		assertEquals(6, Ex7For.q6_sumOfElements(new int[] {1, 2, 3}));
		assertEquals(10, Ex7For.q6_sumOfElements(new int[] {-10, 20}));
		assertEquals(15, Ex7For.q6_sumOfElements(new int[] {1, 2, 3, 4, 5}));
	}
	
	
	@Test
	public void q7_sumOfLargestRowTest() {
		assertEquals(-3, Ex7For.q7_sumOfLargestRow(new int[][] {{-3}}));
		assertEquals(24, Ex7For.q7_sumOfLargestRow(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
		assertEquals(42, Ex7For.q7_sumOfLargestRow(new int[][] {{3, 1, -5, 10, 23}, {1, 44, -2, -6, 4}, {-5, -1, 3, 43, 2}}));
		assertEquals(10, Ex7For.q7_sumOfLargestRow(new int[][] {{1,2}, {3, -4, 5, 6}, {-7, 8, 9}, {10}}));
	}
	
}
