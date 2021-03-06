package cl.com.ccla.webservice.wsdashboard;

import cl.com.ccla.type.wsdashboard.LtrxRsp;
import cl.com.ccla.type.wsdashboard.MPINI;
import cl.com.ccla.type.wsdashboard.ObjectFactory;
import cl.com.ccla.type.wsdashboard.TrxCompleta;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="http://qa-osbweb:8005/Financiero/PagoElectronico/WSDashboardMensajeria/Proxy/WSDashboardService?wsdl",
  targetNamespace="http://dashboard.ws.ccla.cl", name="WSDashboardIF")
@XmlSeeAlso(
  { ObjectFactory.class })
@SOAPBinding(style=Style.RPC)
public interface WSDashboardIF
{
  @WebMethod
  @Action(input="http://dashboard.ws.ccla.cl/WSDashboardIF/generarTRXRequest", fault =
      { @FaultAction(value="http://dashboard.ws.ccla.cl/WSDashboardIF/generarTRX/Fault/Exception",
          className = Exception.class) }, output="http://dashboard.ws.ccla.cl/WSDashboardIF/generarTRXResponse")
  @WebResult(partName="MPINI", name="MPINI")
  public MPINI generarTRX(@WebParam(partName="TrxCompleta", name="TrxCompleta")
    TrxCompleta TrxCompleta)
    throws Exception;

  @WebMethod(operationName="TrxPeriodo")
  @Action(input="http://dashboard.ws.ccla.cl/WSDashboardIF/TrxPeriodoRequest", fault =
      { @FaultAction(value="http://dashboard.ws.ccla.cl/WSDashboardIF/TrxPeriodo/Fault/Exception",
          className = Exception.class) }, output="http://dashboard.ws.ccla.cl/WSDashboardIF/TrxPeriodoResponse")
  @WebResult(partName="trxRsp", name="trxRsp")
  public LtrxRsp trxPeriodo(@WebParam(partName="fcIni", name="fcIni")
    String fcIni, @WebParam(partName="fcFin", name="fcFin")
    String fcFin)
    throws Exception;

  @WebMethod(operationName="TrxBanco")
  @Action(input="http://dashboard.ws.ccla.cl/WSDashboardIF/TrxBancoRequest", fault =
      { @FaultAction(value="http://dashboard.ws.ccla.cl/WSDashboardIF/TrxBanco/Fault/Exception",
          className = Exception.class) }, output="http://dashboard.ws.ccla.cl/WSDashboardIF/TrxBancoResponse")
  @WebResult(partName="trxRsp", name="trxRsp")
  public LtrxRsp trxBanco(@WebParam(partName="cdBnc", name="cdBnc")
    long cdBnc)
    throws Exception;

  @WebMethod(operationName="MensajeriaTrxRS")
  @Action(input="http://dashboard.ws.ccla.cl/WSDashboardIF/MensajeriaTrxRSRequest", fault =
      { @FaultAction(value="http://dashboard.ws.ccla.cl/WSDashboardIF/MensajeriaTrxRS/Fault/Exception",
          className = Exception.class) }, output="http://dashboard.ws.ccla.cl/WSDashboardIF/MensajeriaTrxRSResponse")
  @WebResult(partName="MensajeriaTrxRS", name="MensajeriaTrxRS")
  public cl.com.ccla.type.wsdashboard.RSMensajeriaTrx mensajeriaTrxRS(@WebParam(partName="Transaccion",
      name="Transaccion")
    TrxCompleta Transaccion)
    throws Exception;
}
