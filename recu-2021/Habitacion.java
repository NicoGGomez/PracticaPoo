import java.sql.Date;

public class Habitacion {

    private int metrosCuad;
    private int cantCamas;
    private Date fOcupacion;
    private boolean AceptaMasco;
    private boolean ocupada;

    public Habitacion(int m, int c, Date f, boolean a, boolean o){
        metrosCuad = m;
        cantCamas = c;
        fOcupacion = f;
        AceptaMasco = a;
        ocupada = o;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public int getMetrosCuad() {
        return metrosCuad;
    }

    public Date getfOcupacion() {
        return fOcupacion;
    }

    public Date getAceptaMasco() {
        return AceptaMasco;
    }

    public void setAceptaMasco(boolean AceptaMasco) {
        this.AceptaMasco = AceptaMasco;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public void setMetrosCuad(int metrosCuad) {
        this.metrosCuad = metrosCuad;
    }

}
