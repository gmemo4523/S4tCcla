
package cl.com.ccla.type.dashboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensajeInterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idtrix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idcli" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="urldsh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStatus", propOrder = {
    "codigo",
    "mensaje",
    "mensajeInterno",
    "idtrix",
    "idcli",
    "urldsh",
    "data",
    "firma"
})
public class ServiceStatus {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(required = true)
    protected String mensajeInterno;
    @XmlElement(required = true)
    protected String idtrix;
    @XmlElement(required = true)
    protected String idcli;
    @XmlElement(required = true)
    protected String urldsh;
    @XmlElement(required = true)
    protected String data;
    @XmlElement(required = true)
    protected String firma;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the mensajeInterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeInterno() {
        return mensajeInterno;
    }

    /**
     * Sets the value of the mensajeInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeInterno(String value) {
        this.mensajeInterno = value;
    }

    /**
     * Gets the value of the idtrix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdtrix() {
        return idtrix;
    }

    /**
     * Sets the value of the idtrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdtrix(String value) {
        this.idtrix = value;
    }

    /**
     * Gets the value of the idcli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcli() {
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
    public void setIdcli(String value) {
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
    public String getUrldsh() {
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
    public void setUrldsh(String value) {
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
    public String getData() {
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
    public void setData(String value) {
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
    public String getFirma() {
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
    public void setFirma(String value) {
        this.firma = value;
    }

}
