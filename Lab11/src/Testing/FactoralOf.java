package Testing;
import static org.junit.Assert.*;
import org.junit.Test;
public class FactoralOf {

	@Test
	public void test() {
		int num = 4;
		JunitTestingSuite Obj = new JunitTestingSuite();
		int Output = Obj.factorial(num);   
		System.out.println("Factorial of "+num+" is: "+Output); 
		assertEquals(24,Output);
	}
}


