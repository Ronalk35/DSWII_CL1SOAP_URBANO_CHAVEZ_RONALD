package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.endpoint;

import pe.edu.cibertec.ws.objects.JubilarseRequest;
import pe.edu.cibertec.ws.objects.JubilarseResponse;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service.JubilacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class JubilacionEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private JubilacionService jubilacionService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "JubilarseRequest")
    @ResponsePayload
    public JubilarseResponse puedeJubilarse(@RequestPayload JubilarseRequest request) {
        JubilarseResponse response = new JubilarseResponse();
        response.setPuedeJubilarse(jubilacionService.puedeJubilarse(request.getEdad(), request.getSexo()));
        return response;
    }
}