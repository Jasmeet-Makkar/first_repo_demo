package testpracticesuiteB;

import org.testng.annotations.Test;


public class SearchAndBuyPhone {
	
	@Test(priority=1)
	public void search() {
		System.out.println("Searching Phone");

}
	@Test(priority=2)
	public void select() {
		System.out.println("Selecting phone");
	}
	
	@Test(priority=3)
	public void checkout(){
		System.out.println("checkout");
	}
}
