package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "programatv")
@Getter
@Setter
public class ProgramaTv {

    @Id
    @Column(name = "IdProgramaTv")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProgramaTv;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Resumen")
    private String resumen;

    @Column(name = "FechaInicio")
    private LocalDate fechaInicio;

    @ManyToOne
    @JoinColumn(name = "IdPersonaje")
    private Personaje personaje;

    // Constructor vacío
    public ProgramaTv() {}

}