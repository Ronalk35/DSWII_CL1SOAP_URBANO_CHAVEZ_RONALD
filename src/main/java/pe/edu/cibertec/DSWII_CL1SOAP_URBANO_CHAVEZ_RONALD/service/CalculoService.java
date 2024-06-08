package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service;

import org.springframework.stereotype.Service;

@Service
public class CalculoService {
    public int calcularMenor(int num1, int num2, int num3, int num4) {
        return Math.min(Math.min(num1, num2), Math.min(num3, num4));
    }
}
