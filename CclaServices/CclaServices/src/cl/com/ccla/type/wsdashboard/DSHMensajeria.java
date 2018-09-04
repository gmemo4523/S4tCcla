
package cl.com.ccla.type.wsdashboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSHMensajeria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSHMensajeria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TRX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_CLI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URL_DSH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIRMA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSHMensajeria", propOrder = {
    "idtrx",
    "idcli",
    "urldsh",
    "data",
    "firma"
})
public class DSHMensajeria {

    @XmlElement(name = "ID_TRX", required = true)
    protected String idtrx;
    @XmlElement(name = "ID_CLI", required = true)
    protected String idcli;
    @XmlElement(name = "URL_DSH", required = true)
    protected String urldsh;
    @XmlElement(name = "DATA", required = true)
    protected String data;
    @XmlElement(name = "FIRMA", required = true)
    protected String firma;

    /**
     * Gets the value of the idtrx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTRX() {
        return idtrx;
    }

    /**
     * Sets the value of the idtrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTRX(String value) {
        this.idtrx = value;
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

    /**
     * Gets the value of the urldsh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLDSH() {
        return urldsh;
    }

    /**
     * Sets the value of the urldsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLDSH(String value) {
        this.urldsh = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATA(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRMA() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRMA(String value) {
        this.firma = value;
    }

}
