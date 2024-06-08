package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service.SumaMultiplosService;
import pe.edu.cibertec.ws.objects.SumaRequest;
import pe.edu.cibertec.ws.objects.SumaResponse;

@Endpoint
public class SumaMultiplosEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private SumaMultiplosService sumaMultiplosService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SumaRequest")
    @ResponsePayload
    public SumaResponse calcularSumaMultiplos(@RequestPayload SumaRequest request) {
        SumaResponse response = new SumaResponse();
        int suma = sumaMultiplosService.calcularSumaMultiplos();
        response.setSuma(suma);
        return response;
    }
}
