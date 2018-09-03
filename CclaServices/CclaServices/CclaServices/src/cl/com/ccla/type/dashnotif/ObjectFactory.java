
package cl.com.ccla.type.dashnotif;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.type.dashnotif package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotificarTrxWPRS_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "NotificarTrx_WPRS");
    private final static QName _NotificarTrxWPRQ_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "NotificarTrx_WPRQ");
    private final static QName _DataWPRQ_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "Data_WPRQ");
    private final static QName _Exception_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "Exception");
    private final static QName _Status_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "Status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.type.dashnotif
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RSStatus }
     * 
     */
    public RSStatus createRSStatus() {
        return new RSStatus();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link RQDataWP }
     * 
     */
    public RQDataWP createRQDataWP() {
        return new RQDataWP();
    }

    /**
     * Create an instance of {@link RSNotificarTrxWP }
     * 
     */
    public RSNotificarTrxWP createRSNotificarTrxWP() {
        return new RSNotificarTrxWP();
    }

    /**
     * Create an instance of {@link RQNotificarTrxWP }
     * 
     */
    public RQNotificarTrxWP createRQNotificarTrxWP() {
        return new RQNotificarTrxWP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSNotificarTrxWP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "NotificarTrx_WPRS")
    public JAXBElement<RSNotificarTrxWP> createNotificarTrxWPRS(RSNotificarTrxWP value) {
        return new JAXBElement<RSNotificarTrxWP>(_NotificarTrxWPRS_QNAME, RSNotificarTrxWP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RQNotificarTrxWP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "NotificarTrx_WPRQ")
    public JAXBElement<RQNotificarTrxWP> createNotificarTrxWPRQ(RQNotificarTrxWP value) {
        return new JAXBElement<RQNotificarTrxWP>(_NotificarTrxWPRQ_QNAME, RQNotificarTrxWP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RQDataWP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "Data_WPRQ")
    public JAXBElement<RQDataWP> createDataWPRQ(RQDataWP value) {
        return new JAXBElement<RQDataWP>(_DataWPRQ_QNAME, RQDataWP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "Status")
    public JAXBElement<RSStatus> createStatus(RSStatus value) {
        return new JAXBElement<RSStatus>(_Status_QNAME, RSStatus.class, null, value);
    }

}
