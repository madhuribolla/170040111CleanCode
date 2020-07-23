package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class simcitest {

	@Test
	public void test() {
		Simci s=new Simci();
		assertEquals(1500.00,s.SimpleInterest(10000.00, 3, 5.00),0);	
	}
	@Test
	public void testCompoundInterest() {
		Simci s=new Simci();
		assertEquals(1210.0000000000002,s.CompoundInterest(1000, 2, 10),0);
	}
}