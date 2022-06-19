package Vikingos;

public class Soldado extends Vikingo {

    private Integer vidasCobradas;
    private Integer armas;

    public Soldado(Casta casta, Integer oro, Integer vidasCobradas, Integer armas) {
        super(casta, oro);
        this.vidasCobradas = vidasCobradas;
        this.armas = armas;
    }

    @Override
    public Boolean esProductivo() {
        return vidasCobradas > 20 && tieneArmas();
    }

    @Override
    public void cobrarVida() {
        this.vidasCobradas++;
    }

    @Override
    public Boolean tieneArmas() {
        return armas > 0;
    }

    @Override
    public void bonificarAscenso() {
        this.armas += 10;
    }

    public Integer getVidasCobradas() {
        return vidasCobradas;
    }

    public void setVidasCobradas(Integer vidasCobradas) {
        this.vidasCobradas = vidasCobradas;
    }

    public Integer getArmas() {
        return armas;
    }

    public void setArmas(Integer armas) {
        this.armas = armas;
    }
}
