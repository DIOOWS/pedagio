package visao;

import javax.swing.*;

public class TelaPracas extends JFrame {

    private static TelaPracas instancia;

    private TelaPracas(){
        setTitle("Controle de Praças");
        setSize(400, 200);
    }

    public static TelaPracas getInstance(){
        if(instancia == null){
            instancia = new TelaPracas();
        }
        return instancia;
    }
}
