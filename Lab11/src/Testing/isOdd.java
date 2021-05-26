package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class isOdd {

	@Test
	public void test() {
		JunitTestingSuite Obj = new JunitTestingSuite();
		boolean Output = Obj.issOdd(17);
		assertEquals(true,Output);
	}

}









