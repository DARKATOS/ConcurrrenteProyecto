/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Cuadro;
import modelos.Cubo;
import modelos.Movimientos;

/**
 *
 * @author Jorge Alejandro
 */
public class Controladora implements Movimientos {

    private Cubo cubo;
    private Cubo cubot;

    public Controladora() {
        cubo = null;
    }

    public void inicializarCubo() {
        //inicializo el cubo con sus cuadros, caras, colores
    }

    public void guardarCubo() {
        for (int f = 0; f < cubo.getCubo().length; f++) {
            for (int l = 0; l < cubo.getCubo()[f].getCara().length; l++) {
                cubo.getCubo()[f].getCara()[l] = cubot.getCubo()[f].getCara()[l];
            }
        }
    }

    @Override
    public void movIzq1() {
        int t=4;
        for (int f = 5; f >-1; f--) {
            for (int l = 0; l < 3; l++) {
                if(t<0)
                {
                    t=5;
                }
                cubot.getCubo()[t].getCara()[l]=cubo.getCubo()[f].getCara()[l];
            }
            t--;
        }
        guardarCubo();
    }

    @Override
    public void movIzq2() {
        int t=4;
        for (int f = 5; f >-1; f--) {
            for (int l = 3; l < 6; l++) {
                if(t<0)
                {
                    t=5;
                }
                cubot.getCubo()[t].getCara()[l]=cubo.getCubo()[f].getCara()[l];
            }
            t--;
        }
        guardarCubo();
    }

    @Override
    public void movIzq3() {
        int t=4;
        for (int f = 5; f >-1; f--) {
            for (int l = 6; l < 9; l++) {
                if(t<0)
                {
                    t=5;
                }
                cubot.getCubo()[t].getCara()[l]=cubo.getCubo()[f].getCara()[l];
            }
            t--;
        }
        guardarCubo();
    }

    @Override
    public void movDer1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movDer2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movDer3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movArr1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movArr2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movArr3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movAba1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movAba2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void movAba3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cubo
     */
    public Cubo getCubo() {
        return cubo;
    }

    /**
     * @param cubo the cubo to set
     */
    public void setCubo(Cubo cubo) {
        this.cubo = cubo;
    }

    public Cubo getCubot() {
        return cubot;
    }

    public void setCubot(Cubo cubot) {
        this.cubot = cubot;
    }

}
