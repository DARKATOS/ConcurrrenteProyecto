/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Types;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelos.Cuadro;
import modelos.Cliente;

/**
 *
 * @author Jorge Alejandro
 */
public class Controladora extends Thread {

    private Cliente cliente;
    private String matriz[][];
    private boolean juego;
    private String movimiento;

    private JFrame ventana;
    private HashMap<String, JPanel> paneles;
    private JLabel jlabel2;
    private JLabel jlabel4;
    private JLabel jlabel15;

    /**
     * @see Constructor de la clase Controladora del programa cliente.
     * @param paneles Utilizado para representar los cuadros de la cara.
     * @param juego Establece el estado del juego.
     * @param jlabel15 Utilizado para representar el numero de la cara asginada
     * al cliente
     * @param jlabel2 Uitlizado para representar el turno general del juego.
     * @param jlabel4 Utilizado para representar el turno asignado al cliente.
     */
    public Controladora(JFrame ventana, HashMap<String, JPanel> paneles, boolean juego, JLabel jlabel15, JLabel jlabel2, JLabel jlabel4) {

        movimiento = "";
        this.matriz = new String[3][3];

        this.ventana = ventana;
        this.paneles = paneles;
        this.juego = juego;
        this.jlabel15 = jlabel15;
        this.jlabel2 = jlabel2;
        this.jlabel4 = jlabel4;
    }

    public boolean conectarCliente(String nombre, String direccion, int puerto) {
        cliente = new Cliente(nombre, direccion, puerto);
        cliente.conectar();
        this.start();
        return true;
    }

    /**
     * Metodo que permite actualizar la matriz de la cara y los colores.
     *
     * @param cara Objeto Cara recibido desde el servidor.
     */
    private void actualizarCara(String cara[][]) {
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = cara[i][j].getColor();
//            }
//        }
        matriz = cara;
        switch (matriz[0][0]) {
            case "blanco":
                paneles.get("panel2").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel2").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel2").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel2").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel2").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel2").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[0][0]);

