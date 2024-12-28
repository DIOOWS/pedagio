package visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends  JFrame{

        private final JButton btConsultar = new JButton("Consultar");
        private final JButton btRelatorio = new JButton("Relátorio");
        private final JButton btConfiguracoes = new JButton("Configurações");

        private final JButton btPracas = new JButton("Praças");
        private final JButton btTarifas = new JButton("Tarifas");
        private final JButton btCategorias = new JButton("Categorias");
        private final JButton btEncerrar = new JButton("Encerrar");

        private final JTable tbDados = new JTable();

        public TelaPrincipal(){
        setSize(800, 400);
        setTitle("Sistema de Gestão de Pedágios");

        getContentPane().setLayout(new BorderLayout());

        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new GridLayout(1,3, 5, 5));
        painelSuperior.add(btConsultar);
        painelSuperior.add(btRelatorio);
        painelSuperior.add(btConfiguracoes);

        JPanel painelLateralDireiro = new JPanel();
        painelLateralDireiro.setLayout(new GridLayout(4, 1, 5, 5));
        painelLateralDireiro.add(btPracas);
        painelLateralDireiro.add(btTarifas);
        painelLateralDireiro.add(btCategorias);
        painelLateralDireiro.add(btEncerrar);



        getContentPane().add(painelSuperior, BorderLayout.NORTH);
        getContentPane().add(painelLateralDireiro, BorderLayout.EAST);
        getContentPane().add(tbDados, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        btEncerrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btPracas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        TelaPracas tPracas = TelaPracas.getInstance();
                        tPracas.setVisible(true);

                }
        });
    }
}
