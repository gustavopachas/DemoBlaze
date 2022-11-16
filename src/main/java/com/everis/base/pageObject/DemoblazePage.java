package com.everis.base.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.demoblaze.com/index.html")
    public class DemoblazePage extends PageObject {
        @FindBy(id = "signin2")
        public WebElement signin2;

    @FindBy(id = "login2")
  // @FindBy(xpath = "/html/body/nav/div[1]/ul/li[5]/a")
    public WebElement login2;

    @FindBy(id = "loginusername")
    //@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[1]/input")
    public WebElement loginusername;

    @FindBy(id = "loginpassword")
    //@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[2]/input")
    public WebElement loginpassword;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
    public WebElementFacade btnlin;



    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/input")
    public WebElementFacade txtusuario;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/input")
    public WebElementFacade txtclave;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/button[2]")
    public WebElementFacade btnup;

    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[3]")
    public WebElementFacade Laptops;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    public WebElementFacade linkSony;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/a")
    public WebElementFacade agregarCarro;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[4]/a")
    public WebElementFacade confirmar;









}