        switch (matriz[0][1]) {
            case "blanco":
                paneles.get("panel3").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel3").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel3").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel3").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel3").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel3").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[0][1]);

        switch (matriz[0][2]) {
            case "blanco":
                paneles.get("panel4").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel4").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel4").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel4").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel4").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel4").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[0][2]);

        switch (matriz[1][0]) {
            case "blanco":
                paneles.get("panel5").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel5").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel5").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel5").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel5").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel5").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[1][0]);

        switch (matriz[1][1]) {
            case "blanco":
                paneles.get("panel6").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel6").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel6").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel6").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel6").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel6").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[1][1]);

        switch (matriz[1][2]) {
            case "blanco":
                paneles.get("panel7").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel7").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel7").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel7").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel7").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel7").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[1][2]);

        switch (matriz[2][0]) {
            case "blanco":
                paneles.get("panel8").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel8").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel8").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel8").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel8").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel8").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[2][0]);

        switch (matriz[2][1]) {
            case "blanco":
                paneles.get("panel9").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel9").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel9").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel9").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel9").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel9").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[2][1]);

        switch (matriz[2][2]) {

            case "blanco":
                paneles.get("panel10").setBackground(Color.white);
                break;
            case "naranja":
                paneles.get("panel10").setBackground(Color.orange);
                break;
            case "amarillo":
                paneles.get("panel10").setBackground(Color.yellow);
                break;
            case "azul":
                paneles.get("panel10").setBackground(Color.blue);
                break;
            case "rojo":
                paneles.get("panel10").setBackground(Color.red);
                break;
            case "verde":
                paneles.get("panel10").setBackground(Color.green);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error al pintar", "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println(matriz[2][2]);
        ventana.repaint();
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    /**
     * Metodo que permite recibir el numero de la cara asginado al cliente
     */
    public void recibirNumeroCara() {
        try {
            int numerocara = Integer.parseInt(cliente.getIn().readObject().toString());
            System.out.println("Recibi el numero de la cara: " + numerocara);
            cliente.setNumerocara(numerocara);
            jlabel15.setText(String.valueOf(cliente.getNumerocara()));
        } catch (IOException ex) {
            System.out.println("Error al recibir numero de la cara");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al recibir numero de la cara");
        }
    }

    /**
     * Metodo que permite recibir el turno asignado al cliente dado por el
     * servidor.
     */
    public void recibirTurnoPropio() {
        try {
            int turno = Integer.parseInt(cliente.getIn().readObject().toString());
            cliente.setTurno(turno);
            jlabel4.setText(String.valueOf(cliente.getTurno()));
        } catch (IOException ex) {
            System.out.println("Error al recibir turno propio");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al recibir turno propio");
        }
    }

    /**
     * Metodo que permite recibir una actualizacion de la cara asginada al
     * cliente enviada por el servidor
     */
    public void recibirCara() {
        try {
            String cara[][] = new String[3][3];
            for (int i = 0; i < cara.length; i++) {
                for (int j = 0; j < cara[i].length; j++) {
                    cara[i][j] = cliente.getIn().readObject().toString();
                }
            }
            System.out.println("Recibi la cara para actualizar la cara: " + cliente.getNumerocara());
            actualizarCara(cara);
        } catch (IOException ex) {
            System.out.println("Error al recibir cara");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al recibir cara");
        }
    }

    /**
     * Metodo que permite recibir el turno en general en que va el juego.
     */
    private void recibirTurnoGeneral() {
        try {
            int turnogeneral = Integer.parseInt(cliente.getIn().readObject().toString());
            cliente.setTurnoGeneral(turnogeneral);
            System.out.println("Turno general de la cara: " + cliente.getNumerocara() + " es: " + cliente.getTurnoGeneral());
            jlabel2.setText(String.valueOf(cliente.getTurnoGeneral()));
            ventana.repaint();
        } catch (IOException ex) {
            System.out.println("Error al recibir Turno General");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al recibir Turno General");
        }
    }

    /**
     * Metodo que permite enviar un movimiento al servidor.
     */
    private void enviarMovimiento() {
        if (cliente.getTurnoGeneral() == cliente.getTurno()) {
            System.out.println("El turno es del cliente con numero de cara: " + cliente.getNumerocara());
            while ("".equals(movimiento)) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Error en el sleep: " + ex.getMessage());
                }
            }
            try {
                cliente.getOut().writeObject(movimiento);
                cliente.getOut().writeObject(cliente.getNumerocara());
                movimiento = "";
            } catch (IOException ex) {
                System.out.println("error al enviar movimiento: " + ex.getMessage());
            }
        } else {
            try {
                cliente.getOut().writeObject("no movimiento");
                cliente.getOut().writeObject(-1);
            } catch (IOException ex) {
                System.out.println("error al enviar el no movimiento");
            }
        }
    }

    private void recibirPermiso() {
        try {
            int permiso = Integer.parseInt(cliente.getIn().readObject().toString());
            if (permiso == 1) {
                System.out.println("He recibido el permiso la cara numero: " + cliente.getNumerocara());
            }
        } catch (IOException ex) {
            System.out.println("Error al recibir permiso");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al recibir permiso");
        }
    }

    private void inicializarCanal() {
        try {
            cliente.setIn(new ObjectInputStream(cliente.getSocket().getInputStream()));
            cliente.setOut(new ObjectOutputStream(cliente.getSocket().getOutputStream()));
        } catch (IOException ex) {
            System.out.println("Error al abrir los canales");
        }
    }

    private void enviarPermisoActualizar() {
        try {
            cliente.getOut().writeObject(1);
            System.out.println("envio el permiso para actualizar la cara: " + cliente.getNumerocara());
        } catch (IOException ex) {
            System.out.println("Error al recibir permiso");
        }
    }

    private void enviarPermisoRonda() {
        try {
            cliente.getOut().writeObject(1);
        } catch (IOException ex) {
            System.out.println("Error al enviar permiso");
        }
    }

    private void enviarPermisoCara() {
        try {
            cliente.getOut().writeObject(1);
        } catch (IOException ex) {
            System.out.println("Error al recibir permiso");
        }
    }

    @Override
    public void run() {
        recibirNumeroCara();
        recibirTurnoPropio();
        recibirCara();
        recibirTurnoGeneral(); //primer turno general que lo general es -2.
        recibirTurnoGeneral(); //Segundo recibo del turno general empieza en 0.
        while (true) {
            enviarPermisoRonda();
            enviarMovimiento();
            recibirTurnoGeneral();
            enviarPermisoCara();
            recibirCara();
        }

//        while (true) {
//            try {
//                Thread.sleep(2000);
//
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

}
