import java.util.ArrayList;

public class Elemento {
    ArrayList<Habitacion> habitaciones;
    

    public Elemento(){
        habitaciones = new ArrayList<>();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void addHabitacion(Habitacion h){
        habitaciones.add(h);
    }
    
}