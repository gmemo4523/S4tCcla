
package cl.com.ccla.type.dashboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRXDETREP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRXDETREP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDtll" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mntTtl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mntPgd" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mntSld" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scRgn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdSc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpDc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cmprb" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="prd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="impBlt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRXDETREP", propOrder = {
    "idDtll",
    "mntTtl",
    "mntPgd",
    "mntSld",
    "scRgn",
    "cdSc",
    "tpDc",
    "cmprb",
    "prd",
    "impBlt"
})
public class TRXDETREP {

    protected long idDtll;
    protected long mntTtl;
    protected long mntPgd;
    protected long mntSld;
    protected String scRgn;
    protected String cdSc;
    protected String tpDc;
    @XmlElement(name = "Cmprb")
    protected long cmprb;
    protected int prd;
    protected int impBlt;

    /**
     * Gets the value of the idDtll property.
     * 
     */
    public long getIdDtll() {
        return idDtll;
    }

    /**
     * Sets the value of the idDtll property.
     * 
     */
    public void setIdDtll(long value) {
        this.idDtll = value;
    }

    /**
     * Gets the value of the mntTtl property.
     * 
     */
    public long getMntTtl() {
        return mntTtl;
    }

    /**
     * Sets the value of the mntTtl property.
     * 
     */
    public void setMntTtl(long value) {
        this.mntTtl = value;
    }

    /**
     * Gets the value of the mntPgd property.
     * 
     */
    public long getMntPgd() {
        return mntPgd;
    }

    /**
     * Sets the value of the mntPgd property.
     * 
     */
    public void setMntPgd(long value) {
        this.mntPgd = value;
    }

    /**
     * Gets the value of the mntSld property.
     * 
     */
    public long getMntSld() {
        return mntSld;
    }

    /**
     * Sets the value of the mntSld property.
     * 
     */
    public void setMntSld(long value) {
        this.mntSld = value;
    }

    /**
     * Gets the value of the scRgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScRgn() {
        return scRgn;
    }

    /**
     * Sets the value of the scRgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScRgn(String value) {
        this.scRgn = value;
    }

    /**
     * Gets the value of the cdSc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSc() {
        return cdSc;
    }

    /**
     * Sets the value of the cdSc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSc(String value) {
        this.cdSc = value;
    }

    /**
     * Gets the value of the tpDc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpDc() {
        return tpDc;
    }

    /**
     * Sets the value of the tpDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpDc(String value) {
        this.tpDc = value;
    }

    /**
     * Gets the value of the cmprb property.
     * 
     */
    public long getCmprb() {
        return cmprb;
    }

    /**
     * Sets the value of the cmprb property.
     * 
     */
    public void setCmprb(long value) {
        this.cmprb = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     */
    public int getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     */
    public void setPrd(int value) {
        this.prd = value;
    }

    /**
     * Gets the value of the impBlt property.
     * 
     */
    public int getImpBlt() {
        return impBlt;
    }

    /**
     * Sets the value of the impBlt property.
     * 
     */
    public void setImpBlt(int value) {
        this.impBlt = value;
    }

}
