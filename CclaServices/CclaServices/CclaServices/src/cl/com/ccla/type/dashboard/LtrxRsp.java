
package cl.com.ccla.type.dashboard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ltrxRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ltrxRsp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ltrx" type="{http://dashboard.ws.ccla.cl/}TRXREP" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ltrxRsp", propOrder = {
    "ltrx"
})
public class LtrxRsp {

    protected List<TRXREP> ltrx;

    /**
     * Gets the value of the ltrx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ltrx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLtrx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRXREP }
     * 
     * 
     */
    public List<TRXREP> getLtrx() {
        if (ltrx == null) {
            ltrx = new ArrayList<TRXREP>();
        }
        return this.ltrx;
    }

}
