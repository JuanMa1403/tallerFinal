package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObject.Cita;
import pageObject.Home;

public class OpenCuraStepsDefinitions {

    @Steps
    Home home;

    @Steps
    Cita cita;

    @Given("^que el usuario ingresa a la web$")
    public void queElUsuarioIngresaALaWeb() {
        home.open();
    }

    @When("^el usuario ingresa sus credenciales (.*) y (.*)$")
    public void elUsuarioIngresaSusCredencialesUsuarioYPassword(String usuario, String password) {
        home.enterCredencials(usuario, password);
    }

    @And("^elige el centro de atencion (.*) y Solicitar readmision hospitalaria$")
    public void eligeElCentroDeAtencionCentroAtencionYSolicitarReadmisionHospitalaria(String centroAtencion) {
        cita.selectCentro(centroAtencion);
    }

    @And("^selecciona el programa de salud, elige una fecha (.*) y agrega comentario (.*)$")
    public void seleccionaElProgramaDeSaludEligeUnaFechaFechaYAgregaComentarioComentario(String fecha, String comentrio) {
        cita.selectfechayComentario(fecha, comentrio);
    }


    @Then("^verifica el contro de atencion (.*), fecha (.*), comentario (.*) y confirma la cita medica$")
    public void verificaElControDeAtencionCentroAtencionFechaFechaComentarioComentarioYConfirmaLaCitaMedica(String centroAtencion, String fecha, String comentrio) {

    }
}
