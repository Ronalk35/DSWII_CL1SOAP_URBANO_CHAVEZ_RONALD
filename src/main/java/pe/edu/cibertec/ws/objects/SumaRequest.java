//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 03:28:34 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="inicio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "inicio",
    "fin"
})
@XmlRootElement(name = "SumaRequest")
public class SumaRequest {

    protected int inicio;
    protected int fin;

    /**
     * Obtiene el valor de la propiedad inicio.
     * 
     */
    public int getInicio() {
        return inicio;
    }

    /**
     * Define el valor de la propiedad inicio.
     * 
     */
    public void setInicio(int value) {
        this.inicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fin.
     * 
     */
    public int getFin() {
        return fin;
    }

    /**
     * Define el valor de la propiedad fin.
     * 
     */
    public void setFin(int value) {
        this.fin = value;
    }

}
