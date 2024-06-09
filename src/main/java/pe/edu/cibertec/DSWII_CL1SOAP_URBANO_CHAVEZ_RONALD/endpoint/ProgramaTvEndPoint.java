package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.convert.ProgramaTvConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service.ProgramaTvService;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model.ProgramaTv;
import pe.edu.cibertec.ws.objects.*;

import java.util.Optional;

@Endpoint
public class ProgramaTvEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    private final ProgramaTvService programaTvService;
    private final ProgramaTvConvert programaTvConvert;

    @Autowired
    public ProgramaTvEndPoint(ProgramaTvService programaTvService, ProgramaTvConvert programaTvConvert) {
        this.programaTvService = programaTvService;
        this.programaTvConvert = programaTvConvert;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateRequest")
    @ResponsePayload
    public CreateResponse createProgramaTv(@RequestPayload CreateRequest request) {
        CreateResponse response = new CreateResponse();

        // Verificar si los campos requeridos están presentes y no son nulos o vacíos
        if (request.getTitulo() == null || request.getTitulo().isEmpty() ||
                request.getResumen() == null || request.getResumen().isEmpty() ||
                request.getFechaInicio() == null ||
                request.getIdPersonaje() <= 0) {
            // Campos requeridos incompletos o inválidos
            response.setSuccess(false);
            return response;
        }

        // Crear un nuevo objeto ProgramaTv con los datos proporcionados en la solicitud
        ProgramaTv nuevoProgramaTv = new ProgramaTv();
        nuevoProgramaTv.setTitulo(request.getTitulo());
        nuevoProgramaTv.setResumen(request.getResumen());
        nuevoProgramaTv.setFechaInicio(ProgramaTvConvert.convertToLocalDate(request.getFechaInicio()));


        // Guardar el nuevo programa de TV en la base de datos
        ProgramaTv programaCreado = programaTvService.createProgramaTv(nuevoProgramaTv);

        // Verificar si se creó correctamente el programa de TV
        if (programaCreado != null) {
            response.setSuccess(true);
        } else {
            response.setSuccess(false);
        }
        return response;
    }




    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateRequest")
    @ResponsePayload
    public UpdateResponse updateProgramaTv(@RequestPayload UpdateRequest request) {
        UpdateResponse response = new UpdateResponse();

        // Obtener el ID del programa de TV a actualizar desde la solicitud
        int programaTvId = request.getIdProgramaTv();

        // Obtener el programa de TV existente por su ID
        Optional<ProgramaTv> optionalProgramaTv = programaTvService.getProgramaTvById(programaTvId);

        // Verificar si el programa de TV existe
        if (optionalProgramaTv.isPresent()) {
            // Obtener el programa de TV actualizado a partir de la solicitud
            ProgramaTv programaTv = programaTvConvert.convertProgramaTvTypeToProgramaTv(request);

            // Actualizar el programa de TV utilizando el servicio
            programaTvService.updateProgramaTv(programaTv);

            // Establecer el éxito de la operación en la respuesta
            response.setSuccess(true);
        } else {
            // El programa de TV no existe, establecer el éxito de la operación en falso
            response.setSuccess(false);
        }

        return response;
    }






    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchByIdRequest")
    @ResponsePayload
    public SearchByIdResponse searchProgramaTvById(@RequestPayload SearchByIdRequest request) {
        SearchByIdResponse response = new SearchByIdResponse();

        // Obtener el ID del programa de TV desde la solicitud
        int programaTvId = request.getIdProgramaTv();

        // Buscar el programa de TV por su ID utilizando el servicio
        ProgramaTv programa = programaTvService.getProgramaTvById(programaTvId).orElse(null);

        // Verificar si se encontró el programa de TV
        if (programa != null) {
            // Convertir el programa de TV encontrado a un objeto ProgramaTvType
            ProgramaTvType programaType = programaTvConvert.convertProgramaTvToProgramaTvType(programa);
            // Establecer el programa de TV en la respuesta
            response.setProgramaTv(programaType);
        }

        return response;
    }


}
