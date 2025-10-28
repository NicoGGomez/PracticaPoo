package respuesta2;

public class EquipoHPC extends Equipo {

        @Override
    int getCreatividad() {
        int max = 0;
        for(PitufiElem p: pitufos){
            if (p.getCreatividad() > max) {
                max = p.getCreatividad();
            }
        }
        return max;
    }

    @Override
    int getVelTrab() {
        int retorno = pitufos.get(pitufos.size()-1).getCreatividad();
        return retorno;
    }

    @Override
    Equipo getCascaron() {
        return new EquipoHPC();
    }
}
