
package pe.edu.upeu.soap.ws.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.upeu.soap.ws.dao package. 
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

    private final static QName _ReadAlumno_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "readAlumno");
    private final static QName _ReadAlumnoResponse_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "readAlumnoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.upeu.soap.ws.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadAlumnoResponse }
     * 
     */
    public ReadAlumnoResponse createReadAlumnoResponse() {
        return new ReadAlumnoResponse();
    }

    /**
     * Create an instance of {@link ReadAlumno }
     * 
     */
    public ReadAlumno createReadAlumno() {
        return new ReadAlumno();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "readAlumno")
    public JAXBElement<ReadAlumno> createReadAlumno(ReadAlumno value) {
        return new JAXBElement<ReadAlumno>(_ReadAlumno_QNAME, ReadAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "readAlumnoResponse")
    public JAXBElement<ReadAlumnoResponse> createReadAlumnoResponse(ReadAlumnoResponse value) {
        return new JAXBElement<ReadAlumnoResponse>(_ReadAlumnoResponse_QNAME, ReadAlumnoResponse.class, null, value);
    }

}
