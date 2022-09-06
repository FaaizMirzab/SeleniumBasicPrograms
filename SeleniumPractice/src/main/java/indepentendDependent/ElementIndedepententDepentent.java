package indepentendDependent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIndedepententDepentent {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//driver.get("http:/www.amazon.com");
		driver.get("https://www.amazon.in/s?hidden-keywords=B08SFFS6CK+%7C+B08SF85H45+%7C+B08SFFP19B+%7C+B097RZ2Z2F+%7C+B097RXPRMJ+%7C+B0924SKD58+%7C+B0924W6MVQ+%7C+B0924XD9G8+%7C+B09BNZ3PJD+%7C+B091MC66JP+%7C+B08LBBPLPT+%7C+B08D77XZX5+%7C+B08D76LSFJ+%7C+B08D76XV4R+%7C+B09DD9SX9Z+%7C+B09DD7N79Q+%7C+B09DDBN1YH+%7C+B09P48RZVX+%7C+B09B4671KM+%7C+B09B45Y4T2+%7C+B09B45QY33+%7C+B09BNZLTDZ+%7C+B091M94DWS+%7C+B091MP2RZ3+%7C+B08S1BCT5Q+%7C+B08S1B1P3L+%7C+B08S18FJLH+%7C+B09BLCJZ2K+%7C+B09BLDCK38+%7C+B09DDCF3C8+%7C+B09DD9LWZM+%7C+B08DB8Z972+%7C+B0917GZ793+%7C+B08S19YC6H+%7C+B08S19N234+%7C+B08S19RGWG+%7C+B08S1BG922+%7C+B08S16DMFH+%7C+B0924TF1PG+%7C+B0924TRKS5+%7C+B0924VW867+%7C+B08S18HVD5+%7C+B08S16JKT8+%7C+B094NTQTK8+%7C+B094NTX33X+%7C+B09XBH4F47&pd_rd_r=95d128d2-8f05-4485-b3a5-6f8bc8b9c47e&pd_rd_w=l2gZv&pd_rd_wg=9ThCK&pf_rd_p=649d7b99-b118-4125-8c89-5c7438979475&pf_rd_r=R4ZGJFE8T8EFHG40NG50&ref=pd_gw_unk");
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4'])[1]/../..//div[@class='a-row a-size-base a-color-base']"));
	}  

}

	