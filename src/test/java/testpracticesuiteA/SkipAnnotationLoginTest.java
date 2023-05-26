package testpracticesuiteA;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipAnnotationLoginTest {

	public class SearchAndBuyPhone {
		
		boolean flag=false;//to skip the annotation, we need to set the flag to true
		@Test(priority=1)
		public void search(ITestContext con) {
			if(flag) {
				throw new SkipException("Skip the annotation");
			}
			System.out.println("Searching Phone");
			con.setAttribute("phoneName", "iphone 14");
			

	}
		@Test(priority=2,dependsOnMethods={"search"}) 
		public void select(ITestContext con) {
			System.out.println("Selecting phone");
			System.out.println(con.getAttribute("phoneName"));
			
			//Assert.fail();
		}
		;
		@Test(priority=3, dependsOnMethods= {"search","select"})
		public void checkout(ITestContext con){
			System.out.println("checkout");
		}
}
}
