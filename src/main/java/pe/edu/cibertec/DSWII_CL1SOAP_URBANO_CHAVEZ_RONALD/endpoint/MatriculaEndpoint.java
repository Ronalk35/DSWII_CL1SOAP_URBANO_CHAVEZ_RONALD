package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.MatriculaRequest;
import pe.edu.cibertec.ws.objects.MatriculaResponse;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service.MatriculaService;

import java.math.BigDecimal;

@Endpoint
public class MatriculaEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private MatriculaService matriculaService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MatriculaRequest")
    @ResponsePayload
    public MatriculaResponse calcularCostoMatricula(@RequestPayload MatriculaRequest request) {
        MatriculaResponse response = new MatriculaResponse();
        double costoTotal = matriculaService.calcularCostoMatricula(request.getNumeroMaterias());
        BigDecimal costoTotalBigDecimal = BigDecimal.valueOf(costoTotal);
        response.setCostoTotal(costoTotalBigDecimal);
        return response;
    }
}
