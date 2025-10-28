import java.util.ArrayList;

public class CadenaHotelera {
    protected Turista turista;
    protected ArrayList<Elemento> hoteles;

    public CadenaHotelera(Turista t){
        hoteles = new ArrayList<>();
        turista = t;
    }

    public void addHotel(Elemento hotel){
        hoteles.add(hotel);
    }

    public void ocuparHabitacion(Condicion c){
        
    }

}
