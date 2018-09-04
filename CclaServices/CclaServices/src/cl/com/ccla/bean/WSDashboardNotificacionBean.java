package cl.com.ccla.bean;

import cl.com.ccla.type.wsdashnotif.DashboardNotificacion;
import cl.com.ccla.type.wsdashnotif.RQDataWP;
import cl.com.ccla.type.wsdashnotif.RQNotifProd;
import cl.com.ccla.type.wsdashnotif.RQNotificarTrxProd;
import cl.com.ccla.type.wsdashnotif.RQNotificarTrxWP;
import cl.com.ccla.type.wsdashnotif.RSNotificarTrxProd;
import cl.com.ccla.type.wsdashnotif.RSNotificarTrxWP;
import cl.com.ccla.webservice.wsdashnotif.WSDSHNotifProdIF;

import cl.com.ccla.webservice.wsdashnotif.WSDSHNotifProdService;

import com.google.gson.Gson;

import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.xml.namespace.QName;

@Path("/DashboardNotificacionBean")
public class WSDashboardNotificacionBean {
    public WSDashboardNotificacionBean() {
        super();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/DashboardNotificacion")
    public RSNotificarTrxProd DashboardNotificacion(String input) {
            //extrae parametros
            Gson gson = new Gson();
            DashboardNotificacion req = new DashboardNotificacion();
            req = gson.fromJson(input,DashboardNotificacion.class);

            //setea url
            String url = "http://"+ req.getUrl()+ "/Financiero/PagoElectronico/WsDashboardNotificacion/Proxy/WS_DSH_Notif_Prod";

            //Construye objeto entrada
            URL nuevaurl = null;
            try {
                nuevaurl = new URL(url);
                } catch (MalformedURLException e) {
                   e.printStackTrace();
                }
            QName qname = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/",
                    "WSDSHNotifProdService");
        
            RQNotificarTrxProd request = new RQNotificarTrxProd();
            RQNotifProd notif = new RQNotifProd();
            RQDataWP         requestdata = new RQDataWP();
            RSNotificarTrxProd response = new RSNotificarTrxProd();
            

            
            notif.setIDTRX(req.getIdtrx());
            request.setNotificacion(notif);

            
            
            //llamada servicio
            WSDSHNotifProdService service = new WSDSHNotifProdService(nuevaurl,qname);
            WSDSHNotifProdIF dashboardNotificacion = service.getWSDSHNotifProdPort();
            
            response = dashboardNotificacion.notificarTrxPROD(request);
            return response;

        }
}
