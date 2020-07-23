package epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class Hcontest {

	@Test
	public void test() {
		Hcon h=new Hcon();
		assertEquals(11250.00 ,h.cost("high", "yes", 4.5),0);
				
	}

}