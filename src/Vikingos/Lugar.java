package Vikingos;

public abstract class Lugar {

    public void serInvadidoPor(Expedicion expedicion) {

        expedicion.repartirBotin(botin(expedicion.cantidadIntegrantes()));

        destruirse(expedicion.cantidadIntegrantes());
    }

    public abstract void destruirse(Integer cantInvasores);

    public abstract Integer botin(Integer objetivosAGanar );

    public abstract  boolean valeLaPena(Integer botin) ;

}

