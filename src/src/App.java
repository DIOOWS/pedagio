import modulo.*; // Nome da pasta .* importa todos os modulos que existem dentro dessa pasta

import java.io.Serializable;


public class App implements Serializable {
    public static void main(String[] args) {
    Conssecionaria minhaConssecionaria = new Conssecionaria("Conssecionaria A");


    minhaConssecionaria.setNome("Conssecionaria AAA");


    Praca praca_01 = new Praca();
    praca_01.setCidade("Curitiba");

    Praca praca_02 = new Praca();
    praca_02.setCidade("São Paulo");

    Praca praca_03 = new Praca();
    praca_03.setCidade("Rio de Janeiro");


    minhaConssecionaria.adicionarPraca(praca_01);
    minhaConssecionaria.adicionarPraca(praca_02);
    minhaConssecionaria.adicionarPraca(praca_03);

    //minhaConssecionaria.limpaPracas(praca_01);

    }

}