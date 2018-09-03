package cl.com.ccla.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 150302.2135.55683)

@WebService(wsdlLocation = "http://merelava:8080/TbkAppv1/TbkWS?wsdl",
            targetNamespace = "http://ws/", name = "TbkWS")
@XmlSeeAlso( { cl.com.ccla.type.ObjectFactory.class })
public interface TbkWS {
    @WebMethod
    @Action(input = "http://ws/TbkWS/initTbkRequest",
            output = "http://ws/TbkWS/initTbkResponse")
    @ResponseWrapper(localName = "initTbkResponse",
                     targetNamespace = "http://ws/",
                     className = "cl.com.ccla.type.InitTbkResponse")
    @RequestWrapper(localName = "initTbk", targetNamespace = "http://ws/",
                    className = "cl.com.ccla.type.InitTbk")
    @WebResult(targetNamespace = "")
    public cl.com.ccla.type.InitVO initTbk(@WebParam(targetNamespace = "",
                                                     name = "initMpe")
        cl.com.ccla.type.InitMpeTbkVO initMpe);

    @WebMethod
    @Action(input = "http://ws/TbkWS/getResultadoRequest",
            output = "http://ws/TbkWS/getResultadoResponse")
    @ResponseWrapper(localName = "getResultadoResponse",
                     targetNamespace = "http://ws/",
                     className = "cl.com.ccla.type.GetResultadoResponse")
    @RequestWrapper(localName = "getResultado", targetNamespace = "http://ws/",
                    className = "cl.com.ccla.type.GetResultado")
    @WebResult(targetNamespace = "")
    public cl.com.ccla.type.TransactionResultOutput getResultado(@WebParam(targetNamespace =
                                                                           "",
                                                                           name =
                                                                           "token")
        String token);
}
