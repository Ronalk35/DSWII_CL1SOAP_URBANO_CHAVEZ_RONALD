package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service;

import org.springframework.stereotype.Service;

@Service
public class UtilidadesService {

    public double calcularUtilidades(double salarioMensual, int aniosTrabajados) {
        double utilidades = 0;

        if (aniosTrabajados < 1) {
            utilidades = salarioMensual * 0.05; // 5% del salario
        } else if (aniosTrabajados >= 1 && aniosTrabajados < 2) {
            utilidades = salarioMensual * 0.07; // 7% del salario
        } else if (aniosTrabajados >= 2 && aniosTrabajados < 5) {
            utilidades = salarioMensual * 0.10; // 10% del salario
        } else if (aniosTrabajados >= 5 && aniosTrabajados < 10) {
            utilidades = salarioMensual * 0.15; // 15% del salario
        } else if (aniosTrabajados >= 10) {
            utilidades = salarioMensual * 0.20; // 20% del salario
        }

        return utilidades;
    }
}
