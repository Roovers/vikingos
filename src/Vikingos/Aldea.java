package Vikingos;public class Aldea extends Lugar {

    private Integer cantCrucifijos;

    private Integer monedasOro;

    public Aldea(Integer cantCrucifijos, Integer monedasOro) {
        this.cantCrucifijos = cantCrucifijos;
        this.monedasOro = monedasOro;
    }

    @Override
    public void destruirse(Integer cantCrucifijos) {
        this.cantCrucifijos = 0;
        this.monedasOro = 0;
    }

    @Override
    public Integer botin(Integer objetivosAGanar) {
        objetivosAGanar = monedasOro + cantCrucifijos;
        return objetivosAGanar;
    }

    @Override
    public boolean valeLaPena(Integer botin) {
            return monedasOro >= 15 && cantCrucifijos > 0;
    }

}
