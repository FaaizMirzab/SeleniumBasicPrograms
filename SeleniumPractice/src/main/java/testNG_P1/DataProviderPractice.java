package testNG_P1;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	@DataProvider
	public String[] getData() {
		String[] s= {" hai " , " this " ," is  "," mirzab  "};
		return s;
	}
	@Test(dataProvider="getData")
	public void user(String a) {
		Reporter.log(a,true );
	}
}
