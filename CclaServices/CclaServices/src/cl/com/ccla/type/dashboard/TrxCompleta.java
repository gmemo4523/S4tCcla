
package cl.com.ccla.type.dashboard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxCompleta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxCompleta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDetalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rutPersona" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rutEmpresa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="usuarioGraba" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="urlRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListaDetalle">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Detalle" type="{http://dashboard.ws.ccla.cl/}DetalleTransaccion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxCompleta", propOrder = {
    "tipoDetalle",
    "codigoProducto",
    "rutPersona",
    "rutEmpresa",
    "monto",
    "usuarioGraba",
    "urlRetorno",
    "listaDetalle"
})
public class TrxCompleta {

    @XmlElement(required = true)
    protected String tipoDetalle;
    @XmlElement(required = true)
    protected String codigoProducto;
    protected long rutPersona;
    protected long rutEmpresa;
    protected long monto;
    @XmlElement(required = true)
    protected String usuarioGraba;
    @XmlElement(required = true)
    protected String urlRetorno;
    @XmlElement(name = "ListaDetalle", required = true)
    protected TrxCompleta.ListaDetalle listaDetalle;

    /**
     * Gets the value of the tipoDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDetalle() {
        return tipoDetalle;
    }

    /**
     * Sets the value of the tipoDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDetalle(String value) {
        this.tipoDetalle = value;
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
     * Gets the value of the rutPersona property.
     * 
     */
    public long getRutPersona() {
        return rutPersona;
    }

    /**
     * Sets the value of the rutPersona property.
     * 
     */
    public void setRutPersona(long value) {
        this.rutPersona = value;
    }

    /**
     * Gets the value of the rutEmpresa property.
     * 
     */
    public long getRutEmpresa() {
        return rutEmpresa;
    }

    /**
     * Sets the value of the rutEmpresa property.
     * 
     */
    public void setRutEmpresa(long value) {
        this.rutEmpresa = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     */
    public long getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     */
    public void setMonto(long value) {
        this.monto = value;
    }

    /**
     * Gets the value of the usuarioGraba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioGraba() {
        return usuarioGraba;
    }

    /**
     * Sets the value of the usuarioGraba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioGraba(String value) {
        this.usuarioGraba = value;
    }

    /**
     * Gets the value of the urlRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlRetorno() {
        return urlRetorno;
    }

    /**
     * Sets the value of the urlRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlRetorno(String value) {
        this.urlRetorno = value;
    }

    /**
     * Gets the value of the listaDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link TrxCompleta.ListaDetalle }
     *     
     */
    public TrxCompleta.ListaDetalle getListaDetalle() {
        return listaDetalle;
    }

    /**
     * Sets the value of the listaDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrxCompleta.ListaDetalle }
     *     
     */
    public void setListaDetalle(TrxCompleta.ListaDetalle value) {
        this.listaDetalle = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Detalle" type="{http://dashboard.ws.ccla.cl/}DetalleTransaccion" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detalle"
    })
    public static class ListaDetalle {

        @XmlElement(name = "Detalle")
        protected List<DetalleTransaccion> detalle;

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
         *    getDetalle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DetalleTransaccion }
         * 
         * 
         */
        public List<DetalleTransaccion> getDetalle() {
            if (detalle == null) {
                detalle = new ArrayList<DetalleTransaccion>();
            }
            return this.detalle;
        }
        
        public void setDetalle(List<DetalleTransaccion> lista) {
                detalle = lista;
        }

    }

}
