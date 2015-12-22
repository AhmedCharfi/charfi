package Tests;

import Rechner.Rechner;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Junit Tests for the calculator
 * @author acharfi
 *
 */
public class RechnerTest extends TestCase {
	Rechner tr = new Rechner();
	int a = 4;
	int b = 5;
	int c = -1;
	int d= -3 ;

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public RechnerTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(RechnerTest.class);
	}

	
	public void testCodeChekout() {
		// test
		assertTrue(true);
	}

	public void testAddandSub() {
		assertEquals(tr.add(a, b), 9);
		assertEquals(tr.add(c, d), -4);
		assertEquals(tr.add(a, d), 1);
		assertEquals(tr.sub(a, b), -1);
		assertEquals(tr.sub(c, d), 2);
	}

	public void testMulandDiv() {
		assertEquals(tr.mul(a, b), 20);
		assertEquals(tr.mul(c, d), 3);

		assertEquals(tr.div(a, b), 0);
		assertEquals(tr.div(c, d),0);
	}

	public void testDivisionByZero() {
		try {
			assertEquals(tr.div(a, 0), 0);
		} 
		catch (java.lang.IllegalArgumentException e) {
			System.out.println("cannot divide by 0");
		}

	}
	
	
	   public void testAddFail() {
	      // assertNotEquals(String message, long expected, long actual)
			assertFalse(0== tr.add(a, b));
			assertFalse(999== tr.add(c,d));
	   }

	public void testSubOperator() {
		tr.setA(a);
		tr.setB(b);
		tr.setOp("-");
		tr.getOperator(false, tr);
		assertTrue(tr.getRes()==-1);
		tr.setA(d);
		tr.setB(c);
		tr.setOp("-");
		tr.getOperator(false, tr);
		assertTrue(tr.getRes()==-2);

		
		}
	public void testWrongOperator()
	{
		tr.setA(a);
		tr.setB(b);
		tr.setOp("0");
		assertTrue(tr.getRes()==0);
		tr.setA(d);
		tr.setB(c);
		tr.setOp("hallo");
		assertTrue(tr.getRes()==0);

		
		
	}
	public void testWrongNumberFormat()
	{
		try
		{
		tr.setB(b);
		tr.setA(Integer.parseInt(""));
		
		tr.setOp("-");
		
		assertTrue(tr.getRes()==0);
		}
		catch(java.lang.IllegalArgumentException e)
		{
			System.out.println("Wrong number format");

		}
	}
	


}
