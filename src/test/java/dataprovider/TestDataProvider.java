package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider
	public static Object[][] getdata(Method m){
		
		System.out.println("method which is calling this data provider is:" +m.getName());
		
		Object[][] data=new Object[3][4];//row..column
		if(m.getName().equals("createuser")) {
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
		}
		else if(m.getName().equals("deleteuser")) {
			
			data[0][0]="googleChrome";
			data[0][1]="Administrator";
			data[0][2]=1234567890;
			data[0][3]="indiaindia";
			
			//row2
			data[1][0]="MozillaFirefox";
			data[1][1]="superAdministarator";
			data[1][2]=543210987;
			data[1][3]="canadacanada";
			
			//row3
			data[2][0]="InternetExplorer";
			data[2][1]="Usergeneral";
			data[2][2]=678901234;
			data[2][3]="pakistanpakistan";
		}
	return data;
	}
	
}
