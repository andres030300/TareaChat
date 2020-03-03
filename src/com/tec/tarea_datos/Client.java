package com.tec.tarea_datos;

import javax.swing.*;
import java.awt.*;
import java.net.Socket;


public class Client {

    public static void main (String[] args){
        Ventana ventana = new Ventana();

    }

}

class Ventana extends JFrame {
    public Ventana(){

        setBounds(500,500,500,500);

        JPanel panel= new JPanel();

        panel.setLayout(new BorderLayout());

        JTextField texto = new JTextField();

        panel.add(texto, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);

    }


}