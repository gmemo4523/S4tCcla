
package cl.com.ccla.type.wsdashboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetalleTransaccion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetalleTransaccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_trx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rutPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rutEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoAPagar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoSaldo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ccRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleTransaccion", propOrder = {
    "idTrx",
    "codigoProducto",
    "idItem",
    "rutPersona",
    "rutEmpresa",
    "montoAPagar",
    "montoTotal",
    "montoSaldo",
    "descripcion",
    "ccRegion",
    "ccSucursal",
    "ccTipoDoc",
    "ccComprobante",
    "ccPeriodo"
})
public class DetalleTransaccion {

    @XmlElement(name = "id_trx", required = true)
    protected String idTrx;
    @XmlElement(required = true)
    protected String codigoProducto;
    @XmlElement(required = true)
    protected String idItem;
    @XmlElement(required = true)
    protected String rutPersona;
    @XmlElement(required = true)
    protected String rutEmpresa;
    @XmlElement(required = true)
    protected String montoAPagar;
    @XmlElement(required = true)
    protected String montoTotal;
    @XmlElement(required = true)
    protected String montoSaldo;
    @XmlElement(required = true)
    protected String descripcion;
    protected String ccRegion;
    protected String ccSucursal;
    protected String ccTipoDoc;
    protected String ccComprobante;
    protected String ccPeriodo;

    /**
     * Gets the value of the idTrx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTrx() {
        return idTrx;
    }

    /**
     * Sets the value of the idTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTrx(String value) {
        this.idTrx = value;
    }

    /**
     * Gets the value of the codigoProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Sets the value of the codigoProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProducto(String value) {
        this.codigoProducto = value;
    }

    /**
     * Gets the value of the idItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdItem() {
        return idItem;
    }

    /**
     * Sets the value of the idItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdItem(String value) {
        this.idItem = value;
    }

    /**
     * Gets the value of the rutPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutPersona() {
        return rutPersona;
    }

    /**
     * Sets the value of the rutPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutPersona(String value) {
        this.rutPersona = value;
    }

    /**
     * Gets the value of the rutEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutEmpresa() {
        return rutEmpresa;
    }

    /**
     * Sets the value of the rutEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutEmpresa(String value) {
        this.rutEmpresa = value;
    }

    /**
     * Gets the value of the montoAPagar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoAPagar() {
        return montoAPagar;
    }

    /**
     * Sets the value of the montoAPagar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoAPagar(String value) {
        this.montoAPagar = value;
    }

    /**
     * Gets the value of the montoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotal() {
        return montoTotal;
    }

    /**
     * Sets the value of the montoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotal(String value) {
        this.montoTotal = value;
    }

    /**
     * Gets the value of the montoSaldo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoSaldo() {
        return montoSaldo;
    }

    /**
     * Sets the value of the montoSaldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoSaldo(String value) {
        this.montoSaldo = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the ccRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcRegion() {
        return ccRegion;
    }

    /**
     * Sets the value of the ccRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcRegion(String value) {
        this.ccRegion = value;
    }

    /**
     * Gets the value of the ccSucursal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSucursal() {
        return ccSucursal;
    }

    /**
     * Sets the value of the ccSucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSucursal(String value) {
        this.ccSucursal = value;
    }

    /**
     * Gets the value of the ccTipoDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcTipoDoc() {
        return ccTipoDoc;
    }

    /**
     * Sets the value of the ccTipoDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcTipoDoc(String value) {
        this.ccTipoDoc = value;
    }

    /**
     * Gets the value of the ccComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcComprobante() {
        return ccComprobante;
    }

    /**
     * Sets the value of the ccComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcComprobante(String value) {
        this.ccComprobante = value;
    }

    /**
     * Gets the value of the ccPeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcPeriodo() {
        return ccPeriodo;
    }

    /**
     * Sets the value of the ccPeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcPeriodo(String value) {
        this.ccPeriodo = value;
    }

}
