package testpracticesuiteA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

public class CreateUser {
	
	//@Test(dataProvider="getdata")//step 2..mapping provider to test
	@Test(dataProviderClass = TestDataProvider.class, dataProvider="getdata")
	public void createuser(String browser, String usertype, int phone, String place) { //no of parameter=no of columns
		System.out.println(browser + "....."+usertype+"........"+phone+"......."+place );
}
	
	/*//step 1
	@DataProvider
	public Object[][] getdata(){
		Object[][] data=new Object[3][4];//row..column
		//row1
	data[0][0]="Chrome";
	data[0][1]="Admin";
	data[0][2]=12345;
	data[0][3]="india";
	
	//row2
	data[1][0]="Mozilla";
	data[1][1]="superAdmin";
	data[1][2]=54321;
	data[1][3]="canada";
	
	//row3
	data[2][0]="IE";
	data[2][1]="User";
	data[2][2]=67890;
	data[2][3]="pakistan";
	
	return data;
	}*/
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider="getdata")
	public void deleteuser(String browser, String usertype, int phone, String place) { //no of parameter=no of columns
		System.out.println(browser + "....."+usertype+"........"+phone+"......."+place );

}
}
