package Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FactoralOf.class, isEven.class,
	isOdd.class, PrimeNum.class })
public class AllTests {
}



