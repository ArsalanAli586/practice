package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNum {

	@Test
	public void test() {
		JunitTestingSuite Obj = new JunitTestingSuite();
		boolean Output = Obj.Prime(5);
		assertEquals(true,Output);
	}

}
