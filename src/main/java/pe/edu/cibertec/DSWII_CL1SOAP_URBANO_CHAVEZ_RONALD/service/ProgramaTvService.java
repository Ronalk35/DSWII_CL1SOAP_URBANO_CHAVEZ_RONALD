package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model.ProgramaTv;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.repository.ProgramaTvRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramaTvService implements IProgramaTv {

    @Autowired
    private ProgramaTvRepository programaTvRepository;

    @Override
    public ProgramaTv createProgramaTv(ProgramaTv programaTv) {
        return programaTvRepository.save(programaTv);
    }

    @Override
    public ProgramaTv updateProgramaTv(ProgramaTv programaTv) {
        // Obtener el programa de TV existente por su ID
        Optional<ProgramaTv> optionalProgramaTv = programaTvRepository.findById(programaTv.getIdProgramaTv());

        // Verificar si el programa de TV existe
        if (optionalProgramaTv.isPresent()) {
            // Actualizar el programa de TV existente con los nuevos datos
            ProgramaTv existingProgramaTv = optionalProgramaTv.get();
            existingProgramaTv.setTitulo(programaTv.getTitulo());
            existingProgramaTv.setFechaInicio(programaTv.getFechaInicio());


            // Guardar y devolver el programa de TV actualizado
            return programaTvRepository.save(existingProgramaTv);
        } else {
            // Manejar la situación donde el programa de TV no existe
            // Aquí puedes lanzar una excepción, devolver nulo o hacer algo más dependiendo de tus requerimientos
            return null;
        }
    }

    @Override
    public List<ProgramaTv> getAllProgramaTvs() {
        return programaTvRepository.findAll();
    }

    @Override
    public Optional<ProgramaTv> getProgramaTvById(Integer id) {
        return programaTvRepository.findById(id);
    }

    @Override
    public void deleteProgramaTv(Integer id) {
        programaTvRepository.deleteById(id);
    }
}
