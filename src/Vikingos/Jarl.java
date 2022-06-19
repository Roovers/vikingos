package Vikingos;

public class Jarl extends Casta  {

    @Override
    public Boolean pudedeIr(Vikingo vikingo, Expedicion expedicion) {
        return !vikingo.tieneArmas();
    }

    @Override
    public boolean puedeIr(Vikingo vikingo) {
        return false;
    }

    public void ascender (Vikingo vikingo) {

        vikingo.setCasta (new Karl());
        vikingo.bonificarAscenso();
    }


}
