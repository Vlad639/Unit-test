public class RealRoots extends QuadraticRoots{
    double x1;
    double x2;
    RealRoots(Number x1, Number x2){
        this.x1 = x1.doubleValue();
        this.x2 = x2.doubleValue();
    }

    public boolean equals(Object obj) {
        RealRoots other = (RealRoots)obj;
        return other.x1 == x1 && other.x2 == x2;
    }
}
