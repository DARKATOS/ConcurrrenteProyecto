/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import modelos.Cliente;
import modelos.ServidorCliente;

/**
 *
 * @author Jorge Alejandro
 */
public class Controladora {
    private ServidorCliente sv;
    private String cara[][];

    public Controladora(ServidorCliente sv) {
        this.sv = sv;
    }
    
    public void agregarDatos(String nombre,String direccion,String puerto)
    {
        sv.setCliente(new Cliente(nombre, 1)); //Toca mirar el cuento del turno.
        try {
            sv.setDireccion(InetAddress.getByName(direccion));
        } catch (UnknownHostException ex) {
            System.out.println("Error en la direcccion IP");
        }
        sv.setPuerto(Integer.parseInt(puerto));
    }
    
    public void conexion()
    {
        try {
            sv.setSocket(new Socket(sv.getDireccion(), sv.getPuerto()));
            sv.setDis(new DataInputStream(sv.getSocket().getInputStream()));
            sv.setDos(new DataOutputStream(sv.getSocket().getOutputStream()));
        } catch (IOException ex) {
            System.out.println("Error al crear el socket");
        }
    }
    
    public void actualizaCara(String matriz[][])
    {
        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0; j<matriz[i].length; j++)
            {
                cara[i][j]=matriz[i][j];
            }
        }
    }

    public String[][] getCara() {
        return cara;
    }
}
