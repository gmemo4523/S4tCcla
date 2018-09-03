
package cl.com.ccla.type.wsdashboard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPINI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPINI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDCOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDTRX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDEN_COMPRA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NROPAGOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_RETORNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://dashboard.ws.ccla.cl}DETALLE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SERVICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISC_CONV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPINI", propOrder = {
    "idcom",
    "idtrx",
    "ordencompra",
    "total",
    "nropagos",
    "urlretorno",
    "detalle",
    "servicio",
    "discconv"
})
public class MPINI {

    @XmlElement(name = "IDCOM")
    protected String idcom;
    @XmlElement(name = "IDTRX")
    protected String idtrx;
    @XmlElement(name = "ORDEN_COMPRA")
    protected String ordencompra;
    @XmlElement(name = "TOTAL")
    protected String total;
    @XmlElement(name = "NROPAGOS")
    protected String nropagos;
    @XmlElement(name = "URL_RETORNO")
    protected String urlretorno;
    @XmlElement(name = "DETALLE", namespace = "http://dashboard.ws.ccla.cl")
    protected List<DETALLE> detalle;
    @XmlElement(name = "SERVICIO")
    protected String servicio;
    @XmlElement(name = "DISC_CONV")
    protected String discconv;

    /**
     * Gets the value of the idcom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCOM() {
        return idcom;
    }

    /**
     * Sets the value of the idcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCOM(String value) {
        this.idcom = value;
    }

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
     * Gets the value of the ordencompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDENCOMPRA() {
        return ordencompra;
    }

    /**
     * Sets the value of the ordencompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDENCOMPRA(String value) {
        this.ordencompra = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAL() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAL(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the nropagos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROPAGOS() {
        return nropagos;
    }

    /**
     * Sets the value of the nropagos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROPAGOS(String value) {
        this.nropagos = value;
    }

    /**
     * Gets the value of the urlretorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLRETORNO() {
        return urlretorno;
    }

    /**
     * Sets the value of the urlretorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLRETORNO(String value) {
        this.urlretorno = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDETALLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DETALLE }
     * 
     * 
     */
    public List<DETALLE> getDETALLE() {
        if (detalle == null) {
            detalle = new ArrayList<DETALLE>();
        }
        return this.detalle;
    }

    /**
     * Gets the value of the servicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICIO() {
        return servicio;
    }

    /**
     * Sets the value of the servicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICIO(String value) {
        this.servicio = value;
    }

    /**
     * Gets the value of the discconv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCCONV() {
        return discconv;
    }

    /**
     * Sets the value of the discconv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCCONV(String value) {
        this.discconv = value;
    }

}
