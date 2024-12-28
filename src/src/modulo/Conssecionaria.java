package modulo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Conssecionaria implements Serializable {

    private String nome;
    private Set<Praca> pracas = new HashSet<>();
    private double totalRecebido;

    private Conssecionaria(){

    }

    public Conssecionaria(String nome){
        this.nome = nome;
        this.totalRecebido = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Praca> getPracas() {
        return pracas;
    }

    public double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public void adicionarPraca(Praca praca){
        this.pracas.add(praca);
        this.totalRecebido = 0.0;
        for (Praca p : this.pracas){
            this.totalRecebido = this.totalRecebido + p.getTotalRecebido();
        }
    }

    public void limpaPraca(Praca praca){
        this.pracas = new HashSet<>();
    }

}
