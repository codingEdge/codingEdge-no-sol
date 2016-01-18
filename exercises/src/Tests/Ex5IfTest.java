package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex5If;


public class Ex5IfTest {

	@Test
	public void q1_isZeroTest() {
		assertEquals("non-zero", Ex5If.q1_isZero(2));
		assertEquals("zero", Ex5If.q1_isZero(0));
		assertEquals("zero", Ex5If.q1_isZero(00));
		assertEquals("non-zero", Ex5If.q1_isZero(-2));
	}
	
	@Test
	public void q2_stringLengthOrNumTest() {
		assertEquals(0, Ex5If.q2_absoluteValue(0));
		assertEquals(3, Ex5If.q2_absoluteValue(3));
		assertEquals(3, Ex5If.q2_absoluteValue(-3));
	}
	
	@Test
	public void q3_getMaxTest() {
		assertEquals(0, Ex5If.q3_getMax(0, 0));
		assertEquals(1, Ex5If.q3_getMax(0, 1));
		assertEquals(1, Ex5If.q3_getMax(1, 0));
		assertEquals(3, Ex5If.q3_getMax(-3, 3));
		assertEquals(-3, Ex5If.q3_getMax(-4, -3));
	}
	
	@Test
	public void q4_getDayOfWeekTest() {
		assertEquals("monday", Ex5If.q4_getDayOfWeek(1).toLowerCase());
		assertEquals("tuesday", Ex5If.q4_getDayOfWeek(2).toLowerCase());
		assertEquals("wednesday", Ex5If.q4_getDayOfWeek(3).toLowerCase());
		assertEquals("thursday", Ex5If.q4_getDayOfWeek(4).toLowerCase());
		assertEquals("friday", Ex5If.q4_getDayOfWeek(5).toLowerCase());
		assertEquals("saturday", Ex5If.q4_getDayOfWeek(6).toLowerCase());
		assertEquals("sunday", Ex5If.q4_getDayOfWeek(7).toLowerCase());
	}
	
	@Test
	public void q5_getLetterGradeTest() {
		assertEquals("A", Ex5If.q5_getLetterGrade(100));
		assertEquals("A", Ex5If.q5_getLetterGrade(86));
		assertEquals("B", Ex5If.q5_getLetterGrade(85));
		assertEquals("B", Ex5If.q5_getLetterGrade(70));
		assertEquals("C", Ex5If.q5_getLetterGrade(69));
		assertEquals("C", Ex5If.q5_getLetterGrade(60));
		assertEquals("D", Ex5If.q5_getLetterGrade(59));
		assertEquals("D", Ex5If.q5_getLetterGrade(50));
		assertEquals("F", Ex5If.q5_getLetterGrade(49));
		assertEquals("F", Ex5If.q5_getLetterGrade(0));
		
	}
	
	@Test
	public void q6_getPosNegOddEvenTest() {
		assertEquals("zero", Ex5If.q6_getPosNegOddEven(0));
		assertEquals("positive odd", Ex5If.q6_getPosNegOddEven(1));
		assertEquals("positive even", Ex5If.q6_getPosNegOddEven(2));
		assertEquals("negative odd", Ex5If.q6_getPosNegOddEven(-1));
		assertEquals("negative even", Ex5If.q6_getPosNegOddEven(-2));
	}
	
	@Test
	public void q7_changeLetterGradeTest() {
		assertEquals("A", Ex5If.q7_changeLetterGrade("A", 0));
		assertEquals("B", Ex5If.q7_changeLetterGrade("B", 0));
		assertEquals("C", Ex5If.q7_changeLetterGrade("C", 0));
		assertEquals("D", Ex5If.q7_changeLetterGrade("D", 0));
		assertEquals("F", Ex5If.q7_changeLetterGrade("F", 0));
		
		assertEquals("A", Ex5If.q7_changeLetterGrade("A", 1));
		assertEquals("A", Ex5If.q7_changeLetterGrade("B", 1));
		assertEquals("B", Ex5If.q7_changeLetterGrade("C", 1));
		assertEquals("C", Ex5If.q7_changeLetterGrade("D", 1));
		assertEquals("D", Ex5If.q7_changeLetterGrade("F", 1));
		
		assertEquals("B", Ex5If.q7_changeLetterGrade("A", -1));
		assertEquals("C", Ex5If.q7_changeLetterGrade("B", -1));
		assertEquals("D", Ex5If.q7_changeLetterGrade("C", -1));
		assertEquals("E", Ex5If.q7_changeLetterGrade("D", -1));
		assertEquals("F", Ex5If.q7_changeLetterGrade("F", -1));
	}
}
