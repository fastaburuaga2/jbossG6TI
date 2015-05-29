
package com.mycompany.grupo6ti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCartola complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the inicio property.
     * 
     */
    public float getInicio() {
        return inicio;
    }

    /**
     * Sets the value of the inicio property.
     * 
     */
    public void setInicio(float value) {
        this.inicio = value;
    }

    /**
     * Gets the value of the fin property.
     * 
     */
    public float getFin() {
        return fin;
    }

    /**
     * Sets the value of the fin property.
     * 
     */
    public void setFin(float value) {
        this.fin = value;
    }

    /**
     * Gets the value of the id property.
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
     * Sets the value of the id property.
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
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
