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
public class sumas extends Thread {

    BigDecimal sumas;

    public sumas() {
        this.sumas = new BigDecimal("0.0");
    }

    public void sumarValores(BigDecimal ingreso) {
        this.sumas = this.sumas.add(ingreso);
    }

    public BigDecimal getSuma() {
        return this.sumas;
    }
}
