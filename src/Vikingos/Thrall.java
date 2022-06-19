package Vikingos;

public class Thrall extends Casta{


    @Override
    public Boolean pudedeIr(Vikingo vikingo, Expedicion expedicion) {
        return null;
    }

    @Override
    public boolean puedeIr(Vikingo vikingo) {
        return true;
    }

    @Override
    public void ascender(Vikingo vikingo) {
        throw new RuntimeException("No puede ascender , casta mas alta !");
    }
}
