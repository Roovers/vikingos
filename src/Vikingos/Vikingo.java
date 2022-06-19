package Vikingos;

public abstract class Vikingo {

    private Casta casta;
    private Integer oro;

    public Vikingo(Casta casta, Integer oro) {
        this.casta = casta;
        this.oro = oro;
    }

    public Boolean subirAExpedicion(Vikingo soldado) {
        return esProductivo() && casta.puedeIr(soldado);
    }

    public abstract Boolean esProductivo();

    public abstract void cobrarVida();

    public abstract Boolean tieneArmas();

    public abstract void bonificarAscenso();

    public void ascender() {
        casta.ascender(this);
    }

    public void ganar(Integer monedas) {
        oro += monedas;
    }

    public Casta getCasta() {
        return casta;
    }

    public void setCasta(Casta casta) {
        this.casta = casta;
    }

    public Integer getOro() {
        return oro;
    }

    public void setOro(Integer oro) {
        this.oro = oro;
    }
}




