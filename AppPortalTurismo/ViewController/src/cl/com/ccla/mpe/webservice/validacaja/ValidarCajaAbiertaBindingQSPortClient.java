package cl.com.ccla.mpe.webservices.validacaja;


import cl.com.ccla.bean.validacaja.CajaBean;
import cl.com.ccla.mpe.type.validacaja.CCLAMWClientsType;
import cl.com.ccla.mpe.type.validacaja.CajaTYPE;
import cl.com.ccla.mpe.type.validacaja.EntValidarCajaAbiertaInReqType;
import cl.com.ccla.mpe.type.validacaja.EntValidarCajaAbiertaOutResTYPE;
import cl.com.ccla.mpe.type.validacaja.ObjectFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 150302.2135.55683)

public class ValidarCajaAbiertaBindingQSPortClient {
    @WebServiceRef
    private static ValidarCajaAbiertaBindingQSService validarCajaAbiertaBindingQSService;

    public static void main(String[] args) {
        validarCajaAbiertaBindingQSService =
                new ValidarCajaAbiertaBindingQSService();
        ValidarCajaAbiertaOperacionPortType validarCajaAbiertaOperacionPortType =
            validarCajaAbiertaBindingQSService.getValidarCajaAbiertaBindingQSPort();
        // Add your code to call the desired methods.

        CajaBean cajaBean = new CajaBean();

        EntValidarCajaAbiertaInReqType reqOSB =
            new EntValidarCajaAbiertaInReqType();
        EntValidarCajaAbiertaOutResTYPE resOSB =
            new EntValidarCajaAbiertaOutResTYPE();

        CCLAMWClientsType header = new CCLAMWClientsType();

        header.setAplicacion("CCLA");
        header.setComponente("CCLA");
        header.setPlataforma("CCLA");

        CajaTYPE cajaType = new CajaTYPE();
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<String> usuarioPago =
            objectFactory.createCajaTYPEPagoUsuario("WEBPAY1");
        cajaType.setPagoUsuario(usuarioPago);
        reqOSB.setCaja(cajaType);
        resOSB =
                validarCajaAbiertaOperacionPortType.validarCajaAbierta(reqOSB, header);
        cajaBean.setStatus(String.valueOf(resOSB.getStatusCaja()));
        cajaBean.setHoraInicio(resOSB.getHorarioCajaInicio());
        cajaBean.setHoraFin(resOSB.getHorarioCajaFin());

        System.out.println(cajaBean.getHoraFin());
        System.out.println(cajaBean.getStatus());
    }
}
