
package cl.uc.integracion.banco.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Error complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Error">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="httpCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eRROR_CODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error", propOrder = {
    "httpCode",
    "errorcode",
    "description"
})
public class Error {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer httpCode;
    @XmlElement(name = "eRROR_CODE", required = true, type = Integer.class, nillable = true)
    protected Integer errorcode;
    @XmlElement(required = true, nillable = true)
    protected String description;

    /**
     * Obtiene el valor de la propiedad httpCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHttpCode() {
        return httpCode;
    }

    /**
     * Define el valor de la propiedad httpCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHttpCode(Integer value) {
        this.httpCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorcode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getERRORCODE() {
        return errorcode;
    }

    /**
     * Define el valor de la propiedad errorcode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setERRORCODE(Integer value) {
        this.errorcode = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
