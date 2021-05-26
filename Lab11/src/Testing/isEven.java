package Testing;
import static org.junit.Assert.*;
import org.junit.Test;

public class isEven {

	@Test
	public void test() {
		JunitTestingSuite Obj = new JunitTestingSuite();
		boolean Output = Obj.issEven(26);
		assertEquals(true,Output);
	}
}


