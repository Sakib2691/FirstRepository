package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
WebDriver driver;
public PageObjectModel(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);


}
@FindBy(xpath="//input[@id='email']")//this is my locator(ex: id,name, xpath) but i prefer use xpath locator
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(xpath="//input[@id='pass']")
private WebElement password;
public WebElement getPassword() {
	return password;

}
@FindBy(xpath="//input[@value='Log In']")
private WebElement login;
public WebElement getLogin () {
return login;
}
}
