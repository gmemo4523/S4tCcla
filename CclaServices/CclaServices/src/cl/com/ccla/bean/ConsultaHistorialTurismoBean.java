package cl.com.ccla.bean;

import cl.com.ccla.type.consultahistorialturismo.CCLAMWClientsType;
import cl.com.ccla.type.consultahistorialturismo.EntConsultarHistorialTurismoInReqType;
import cl.com.ccla.type.consultahistorialturismo.EntConsultarHistorialTurismoOutResTYPE;


import cl.com.ccla.type.consultahistorialturismo.ObjectFactory;
import cl.com.ccla.type.consultahistorialturismo.Persona;
import cl.com.ccla.type.consultahistorialturismo.PersonaTYPE;
import cl.com.ccla.webservice.consultahistorialturismo.ConsultarHistorialTurismoBindingQSService;

import cl.com.ccla.webservice.consultahistorialturismo.ConsultarHistorialTurismoOperacionPortType;

import com.google.gson.Gson;

import java.math.BigDecimal;

import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.xml.namespace.QName;

@Path("/ConsultaHistorialTurismoBean")
public class ConsultaHistorialTurismoBean {
    public ConsultaHistorialTurismoBean() {
        super();
    }
        
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/HistorialTurismo")
    public EntConsultarHistorialTurismoOutResTYPE HistorialTurismo(String input) {
        //extrae parametros
        Persona person = new Persona();
        Gson gson = new Gson();
        person = gson.fromJson(input, Persona.class);
        
        //setea url
        String url = "http://"+person.getUrl()+"/Financiero/PagoElectronico/Consulta/HistorialTurismo";
        
        //Construye objeto entrada
        EntConsultarHistorialTurismoOutResTYPE response = new EntConsultarHistorialTurismoOutResTYPE();
        EntConsultarHistorialTurismoInReqType request = new EntConsultarHistorialTurismoInReqType();
        PersonaTYPE persona = new PersonaTYPE();
        cl.com.ccla.type.consultahistorialturismo.ObjectFactory factory = new cl.com.ccla.type.consultahistorialturismo.ObjectFactory();
        persona.setRut(factory.createPersonaTYPERut(new BigDecimal(person.getRut())));
        persona.setComprobante(factory.createPersonaTYPEComprobante(person.getComprobante()));
        request.setPersona(persona);
        URL nuevaurl = null;
        
        try {
            nuevaurl = new URL(url);
            } catch (MalformedURLException e) {
               e.printStackTrace();
            }
        QName qname = new QName("http://ccla.cl/enterprise/catalogo/ebs/region",
                    "ConsultarHistorialTurismoBindingQSService");

        CCLAMWClientsType header = new CCLAMWClientsType();
        header.setAplicacion("CCLA");
        header.setComponente("CCLA");
        header.setPlataforma("CCLA");
        
        
        //llamada al servicio
        ConsultarHistorialTurismoBindingQSService service = new ConsultarHistorialTurismoBindingQSService(nuevaurl,qname);
        ConsultarHistorialTurismoOperacionPortType ejecucion = service.getConsultarHistorialTurismoBindingQSPort();

        return ejecucion.consultarHistorialTurismo(request, header);
        
        
    }
    
}
