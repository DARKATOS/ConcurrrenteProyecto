/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Alejandro
 */
public class Cliente {
    
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private String direccion;
    private int puerto;
    
    private String nombre;
    private int turno;
    private int numerocara;
    private int turnoGeneral;

    public Cliente(String nombre, String direccion, int puerto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puerto = puerto;
        this.turno=-1;
        this.numerocara=-1;
        turnoGeneral = -1;
    }
    
    /**
     * Metodo que permite conectar al cliente con el servidor
     */
    public void conectar()
    {
        try {
            socket=new Socket(direccion, puerto);
            out=new ObjectOutputStream(socket.getOutputStream());
            in=new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerocara() {
        return numerocara;
    }

    public void setNumerocara(int numerocara) {
        this.numerocara = numerocara;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getDireccion() {
        return direccion;
    }

    public ObjectInputStream getIn() {
        return in;
    }

    public ObjectOutputStream getOut() {
        return out;
    }

    public int getTurnoGeneral() {
        return turnoGeneral;
    }

    public void setTurnoGeneral(int turnoGeneral) {
        this.turnoGeneral = turnoGeneral;
    }

    public void setIn(ObjectInputStream in) {
        this.in = in;
    }

    public void setOut(ObjectOutputStream out) {
        this.out = out;
    }

    public Socket getSocket() {
        return socket;
    }
    
}
