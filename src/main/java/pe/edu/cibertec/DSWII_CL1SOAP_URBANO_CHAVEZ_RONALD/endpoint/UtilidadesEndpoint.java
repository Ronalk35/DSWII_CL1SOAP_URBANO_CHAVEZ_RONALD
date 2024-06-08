package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service.UtilidadesService;
import pe.edu.cibertec.ws.objects.SalarioRequest;
import pe.edu.cibertec.ws.objects.SalarioResponse;

import java.math.BigDecimal;

@Endpoint
public class UtilidadesEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private UtilidadesService utilidadesService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SalarioRequest")
    @ResponsePayload
    public SalarioResponse calcularUtilidades(@RequestPayload SalarioRequest request) {
        SalarioResponse response = new SalarioResponse();
        double salarioMensual = request.getSalarioMensual().doubleValue();
        double utilidades = utilidadesService.calcularUtilidades(salarioMensual, request.getAniosTrabajados());
        response.setUtilidades(BigDecimal.valueOf(utilidades));
        return response;
    }
}
