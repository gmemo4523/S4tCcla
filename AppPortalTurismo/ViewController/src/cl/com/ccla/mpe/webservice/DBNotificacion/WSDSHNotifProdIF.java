package cl.com.ccla.mpe.webservice.DBNotificacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 150302.2135.55683)

@WebService(wsdlLocation =
            "http://qa-osbweb:8005/Financiero/PagoElectronico/WsDashboardNotificacion/Proxy/WS_DSH_Notif_Prod?wsdl",
            targetNamespace =
            "http://producto.notificacion.dashboard.ws.ccla.cl/",
            name = "WSDSHNotifProdIF")
@XmlSeeAlso( { cl.com.ccla.mpe.type.DBNotificacion.ObjectFactory.class })
@SOAPBinding(style = Style.RPC)
public interface WSDSHNotifProdIF {
    @WebMethod
    @Action(input =
            "http://producto.notificacion.dashboard.ws.ccla.cl/WSDSHNotifProdIF/notificarTrxWPRequest",
            output =
            "http://producto.notificacion.dashboard.ws.ccla.cl/WSDSHNotifProdIF/notificarTrxWPResponse")
    @WebResult(partName = "NotificarTrx_WPRS", name = "NotificarTrx_WPRS")
    public cl.com.ccla.mpe.type.DBNotificacion.RSNotificarTrxWP notificarTrxWP(@WebParam(partName =
                                                                                         "NotificarTrx_WPRQ",
                                                                                         name =
                                                                                         "NotificarTrx_WPRQ")
        cl.com.ccla.mpe.type.DBNotificacion.RQNotificarTrxWP NotificarTrx_WPRQ);

    @WebMethod
    @Action(input =
            "http://producto.notificacion.dashboard.ws.ccla.cl/WSDSHNotifProdIF/notificarTrxPRODRequest",
            output =
            "http://producto.notificacion.dashboard.ws.ccla.cl/WSDSHNotifProdIF/notificarTrxPRODResponse")
    @WebResult(partName = "NotificarTrx_ProdRS", name = "NotificarTrx_ProdRS")
    public cl.com.ccla.mpe.type.DBNotificacion.RSNotificarTrxProd notificarTrxPROD(@WebParam(partName =
                                                                                             "NotificarTrx_ProdRQ",
                                                                                             name =
                                                                                             "NotificarTrx_ProdRQ")
        cl.com.ccla.mpe.type.DBNotificacion.RQNotificarTrxProd NotificarTrx_ProdRQ);
}
