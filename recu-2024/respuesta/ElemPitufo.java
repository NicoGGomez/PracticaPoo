import java.util.ArrayList;

abstract class ElemPitufo {

    abstract double getVel();
    abstract double getCrea();
    abstract ArrayList<String> getHabs();
    abstract int getCantPitufos(Condicion c);
    abstract ElemPitufo getCopia();

}