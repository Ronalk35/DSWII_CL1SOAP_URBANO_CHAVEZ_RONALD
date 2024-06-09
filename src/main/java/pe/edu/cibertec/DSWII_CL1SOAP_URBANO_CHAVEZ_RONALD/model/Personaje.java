package pe.edu.cibertec.DSWII_CL1SOAP_URBANO_CHAVEZ_RONALD.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class Personaje {

    @Id
    @Column(name = "IdPersonaje")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersonaje;

    @Column(name = "NomPersonaje")
    private String nomPersonaje;

    @Column(name = "ApePersonaje")
    private String apePersonaje;

    @Column(name = "FechNacPersonaje")
    private LocalDate fechNacPersonaje;

    // Constructor vacío
    public Personaje() {}

}