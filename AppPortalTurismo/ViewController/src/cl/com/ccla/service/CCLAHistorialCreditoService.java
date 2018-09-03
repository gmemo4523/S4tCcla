package cl.com.ccla.service;


import cl.com.ccla.bean.CCLAHistorialTurismo;
import cl.com.ccla.bean.CCLAUserBean;
import cl.com.ccla.mpe.bean.CCLAHistorialTurismoConsultar;
import cl.com.ccla.mpe.bean.MPEConsultarTurismoHistorialBean;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import oracle.adf.share.logging.ADFLogger;


public class CCLAHistorialCreditoService {
    private static final long serialVersionUID = 0L;

    private List<CCLAHistorialTurismo> listaHistorialTurismo = null;


    private CCLAUserBean usuario = new CCLAUserBean();
    private BigInteger rut = null;
    private String digitoVerificador = "";
    private static final ADFLogger logger =
        ADFLogger.createADFLogger(CCLAHistorialCreditoService.class);


    public CCLAHistorialCreditoService() {
        super();
        //  usuario = new CCLAUserBean();

        digitoVerificador = "";
        //    ExternalContext exctx =
        //      FacesContext.getCurrentInstance().getExternalContext();
        //    CCLAUserInfoService userInfo =
        //     (CCLAUserInfoService)exctx.getSessionMap().get("UserInfoMB");
        //  if (userInfo != null && userInfo.getUser() != null) {
        //         usuario = userInfo.getUser();
        // }
        usuario.setRut("12842218");
        rut = new BigInteger(usuario.getRut());
        llenarListaTurismo(rut);

        try {
            if (usuario != null) {
                /*      String rutStr =
                   usuario.getRut().isEmpty() ? CCLAUserInfoUtils.getRut() :
                  usuario.getRut();
              digitoVerificador =
                     usuario.getDv().isEmpty() ? CCLAUserInfoUtils.getDigitoVerificador() :
                      usuario.getDv();
              rut = new BigInteger(rutStr);

               digitoVerificador = usuario.getDv();*/
                llenarListaTurismo(rut);
                //    llenarListaTurismo(new BigInteger("121") );

                String r = String.valueOf(rut);

            }
            logger.info("rut de usuario ----->" + rut + "-" +
                        digitoVerificador);
        } catch (Exception e) {
            logger.severe(e.getMessage());

        }
    }
    //se obtienen listas de historial de turismo y credito


    //reemplazar cuando entregen EJB

    public void llenarListaTurismo(BigInteger rut) {
        System.out.println("llenarListaTurismo");
        MPEConsultarTurismoHistorialBean mpe =
            new MPEConsultarTurismoHistorialBean();
        ArrayList<CCLAHistorialTurismoConsultar> lista = mpe.turismo(rut);
        listaHistorialTurismo = new ArrayList<CCLAHistorialTurismo>();
        for (CCLAHistorialTurismoConsultar lista2 : lista) {

            CCLAHistorialTurismo cclaHistoria = new CCLAHistorialTurismo();
            cclaHistoria.setCentroTuristico(lista2.getCentroTuristico());
            cclaHistoria.setCodReserva(lista2.getCodigoReserva());
            cclaHistoria.setNroBoleta(lista2.getNumeroBoleta().toString());
            cclaHistoria.setCheckIn(lista2.getCheckIn().toString());
            cclaHistoria.setCheckOut(lista2.getCheckOut().toString());
            cclaHistoria.setFechaVencimiento("28/08/2018");
            cclaHistoria.setNroCuota(lista2.getNumeroCuota());
            cclaHistoria.setEstadoPago("Disponible");
            cclaHistoria.setMonto(lista2.getMonto());
            cclaHistoria.setNumeroBoleta(lista2.getNumeroBoleta().toString());

            // cclaHistoria.setFechaPago("29-08-2018");
            listaHistorialTurismo.add(cclaHistoria);


        }


    }


    //  listaHistorialTurismo.add(historial1);


    public void setUsuario(CCLAUserBean usuario) {
        this.usuario = usuario;
    }

    public CCLAUserBean getUsuario() {
        return usuario;
    }

    public void setRut(BigInteger rut) {
        this.rut = rut;
    }

    public BigInteger getRut() {
        return rut;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public static ADFLogger getLogger() {
        return logger;
    }

    public void setListaHistorialTurismo(List<CCLAHistorialTurismo> listaHistorialTurismo) {
        this.listaHistorialTurismo = listaHistorialTurismo;
    }

    public List<CCLAHistorialTurismo> getListaHistorialTurismo() {
        return listaHistorialTurismo;
    }
}
