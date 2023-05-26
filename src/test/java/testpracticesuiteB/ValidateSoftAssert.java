package testpracticesuiteB;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSoftAssert {
	
	@Test
	public void valiadte() {
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("ABC", "ABC");//pass
		sa.assertEquals("Avg", "jih");//fail
		sa.assertTrue(2>1, "null custom message");//pass
		sa.assertTrue(5<2, "custom error message");//fail
		sa.fail("intentional fail message");//fail
		
		sa.assertAll();
	} 

}
