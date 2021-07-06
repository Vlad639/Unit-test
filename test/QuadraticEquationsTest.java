import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationsTest {

    @Test
    void realRootCheck(){
        QuadraticEquations a = new QuadraticEquations();
        a.setKoefficients(3.8, 20.5, 1);
        assertEquals(new RealRoots(-0.0492, -5.3455), a.findRoots(4));
    }

    @Test
    void imaginaryRootCheck(){
        QuadraticEquations a = new QuadraticEquations();
        a.setKoefficients(15, 4, 1);
        assertEquals(
                new ImageRoots(new ImageNumber(-0.13, 0.22), new ImageNumber(-0.13, -0.22)),
                a.findRoots(2));
    }
}
