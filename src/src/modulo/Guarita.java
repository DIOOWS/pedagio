package modulo;

import java.io.Serializable;
import java.util.Set;

public class Guarita implements Serializable {

    private int numero;
    private int veiculos;
    private double totalRecebeido;
    private Set<Praca> pracas;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(int veiculos) {
        this.veiculos = veiculos;
    }

    public double getTotalRecebeido() {
        return totalRecebeido;
    }

    public void setTotalRecebeido(double totalRecebeido) {
        this.totalRecebeido = totalRecebeido;
    }

    public Set<Praca> getPracas() {
        return pracas;
    }

    public void setPracas(Set<Praca> pracas) {
        this.pracas = pracas;
    }


}
