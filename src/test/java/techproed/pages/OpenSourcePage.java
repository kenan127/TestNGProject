package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import javax.xml.xpath.XPath;

public class OpenSourcePage {

// Page Objectleri bu sinifta buluruz

//  1.Constructor olusturman gerekli. her page bir constructor ile baslamak zorunda. cunku dizaynda fonksiyon var

        public OpenSourcePage(){
            //PageFactory seleniumdan gelir ve bu sayfada elementlerini baslangic degeri vermek icin kullanilir.
            //Sayfa objeleri cagirildiginda Null pointer alinmaz. olmazsa olmaz yapi budur.
            PageFactory.initElements(Driver.getDriver(),this);

        }

// login icin 3 adet Page Object olustur.
// public WebElement username = Driver.getDriver().findElement(By.name("username")); --> Geleneksel

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;



}
