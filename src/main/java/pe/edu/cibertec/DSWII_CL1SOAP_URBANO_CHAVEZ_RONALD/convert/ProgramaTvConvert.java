package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model.Personaje;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model.ProgramaTv;
import pe.edu.cibertec.ws.objects.ProgramaTvType;
import pe.edu.cibertec.ws.objects.UpdateRequest;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

@Component
public class ProgramaTvConvert {

    public static LocalDate convertToLocalDate(XMLGregorianCalendar fechaInicio) {
        return fechaInicio.toGregorianCalendar().toZonedDateTime().toLocalDate();
    }
    public ProgramaTv convertProgramaTvTypeToProgramaTv(UpdateRequest programaTvType) {
        ProgramaTv programaTv = new ProgramaTv();
        programaTv.setIdProgramaTv(programaTvType.getIdProgramaTv());
        programaTv.setTitulo(programaTvType.getTitulo());
        programaTv.setResumen(programaTvType.getResumen());

        if (programaTvType.getFechaInicio() != null) {
            programaTv.setFechaInicio(programaTvType.getFechaInicio().toGregorianCalendar().toZonedDateTime().toLocalDate());
        }

        Personaje personaje = new Personaje();
        personaje.setIdPersonaje(programaTvType.getIdPersonaje());
        programaTv.setPersonaje(personaje);

        return programaTv;
    }

    public ProgramaTvType convertProgramaTvToProgramaTvType(ProgramaTv programaTv) {
        ProgramaTvType programaTvType = new ProgramaTvType();
        programaTvType.setIdProgramaTv(programaTv.getIdProgramaTv());
        programaTvType.setTitulo(programaTv.getTitulo());
        programaTvType.setResumen(programaTv.getResumen());

        if (programaTv.getFechaInicio() != null) {
            programaTvType.setFechaInicio(convertToXMLGregorianCalendar(programaTv.getFechaInicio()));
        }

        programaTvType.setIdPersonaje(programaTv.getPersonaje().getIdPersonaje());
        return programaTvType;
    }

    private XMLGregorianCalendar convertToXMLGregorianCalendar(LocalDate localDate) {
        try {
            GregorianCalendar gregorianCalendar = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
