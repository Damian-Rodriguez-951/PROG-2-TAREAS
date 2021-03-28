package com.company;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;


public class Main implements ActionListener {

    JButton bt1,bt2,bt3,bt4;
    JLabel jl1, jl2, jl3;
    JTextField jt1, jt2, jt3;
    JFrame jf = new JFrame("Calculadora");
    JCheckBox jCh = new JCheckBox();


    public Main() {//constructor de la clase

        jf.setLayout(new FlowLayout());
        Dimension d = new Dimension();

        //Instanciando etiquetas
        jl1 = new JLabel("Numero 1");
        jl2 = new JLabel("Numero 2");
        jl3 = new JLabel("=");

        //Instanciando cuadros de texto
        jt1 = new JTextField(8);
        jt2 = new JTextField(8);
        jt3 = new JTextField(12);

        //Instanciando boton con texto
        bt1 = new JButton("+");
        bt2 = new JButton("-");
        bt3 = new JButton("*");
        bt4 = new JButton("/");

        //añadiendo objetos a la ventana
        jf.add(jl1);
        jf.add(jt1);
        jf.add(bt1);
        jf.add(bt2);
        jf.add(bt3);
        jf.add(bt4);
        jf.add(jl2);
        jf.add(jt2);
        jf.add(jl3);
        jf.add(jt3);



        //margenes para texto en boton
        bt1.setMargin(new Insets(1, 5, 1, 5));
        bt2.setMargin(new Insets(1, 5, 1, 5));
        bt3.setMargin(new Insets(1, 5, 1, 5));
        bt4.setMargin(new Insets(1, 5, 1, 5));

        //añadiendo el listener a los botones para manipular los eventos del click
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocation((int) ((d.getWidth() / 2) + 290), 50);
        jf.setSize(400, 250);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        Main gj = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2 ,nr;
        num1 =Double.parseDouble(jt1.getText());
        num2 = Double.parseDouble(jt2.getText());
        Calculo cal1 = new Calculo(num1,num2);

        if (e.getSource() == bt1) {
            nr = cal1.suma();
            jt3.setText(""+nr);
        }
        if(e.getSource() ==bt2){
            nr = cal1.resta();
            jt3.setText(""+ nr);
        }
        if (e.getSource() == bt3){
            nr = cal1.multiplicacion();
            jt3.setText(""+ nr);
        }
        if (e.getSource()==bt4){
            nr = cal1.division();
            jt3.setText(""+ nr);
        }
    }
}
