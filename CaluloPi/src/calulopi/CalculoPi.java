package calulopi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import calulopi.calculo;

public class CalculoPi {

    sumas Sumando = new sumas();
          
    public static void main(String[] args) {
        
        CalculoPi pi = new CalculoPi();
        BigDecimal bd1 = new BigDecimal("0.0");
        BigDecimal suma = bd1.add(new BigDecimal("1.0"));
        calculo resultado = new calculo();
        resultado.calularPi(1.0, false, 1);
    }
}
