
package cl.com.ccla.type.wsdashboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSMensajeriaTrx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSMensajeriaTrx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://dashboard.ws.ccla.cl}RSStatus"/>
 *         &lt;element name="MensajeriaDSH" type="{http://dashboard.ws.ccla.cl}DSHMensajeria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSMensajeriaTrx", propOrder = {
    "status",
    "mensajeriaDSH"
})
public class RSMensajeriaTrx {

    @XmlElement(name = "Status", required = true)
    protected RSStatus status;
    @XmlElement(name = "MensajeriaDSH", required = true)
    protected DSHMensajeria mensajeriaDSH;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RSStatus }
     *     
     */
    public RSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSStatus }
     *     
     */
    public void setStatus(RSStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the mensajeriaDSH property.
     * 
     * @return
     *     possible object is
     *     {@link DSHMensajeria }
     *     
     */
    public DSHMensajeria getMensajeriaDSH() {
        return mensajeriaDSH;
    }

    /**
     * Sets the value of the mensajeriaDSH property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSHMensajeria }
     *     
     */
    public void setMensajeriaDSH(DSHMensajeria value) {
        this.mensajeriaDSH = value;
    }

}
