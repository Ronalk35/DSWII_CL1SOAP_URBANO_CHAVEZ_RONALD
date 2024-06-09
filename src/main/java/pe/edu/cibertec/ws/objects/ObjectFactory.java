//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 04:39:47 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.ws.objects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.ws.objects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateRequest }
     * 
     */
    public CreateRequest createCreateRequest() {
        return new CreateRequest();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link SearchByIdRequest }
     * 
     */
    public SearchByIdRequest createSearchByIdRequest() {
        return new SearchByIdRequest();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link ProgramaTvType }
     * 
     */
    public ProgramaTvType createProgramaTvType() {
        return new ProgramaTvType();
    }

    /**
     * Create an instance of {@link SearchByIdResponse }
     * 
     */
    public SearchByIdResponse createSearchByIdResponse() {
        return new SearchByIdResponse();
    }

}
