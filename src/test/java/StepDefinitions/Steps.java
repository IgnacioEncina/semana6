package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso abre el navegado google chrome");
		System.setProperty("webdriver.chrome.driver","P:\\IPLACEX\\Programas\\Driver-chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8087/LoginBancoPlatinum/faces/index.xhtml");
	}

	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso ingresa las credenciales del usuario");
		System.out.println("En este paso ingresa el nombre de usuario y contraseña en la pagina de login");
		driver.findElement(By.id("j_idt5:username")).sendKeys(string);
		driver.findElement(By.id("j_idt5:password")).sendKeys(string2);
	}

	@Then("ir a registrar")
	public void inicia_sesion() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo MyTest.feature");
		driver.findElement(By.id("j_idt11:irRegistro")).click();
	}

}
