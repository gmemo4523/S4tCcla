package cl.com.ccla.bean;


import cl.com.ccla.type.datosturismo.CCLAMWClientsType;
import cl.com.ccla.type.datosturismo.PersonaTYPE;
import cl.com.ccla.type.datosturismo.Persona;
import cl.com.ccla.type.datosturismo.EntConsultarDatosTurismoInReqType;
import cl.com.ccla.type.datosturismo.EntConsultarDatosTurismoOutResTYPE;

import cl.com.ccla.type.datosturismo.ListaTurismo;
import cl.com.ccla.type.datosturismo.ObjectFactory;
import cl.com.ccla.type.datosturismo.Turismo;
import cl.com.ccla.webservice.datosturismo.ConsultarDatosTurismoBindingQSService;

import cl.com.ccla.webservice.datosturismo.ConsultarDatosTurismoOperacionPortType;

import com.google.gson.Gson;

import java.math.BigDecimal;

import java.net.MalformedURLException;
import java.net.URL;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.xml.namespace.QName;


@Path("/ConsultaDatosTurismoBean")
public class ConsultarDatosTurismoBean {
    public ConsultarDatosTurismoBean() {
        super();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/DatosTurismo")
    public ListaTurismo HistorialTurismo(String input) {
        //extrae parametros
        Persona person = new Persona();
        Gson gson = new Gson();
        person = gson.fromJson(input, Persona.class);
        
        //setea url
        String url = "http://"+ person.getUrl()+"/Financiero/PagoElectronico/ConsultaDatosTurismo";
        
        //utilidades de salida
        ListaTurismo listaTurismo = new ListaTurismo();
        ArrayList<Turismo> lista = new ArrayList<Turismo>();
        Turismo tur;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm");
                
        
        //Construye objeto entrada
        EntConsultarDatosTurismoInReqType request = new EntConsultarDatosTurismoInReqType();
        EntConsultarDatosTurismoOutResTYPE response = new EntConsultarDatosTurismoOutResTYPE();
        PersonaTYPE persona = new PersonaTYPE();
        cl.com.ccla.type.datosturismo.ObjectFactory factory = new cl.com.ccla.type.datosturismo.ObjectFactory();
        persona.setRut(factory.createPersonaTYPERut(new BigDecimal(person.getRut())));
        
        
        request.setPersona(persona);
        URL nuevaurl = null;
        
        try {
            nuevaurl = new URL(url);
            } catch (MalformedURLException e) {
               e.printStackTrace();
            }
        QName qname = new QName("http://ccla.cl/enterprise/catalogo/ebs/region",
                    "ConsultarDatosTurismoBindingQSService");

        CCLAMWClientsType header = new CCLAMWClientsType();
        header.setAplicacion("CCLA");
        header.setComponente("CCLA");
        header.setPlataforma("CCLA");
        
        //lamada al servicio
        
        ConsultarDatosTurismoBindingQSService service = new ConsultarDatosTurismoBindingQSService(nuevaurl,qname);
        ConsultarDatosTurismoOperacionPortType ejecucion = service.getConsultarDatosTurismoBindingQSPort();

        response =  ejecucion.consultarDatosTurismo(request, header);      
        
        for (int i = 0; i < response.getListaTurismo().getTurismo().size(); i++) {
            tur = new Turismo();
            tur.setReservaID(response.getListaTurismo().getTurismo().get(i).getReservaID().getValue());
            tur.setCodigoReserva(response.getListaTurismo().getTurismo().get(i).getCodigoReserva().getValue());
            tur.setCheckIn(sdf.format(response.getListaTurismo().getTurismo().get(i).getCheckIn().getValue().toGregorianCalendar().getTime()));
            tur.setCheckOut(sdf.format(response.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().toGregorianCalendar().getTime()));
            tur.setCentro(response.getListaTurismo().getTurismo().get(i).getCentro().getValue());
            tur.setMntPendiente(response.getListaTurismo().getTurismo().get(i).getMntPendiente().getValue());
            tur.setEstado(response.getListaTurismo().getTurismo().get(i).getEstado().getValue());
            tur.setTipoHabitacion(response.getListaTurismo().getTurismo().get(i).getTipoHabitacion().getValue());
            tur.setNroHabitacion(response.getListaTurismo().getTurismo().get(i).getNroHabitacion().getValue());
            tur.setCapacidadHabitacion(response.getListaTurismo().getTurismo().get(i).getCapacidadHabitacion().getValue());
            tur.setFechaGrab(sdf.format(response.getListaTurismo().getTurismo().get(i).getFechaGrab().getValue().toGregorianCalendar().getTime()));
            tur.setNumeroComprobante(response.getListaTurismo().getTurismo().get(i).getNumeroComprobante().getValue());
            tur.setEstadoCi(response.getListaTurismo().getTurismo().get(i).getEstadoCi().getValue());
            tur.setMontoCi(response.getListaTurismo().getTurismo().get(i).getMontoCi().getValue());
            tur.setCuentaPeriodo(response.getListaTurismo().getTurismo().get(i).getCuentaPeriodo().getValue());
            tur.setRegion(response.getListaTurismo().getTurismo().get(i).getCentro().getValue());
            tur.setCodigoSucursal(response.getListaTurismo().getTurismo().get(i).getCodigoSucursal().getValue());
            tur.setTipoDocumento(response.getListaTurismo().getTurismo().get(i).getTipoDocumento().getValue());
            tur.setCorrelativoComprobante(response.getListaTurismo().getTurismo().get(i).getCorrelativoComprobante().getValue());
            tur.setIdCuota(response.getListaTurismo().getTurismo().get(i).getIdCuota().getValue());
            tur.setFechaVencimiento(sdf.format(response.getListaTurismo().getTurismo().get(i).getFechaVencimiento().getValue().toGregorianCalendar().getTime()));
            
            lista.add(tur);
            
         
        }
        
        listaTurismo.setListaTurismo(lista);

        return listaTurismo;
        

    
}

}
