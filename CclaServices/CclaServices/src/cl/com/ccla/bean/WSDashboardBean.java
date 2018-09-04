package cl.com.ccla.bean;


import cl.com.ccla.type.wsdashboard.Dash;
import cl.com.ccla.type.wsdashboard.DetalleTransaccion;
import cl.com.ccla.type.wsdashboard.RSMensajeriaTrx;
import cl.com.ccla.type.wsdashboard.Status;

import cl.com.ccla.type.wsdashboard.TrxCompleta;


import cl.com.ccla.webservice.dashboard.WSDashboardIF;

import com.google.gson.Gson;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.xml.namespace.QName;


@Path("/DashboardBean")
public class WSDashboardBean {
    public WSDashboardBean() {
        super();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/Dashboard")
    public Status DashboardNotificacion(String input) throws Exception {
        
        
            //extrae parametros
            Gson gson = new Gson();
            Dash req = new Dash();
            req = gson.fromJson(input,Dash.class);

            //setea url
            String url = "http://" +  req.getUrl() + "/Financiero/PagoElectronico/WSDashboardMensajeria/Proxy/WSDashboardService";
            
            //complemento
            Status status = new Status();

            //Construye objeto entrada
            URL nuevaurl = null;
            try {
                nuevaurl = new URL(url);
                } catch (MalformedURLException e) {
                   e.printStackTrace();
                }
            QName qname = new QName("http://dashboard.ws.ccla.cl", "WSDashboardPortBindingQSService");

            TrxCompleta request = new TrxCompleta();
            RSMensajeriaTrx response = new RSMensajeriaTrx();
            ArrayList<DetalleTransaccion> lista = new ArrayList<DetalleTransaccion>() ;
            DetalleTransaccion det = null;
            
            for (int counter = 0; counter < req.getDetalle().size(); counter++) {   
                det = new DetalleTransaccion();
                det.setIdTrx(req.getDetalle().get(counter).getIdTrx());
                det.setCodigoProducto(req.getDetalle().get(counter).getCodigoProducto());
                det.setIdItem(req.getDetalle().get(counter).getIdItem());
                det.setRutPersona(req.getDetalle().get(counter).getRutPersona());
                det.setRutEmpresa(req.getDetalle().get(counter).getRutEmpresa());
                det.setMontoAPagar(req.getDetalle().get(counter).getMontoAPagar());
                det.setMontoTotal(req.getDetalle().get(counter).getMontoTotal());
                det.setMontoSaldo(req.getDetalle().get(counter).getMontoSaldo());
                det.setDescripcion(req.getDetalle().get(counter).getDescripcion());
                det.setCcRegion(req.getDetalle().get(counter).getCcRegion());
                det.setCcSucursal(req.getDetalle().get(counter).getCcSucursal());
                det.setCcTipoDoc(req.getDetalle().get(counter).getCcTipoDoc());
                det.setCcComprobante(req.getDetalle().get(counter).getCcComprobante());
                det.setCcPeriodo(req.getDetalle().get(counter).getCcPeriodo());
     
                lista.add(det);
                
            }         
            
            TrxCompleta.ListaDetalle listita = new TrxCompleta.ListaDetalle();
            listita.setDetalle(lista);
            
            request.setTipoDetalle(req.getTipoDetalle());
            request.setCodigoProducto(req.getCodigoProducto());
            request.setRutPersona(req.getRutPersona());
            request.setRutEmpresa(req.getRutEmpresa());
            request.setMonto(req.getMonto());
            request.setUsuarioGraba(req.getUsuarioGraba());
            request.setUrlRetorno(req.getUrlRetorno());
            request.setListaDetalle(listita);

            WSDashboardService servicio = new WSDashboardService(nuevaurl,qname);
            WSDashboardIF wSDashboardIF = servicio.getWSDashboardPort();

            
            response = wSDashboardIF.mensajeriaTrxRS(request);
            
            
            
            
            status.setCodigo(response.getStatus().getCodigo());
            status.setData(response.getMensajeriaDSH().getDATA());
            status.setFirma(response.getMensajeriaDSH().getFIRMA());
            status.setIdcli(response.getMensajeriaDSH().getIDCLI());
            status.setIdtrix(response.getMensajeriaDSH().getIDTRX());
            status.setMensaje(response.getStatus().getMensaje());
            status.setMensajeInterno(response.getStatus().getMensajeInterno());
            status.setUrldsh(response.getMensajeriaDSH().getURLDSH());
            
            return status;
        
        }
}
