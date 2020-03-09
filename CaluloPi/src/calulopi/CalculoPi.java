package calulopi;
import java.math.BigDecimal; 
import java.math.RoundingMode;

public class CalculoPi {

    public static void main(String[] args) {
        CalculoPi pi = new CalculoPi();
        BigDecimal bd1 =  new BigDecimal("0.0"); 
        BigDecimal resultadocalculo = pi.calularPi(bd1, 1.0, false);
        System.out.println(resultadocalculo.toString());
        BigDecimal resultado = resultadocalculo.subtract(new BigDecimal("1"));
        System.out.println(resultado);
    }

    public BigDecimal calularPi(BigDecimal data, double n, boolean signo) {
        n = n + 2.0;
        try {
            BigDecimal operacion = new BigDecimal(String.valueOf(n));
            BigDecimal constante = new BigDecimal("1.0");
            BigDecimal division = constante.divide(operacion,100,RoundingMode.HALF_UP);
            System.out.println("Esta es la division: "+division.toString());
            if (signo) {
                data = data.add(division); 
                signo = false;
            } else {
                data = data.subtract(division);
                signo = true;
            }
            data = calularPi(data, n, signo);
        } catch (ArithmeticException e) {
            System.out.println("Ya llego al fin se estalla por "+e.getMessage());
        }
        return data;
    }
    
    
    public BigDecimal calularPisimple(BigDecimal data, double n, boolean signo) {
        n = n + 2.0;
        String s=String.valueOf(n); 
        BigDecimal operacion = new BigDecimal(s);
        BigDecimal constante = new BigDecimal("1.0");
        BigDecimal division = constante.divide(operacion, RoundingMode.HALF_UP);
        data = data.add(division); 
        System.out.println("resultado "+data.toString());
    return data;
    }

}
