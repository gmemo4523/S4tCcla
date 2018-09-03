package cl.com.ccla.bean;

import cl.com.ccla.type.historialpagoturismoagregar.RequestHistorialTurismo;
import cl.com.ccla.type.historialpagoturismoagregar.RequestHistorialTurismoTYPE;
import cl.com.ccla.type.historialpagoturismoagregar.ResponseHistorialPagoTurismoTYPE;

import cl.com.ccla.type.historialpagoturismoagregar.ResponsePago;
import cl.com.ccla.webservice.historialpagoturismoagregar.HistorialPagoTurismoAgregar;
import cl.com.ccla.webservice.historialpagoturismoagregar.HistorialPagoTurismoAgregar_Service;

import com.google.gson.Gson;

import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

@Path("/HistorialPagoTurismoBean")
public class HistorialPagoTurismoBean {
    public HistorialPagoTurismoBean() {
        super();
    }   
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/HistorialPagoTurismo")
    public ResponsePago HistorialPagoTurismoAgregar(String input) {
        //extrae parametros
        Gson gson = new Gson();
        RequestHistorialTurismo req = new RequestHistorialTurismo();
        req = gson.fromJson(input,RequestHistorialTurismo.class);
        
        //setea url
        String url = "http://" + req.getUrl() + "/Financiero/PagoElectronico/HistorialPagoTurismoAgregar/EBS/HistorialPagoTurismoAgregarEBS";

        //utilidad
        ResponsePago res = new ResponsePago();

        //Construye objeto entrada
        URL nuevaurl = null;
        try {
            nuevaurl = new URL(url);
            } catch (MalformedURLException e) {
               e.printStackTrace();
            }
        QName qname = new QName("http://www.ccla.cl/HistorialPagoTurismoAgregar",
                    "HistorialPagoTurismoAgregar");
        
        DatatypeFactory dataTypeFactory;
        XMLGregorianCalendar result = null;

        
        RequestHistorialTurismoTYPE request = new RequestHistorialTurismoTYPE();
        ResponseHistorialPagoTurismoTYPE response = new ResponseHistorialPagoTurismoTYPE();
        request.setRut(req.getRut());
        request.setNumeroComprobante(req.getNumeroComprobante());
        request.setIdTransaccion(req.getIdTransaccion());
        request.setIdTransaccionCaja(req.getIdTransaccionCaja());
        request.setEstadoPago(req.getEstadoPago());
        request.setCodigoReserva(req.getCodigoReserva());
        request.setNumeroCuota(req.getNumeroCuota());
        request.setCentroTuristico(req.getCentroTuristico());
        request.setMonto(req.getMonto());
        request.setNumeroBoleta(req.getNumeroBoleta());

        try {
            request.setFechaComprobante(DatatypeFactory.newInstance().newXMLGregorianCalendar(req.getFechaComprobante()));
            request.setCheckOut(DatatypeFactory.newInstance().newXMLGregorianCalendar(req.getCheckOut()));
            request.setChekIn(DatatypeFactory.newInstance().newXMLGregorianCalendar(req.getCheckIn()));
            request.setFechaPago(DatatypeFactory.newInstance().newXMLGregorianCalendar(req.getFechaPago()));
            request.setFechaVencimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(req.getFechaVencimiento()));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        
        
        //llamada servicio
        HistorialPagoTurismoAgregar_Service service = new HistorialPagoTurismoAgregar_Service(nuevaurl,qname);
        HistorialPagoTurismoAgregar historialPagoTurismoAgregar = service.getHistorialPagoTurismoAgregarSOAP();
        
        response = historialPagoTurismoAgregar.pagoTurismoAgregar(request);
        
        res.setCodigo(response.getCodigo());
        res.setMensaje(response.getMensaje());
        return res;

    }
}