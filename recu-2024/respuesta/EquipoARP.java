public class EquipoARP extends Equipo {
    
    @Override
    protected Equipo getCascaron() {
        return new EquipoARP();
    }

    @Override
    double getCrea() {
        if (miembros.size()>0)
            return miembros.get(0).getCrea();
        return 0;
    }

    @Override
    double getVel() {
        double velMax = 0;
        for (ElemPitufo m: miembros) {
            if (m.getVel() > velMax) {
                velMax = m.getVel();
            }
        }
        return velMax;
    }

}
