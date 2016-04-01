/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcurrente;

import controladoras.Controladora;
import modelos.Cubo;

/**
 *
 * @author Jorge Alejandro
 */
public class ProyectoConcurrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controladora controladora=new Controladora();
        controladora.movAba3(4);
        Cubo cubo=controladora.getCubo();
        for(int i=0; i<cubo.getCubo().length; i++)
        {
            System.out.println("Cara Numero: "+i);
            for(int j=0; j<cubo.getCubo()[i].getCara().length;j++)
            {
                System.out.println(cubo.getCubo()[i].getCara()[j][0].getColor()+"\t"+cubo.getCubo()[i].getCara()[j][1].getColor()+"\t"+cubo.getCubo()[i].getCara()[j][2].getColor());
            }
            System.out.println("------------------------------------------------");
        }
    }
}
