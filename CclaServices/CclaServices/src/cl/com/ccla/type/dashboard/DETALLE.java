
package cl.com.ccla.type.dashboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DETALLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DETALLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SRVREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLOSA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CANTIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATOADIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NMIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DETALLE", propOrder = {
    "srvrec",
    "monto",
    "glosa",
    "cantidad",
    "precio",
    "datoadic",
    "nmif",
    "idcli"
})
public class DETALLE {

    @XmlElement(name = "SRVREC")
    protected String srvrec;
    @XmlElement(name = "MONTO")
    protected String monto;
    @XmlElement(name = "GLOSA")
    protected String glosa;
    @XmlElement(name = "CANTIDAD")
    protected String cantidad;
    @XmlElement(name = "PRECIO")
    protected String precio;
    @XmlElement(name = "DATOADIC")
    protected String datoadic;
    @XmlElement(name = "NMIF")
    protected String nmif;
    @XmlElement(name = "ID_CLI")
    protected String idcli;

    /**
     * Gets the value of the srvrec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVREC() {
        return srvrec;
    }

    /**
     * Sets the value of the srvrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVREC(String value) {
        this.srvrec = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONTO() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONTO(String value) {
        this.monto = value;
    }

    /**
     * Gets the value of the glosa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLOSA() {
        return glosa;
    }

    /**
     * Sets the value of the glosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLOSA(String value) {
        this.glosa = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANTIDAD() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANTIDAD(String value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECIO() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECIO(String value) {
        this.precio = value;
    }

    /**
     * Gets the value of the datoadic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATOADIC() {
        return datoadic;
    }

    /**
     * Sets the value of the datoadic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATOADIC(String value) {
        this.datoadic = value;
    }

    /**
     * Gets the value of the nmif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMIF() {
        return nmif;
    }

    /**
     * Sets the value of the nmif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMIF(String value) {
        this.nmif = value;
    }

    /**
     * Gets the value of the idcli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCLI() {
        return idcli;
    }

    /**
     * Sets the value of the idcli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCLI(String value) {
        this.idcli = value;
    }

}
