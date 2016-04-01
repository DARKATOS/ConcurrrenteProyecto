/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Jorge Alejandro
 */
public class ServidorCliente {
    private Cliente cliente;
    
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;
    
    private InetAddress direccion;
    private int puerto;

    public ServidorCliente() {
        cliente=null;
        socket=null;
        dis=null;
        dos=null;
        direccion=null;
        puerto=0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public DataInputStream getDis() {
        return dis;
    }

    public DataOutputStream getDos() {
        return dos;
    }

    public Socket getSocket() {
        return socket;
    }

    public InetAddress getDireccion() {
        return direccion;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setDireccion(InetAddress direccion) {
        this.direccion = direccion;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDis(DataInputStream dis) {
        this.dis = dis;
    }

    public void setDos(DataOutputStream dos) {
        this.dos = dos;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
