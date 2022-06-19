package Vikingos;

import java.util.List;

public class Expedicion {

    private List<Vikingo> integrantes;
    private List<Lugar> objetivos;

    public List<Vikingo> getIntegrantes() {
        return integrantes;
    }

    public Expedicion(List<Vikingo> integrantes, List<Lugar> objetivos) {
        this.integrantes = integrantes;
        this.objetivos = objetivos;
    }

    public void subir(Vikingo vikingo) {

        if (!vikingo.subirAExpedicion(vikingo)) {

            System.out.println("No puede subir a la expedicion.");

        }
        integrantes.add(vikingo);
    }

    public Boolean valeLaPena() {

        return objetivos.stream().allMatch(obj -> obj.valeLaPena(cantidadIntegrantes()));
    }



    public void setIntegrantes(List<Vikingo> integrantes) {
        this.integrantes = integrantes;
    }

    public Integer cantidadIntegrantes() {

        return integrantes.size();
    }

    public void realizar() {

        objetivos.forEach(obj -> obj.serInvadidoPor(this));

    }

    public void repartirBotin(Integer botin) {

        integrantes.forEach(integ -> integ.ganar(botin / cantidadIntegrantes()));

    }

    public void agregarLugar(Lugar objetivo) {

        objetivos.add(objetivo);
    }

    public void aumentarVidasCobradas(Integer cantidad) {

        integrantes.stream().limit(cantidadIntegrantes()).forEach(integ -> integ.cobrarVida());


    }
}


