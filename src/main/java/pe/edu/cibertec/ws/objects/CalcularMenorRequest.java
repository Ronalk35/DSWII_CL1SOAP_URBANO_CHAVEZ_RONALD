//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 01:36:42 PM PET 
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
 *         &lt;element name="numero1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "numero1",
    "numero2",
    "numero3",
    "numero4"
})
@XmlRootElement(name = "CalcularMenorRequest")
public class CalcularMenorRequest {

    protected int numero1;
    protected int numero2;
    protected int numero3;
    protected int numero4;

    /**
     * Obtiene el valor de la propiedad numero1.
     * 
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * Define el valor de la propiedad numero1.
     * 
     */
    public void setNumero1(int value) {
        this.numero1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero2.
     * 
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * Define el valor de la propiedad numero2.
     * 
     */
    public void setNumero2(int value) {
        this.numero2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero3.
     * 
     */
    public int getNumero3() {
        return numero3;
    }

    /**
     * Define el valor de la propiedad numero3.
     * 
     */
    public void setNumero3(int value) {
        this.numero3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero4.
     * 
     */
    public int getNumero4() {
        return numero4;
    }

    /**
     * Define el valor de la propiedad numero4.
     * 
     */
    public void setNumero4(int value) {
        this.numero4 = value;
    }

}
