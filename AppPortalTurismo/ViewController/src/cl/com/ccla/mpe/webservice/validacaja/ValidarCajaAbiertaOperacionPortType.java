package cl.com.ccla.mpe.webservices.validacaja;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 150302.2135.55683)

@WebService(wsdlLocation =
            "http://qa-osbweb:8005/Financiero/PagoElectronico/ValidaCajasAbiertas/ValidaCajaAbierta?Wsdl",
            targetNamespace = "http://ccla.cl/enterprise/catalogo/ebs/region",
            name = "ValidarCajaAbiertaOperacionPortType")
@XmlSeeAlso( { cl.com.ccla.mpe.type.validacaja.ObjectFactory.class })
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.BARE)
public interface ValidarCajaAbiertaOperacionPortType {
    @WebMethod(operationName = "ValidarCajaAbierta",
               action = "http://ccla.cl/enterprise/catalogo/ebs/licanciaAfiliado/ValidarCajaAbierta")
    @SOAPBinding(parameterStyle = ParameterStyle.BARE)
    @Action(input =
            "http://ccla.cl/enterprise/catalogo/ebs/licanciaAfiliado/ValidarCajaAbierta",
            output =
            "http://ccla.cl/enterprise/catalogo/ebs/region/ValidarCajaAbiertaOperacionPortType/ValidarCajaAbiertaResponse")
    @WebResult(targetNamespace =
               "http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta",
               partName = "parameter", name = "EntValidarCajaAbiertaOutEBM")
    public cl.com.ccla.mpe.type.validacaja.EntValidarCajaAbiertaOutResTYPE validarCajaAbierta(@WebParam(targetNamespace =
                                                                                                        "http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta",
                                                                                                        partName =
                                                                                                        "parameters",
                                                                                                        name =
                                                                                                        "EntValidarCajaAbiertaInEBM")
        cl.com.ccla.mpe.type.validacaja.EntValidarCajaAbiertaInReqType parameters,
        @WebParam(targetNamespace =
                  "http://esb.cla.cl/EnterpriseObjects/CCLAMWClients/V1",
                  partName = "requestHeader", name = "CCLAMWClients",
                  header = true)
        cl.com.ccla.mpe.type.validacaja.CCLAMWClientsType requestHeader);
}
