package respuesta2;

import java.util.ArrayList;

public abstract class PitufiElem {
    abstract int getVelTrab();
    abstract int getCreatividad();
    abstract ArrayList<String> getHabilidades();
    abstract int cantidadPitufos(Condicion c);
    abstract PitufiElem copia();
}
