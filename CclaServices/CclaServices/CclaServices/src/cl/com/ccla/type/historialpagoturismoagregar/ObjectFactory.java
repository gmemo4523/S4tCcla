
package cl.com.ccla.type.historialpagoturismoagregar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.type.historialpagoturismoagregar package. 
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

    private final static QName _HistorialPagoTurismoResp_QNAME = new QName("http://www.ccla.cl/HistorialPagoTurismoResp", "HistorialPagoTurismoResp");
    private final static QName _RequestHistorial_QNAME = new QName("http://www.ccla.cl/HistorialPagoTurismoReq", "RequestHistorial");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.type.historialpagoturismoagregar
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewOperation }
     * 
     */
    public NewOperation createNewOperation() {
        return new NewOperation();
    }

    /**
     * Create an instance of {@link NewOperationResponse }
     * 
     */
    public NewOperationResponse createNewOperationResponse() {
        return new NewOperationResponse();
    }

    /**
     * Create an instance of {@link ResponseHistorialPagoTurismoTYPE }
     * 
     */
    public ResponseHistorialPagoTurismoTYPE createResponseHistorialPagoTurismoTYPE() {
        return new ResponseHistorialPagoTurismoTYPE();
    }

    /**
     * Create an instance of {@link RequestHistorialTurismoTYPE }
     * 
     */
    public RequestHistorialTurismoTYPE createRequestHistorialTurismoTYPE() {
        return new RequestHistorialTurismoTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHistorialPagoTurismoTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ccla.cl/HistorialPagoTurismoResp", name = "HistorialPagoTurismoResp")
    public JAXBElement<ResponseHistorialPagoTurismoTYPE> createHistorialPagoTurismoResp(ResponseHistorialPagoTurismoTYPE value) {
        return new JAXBElement<ResponseHistorialPagoTurismoTYPE>(_HistorialPagoTurismoResp_QNAME, ResponseHistorialPagoTurismoTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHistorialTurismoTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ccla.cl/HistorialPagoTurismoReq", name = "RequestHistorial")
    public JAXBElement<RequestHistorialTurismoTYPE> createRequestHistorial(RequestHistorialTurismoTYPE value) {
        return new JAXBElement<RequestHistorialTurismoTYPE>(_RequestHistorial_QNAME, RequestHistorialTurismoTYPE.class, null, value);
    }

}
