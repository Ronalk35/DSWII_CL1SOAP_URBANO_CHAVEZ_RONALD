package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service;

import org.springframework.stereotype.Service;

@Service
public class MatriculaService {
    private static final double COSTO_POR_MATERIA = 520.0;
    private static final double DESCUENTO_POR_MAS_DE_5_MATERIAS = 0.10;

    public double calcularCostoMatricula(int numeroMaterias) {
        double costoTotal = numeroMaterias * COSTO_POR_MATERIA;

        // Aplicar descuento si el número de materias es mayor a 5
        if (numeroMaterias > 5) {
            costoTotal -= costoTotal * DESCUENTO_POR_MAS_DE_5_MATERIAS;
        }

        return costoTotal;
    }
}