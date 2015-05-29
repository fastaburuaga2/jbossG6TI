
package cl.uc.integracion.banco.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.uc.integracion.banco.servicios package. 
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

    private final static QName _BadParameters_QNAME = new QName("http://servicios.banco.integracion.uc.cl/", "BadParameters");
    private final static QName _Error_QNAME = new QName("http://servicios.banco.integracion.uc.cl/", "Error");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.uc.integracion.banco.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BadParameters }
     * 
     */
    public BadParameters createBadParameters() {
        return new BadParameters();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link CrearTransaccion }
     * 
     */
    public CrearTransaccion createCrearTransaccion() {
        return new CrearTransaccion();
    }

    /**
     * Create an instance of {@link TransaccionArray }
     * 
     */
    public TransaccionArray createTransaccionArray() {
        return new TransaccionArray();
    }

    /**
     * Create an instance of {@link Transaccion }
     * 
     */
    public Transaccion createTransaccion() {
        return new Transaccion();
    }

    /**
     * Create an instance of {@link BadParameterItem }
     * 
     */
    public BadParameterItem createBadParameterItem() {
        return new BadParameterItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.banco.integracion.uc.cl/", name = "BadParameters")
    public JAXBElement<BadParameters> createBadParameters(BadParameters value) {
        return new JAXBElement<BadParameters>(_BadParameters_QNAME, BadParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.banco.integracion.uc.cl/", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

}
