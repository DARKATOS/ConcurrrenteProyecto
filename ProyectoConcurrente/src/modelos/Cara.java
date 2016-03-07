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
public class Cara {
    private Cuadro cara[];

    public Cara(Cuadro[] cara) {
        this.cara = cara;
    }

    /**
     * @return the cara
     */
    public Cuadro[] getCara() {
        return cara;
    }

    /**
     * @param cara the cara to set
     */
    public void setCara(Cuadro[] cara) {
        this.cara = cara;
    }
    
    
}
