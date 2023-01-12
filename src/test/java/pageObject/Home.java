package pageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject {

    @FindBy(id = "menu-toggle")
    public WebElementFacade boxMenu;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    public WebElementFacade optionLogin;

    @FindBy(id = "txt-username")
    public WebElementFacade usernameTxt;

    @FindBy(id = "txt-password")
    public WebElementFacade PasswordTxt;

    @FindBy(id = "btn-login")
    public WebElementFacade buttonLogin;

    public void enterCredencials(String usuario, String password) {
        element(boxMenu).waitUntilVisible();
        boxMenu.click();
        optionLogin.click();
        usernameTxt.sendKeys(usuario);
        PasswordTxt.sendKeys(password);
        buttonLogin.click();
    }

}
