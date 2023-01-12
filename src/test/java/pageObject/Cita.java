package pageObject;

import actions.SelectOptions;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Cita extends PageObject {

    @FindBy(id = "combo_facility")
    public List<WebElementFacade> listCentro;

    @FindBy(id = "chk_hospotal_readmission")
    public WebElementFacade readmisionTxt;

    @FindBy(id = "radio_program_medicaid")
    public WebElementFacade programaTxt;

    @FindBy(id = "txt_visit_date")
    public WebElementFacade fechaTxt;

    @FindBy(id = "txt_comment")
    public WebElementFacade comentarioTxt;

    @FindBy(id = "btn-book-appointment")
    public WebElementFacade buttonReservar;

    @FindBy(xpath = "//section[@id='summary']/div[1]/div")
    public WebElementFacade confirmacionCita;

    public void selectCentro(String centro) {
        element(readmisionTxt).waitUntilVisible();
        SelectOptions.in(listCentro, centro);
        readmisionTxt.click();
    }

    public void selectfechayComentario(String fecha, String comentario) {
        programaTxt.click();
        fechaTxt.sendKeys(fecha);
        comentarioTxt.sendKeys(comentario);
        buttonReservar.click();
    }

    public void validarCita(String centro, String fecha, String comentario) {
        element(confirmacionCita).waitUntilVisible();
        boolean flagCentro = confirmacionCita.getText().contentEquals(centro);
        Assert.assertTrue(flagCentro);
        boolean flagFecha = confirmacionCita.getText().contentEquals(fecha);
        Assert.assertTrue(flagFecha);
        boolean flagcomentario = confirmacionCita.getText().contentEquals(comentario);
        Assert.assertTrue(flagcomentario);
    }
}
