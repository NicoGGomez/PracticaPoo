public class EquipoHPC extends Equipo {

    @Override
    protected Equipo getCascaron() {
        return new EquipoHPC();
    }

    @Override
    double getCrea() {
        double creaMax = 0;
        for(ElemPitufo m: miembros){
            if (m.getCrea() > creaMax) {
                creaMax =  m.getCrea();
            }
        }
        return creaMax;
    }

    @Override
    double getVel() {
        double vel = 0;
            if(miembros.size() > 0)
            vel = miembros.get(miembros.size()-1).getVel();
        return vel;
    }

}
