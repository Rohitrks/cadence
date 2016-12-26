package com.cadence.bench;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.cadence.genericLib.Driver;

public class TakeScreenshot {
	
	static WebDriver driver= Driver.driver;
	
	
	public File getScreenshot() throws IOException{
			File screenshot=((TakeScreenshot)driver).getScreenshot();
			org.apache.commons.io.FileUtils.copyFile(screenshot, new File("C:\\Users\\shrohit\\Documents\\GitHub\\cadence\\test-output\\screenshots"+".png"));
			return screenshot;
			
			
	}

}
