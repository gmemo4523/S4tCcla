package cl.com.ccla.type.historialpagoturismoagregar;

import java.math.BigDecimal;


public class RequestHistorialTurismo {
    
    private BigDecimal rut;
    private String numeroComprobante;
    private String fechaComprobante;
    private String idTransaccion;
    private String idTransaccionCaja;
    private String estadoPago;
    private String codigoReserva;
    private String checkOut;
    private String checkIn;
    private BigDecimal numeroCuota;
    private String centroTuristico;
    private BigDecimal monto;
    private String fechaPago;
    private BigDecimal numeroBoleta;
    private String fechaVencimiento;
    private String url;
    
    public RequestHistorialTurismo() {
        super();
    }

    public void setRut(BigDecimal rut) {
        this.rut = rut;
    }

    public BigDecimal getRut() {
        return rut;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setFechaComprobante(String fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public String getFechaComprobante() {
        return fechaComprobante;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccionCaja(String idTransaccionCaja) {
        this.idTransaccionCaja = idTransaccionCaja;
    }

    public String getIdTransaccionCaja() {
        return idTransaccionCaja;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setNumeroCuota(BigDecimal numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public BigDecimal getNumeroCuota() {
        return numeroCuota;
    }

    public void setCentroTuristico(String centroTuristico) {
        this.centroTuristico = centroTuristico;
    }

    public String getCentroTuristico() {
        return centroTuristico;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setNumeroBoleta(BigDecimal numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public BigDecimal getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
