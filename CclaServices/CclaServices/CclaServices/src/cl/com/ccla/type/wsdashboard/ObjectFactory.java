
package cl.com.ccla.type.wsdashboard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.type.wsdashboard package. 
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

    private final static QName _DetalleTransaccion_QNAME = new QName("http://dashboard.ws.ccla.cl", "DetalleTransaccion");
    private final static QName _TRXDETREP_QNAME = new QName("http://dashboard.ws.ccla.cl", "TRXDETREP");
    private final static QName _TrxCompleta_QNAME = new QName("http://dashboard.ws.ccla.cl", "TrxCompleta");
    private final static QName _LtrxRsp_QNAME = new QName("http://dashboard.ws.ccla.cl", "ltrxRsp");
    private final static QName _TRXREP_QNAME = new QName("http://dashboard.ws.ccla.cl", "TRXREP");
    private final static QName _DSHMensajeria_QNAME = new QName("http://dashboard.ws.ccla.cl", "DSHMensajeria");
    private final static QName _Exception_QNAME = new QName("http://dashboard.ws.ccla.cl", "Exception");
    private final static QName _MPINI_QNAME = new QName("http://dashboard.ws.ccla.cl", "MPINI");
    private final static QName _RSMensajeriaTrx_QNAME = new QName("http://dashboard.ws.ccla.cl", "RSMensajeriaTrx");
    private final static QName _RSStatus_QNAME = new QName("http://dashboard.ws.ccla.cl", "RSStatus");
    private final static QName _DETALLE_QNAME = new QName("http://dashboard.ws.ccla.cl", "DETALLE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.type.wsdashboard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrxCompleta }
     * 
     */
    public TrxCompleta createTrxCompleta() {
        return new TrxCompleta();
    }

    /**
     * Create an instance of {@link TRXREP }
     * 
     */
    public TRXREP createTRXREP() {
        return new TRXREP();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DSHMensajeria }
     * 
     */
    public DSHMensajeria createDSHMensajeria() {
        return new DSHMensajeria();
    }

    /**
     * Create an instance of {@link LtrxRsp }
     * 
     */
    public LtrxRsp createLtrxRsp() {
        return new LtrxRsp();
    }

    /**
     * Create an instance of {@link RSStatus }
     * 
     */
    public RSStatus createRSStatus() {
        return new RSStatus();
    }

    /**
     * Create an instance of {@link DETALLE }
     * 
     */
    public DETALLE createDETALLE() {
        return new DETALLE();
    }

    /**
     * Create an instance of {@link RSMensajeriaTrx }
     * 
     */
    public RSMensajeriaTrx createRSMensajeriaTrx() {
        return new RSMensajeriaTrx();
    }

    /**
     * Create an instance of {@link MPINI }
     * 
     */
    public MPINI createMPINI() {
        return new MPINI();
    }

    /**
     * Create an instance of {@link DetalleTransaccion }
     * 
     */
    public DetalleTransaccion createDetalleTransaccion() {
        return new DetalleTransaccion();
    }

    /**
     * Create an instance of {@link TRXDETREP }
     * 
     */
    public TRXDETREP createTRXDETREP() {
        return new TRXDETREP();
    }

    /**
     * Create an instance of {@link TrxCompleta.ListaDetalle }
     * 
     */
    public TrxCompleta.ListaDetalle createTrxCompletaListaDetalle() {
        return new TrxCompleta.ListaDetalle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "DetalleTransaccion")
    public JAXBElement<DetalleTransaccion> createDetalleTransaccion(DetalleTransaccion value) {
        return new JAXBElement<DetalleTransaccion>(_DetalleTransaccion_QNAME, DetalleTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRXDETREP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "TRXDETREP")
    public JAXBElement<TRXDETREP> createTRXDETREP(TRXDETREP value) {
        return new JAXBElement<TRXDETREP>(_TRXDETREP_QNAME, TRXDETREP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrxCompleta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "TrxCompleta")
    public JAXBElement<TrxCompleta> createTrxCompleta(TrxCompleta value) {
        return new JAXBElement<TrxCompleta>(_TrxCompleta_QNAME, TrxCompleta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LtrxRsp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "ltrxRsp")
    public JAXBElement<LtrxRsp> createLtrxRsp(LtrxRsp value) {
        return new JAXBElement<LtrxRsp>(_LtrxRsp_QNAME, LtrxRsp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRXREP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "TRXREP")
    public JAXBElement<TRXREP> createTRXREP(TRXREP value) {
        return new JAXBElement<TRXREP>(_TRXREP_QNAME, TRXREP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSHMensajeria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "DSHMensajeria")
    public JAXBElement<DSHMensajeria> createDSHMensajeria(DSHMensajeria value) {
        return new JAXBElement<DSHMensajeria>(_DSHMensajeria_QNAME, DSHMensajeria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MPINI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "MPINI")
    public JAXBElement<MPINI> createMPINI(MPINI value) {
        return new JAXBElement<MPINI>(_MPINI_QNAME, MPINI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSMensajeriaTrx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "RSMensajeriaTrx")
    public JAXBElement<RSMensajeriaTrx> createRSMensajeriaTrx(RSMensajeriaTrx value) {
        return new JAXBElement<RSMensajeriaTrx>(_RSMensajeriaTrx_QNAME, RSMensajeriaTrx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "RSStatus")
    public JAXBElement<RSStatus> createRSStatus(RSStatus value) {
        return new JAXBElement<RSStatus>(_RSStatus_QNAME, RSStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DETALLE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dashboard.ws.ccla.cl", name = "DETALLE")
    public JAXBElement<DETALLE> createDETALLE(DETALLE value) {
        return new JAXBElement<DETALLE>(_DETALLE_QNAME, DETALLE.class, null, value);
    }

}
