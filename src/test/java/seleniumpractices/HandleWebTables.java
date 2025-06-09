package seleniumpractices;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Utilities;

public class HandleWebTables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().enableRecording().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Utilities.readProperty("url"));
		driver.manage().window().maximize();

		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));

		// tableData.stream().forEach(e -> System.out.print(e.getText()+"\t"));

		tableData.stream().sorted(Comparator.comparing((WebElement e) -> e.getText()).reversed())
				.collect(Collectors.toList()).forEach(e -> System.out.println(e.getText()));

		System.out.println("###############################################################################");

		for (WebElement elm : tableData) {
			System.out.println(elm.getText());
		}

		System.out.println("#########################################");
		tableData.clear();
		tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td"));
		for (WebElement elm : tableData) {
			System.out.println(elm.getText());
		}

		System.out.println("#############################################");

		tableData.clear();
		tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
		for (WebElement elm : tableData) {
			System.out.println(elm.getText());
		}

		System.out.println("#############################################");
		tableData.clear();
		tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[4]/td[2]"));
		for (WebElement elm : tableData) {
			System.out.println(elm.getText());
		}

		// table[@id='table1']/tbody/tr/td[text()='Kishore' or text()='Bangalore']
		// table[@id='table1']/tbody/tr/td[text()='22' or text()='31' or
		// text()='Delhi']

	}

}
