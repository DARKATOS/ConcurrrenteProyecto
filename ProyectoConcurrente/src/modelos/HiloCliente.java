/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladoras.Servidor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Alejandro
 */
public class HiloCliente extends Thread {

    private Socket cliente;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private int numeroCara;
    private int turno;

    /**
     * Constructor de la clase cliente que recibe el socket del cliente, el
     * turno y la cara del cliente dados por el servidor.
     *
     * @param cliente Socket del cliente previamente aceptado por el servidor.
     * @param turno turno dado por el servidor al cliente.
     * @param cara numero de la cara dado por el servidor para el cliente.
     */
    public HiloCliente(Socket cliente, int turno, int cara) {
//        try {
//            this.cliente = cliente;
//            this.out = new ObjectOutputStream(this.cliente.getOutputStream());
//            this.in = new ObjectInputStream(this.cliente.getInputStream());
//            this.turno = turno;
//            this.numeroCara = cara;
//        } catch (IOException ex) {
//            System.out.println("Error al crear el hilo cliente");
        this.cliente = cliente;
        this.out = null;
        this.in = null;
        this.turno = turno;
        this.numeroCara = cara;
    }

    public int getTurno() {
        return turno;
    }

    public ObjectInputStream getIn() {
        return in;
    }

    public ObjectOutputStream getOut() {
        return out;
    }

    public Socket getCliente() {
        return cliente;
    }

    /**
     * Permite recibir el movimiento realizado por la parte cliente
     */
    private void recibirMovimiento() {
        try {
            String movimiento = in.readObject().toString();
            int cara = Integer.parseInt(in.readObject().toString());
            System.out.println("Recibi el movimiento: " + movimiento);
            System.out.println("Recibi la cara para movimiento: " + cara);
            if (cara != -1) {
                Servidor.controladora.ejecutarMovimiento(movimiento, cara);
                if (Servidor.turnoGeneral == 1) {
                    Servidor.turnoGeneral = 0;
                } else {
                    Servidor.turnoGeneral++;
                }
                Servidor.enviarTurnoGeneral();
            }
        } catch (IOException ex) {
            System.out.println("Error en uno de los hilos de cliente: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en uno de los hilos de cliente: " + ex.getMessage());
        }
    }

    /**
     * Permite inicializar los canales de input stream y output stream con el
     * cliente.
     */
    private void inicializarCanal() {
        try {
            in = new ObjectInputStream(this.cliente.getInputStream());
            out = new ObjectOutputStream(this.cliente.getOutputStream());
        } catch (IOException ex) {
            System.out.println("Error al abrir los canales de comunicacion con el cliente");
        }
    }

    /**
     * metodo que permite enviar el numero de la cara al cliente.
     */
    private void enviarNumeroCara() {
        try {
            out.writeObject(numeroCara);
            System.out.println("Envie el numero de la cara a la conexion: " + numeroCara);
        } catch (IOException ex) {
            System.out.println("Error al enviar la cara al cliente.");
        }
    }

    /**
     * Metodo que permite enviar el turno asginado al cliente.
     */
    private void enviarTurno() {
        try {
            out.writeObject(turno);
        } catch (IOException ex) {
            System.out.println("Error al enviar el turno al cliente");
        }
    }

    /**
     * Metodo que permite enviar la matriz de la cara asignada al cliente.
     */
    private void enviarCara() {
        try {
            System.out.println("Actualizacion de la cara");
            for (int i = 0; i < Servidor.controladora.getCubo().getCubo()[numeroCara].getCara().length; i++) {
                for (int j = 0; j < Servidor.controladora.getCubo().getCubo()[numeroCara].getCara()[i].length; j++) {
                    System.out.println(Servidor.controladora.getCubo().getCubo()[numeroCara].getCara()[i][j].getColor());
                }
            }
            for (int i = 0; i < Servidor.controladora.getCubo().getCubo()[numeroCara].getCara().length; i++) {
                for (int j = 0; j < Servidor.controladora.getCubo().getCubo()[numeroCara].getCara()[i].length; j++) {
                    out.writeObject(Servidor.controladora.getCubo().getCubo()[numeroCara].getCara()[i][j].getColor());
                }
            }
            System.out.println("Envie actualizacion de la cara: " + numeroCara);
        } catch (IOException ex) {
            System.out.println("Error al enviar la cara al cliente");
        }
    }

    private void recibirPermisoRonda() {
        try {
            int permiso = Integer.parseInt(in.readObject().toString());
            if (permiso == 1) {
                System.out.println("Se ha recibido el permiso para comenzar la ronda: " + numeroCara);
            }
        } catch (IOException ex) {
            System.out.println("Error al recibir el permiso para actualizar");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al recibir el permiso para actualizar");
        }
    }

    private void enviarTurnoGeneral() {
        try {
            out.writeObject(Servidor.turnoGeneral);
            System.out.println("Envie el turno general a la cara: " + numeroCara);
        } catch (IOException ex) {
            System.out.println("Error al recibir el permiso para actualizar");
        }
    }

    private void recibirPermisoCara() {
        try {
            int permiso = Integer.parseInt(in.readObject().toString());
            if (permiso == 1) {
                System.out.println("Se ha recibido el permiso para comenzar la ronda: " + numeroCara);
            }
        } catch (IOException ex) {
            System.out.println("Error al recibir el permiso para actualizar");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al recibir el permiso para actualizar");
        }
    }

    @Override
    public void run() {
        inicializarCanal();
        enviarNumeroCara();
        enviarTurno();
        enviarCara();
        enviarTurnoGeneral();
        if (numeroCara == 1) {
            Servidor.turnoGeneral = 0;
            Servidor.enviarTurnoGeneral();
        }
        while (true) {
            recibirPermisoRonda();
            recibirMovimiento();
            recibirPermisoCara();
            enviarCara();
        }

//        while (Servidor.juego) {
//            try {
//                Thread.sleep(2000);
//
//            } catch (InterruptedException ex) {
//                Logger.getLogger(HiloCliente.class
//                        .getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
