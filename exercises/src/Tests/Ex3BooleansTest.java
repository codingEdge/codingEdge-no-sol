package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex3Booleans;

public class Ex3BooleansTest {
	
	@Test
	public void q1_notBoolTest() {
		assertEquals(false, Ex3Booleans.q1_notBool(true));
		assertEquals(true, Ex3Booleans.q1_notBool(false));
	}
	
	@Test
	public void q2_bothTrueTest() {
		assertEquals(true, Ex3Booleans.q2_bothTrue(true, true));
		assertEquals(false, Ex3Booleans.q2_bothTrue(true, false));
		assertEquals(false, Ex3Booleans.q2_bothTrue(false, true));
		assertEquals(false, Ex3Booleans.q2_bothTrue(false, false));
	}
	
	public void q3_noneTrueTest() {
		assertEquals(true, Ex3Booleans.q3_noneTrue(false, false));
		assertEquals(false, Ex3Booleans.q3_noneTrue(false, true));
		assertEquals(false, Ex3Booleans.q3_noneTrue(true, false));
		assertEquals(false, Ex3Booleans.q3_noneTrue(true, true));
	}
	
	@Test
	public void q4_atLeastOneTrueTest() {
		assertEquals(true, Ex3Booleans.q4_atLeastOneTrue(true, true));
		assertEquals(true, Ex3Booleans.q4_atLeastOneTrue(true, false));
		assertEquals(true, Ex3Booleans.q4_atLeastOneTrue(false, true));
		assertEquals(false, Ex3Booleans.q4_atLeastOneTrue(false, false));
	}
	
	@Test
	public void q5_exactlyOneTrueTest() {
		assertEquals(false, Ex3Booleans.q5_exactlyOneTrue(true, true));
		assertEquals(true, Ex3Booleans.q5_exactlyOneTrue(true, false));
		assertEquals(true, Ex3Booleans.q5_exactlyOneTrue(false, true));
		assertEquals(false, Ex3Booleans.q5_exactlyOneTrue(false, false));
	}
	
	@Test
	public void q6_exactlyTwoTrueTest() {
		assertEquals(false, Ex3Booleans.q6_exactlyTwoTrue(false, false, false));
		assertEquals(false, Ex3Booleans.q6_exactlyTwoTrue(true, true, true));
		assertEquals(false, Ex3Booleans.q6_exactlyTwoTrue(false, false, true));
		assertEquals(false, Ex3Booleans.q6_exactlyTwoTrue(true, false, false));
		assertEquals(false, Ex3Booleans.q6_exactlyTwoTrue(false, true, false));
		assertEquals(true, Ex3Booleans.q6_exactlyTwoTrue(false, true, true));
		assertEquals(true, Ex3Booleans.q6_exactlyTwoTrue(true, true, false));
		assertEquals(true, Ex3Booleans.q6_exactlyTwoTrue(true, false, true));
	}
	
	@Test
	public void q7_oddNumberTrueTest() {
		assertEquals(false, Ex3Booleans.q7_oddNumberTrue(false, false, false, false, false));
		assertEquals(true, Ex3Booleans.q7_oddNumberTrue(false ,false, true, false, false));
		assertEquals(true, Ex3Booleans.q7_oddNumberTrue(false, false, false, false, true));
		assertEquals(true, Ex3Booleans.q7_oddNumberTrue(false, true, false, false, false));
		assertEquals(false, Ex3Booleans.q7_oddNumberTrue(false, true, false, false, true));
		assertEquals(false, Ex3Booleans.q7_oddNumberTrue(false, true, false, false, true));
		assertEquals(true, Ex3Booleans.q7_oddNumberTrue(false, true, true, false, true));
		assertEquals(false, Ex3Booleans.q7_oddNumberTrue(true, true, false, true, true));
		assertEquals(true, Ex3Booleans.q7_oddNumberTrue(true, true, true, true, true));
	}
	
	@Test
	public void q8_evenNumberTrueTest() {
		assertEquals(true, Ex3Booleans.q8_evenNumberTrue(false, false, false, false, false));
		assertEquals(false, Ex3Booleans.q8_evenNumberTrue(false ,false, true, false, false));
		assertEquals(false, Ex3Booleans.q8_evenNumberTrue(false, false, false, false, true));
		assertEquals(false, Ex3Booleans.q8_evenNumberTrue(false, true, false, false, false));
		assertEquals(true, Ex3Booleans.q8_evenNumberTrue(false, true, false, false, true));
		assertEquals(true, Ex3Booleans.q8_evenNumberTrue(false, true, false, false, true));
		assertEquals(false, Ex3Booleans.q8_evenNumberTrue(false, true, true, false, true));
		assertEquals(true, Ex3Booleans.q8_evenNumberTrue(true, true, false, true, true));
		assertEquals(false, Ex3Booleans.q8_evenNumberTrue(true, true, true, true, true));
	}	
}
