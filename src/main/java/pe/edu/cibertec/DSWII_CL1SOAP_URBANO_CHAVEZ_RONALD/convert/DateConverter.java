package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.convert;

import java.time.LocalDate;


import javax.xml.datatype.XMLGregorianCalendar;

public class DateConverter {

    public static LocalDate convertToLocalDate(XMLGregorianCalendar fecha) {
        return fecha.toGregorianCalendar().toZonedDateTime().toLocalDate();
    }
}
