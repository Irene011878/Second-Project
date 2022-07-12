package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ShoppingMap;

public class ShoppingSteps {
	
	WebDriver driver;
	
	ShoppingMap sh;
	
	@Given("The user enter to login page")
	public void the_user_enter_to_login_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
		driver = new ChromeDriver();
	    sh = new ShoppingMap(driver);
	    driver.get("http://automationpractice.com/index.php?controller=authentication");
	}

	@When("The user enter username as {string}")
	public void the_user_enter_username_as(String email) {
		
		sh.emailInput.sendKeys(email);
	    
	}

	@When("The user enter password as {string}")
	public void the_user_enter_password_as(String password) {
		
		sh.passInput.sendKeys(password);
	    
	}

	@When("The user click on the sign in botton")
	public void the_user_click_on_the_sign_in_botton() {
		
		sh.submitBtn.click();
	    
	}

	@When("The user go to home page")
	public void the_user_go_to_home_page() {
		
		sh.returnToHomeBtn.click();
	   
	}

	//@When("The user select blouse image")
	//public void the_user_select_blouse_image() {
		
		//sh.productImage.click();
	    
	//}

	//@When("The user clear the information load in the page")
	//public void the_user_clear_the_information_load_in_the_page() {
		
		//sh.txtQuantity.clear();
		
	   
	//}

	//@When("The user fill the box quantity")
	//public void the_user_fill_the_box_quantity() {
		
		//sh.txtQuantity.sendKeys("2");
	    
	//}

	//@When("the user select the size")
	//public void the_user_select_the_size() {
		
		//sh.selectSize.sendKeys("M");
	    
	//}

	//@When("The user select color black")
	//public void the_user_select_color_black() {
		
		//sh.selectColor.isSelected();
	    
	//}

	@When("The user click add to cart botton")
	public void the_user_click_add_to_cart_botton() {
		sh.moveToImage();
		sh.addToCartBtn.click();
	    
	}

	@When("The user click on first proceed to checkout botton")
	public void the_user_click_on_first_proceed_to_checkout_botton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(sh.firstCheckoutBtn)).click();
		
	    
	}

	@When("The user go to the shopping cart summary page")
	public void the_user_go_to_the_shopping_cart_summary_page() {
		
		sh.shopCartSummaryPageTitle.isDisplayed();
	    
	}

	@When("The user click on second proceed to checkout button")
	public void the_user_click_on_second_proceed_to_checkout_button() {
		
		sh.secondCheckoutBtn.click();
	    
	}

	@When("The user go to the addresses page")
	public void the_user_go_to_the_addresses_page() {
		
		sh.addressesPageTitle.isDisplayed();
	    
	}

	@When("The user click on third proceed to checkout button")
	public void the_user_click_on_third_proceed_to_checkout_button() {
		
		sh.thirdCheckoutBtn.click();
	    
	}

	@When("The user go to the shipping page")
	public void the_user_go_to_the_shipping_page() {
		
		sh.shippoingPageTitle.isDisplayed();
	    
	}

	@When("The user click on accepting terms of service square")
	public void the_user_click_on_accepting_terms_of_service_square() {
		
		sh.TermsBtn.click();
	    
	}

	@When("The user click on fourth proceed to check out")
	public void the_user_click_on_fourth_proceed_to_check_out() {
		
		sh.fourthCheckoutBtn.click();
	    
	}

	@When("The user go to please choose your payment method page")
	public void the_user_go_to_please_choose_your_payment_method_page() {
		
		sh.paymentMethodPageTitle.isDisplayed();
	   
	}

	@When("The user click on pay by bank wire bar")
	public void the_user_click_on_pay_by_bank_wire_bar() {
		
		sh.wirePaymentBar.click();
	    
	}

	@When("The user click on confirm my order button")
	public void the_user_click_on_confirm_my_order_button() {
	    
		sh.confirmOrderBtn.click();
	}

	@Then("The user should see the orden confirmation")
	public void the_user_should_see_the_orden_confirmation() {
		
		sh.conformationOrderPage.isDisplayed();
		
		Assert.assertEquals(driver.getTitle(), "Order confirmation - My Store");
		driver.quit();
	    
	}

}
