/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jorge Alejandro
 */
public class CaraCRUD {

    public CaraCRUD() {
    }

    public Cuadro[][] leerCara0() {
        try {
            Cuadro cara[][] = new Cuadro[3][3];
            Conexion conexion = new Conexion();
            conexion.setFop(conexion.getConexion().prepareCall("call LEER_CARA0()"));
            ResultSet resultado = conexion.getFop().executeQuery();
            int i = 0;
            int j = 0;
            while (resultado.next()) {
                Cuadro cuadro = new Cuadro(resultado.getString("COLOR"), resultado.getInt("NUMERO"));
                if (i == 3) {
                    i = 0;
                    j++;
                }
                cara[i][j] = cuadro;
                i++;
            }
            conexion.desconectar();
            return cara;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Cuadro[][] leerCara1() {
        try {
            Cuadro cara[][] = new Cuadro[3][3];
            Conexion conexion = new Conexion();
            conexion.setFop(conexion.getConexion().prepareCall("call LEER_CARA1()"));
            ResultSet resultado = conexion.getFop().executeQuery();
            int i = 0;
            int j = 0;
            while (resultado.next()) {
                Cuadro cuadro = new Cuadro(resultado.getString("COLOR"), resultado.getInt("NUMERO"));
                if (i == 3) {
                    i = 0;
                    j++;
                }
                cara[i][j] = cuadro;
                i++;
            }
            conexion.desconectar();
            return cara;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Cuadro[][] leerCara2() {
        try {
            Cuadro cara[][] = new Cuadro[3][3];
            Conexion conexion = new Conexion();
            conexion.setFop(conexion.getConexion().prepareCall("call LEER_CARA2()"));
            ResultSet resultado = conexion.getFop().executeQuery();
            int i = 0;
            int j = 0;
            while (resultado.next()) {
                Cuadro cuadro = new Cuadro(resultado.getString("COLOR"), resultado.getInt("NUMERO"));
                if (i == 3) {
                    i = 0;
                    j++;
                }
                cara[i][j] = cuadro;
                i++;
            }
            conexion.desconectar();
            return cara;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
    public Cuadro[][] leerCara3() {
        try {
            Cuadro cara[][] = new Cuadro[3][3];
            Conexion conexion = new Conexion();
            conexion.setFop(conexion.getConexion().prepareCall("call LEER_CARA3()"));
            ResultSet resultado = conexion.getFop().executeQuery();
            int i = 0;
            int j = 0;
            while (resultado.next()) {
                Cuadro cuadro = new Cuadro(resultado.getString("COLOR"), resultado.getInt("NUMERO"));
                if (i == 3) {
                    i = 0;
                    j++;
                }
                cara[i][j] = cuadro;
                i++;
            }
            conexion.desconectar();
            return cara;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public Cuadro[][] leerCara4() {
        try {
            Cuadro cara[][] = new Cuadro[3][3];
            Conexion conexion = new Conexion();
            conexion.setFop(conexion.getConexion().prepareCall("call LEER_CARA4()"));
            ResultSet resultado = conexion.getFop().executeQuery();
            int i = 0;
            int j = 0;
            while (resultado.next()) {
                Cuadro cuadro = new Cuadro(resultado.getString("COLOR"), resultado.getInt("NUMERO"));
                if (i == 3) {
                    i = 0;
                    j++;
                }
                cara[i][j] = cuadro;
                i++;
            }
            conexion.desconectar();
            return cara;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public Cuadro[][] leerCara5() {
        try {
            Cuadro cara[][] = new Cuadro[3][3];
            Conexion conexion = new Conexion();
            conexion.setFop(conexion.getConexion().prepareCall("call LEER_CARA5()"));
            ResultSet resultado = conexion.getFop().executeQuery();
            int i = 0;
            int j = 0;
            while (resultado.next()) {
                Cuadro cuadro = new Cuadro(resultado.getString("COLOR"), resultado.getInt("NUMERO"));
                if (i == 3) {
                    i = 0;
                    j++;
                }
                cara[i][j] = cuadro;
                i++;
            }
            conexion.desconectar();
            return cara;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean actualizarCuadro(String color, int numero, int idcara ) {
        try {
            Conexion conexion=new Conexion();
            conexion.setFop(conexion.getConexion().prepareCall("call ACTUALIZAR_CUADRO(?,?,?)"));
            conexion.getFop().setString(1, color);
            conexion.getFop().setInt(2, numero);
            conexion.getFop().setInt(3, idcara);
            conexion.getFop().execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
