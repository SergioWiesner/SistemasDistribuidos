/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulopi;
import java.math.BigDecimal;
/**
 *
 * @author webdev
 */
public class restas  extends Thread {
       BigDecimal restas;

    public restas() {
        this.restas = new BigDecimal("1.0");
    }

    public void restasValores(BigDecimal ingreso) {
        this.restas = this.restas.subtract(ingreso);
    }

    public BigDecimal getRestas() {
        return this.restas;
    } 
}
