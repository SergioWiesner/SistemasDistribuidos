/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulopi;

import calulopi.sumas;
import calulopi.restas;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author webdev
 */
public class calculo {

    sumas Sumando;
    restas Restando;
    BigDecimal constante;

    public calculo() {
        this.Sumando = new sumas();
        this.Restando = new restas();
        this.constante = new BigDecimal("1.0");        
        this.Sumando.start();
        this.Restando.start();
    }

    public void calularPi(double n, boolean signo, int iteracion) {
        try {
            n = n + 2.0;
            BigDecimal operacion = new BigDecimal(String.valueOf(n));
            BigDecimal division = this.constante.divide(operacion, 100, RoundingMode.HALF_UP);
            operacion = null;
            if (signo) {
                this.Sumando.sumarValores(division);
                signo = false;
            } else {
                this.Restando.restasValores(division);
                signo = true;
            }
            division = null;
            calularPi(n, signo, ++iteracion);
        } catch (StackOverflowError error) {
            System.out.println("Ya llega al fin de la recursion, se lleno la memoria.");
            System.out.println(iteracion + " numero de iteraciones.");
            GenerandoResultado();
        }
    }

    public void GenerandoResultado() {
        this.Sumando.sumarValores(this.Restando.getRestas());
        BigDecimal resultadomultiplicarpor4 = this.Sumando.getSuma().multiply(new BigDecimal("4"));
        System.out.println(resultadomultiplicarpor4.toString());
    }

}
