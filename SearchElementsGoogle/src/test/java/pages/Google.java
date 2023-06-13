package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import util.PageBase;

public class Google extends PageBase {

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/browser/chromedriver.exe");
				//"C:\\Users\\juani\\OneDrive\\Documentos\\Proyectos Eclipse Sophos\\GalaxyTraining\\chromedriver.exe");
		bender = new ChromeDriver();
	}

	public void openGoogleURL() {
		bender.get("https://www.google.com/");
	}

	public void SearchBox() {
		if (bender.findElement(By.name("q")).isDisplayed()) {
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
	}

	public void SearchButton(){
		if (bender.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("Google search button is displayed");
		} else {
			System.out.println("Google search button is NOT displayed");
		}
	}

	public void LuckyButton() {
		if (bender.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I'm feeling lucky button is displayed");
		} else {
			System.out.println("I'm feeling lucky is NOT displayed");
		}
	}

	public void closeBrowser() {
		bender.close();
	}
}
