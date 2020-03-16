package calulopi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoPi {

    public static void main(String[] args) {
        CalculoPi pi = new CalculoPi();
        BigDecimal bd1 = new BigDecimal("0.0");
        BigDecimal suma = bd1.add(new BigDecimal("1.0"));
        BigDecimal resultadoiteraciones = pi.calularPi(suma, 1.0, false);
        BigDecimal resultadomultiplicarpor4 = resultadoiteraciones.multiply(new BigDecimal("4"));
        System.out.println(resultadomultiplicarpor4.toString());
    }

    public BigDecimal calularPi(BigDecimal data, double n, boolean signo) {
        try {
            n = n + 2.0;
            BigDecimal operacion = new BigDecimal(String.valueOf(n));
            BigDecimal constante = new BigDecimal("1.0");
            BigDecimal division = constante.divide(operacion, 200, RoundingMode.HALF_UP);
            if (signo) {
                data = data.add(division);
                signo = false;
            } else {
                data = data.subtract(division);
                signo = true;
            }
            data = calularPi(data, n, signo);
        } catch (StackOverflowError error) {
            System.out.println("Ya llega al fin de la recursion.");
            System.out.println(error.getMessage());
        }
        return data;
    }

    public BigDecimal calularPisimple(BigDecimal data, double n, boolean signo) {
        n = n + 2.0;
        String s = String.valueOf(n);
        BigDecimal operacion = new BigDecimal(s);
        BigDecimal constante = new BigDecimal("1.0");
        BigDecimal division = constante.divide(operacion, RoundingMode.HALF_UP);
        data = data.add(division);
        System.out.println("resultado " + data.toString());
        return data;
    }

}
