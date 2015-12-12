package a ;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	App tr = new App();
	int a = 4;
	int b= 5;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	// test
        assertTrue( true );
    }
    public void test1()
	{
		assertEquals(tr.add(a,b),9);
		assertEquals(tr.mul(a,b),20);
	}
    public void test2()
  	{
  		assertEquals(tr.sub(a,b),-1);
  		//assertEquals(tr.div(a,b),20);
  	}
    
}
