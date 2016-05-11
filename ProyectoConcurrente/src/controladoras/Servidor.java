/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.HiloCliente;

/**
 *
 * @author Jorge Alejandro
 */
public class Servidor {

    private ServerSocket servidorSocket;
    public static LinkedList<HiloCliente> totalClientes;
    public static int turnoGeneral;

    public static Controladora controladora;

    public static boolean juego;

    /**
     * Constructor de la clase Servidor inicializa la lista de clientes, la
     * controladoray y activa el juego.
     *
     * @param port puerto de comunicacion entre el servidor y los clientes.
     */
    public Servidor(int port) {
        totalClientes = new LinkedList<>();
        controladora = new Controladora();
        turnoGeneral = -1;
        juego = true;
        startServer(port);

    }

    /**
     * Metodo que permite iniciar el servidor.
     *
     * @param port puerto de comunicacion entre el servidor y los clientes.
     */
    private void startServer(int port) {
        try {
            servidorSocket = new ServerSocket(port);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
   
    
    public static void enviarTurnoGeneral()
    {
        for (int i=0; i<totalClientes.size(); i++)
        {
            try {
                totalClientes.get(i).getOut().writeObject(turnoGeneral);
//                totalClientes.get(i).getOut().flush();
                System.out.println("Le he enviado el turno general a la cara: "+totalClientes.get(i).getTurno());
            } catch (IOException ex) {
                System.out.println("Error al enviar el turno general");
            }
        }
    }
    /**
     * Metodo que permite escuchar y aceptar las solicitudes de conexion de los
     * 6 clientes e inicializa el delegado de los mismos.
     */
    public void listenConnections() {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Esperando Conexion");
                Socket socketCliente = servidorSocket.accept();
                HiloCliente cliente = new HiloCliente(socketCliente, i, i);
                cliente.start();
                totalClientes.add(cliente);
            } catch (IOException ex) {
                System.out.println("Error al escuchar las conexiones: " + ex.getMessage());
            }
        }
//        turnoGeneral=0;
//        enviarTurnoGeneral();
    }

    public ServerSocket getServidorSocket() {
        return servidorSocket;
    }
    
}
