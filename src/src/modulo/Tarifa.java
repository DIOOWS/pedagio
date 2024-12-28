package modulo;

import java.io.Serializable;

public class Tarifa  implements Serializable {

    private Categoria categoria; // Correlacionamento da classe Categoria com a classe Tarifa

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


}
