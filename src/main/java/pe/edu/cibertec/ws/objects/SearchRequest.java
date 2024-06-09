//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 04:39:47 PM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicioDesde" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicioHasta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IdPersonaje" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "titulo",
    "resumen",
    "fechaInicioDesde",
    "fechaInicioHasta",
    "idPersonaje"
})
@XmlRootElement(name = "SearchRequest")
public class SearchRequest {

    @XmlElement(name = "Titulo")
    protected String titulo;
    @XmlElement(name = "Resumen")
    protected String resumen;
    @XmlElement(name = "FechaInicioDesde")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioDesde;
    @XmlElement(name = "FechaInicioHasta")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioHasta;
    @XmlElement(name = "IdPersonaje")
    protected Integer idPersonaje;

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad resumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * Define el valor de la propiedad resumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumen(String value) {
        this.resumen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioDesde() {
        return fechaInicioDesde;
    }

    /**
     * Define el valor de la propiedad fechaInicioDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioDesde(XMLGregorianCalendar value) {
        this.fechaInicioDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioHasta() {
        return fechaInicioHasta;
    }

    /**
     * Define el valor de la propiedad fechaInicioHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioHasta(XMLGregorianCalendar value) {
        this.fechaInicioHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersonaje.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPersonaje() {
        return idPersonaje;
    }

    /**
     * Define el valor de la propiedad idPersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPersonaje(Integer value) {
        this.idPersonaje = value;
    }

}
