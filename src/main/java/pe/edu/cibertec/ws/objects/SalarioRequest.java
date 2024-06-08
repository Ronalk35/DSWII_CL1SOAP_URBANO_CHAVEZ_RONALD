//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 02:37:31 PM PET 
//


package pe.edu.cibertec.ws.objects;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="salarioMensual" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="aniosTrabajados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salarioMensual",
    "aniosTrabajados"
})
@XmlRootElement(name = "SalarioRequest")
public class SalarioRequest {

    @XmlElement(required = true)
    protected BigDecimal salarioMensual;
    protected int aniosTrabajados;

    /**
     * Obtiene el valor de la propiedad salarioMensual.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * Define el valor de la propiedad salarioMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalarioMensual(BigDecimal value) {
        this.salarioMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad aniosTrabajados.
     * 
     */
    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    /**
     * Define el valor de la propiedad aniosTrabajados.
     * 
     */
    public void setAniosTrabajados(int value) {
        this.aniosTrabajados = value;
    }

}
