
package cl.com.ccla.type.dashboard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TRXREP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRXREP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTrx" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="trxCCLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trxEFT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="trxRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fcGrb" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fcNtfc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rtTrx" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="estd" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="glEstd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cdbnc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nmbbnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntfcEFT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ntfcPrd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rndEFT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rndPrd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dtlltrx" type="{http://dashboard.ws.ccla.cl/}TRXDETREP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRXREP", propOrder = {
    "idTrx",
    "trxCCLA",
    "trxEFT",
    "trxRec",
    "fcGrb",
    "fcNtfc",
    "rtTrx",
    "estd",
    "glEstd",
    "mnt",
    "cdbnc",
    "nmbbnc",
    "ntfcEFT",
    "ntfcPrd",
    "rndEFT",
    "rndPrd",
    "dtlltrx",
    "error"
})
public class TRXREP {

    protected long idTrx;
    protected String trxCCLA;
    protected long trxEFT;
    protected String trxRec;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fcGrb;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fcNtfc;
    protected long rtTrx;
    protected long estd;
    protected String glEstd;
    protected long mnt;
    protected int cdbnc;
    protected String nmbbnc;
    protected int ntfcEFT;
    protected int ntfcPrd;
    protected int rndEFT;
    protected int rndPrd;
    protected List<TRXDETREP> dtlltrx;
    protected String error;

    /**
     * Gets the value of the idTrx property.
     * 
     */
    public long getIdTrx() {
        return idTrx;
    }

    /**
     * Sets the value of the idTrx property.
     * 
     */
    public void setIdTrx(long value) {
        this.idTrx = value;
    }

    /**
     * Gets the value of the trxCCLA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxCCLA() {
        return trxCCLA;
    }

    /**
     * Sets the value of the trxCCLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxCCLA(String value) {
        this.trxCCLA = value;
    }

    /**
     * Gets the value of the trxEFT property.
     * 
     */
    public long getTrxEFT() {
        return trxEFT;
    }

    /**
     * Sets the value of the trxEFT property.
     * 
     */
    public void setTrxEFT(long value) {
        this.trxEFT = value;
    }

    /**
     * Gets the value of the trxRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxRec() {
        return trxRec;
    }

    /**
     * Sets the value of the trxRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxRec(String value) {
        this.trxRec = value;
    }

    /**
     * Gets the value of the fcGrb property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFcGrb() {
        return fcGrb;
    }

    /**
     * Sets the value of the fcGrb property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFcGrb(XMLGregorianCalendar value) {
        this.fcGrb = value;
    }

    /**
     * Gets the value of the fcNtfc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFcNtfc() {
        return fcNtfc;
    }

    /**
     * Sets the value of the fcNtfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFcNtfc(XMLGregorianCalendar value) {
        this.fcNtfc = value;
    }

    /**
     * Gets the value of the rtTrx property.
     * 
     */
    public long getRtTrx() {
        return rtTrx;
    }

    /**
     * Sets the value of the rtTrx property.
     * 
     */
    public void setRtTrx(long value) {
        this.rtTrx = value;
    }

    /**
     * Gets the value of the estd property.
     * 
     */
    public long getEstd() {
        return estd;
    }

    /**
     * Sets the value of the estd property.
     * 
     */
    public void setEstd(long value) {
        this.estd = value;
    }

    /**
     * Gets the value of the glEstd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlEstd() {
        return glEstd;
    }

    /**
     * Sets the value of the glEstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlEstd(String value) {
        this.glEstd = value;
    }

    /**
     * Gets the value of the mnt property.
     * 
     */
    public long getMnt() {
        return mnt;
    }

    /**
     * Sets the value of the mnt property.
     * 
     */
    public void setMnt(long value) {
        this.mnt = value;
    }

    /**
     * Gets the value of the cdbnc property.
     * 
     */
    public int getCdbnc() {
        return cdbnc;
    }

    /**
     * Sets the value of the cdbnc property.
     * 
     */
    public void setCdbnc(int value) {
        this.cdbnc = value;
    }

    /**
     * Gets the value of the nmbbnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbbnc() {
        return nmbbnc;
    }

    /**
     * Sets the value of the nmbbnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbbnc(String value) {
        this.nmbbnc = value;
    }

    /**
     * Gets the value of the ntfcEFT property.
     * 
     */
    public int getNtfcEFT() {
        return ntfcEFT;
    }

    /**
     * Sets the value of the ntfcEFT property.
     * 
     */
    public void setNtfcEFT(int value) {
        this.ntfcEFT = value;
    }

    /**
     * Gets the value of the ntfcPrd property.
     * 
     */
    public int getNtfcPrd() {
        return ntfcPrd;
    }

    /**
     * Sets the value of the ntfcPrd property.
     * 
     */
    public void setNtfcPrd(int value) {
        this.ntfcPrd = value;
    }

    /**
     * Gets the value of the rndEFT property.
     * 
     */
    public int getRndEFT() {
        return rndEFT;
    }

    /**
     * Sets the value of the rndEFT property.
     * 
     */
    public void setRndEFT(int value) {
        this.rndEFT = value;
    }

    /**
     * Gets the value of the rndPrd property.
     * 
     */
    public int getRndPrd() {
        return rndPrd;
    }

    /**
     * Sets the value of the rndPrd property.
     * 
     */
    public void setRndPrd(int value) {
        this.rndPrd = value;
    }

    /**
     * Gets the value of the dtlltrx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtlltrx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtlltrx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRXDETREP }
     * 
     * 
     */
    public List<TRXDETREP> getDtlltrx() {
        if (dtlltrx == null) {
            dtlltrx = new ArrayList<TRXDETREP>();
        }
        return this.dtlltrx;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
