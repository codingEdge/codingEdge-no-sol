package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex6While;

public class Ex6WhileTest {
	
	@Test
	public void q1_printNameNumberofTimesTest() {
		assertEquals("WillWill", Ex6While.q1_printNameNumberofTimes("Will", 2));
		assertEquals("", Ex6While.q1_printNameNumberofTimes("Jeremy", 0));
		assertEquals("BobBobBobBobBob", Ex6While.q1_printNameNumberofTimes("Bob", 5));
	}
	
	@Test
	public void q2_createArrayOfIndicesTest() {
		assertArrayEquals(new int[]{}, Ex6While.q2_createArrayOfIndices(0));
		assertArrayEquals(new int[]{0}, Ex6While.q2_createArrayOfIndices(1));
		assertArrayEquals(new int[]{0, 1, 2, 3}, Ex6While.q2_createArrayOfIndices(4));
	}
	
	
	@Test
	public void q3_findIndexOfIntTest() {
		assertEquals(0, Ex6While.q3_findIndexOfInt(new int[] {0, 0, 1, 2, 3}, 0));
		assertEquals(3, Ex6While.q3_findIndexOfInt(new int[] {0, 0, 1, -1, -1}, -1));
		assertEquals(4, Ex6While.q3_findIndexOfInt(new int[] {0, 0, 1, 2, 3}, 3));
	}
	
	@Test
	public void q4_zerosAtStartTest() {
		assertEquals(2, Ex6While.q4_zerosAtStart(new int[] {0, 0, 1, 2, 3}));
		assertEquals(0, Ex6While.q4_zerosAtStart(new int[] {1, 0, 0, 1, 2, 3}));
		assertEquals(0, Ex6While.q4_zerosAtStart(new int[] {}));
	}
	
	@Test
	public void q5_totalSumIntArrayTest() {
		assertEquals(0, Ex6While.q5_totalSumIntArray(new int[] {}));
		assertEquals(0, Ex6While.q5_totalSumIntArray(new int[] {0}));
		assertEquals(6, Ex6While.q5_totalSumIntArray(new int[] {1, 2, 3}));
		assertEquals(6, Ex6While.q5_totalSumIntArray(new int[] {1, 2, 3, -3, -2, -1, 6}));
	}
	
	@Test
	public void q6_sumUntilThresholdTest(){
		assertEquals(0, Ex6While.q6_sumUntilThreshold(new int[] {0, 0, 0, 0, 0}, 1));
		assertEquals(0, Ex6While.q6_sumUntilThreshold(new int[] {0, 1, 2, 3, 4}, 100));
		assertEquals(5, Ex6While.q6_sumUntilThreshold(new int[] {0, 1, 2, 3, 4}, 10));
		assertEquals(3, Ex6While.q6_sumUntilThreshold(new int[] {1, 3, 5, 2, 10}, 9));
	}
	
}
