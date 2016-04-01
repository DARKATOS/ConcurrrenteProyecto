/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Cara;
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
        cubot = null;
        inicializarCubo();
    }

    private void inicializarCubo() {
        //inicializo el cubo con sus cuadros, caras, colores
        //0. blanco.
        //1. amarillo.
        //2. azul.
        //3. rojo.
        //4. verde
        //5. naranja

        Cara caras[] = new Cara[6];
        Cara caras2[] = new Cara[6];
        for (int i = 0; i < caras.length; i++) {
            Cuadro cuadros[][] = new Cuadro[3][3];
            Cuadro cuadro;

            Cuadro cuadros2[][] = new Cuadro[3][3];
            Cuadro cuadro2;
            if (i == 0) {
                cuadro = new Cuadro("blanco", 1);
                cuadro2 = new Cuadro("blanco", 1);
            } else if (i == 1) {
                cuadro = new Cuadro("amarillo", 2);
                cuadro2 = new Cuadro("amarillo", 2);
            } else if (i == 2) {
                cuadro = new Cuadro("azul", 3);
                cuadro2 = new Cuadro("azul", 3);
            } else if (i == 3) {
                cuadro = new Cuadro("rojo", 3);
                cuadro2 = new Cuadro("rojo", 3);
            } else if (i == 4) {
                cuadro = new Cuadro("verde", 3);
                cuadro2 = new Cuadro("verde", 3);
            } else {
                cuadro = new Cuadro("naranja", 3);
                cuadro2 = new Cuadro("naranja", 3);
            }
            for (int j = 0; j < cuadros.length; j++) {
                for (int k = 0; k < cuadros[0].length; k++) {
                    cuadros[j][k] = cuadro;
                    cuadros2[j][k] = cuadro2;

                }
            }
            caras[i] = new Cara(cuadros);
            caras2[i] = new Cara(cuadros2);
        }
        //cubo = new Cubo(caras);

        //Se llenan las orientaciones y las caras que afectan los moimientos
        int movIzqDer1[] = {0, 2, 5, 4}; //caras medias izquierda
        int movIzqDer2[] = {1, 2, 3, 4}; //cara arriba y abajo izquierda
        int movArrAba1[] = {1, 0, 3, 5}; //Cara arriba y abajo arriba
        int movArrAba2[] = {2, 0, 4, 5}; //caras lados arriba
        caras[0].setLimitaArriba(3);
        caras[0].setLimitaAbajo(1);
        caras[0].setLimitaIzquierda(2);
        caras[0].setLimitaDerecha(4);
        caras[0].setMovIzqDer(movIzqDer1);
        caras[0].setMovArrAba(movArrAba1);

        caras[5].setLimitaArriba(1);
        caras[5].setLimitaAbajo(3);
        caras[5].setLimitaIzquierda(2);
        caras[5].setLimitaDerecha(4);
        caras[5].setMovIzqDer(movIzqDer1);
        caras[5].setMovArrAba(movArrAba1);

        caras[1].setLimitaArriba(0);
        caras[1].setLimitaAbajo(5);
        caras[1].setLimitaIzquierda(2);
        caras[1].setLimitaDerecha(4);
        caras[1].setMovIzqDer(movIzqDer2);
        caras[1].setMovArrAba(movArrAba1);

        caras[2].setLimitaArriba(0);
        caras[2].setLimitaAbajo(5);
        caras[2].setLimitaIzquierda(3);
        caras[2].setLimitaDerecha(1);
        caras[2].setMovIzqDer(movIzqDer2);
        caras[2].setMovArrAba(movArrAba2);

        caras[3].setLimitaArriba(0);
        caras[3].setLimitaAbajo(5);
        caras[3].setLimitaIzquierda(4);
        caras[3].setLimitaDerecha(2);
        caras[3].setMovIzqDer(movIzqDer2);
        caras[3].setMovArrAba(movArrAba1);

        caras[4].setLimitaArriba(0);
        caras[4].setLimitaAbajo(5);
        caras[4].setLimitaIzquierda(1);
        caras[4].setLimitaDerecha(3);
        caras[4].setMovIzqDer(movIzqDer2);
        caras[4].setMovArrAba(movArrAba2);

        caras2[0].setLimitaArriba(3);
        caras2[0].setLimitaAbajo(1);
        caras2[0].setLimitaIzquierda(2);
        caras2[0].setLimitaDerecha(4);
        caras2[0].setMovIzqDer(movIzqDer1);
        caras2[0].setMovArrAba(movArrAba1);

        caras2[5].setLimitaArriba(1);
        caras2[5].setLimitaAbajo(3);
        caras2[5].setLimitaIzquierda(2);
        caras2[5].setLimitaDerecha(4);
        caras2[5].setMovIzqDer(movIzqDer1);
        caras2[5].setMovArrAba(movArrAba1);

        caras2[1].setLimitaArriba(0);
        caras2[1].setLimitaAbajo(5);
        caras2[1].setLimitaIzquierda(2);
        caras2[1].setLimitaDerecha(4);
        caras2[1].setMovIzqDer(movIzqDer2);
        caras2[1].setMovArrAba(movArrAba1);

        caras2[2].setLimitaArriba(0);
        caras2[2].setLimitaAbajo(5);
        caras2[2].setLimitaIzquierda(3);
        caras2[2].setLimitaDerecha(1);
        caras2[2].setMovIzqDer(movIzqDer2);
        caras2[2].setMovArrAba(movArrAba2);

        caras2[3].setLimitaArriba(0);
        caras2[3].setLimitaAbajo(5);
        caras2[3].setLimitaIzquierda(4);
        caras2[3].setLimitaDerecha(2);
        caras2[3].setMovIzqDer(movIzqDer2);
        caras2[3].setMovArrAba(movArrAba1);

        caras2[4].setLimitaArriba(0);
        caras2[4].setLimitaAbajo(5);
        caras2[4].setLimitaIzquierda(1);
        caras2[4].setLimitaDerecha(3);
        caras2[4].setMovIzqDer(movIzqDer2);
        caras2[4].setMovArrAba(movArrAba2);

        cubo = new Cubo(caras);
        cubot = new Cubo(caras2);
    }

    private void guardarCubo() {
        for (int f = 0; f < cubo.getCubo().length; f++) {
            for (int l = 0; l < cubo.getCubo()[f].getCara().length; l++) {
                for (int a = 0; a < cubo.getCubo()[f].getCara()[l].length; a++) {
                    cubo.getCubo()[f].getCara()[l][a] = cubot.getCubo()[f].getCara()[l][a];
                }
            }
        }
    }

    /**
     * @param cara
     * @see movimiento a la izquierda en alguna de las caras en la primera fila.
     * @see compromete la cara de arriba que es la numero 0.
     */
    @Override
    public void movIzq1(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = 0; c < cubo.getCubo()[cara].getMovIzqDer().length; c++) {
            temp1 = cubo.getCubo()[cara].getMovIzqDer()[c];
            if (c + 1 == cubo.getCubo()[cara].getMovIzqDer().length) {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[0];
            } else {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[c + 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[0][col] = cubo.getCubo()[temp1].getCara()[0][col];
            }
        }
        int limitearriba = cubo.getCubo()[cara].getLimitaArriba();
        for (int f = 0; f < 3; f++) {
            int t=2;
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limitearriba].getCara()[f][t] = cubo.getCubo()[limitearriba].getCara()[c][f];
                t--;
            }
        }
        guardarCubo();
    }

    @Override
    public void movIzq2(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = 0; c < cubo.getCubo()[cara].getMovIzqDer().length; c++) {
            temp1 = cubo.getCubo()[cara].getMovIzqDer()[c];
            if (c + 1 == cubo.getCubo()[cara].getMovIzqDer().length) {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[0];
            } else {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[c + 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[1][col] = cubo.getCubo()[temp1].getCara()[1][col];
            }
        }
        guardarCubo();
    }

    @Override
    public void movIzq3(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = 0; c < cubo.getCubo()[cara].getMovIzqDer().length; c++) {
            temp1 = cubo.getCubo()[cara].getMovIzqDer()[c];
            if (c + 1 == cubo.getCubo()[cara].getMovIzqDer().length) {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[0];
            } else {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[c + 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[2][col] = cubo.getCubo()[temp1].getCara()[2][col];
            }
        }
        int limiteabajo = cubo.getCubo()[cara].getLimitaAbajo();
        for (int f = 0; f < 3; f++) {
            int t=2;
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limiteabajo].getCara()[f][t] = cubo.getCubo()[limiteabajo].getCara()[c][f];
                t--;
            }
        }
        guardarCubo();
    }

    @Override
    public void movDer1(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = cubo.getCubo()[cara].getMovIzqDer().length - 1; c > -1; c--) {
            temp1 = cubo.getCubo()[cara].getMovIzqDer()[c];
            if (c - 1 == -1) {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[cubo.getCubo()[cara].getMovIzqDer().length - 1];
            } else {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[c - 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[0][col] = cubo.getCubo()[temp1].getCara()[0][col];
            }
        }
        int limitearriba = cubo.getCubo()[cara].getLimitaArriba();
        int t=0;
        for (int f = 2; f >-1; f--) {
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limitearriba].getCara()[t][c] = cubo.getCubo()[limitearriba].getCara()[c][f];
            }
            t++;
        }
        guardarCubo();
    }

    @Override
    public void movDer2(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = cubo.getCubo()[cara].getMovIzqDer().length - 1; c > -1; c--) {
            temp1 = cubo.getCubo()[cara].getMovIzqDer()[c];
            if (c - 1 == -1) {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[cubo.getCubo()[cara].getMovIzqDer().length - 1];
            } else {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[c - 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[1][col] = cubo.getCubo()[temp1].getCara()[1][col];
            }
        }
        guardarCubo();
    }

    @Override
    public void movDer3(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = cubo.getCubo()[cara].getMovIzqDer().length - 1; c > -1; c--) {
            temp1 = cubo.getCubo()[cara].getMovIzqDer()[c];
            if (c - 1 == -1) {
                temp2=cubo.getCubo()[cara].getMovIzqDer()[cubo.getCubo()[cara].getMovIzqDer().length - 1];
            } else {
                temp2 = cubo.getCubo()[cara].getMovIzqDer()[c - 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[2][col] = cubo.getCubo()[temp1].getCara()[2][col];
            }
        }
        int limiteabajo = cubo.getCubo()[cara].getLimitaAbajo();
        int t=0;
        for (int f = 2; f >-1; f--) {
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limiteabajo].getCara()[t][c] = cubo.getCubo()[limiteabajo].getCara()[c][f];
            }
            t++;
        }
        guardarCubo();
    }

    @Override
    public void movArr1(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = 0; c < cubo.getCubo()[cara].getMovArrAba().length; c++) {
            temp1 = cubo.getCubo()[cara].getMovArrAba()[c];
            if (c + 1 == cubo.getCubo()[cara].getMovArrAba().length) {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[0];
            } else {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[c + 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[col][0] = cubo.getCubo()[temp1].getCara()[col][0];
            }
        }
        int limiteizquierda = cubo.getCubo()[cara].getLimitaIzquierda();
        int t=0;
        for (int f = 2; f >-1; f--) {
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limiteizquierda].getCara()[t][c] = cubo.getCubo()[limiteizquierda].getCara()[c][f];
            }
            t++;
        }
        guardarCubo();
    }

    @Override
    public void movArr2(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = 0; c < cubo.getCubo()[cara].getMovArrAba().length; c++) {
            temp1 = cubo.getCubo()[cara].getMovArrAba()[c];
            if (c + 1 == cubo.getCubo()[cara].getMovArrAba().length) {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[0];
            } else {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[c + 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[col][1] = cubo.getCubo()[temp1].getCara()[col][1];
            }
        }
        guardarCubo();
    }

    @Override
    public void movArr3(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = 0; c < cubo.getCubo()[cara].getMovArrAba().length; c++) {
            temp1 = cubo.getCubo()[cara].getMovArrAba()[c];
            if (c + 1 == cubo.getCubo()[cara].getMovArrAba().length) {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[0];
            } else {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[c + 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[col][2] = cubo.getCubo()[temp1].getCara()[col][2];
            }
        }
        int limitederecha = cubo.getCubo()[cara].getLimitaDerecha();
        int t=0;
        for (int f = 2; f >-1; f--) {
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limitederecha].getCara()[t][c] = cubo.getCubo()[limitederecha].getCara()[c][f];
            }
            t++;
        }
        guardarCubo();
    }

    @Override
    public void movAba1(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = cubo.getCubo()[cara].getMovArrAba().length-1; c >-1 ; c--) {
            temp1 = cubo.getCubo()[cara].getMovArrAba()[c];
            if (c - 1 == -1) {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[cubo.getCubo()[cara].getMovArrAba().length - 1];
            } else {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[c - 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[col][0] = cubo.getCubo()[temp1].getCara()[col][0];
            }
        }
        int limiteizquierda = cubo.getCubo()[cara].getLimitaIzquierda();
        for (int f = 0; f < 3; f++) {
            int t=2;
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limiteizquierda].getCara()[f][t] = cubo.getCubo()[limiteizquierda].getCara()[c][f];
                t--;
            }
        }
        guardarCubo();
    }

    @Override
    public void movAba2(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = cubo.getCubo()[cara].getMovArrAba().length-1; c >-1 ; c--) {
            temp1 = cubo.getCubo()[cara].getMovArrAba()[c];
            if (c - 1 == -1) {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[cubo.getCubo()[cara].getMovArrAba().length - 1];
            } else {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[c - 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[col][1] = cubo.getCubo()[temp1].getCara()[col][1];
            }
        }
        guardarCubo();
    }

    @Override
    public void movAba3(int cara) {
        int temp1 = 0;
        int temp2 = 0;
        for (int c = cubo.getCubo()[cara].getMovArrAba().length-1; c >-1 ; c--) {
            temp1 = cubo.getCubo()[cara].getMovArrAba()[c];
            if (c - 1 == -1) {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[cubo.getCubo()[cara].getMovArrAba().length - 1];
            } else {
                temp2 = cubo.getCubo()[cara].getMovArrAba()[c - 1];
            }

            for (int col = 0; col < 3; col++) {
                cubot.getCubo()[temp2].getCara()[col][2] = cubo.getCubo()[temp1].getCara()[col][2];
            }
        }
        int limitederecha = cubo.getCubo()[cara].getLimitaDerecha();
        for (int f = 0; f < 3; f++) {
            int t=2;
            for (int c = 0; c < 3; c++) {
                cubot.getCubo()[limitederecha].getCara()[f][t] = cubo.getCubo()[limitederecha].getCara()[c][f];
                t--;
            }
        }
        guardarCubo();
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
