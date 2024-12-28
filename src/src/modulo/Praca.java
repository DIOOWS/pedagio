package modulo;

import java.util.Set;

public class Praca {

    private String cidade;
    private double totalRecebido;
    private Set<Guarita> guaritas;
    private Set<Tarifa> tarifas;

    public Conssecionaria getConssecionaria() {
        return conssecionaria;
    }

    public void setConssecionaria(Conssecionaria conssecionaria) {
        this.conssecionaria = conssecionaria;
    }

    private Conssecionaria conssecionaria; // Correlacionamento da classe Categoria com a classe Tarifa

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public Set<Guarita> getGuaritas() {
        return guaritas;
    }

    public void setGuaritas(Set<Guarita> guaritas) {
        this.guaritas = guaritas;
    }

    public Set<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(Set<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }


}
