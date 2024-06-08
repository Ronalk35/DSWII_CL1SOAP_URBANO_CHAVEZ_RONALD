package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service;

import org.springframework.stereotype.Service;

@Service
public class SumaMultiplosService {

    public int calcularSumaMultiplos() {
        int suma = 0;
        for (int i = 9; i <= 45; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
