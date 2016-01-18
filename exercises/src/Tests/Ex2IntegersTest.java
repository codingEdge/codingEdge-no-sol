package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex2Integers;

public class Ex2IntegersTest {
	
	@Test
	public void q1_addOneTest() {
		assertEquals(1, Ex2Integers.q1_addOne(0));
		assertEquals(0, Ex2Integers.q1_addOne(-1));
		assertEquals(1001, Ex2Integers.q1_addOne(1000));
	}
	
	@Test
	public void q2_minusOneTest() {
		assertEquals(0, Ex2Integers.q2_minusOne(1));
		assertEquals(-1, Ex2Integers.q2_minusOne(0));
		assertEquals(999, Ex2Integers.q2_minusOne(1000));
	}
	
	@Test
	public void q3_productTest() {
		assertEquals(-10, Ex2Integers.q3_product(10, -1));
		assertEquals(0, Ex2Integers.q3_product(10, 0));
		assertEquals(10, Ex2Integers.q3_product(10, 1));
		assertEquals(6, Ex2Integers.q3_product(2, 3));
		assertEquals(8, Ex2Integers.q3_product(2, 4));
	}
	
	@Test
	public void q4_remainderTest() {
		assertEquals(0, Ex2Integers.q4_remainder(10, 5));
		assertEquals(2, Ex2Integers.q4_remainder(10, 4));
		assertEquals(5, Ex2Integers.q4_remainder(5, 10));
		assertEquals(0, Ex2Integers.q4_remainder(5, 1));
	}
	
	@Test
	public void q5_stringToIntTest() {
		assertEquals(1, Ex2Integers.q5_stringToInt("1"));
		assertEquals(0, Ex2Integers.q5_stringToInt("0"));
		assertEquals(-1, Ex2Integers.q5_stringToInt("-1"));
	}
	
	@Test
	public void q6_totalStringsLengthTest() {
		assertEquals(0, Ex2Integers.q6_totalStringsLength("", ""));
		assertEquals(2, Ex2Integers.q6_totalStringsLength("a", "b"));
		assertEquals(10, Ex2Integers.q6_totalStringsLength("12345678", "hi"));
		assertEquals(4, Ex2Integers.q6_totalStringsLength("", "abcd"));
	}
}
