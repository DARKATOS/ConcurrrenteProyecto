/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author Jorge Alejandro
 */
public class Cara implements Serializable{
    private Cuadro cara[][];
    private int limitaArriba;
    private int limitaAbajo;
    private int limitaIzquierda;
    private int limitaDerecha;
    private int movIzqDer[];
    private int movArrAba[];

    public Cara(Cuadro[][] cara) {
        this.cara = cara;
    }

    public Cuadro[][] getCara() {
        return cara;
    }

    /**
     * @param cara the cara to set
     */
    public void setCara(Cuadro[][] cara) {
        this.cara = cara;
    }

    /**
     * @return the limitaArriba
     */
    public int getLimitaArriba() {
        return limitaArriba;
    }

    /**
     * @param limitaArriba the limitaArriba to set
     */
    public void setLimitaArriba(int limitaArriba) {
        this.limitaArriba = limitaArriba;
    }

    /**
     * @return the limitaAbajo
     */
    public int getLimitaAbajo() {
        return limitaAbajo;
    }

    /**
     * @param limitaAbajo the limitaAbajo to set
     */
    public void setLimitaAbajo(int limitaAbajo) {
        this.limitaAbajo = limitaAbajo;
    }

    /**
     * @return the limitaIzquierda
     */
    public int getLimitaIzquierda() {
        return limitaIzquierda;
    }

    /**
     * @param limitaIzquierda the limitaIzquierda to set
     */
    public void setLimitaIzquierda(int limitaIzquierda) {
        this.limitaIzquierda = limitaIzquierda;
    }

    /**
     * @return the limitaDerecha
     */
    public int getLimitaDerecha() {
        return limitaDerecha;
    }

    /**
     * @param limitaDerecha the limitaDerecha to set
     */
    public void setLimitaDerecha(int limitaDerecha) {
        this.limitaDerecha = limitaDerecha;
    }

    public int[] getMovArrAba() {
        return movArrAba;
    }

    public int[] getMovIzqDer() {
        return movIzqDer;
    }

    public void setMovArrAba(int[] movArrAba) {
        this.movArrAba = movArrAba;
    }

    public void setMovIzqDer(int[] movIzqDer) {
        this.movIzqDer = movIzqDer;
    }
}
