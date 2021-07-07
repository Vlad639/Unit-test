import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    private static BigDecimal fieldA;
    private static BigDecimal fieldB;

    private static void setFields(Number a, Number b){
        fieldA = new BigDecimal(a.toString());
        fieldB = new BigDecimal(b.toString());
    }

    public static double sum(Number a, Number b){
        setFields(a, b);
        return fieldA.add(fieldB).doubleValue();
    }

    public static double sub(Number a, Number b){
        setFields(a, b);
        return fieldA.subtract(fieldB).doubleValue();
    }

    public static double mul(Number a, Number b){
        setFields(a, b);
        return fieldA.multiply(fieldB).doubleValue();
    }
    public static double div(Number a, Number b){
        setFields(a,b);
        return fieldA.divide(fieldB).doubleValue();
    }

    public static double div(Number a, Number b, int precision){
        setFields(a,b);
        return fieldA.divide(fieldB, precision, RoundingMode.HALF_UP).doubleValue();
    }

}
