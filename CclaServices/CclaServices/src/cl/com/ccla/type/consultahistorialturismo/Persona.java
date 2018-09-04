package cl.com.ccla.type.consultahistorialturismo;


public class Persona {
    
    private String rut;
    private String comprobante;
    private String url;
    
    public Persona() {
        super();
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getComprobante() {
        return comprobante;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
