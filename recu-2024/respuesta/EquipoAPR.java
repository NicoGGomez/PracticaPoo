package respuesta2;

public class EquipoAPR extends Equipo {

    @Override
    int getCreatividad() {
        int retorno = pitufos.get(0).getCreatividad();
        return retorno;
    }

    @Override
    int getVelTrab() {
        int max = 0;
        for(PitufiElem p: pitufos){
            if (p.getVelTrab() > max) {
                max = p.getVelTrab();
            }
        }
        return max;
    }

    @Override
    Equipo getCascaron() {
        return new EquipoAPR();
    }
}
