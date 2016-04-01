/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Jorge Alejandro
 */
public class Cubo {
    private Cara cubo[];

    public Cubo(Cara[] cubo) {
        this.cubo = cubo;
    }

    /**
     * @return the cubo
     */
    public Cara[] getCubo() {
        return cubo;
    }

    /**
     * @param cubo the cubo to set
     */
    public void setCubo(Cara[] cubo) {
        this.cubo = cubo;
    }
    
}
