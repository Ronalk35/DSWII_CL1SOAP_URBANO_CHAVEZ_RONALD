package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service;

import org.springframework.stereotype.Service;

@Service
public class JubilacionService {
    public boolean puedeJubilarse(int edad, String sexo) {
        if ("Hombre".equalsIgnoreCase(sexo) && edad >= 60) {
            return true;
        } else if ("Mujer".equalsIgnoreCase(sexo) && edad >= 54) {
            return true;
        }
        return false;
    }
}
