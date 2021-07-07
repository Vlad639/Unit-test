public class ImageNumber{//комплексное число
    double r;
    double i;
    ImageNumber(Number r, Number i){
        this.r = r.doubleValue();
        this.i = i.doubleValue();
    }

    public boolean equals(Object obj) {
        ImageNumber other = (ImageNumber)obj;
        return r == other.r && i == other.i;
    }
}
