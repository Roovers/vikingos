package Vikingos;

public class Granjero extends Vikingo {

    private Integer hectareas;
    private Integer hijos;

    public Granjero(Casta casta, Integer oro, Integer hectareas, Integer hijos) {
        super(casta, oro);
        this.hectareas = hectareas;
        this.hijos = hijos;
    }

    @Override
    public Boolean esProductivo() {
        return hectareas * 2 >= hijos;
    }

    @Override
    public void cobrarVida() {
        System.out.println("El granjero no cobra vidas");
    }

    @Override
    public Boolean tieneArmas() {
        return false;
    }

    @Override
    public void bonificarAscenso() {
        this.hectareas += 2;
        this.hijos += 2;
    }

    public Integer getHectareas() {
        return hectareas;
    }

    public void setHectareas(Integer hectareas) {
        this.hectareas = hectareas;
    }

    public Integer getHijos() {
        return hijos;
    }

    public void setHijos(Integer hijos) {
        this.hijos = hijos;
    }
}
