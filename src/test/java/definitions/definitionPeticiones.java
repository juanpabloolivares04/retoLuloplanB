package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.lulo.steps.stepsGetAll;

public class getdefinition {


    @Steps
    stepsGetAll objsteps;


    @Dado("^que Juan quiere ver los clientes registrados$")
    public void que_Juan_quiere_ver_los_clientes_registrados() {
        objsteps.getAll();
    }


    @Cuando("^se consuma el servicio get$")
    public void se_consuma_el_servicio_get() {
        objsteps.getAll();
    }

    @Entonces("^debe responder (\\d+) y mostrar los clientes$")
    public void debe_responder_y_mostrar_los_clientes(int status) {
        objsteps.getstatusAll(status);

    }
}
