package cl.com.ccla.type.dashnotif;

public class DashboardNotificacion {
    
    private String idtrx;
    private String tipoMov;
    private dataWP dataWP;
    private String url;
    
    public DashboardNotificacion() {
        super();
    }

    public String getIdtrx() {
        return idtrx;
    }

    public void setIdtrx(String idtrx) {
        this.idtrx = idtrx;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public dataWP getDataWP() {
        return dataWP;
    }

    public void setDataWP(dataWP dataWP) {
        this.dataWP = dataWP;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
