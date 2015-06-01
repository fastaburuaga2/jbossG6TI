
package com.mycompany.grupo6ti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCartola complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCartola">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inicio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fin" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCartola", propOrder = {
    "inicio",
    "fin",
    "id",
    "limit"
})
public class GetCartola {

    protected float inicio;
    protected float fin;
    @XmlElement(required = true)
    protected String id;
    protected int limit;

    /**
     * Obtiene el valor de la propiedad inicio.
     * 
     */
    public float getInicio() {
        return inicio;
    }

    /**
     * Define el valor de la propiedad inicio.
     * 
     */
    public void setInicio(float value) {
        this.inicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fin.
     * 
     */
    public float getFin() {
        return fin;
    }

    /**
     * Define el valor de la propiedad fin.
     * 
     */
    public void setFin(float value) {
        this.fin = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad limit.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Define el valor de la propiedad limit.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
