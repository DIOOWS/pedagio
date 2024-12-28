package percistencia;

import java.awt.*;
import java.io.*;

public class Repositorio implements Serializable{


    public void gravar (List conssecionaria) throws IOException {
        FileOutputStream saidaArquivo = new FileOutputStream ("pedagio.dat");
        ObjectOutputStream objetoSaida = new ObjectOutputStream (saidaArquivo);
        objetoSaida.writeObject(conssecionaria);
    }

    public List ler() throws IOException, ClassNotFoundException {
        FileInputStream entradaArquivo = new FileInputStream("pedagio.dat");
        ObjectInputStream objetoEntrada = new ObjectInputStream(entradaArquivo);
        Object conssecionarias = objetoEntrada.readObject();
        return (List) conssecionarias;
    }
}

