
package com.mycompany.grupo6ti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cartola complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cartola">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fin" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inicio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="transacciones" type="{http://servicios.banco.integracion.uc.cl/}transaccion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartola", propOrder = {
    "fin",
    "id",
    "inicio",
    "transacciones"
})
public class Cartola {

    protected float fin;
    protected String id;
    protected float inicio;
    @XmlElement(nillable = true)
    protected List<Transaccion> transacciones;

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
     * Gets the value of the transacciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transacciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransacciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaccion }
     * 
     * 
     */
    public List<Transaccion> getTransacciones() {
        if (transacciones == null) {
            transacciones = new ArrayList<Transaccion>();
        }
        return this.transacciones;
    }

}
