package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
public MainPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(id="reset")
    public WebElement reset;
    @FindBy(id="weigh")
    public WebElement weigh;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement result;
    @FindBy(id="left_0")
    public WebElement left_0;
    @FindBy(id="left_1")
    public WebElement left_1;
    @FindBy(id="left_2")
    public WebElement left_2;
    @FindBy(id="left_3")
    public WebElement left_3;
    @FindBy(id="left_4")
    public WebElement left_4;
    @FindBy(id="left_5")
    public WebElement left_5;
    @FindBy(id="left_6")
    public WebElement left_6;
    @FindBy(id="left_7")
    public WebElement left_7;
    @FindBy(id="left_8")
    public WebElement left_8;
    @FindBy(id="right_0")
    public WebElement right_0;
    @FindBy(id="right_1")
    public WebElement right_1;
    @FindBy(id="right_2")
    public WebElement right_2;
    @FindBy(id="right_3")
    public WebElement right_3;
    @FindBy(id="right_4")
    public WebElement right_4;
    @FindBy(id="right_5")
    public WebElement right_5;
    @FindBy(id="right_6")
    public WebElement right_6;
    @FindBy(id="right_7")
    public WebElement right_7;
    @FindBy(id="right_8")
    public WebElement right_8;
    @FindBy(id="coin_0")
    public WebElement number0;
    @FindBy(id="coin_1")
    public WebElement number1;
    @FindBy(id="coin_2")
    public WebElement number2;
    @FindBy(id="coin_3")
    public WebElement number3;
    @FindBy(id="coin_4")
    public WebElement number4;
    @FindBy(id="coin_5")
    public WebElement number5;
    @FindBy(id="coin_6")
    public WebElement number6;
    @FindBy(id="coin_7")
    public WebElement number7;
    @FindBy(id="coin_8")
    public WebElement number8;





}
