import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class QuadraticEquations {
    private static BigDecimal aKoeff;
    private static BigDecimal bKoeff;
    private static BigDecimal cKoeff;
    private static BigDecimal D;
    private int precision = 2;

    private QuadraticRoots findRealRoots(){ //поиск корней если дискриминант >= 0
        BigDecimal x1 = bKoeff.multiply(new BigDecimal(-1)).add(D.sqrt(new MathContext(precision+1)));
        BigDecimal x2 = bKoeff.multiply(new BigDecimal(-1)).subtract(D.sqrt(new MathContext(precision+1)));
        x1 = x1.divide(  new BigDecimal(2).multiply(aKoeff), precision, RoundingMode.HALF_UP  );
        x2 = x2.divide(  new BigDecimal(2).multiply(aKoeff), precision, RoundingMode.HALF_UP  );
        //RealRoots - класс, для передачи 2х корней
        return new RealRoots(x1, x2);
    }

    private QuadraticRoots findImaginaryRoots(){//поиск корней если дискриминант < 0
        D = D.multiply(new BigDecimal(-1));
        BigDecimal divisor = aKoeff.multiply(new BigDecimal(2));

        //ImageNumber - комплексное число
        //ImageRoots - класс, для передачи 2х комплексных корней
        ImageNumber x1 = new ImageNumber(
                bKoeff.multiply(new BigDecimal(-1)).divide(divisor, precision, RoundingMode.HALF_UP).doubleValue(),
                D.sqrt(new MathContext(precision+1)).divide(divisor, precision, RoundingMode.HALF_UP).doubleValue()
        );

        ImageNumber x2 = new ImageNumber(x1.r, -x1.i);

        return new ImageRoots(x1, x2);

    }

    public QuadraticRoots findRoots(int precision){
        this.precision = precision;
        if (D.doubleValue() >= 0){
            return findRealRoots();
        } else {
            return findImaginaryRoots();
        }
    }

    private void calculateD(){
        D = bKoeff.multiply(bKoeff);
        D = D.subtract( new BigDecimal(4).multiply(aKoeff.multiply(cKoeff)) );
    }

    public void setKoefficients(Number a, Number b, Number c){
        aKoeff = new BigDecimal(a.toString());
        bKoeff = new BigDecimal(b.toString());
        cKoeff = new BigDecimal(c.toString());
        calculateD();
    }
}
