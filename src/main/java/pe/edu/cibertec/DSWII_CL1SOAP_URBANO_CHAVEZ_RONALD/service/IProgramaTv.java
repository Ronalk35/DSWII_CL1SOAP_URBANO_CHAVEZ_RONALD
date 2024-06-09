package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.service;

import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model.ProgramaTv;

import java.util.List;
import java.util.Optional;

public interface IProgramaTv {
    ProgramaTv createProgramaTv(ProgramaTv programaTv);
    ProgramaTv updateProgramaTv(ProgramaTv programaTv);
    List<ProgramaTv> getAllProgramaTvs();
    Optional<ProgramaTv> getProgramaTvById(Integer id);
    void deleteProgramaTv(Integer id);
}