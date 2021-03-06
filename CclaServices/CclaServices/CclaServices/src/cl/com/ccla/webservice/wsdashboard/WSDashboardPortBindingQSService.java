package cl.com.ccla.webservice.wsdashboard;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://qa-osbweb:8005/Financiero/PagoElectronico/WSDashboardMensajeria/Proxy/WSDashboardService?wsdl",
  targetNamespace="http://dashboard.ws.ccla.cl", name="WSDashboardPortBindingQSService")
public class WSDashboardPortBindingQSService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("cl.com.ccla.webservice.wsdashboard.WSDashboardPortBindingQSService");
      URL baseUrl = WSDashboardPortBindingQSService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            WSDashboardPortBindingQSService.class.getResource("http://qa-osbweb:8005/Financiero/PagoElectronico/WSDashboardMensajeria/Proxy/WSDashboardService?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://qa-osbweb:8005/Financiero/PagoElectronico/WSDashboardMensajeria/Proxy/WSDashboardService?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://qa-osbweb:8005/Financiero/PagoElectronico/WSDashboardMensajeria/Proxy/WSDashboardService?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://qa-osbweb:8005/Financiero/PagoElectronico/WSDashboardMensajeria/Proxy/WSDashboardService?wsdl",
          e);
    }
  }

  public WSDashboardPortBindingQSService()
  {
    super(wsdlLocationURL,
          new QName("http://dashboard.ws.ccla.cl", "WSDashboardPortBindingQSService"));
  }

  public WSDashboardPortBindingQSService(URL wsdlLocation,
                                         QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="WSDashboardPortBindingQSPort")
  public WSDashboardIF getWSDashboardPortBindingQSPort()
  {
    return (WSDashboardIF) super.getPort(new QName("http://dashboard.ws.ccla.cl",
                                                   "WSDashboardPortBindingQSPort"),
                                         WSDashboardIF.class);
  }

  @WebEndpoint(name="WSDashboardPortBindingQSPort")
  public WSDashboardIF getWSDashboardPortBindingQSPort(WebServiceFeature... features)
  {
    return (WSDashboardIF) super.getPort(new QName("http://dashboard.ws.ccla.cl",
                                                   "WSDashboardPortBindingQSPort"),
                                         WSDashboardIF.class, features);
  }
}
