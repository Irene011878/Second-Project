package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingMap {
	
	WebDriver driver;
	
	public ShoppingMap(WebDriver driver) {
	this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement emailInput;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	public WebElement passInput;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
	public WebElement submitBtn;
	
	@FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a")
	public WebElement returnToHomeBtn;
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
	public WebElement productImage;
	

	
	//@FindBy(xpath = "//*[@id=\"quantity_wanted\"]")    
	//public WebElement txtQuantity;
	
	//@FindBy(xpath = "//*[@id=\"group_1\"]") 
	//public WebElement selectSize;
	
	//@FindBy(xpath = "//*[@id=\"color_11\"]")
	//public WebElement selectColor;
	
	@FindBy(xpath = "//span[contains(text(),\"Add to cart\")]")
	public WebElement addToCartBtn;             

	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	public WebElement firstCheckoutBtn;
	
	@FindBy(xpath = "//*[@id=\"cart_title\"]")
	public WebElement shopCartSummaryPageTitle;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	public WebElement secondCheckoutBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	public WebElement addressesPageTitle;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	public WebElement thirdCheckoutBtn;
	
	@FindBy(xpath = "//*[@id=\"carrier_area\"]/h1")
	public WebElement shippoingPageTitle;
	
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	public WebElement TermsBtn;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	public WebElement fourthCheckoutBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	public WebElement paymentMethodPageTitle;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	public WebElement wirePaymentBar;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	public WebElement confirmOrderBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	public WebElement conformationOrderPage;
	
	@FindBy(xpath = "//a[@class='product_img_link']")
	public WebElement imgMouseOv;
	
	//esta es otra clase o pantalla
	public void moveToImage() {

		Actions act = new Actions(driver);
		act.moveToElement(imgMouseOv).build().perform();


	}
	
	
	
	
	
}
