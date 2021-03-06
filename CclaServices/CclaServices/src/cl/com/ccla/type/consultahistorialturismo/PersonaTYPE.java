
package cl.com.ccla.type.consultahistorialturismo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personaTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personaTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="comprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personaTYPE", propOrder = {
    "rut",
    "comprobante"
})
public class PersonaTYPE {

    @XmlElementRef(name = "rut", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rut;
    @XmlElementRef(name = "comprobante", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<String> comprobante;

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRut(JAXBElement<BigDecimal> value) {
        this.rut = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the comprobante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComprobante() {
        return comprobante;
    }

    /**
     * Sets the value of the comprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComprobante(JAXBElement<String> value) {
        this.comprobante = ((JAXBElement<String> ) value);
    }

}
