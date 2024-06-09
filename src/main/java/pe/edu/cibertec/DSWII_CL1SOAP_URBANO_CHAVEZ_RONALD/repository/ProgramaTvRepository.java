package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model.ProgramaTv;

public interface ProgramaTvRepository extends JpaRepository<ProgramaTv, Integer> {
    ProgramaTv findByIdProgramaTv(Integer idProgramaTv);
}
