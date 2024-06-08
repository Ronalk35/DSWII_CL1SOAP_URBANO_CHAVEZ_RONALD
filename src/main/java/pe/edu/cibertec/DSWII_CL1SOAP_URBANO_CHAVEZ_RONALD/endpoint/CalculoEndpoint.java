package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.endpoint;

import pe.edu.cibertec.ws.objects.CalcularMenorRequest;
import pe.edu.cibertec.ws.objects.CalcularMenorResponse;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculoEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private CalculoService calculoService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalcularMenorRequest")
    @ResponsePayload
    public CalcularMenorResponse calcularMenor(@RequestPayload CalcularMenorRequest request) {
        CalcularMenorResponse response = new CalcularMenorResponse();
        response.setMenor(calculoService.calcularMenor(request.getNumero1(), request.getNumero2(), request.getNumero3(), request.getNumero4()));
        return response;
    }
}