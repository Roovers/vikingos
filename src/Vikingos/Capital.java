package Vikingos;

public class Capital extends Lugar {

    private Integer defensores;
    private Integer riqueza ;

    private Integer monedasOro;

    public Capital(Integer defensores, Integer riqueza) {
        this.defensores = defensores;
        this.riqueza = riqueza;
        this.monedasOro = monedasOro;
    }

    @Override
    public Integer botin(Integer cantInvasores) {
        return  defensoresDerrotados(cantInvasores) * riqueza;
    }

    @Override
    public boolean valeLaPena(Integer cantInvasores) {
        return this.botin(cantInvasores) / cantInvasores >= 3 ;
    }

    @Override
    public void destruirse(Integer cantInvasores) {

        this.defensores -= defensoresDerrotados(cantInvasores);
    }

    public Integer defensoresDerrotados(Integer cantInvasores) {
        return Math.min(defensores , cantInvasores);
    }

    @Override
    public void serInvadidoPor (Expedicion expedicion) {

     expedicion.aumentarVidasCobradas(defensoresDerrotados(expedicion.cantidadIntegrantes()));
    }

    public Integer getDefensores() {
        return defensores;
    }

    public void setDefensores(Integer defensores) {
        this.defensores = defensores;
    }

    public Integer getRiqueza() {
        return riqueza;
    }

    public void setRiqueza(Integer riqueza) {
        this.riqueza = riqueza;
    }
}

