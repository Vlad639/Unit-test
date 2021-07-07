public class ImageRoots extends QuadraticRoots{
    ImageNumber x1;
    ImageNumber x2;
    ImageRoots(ImageNumber x1, ImageNumber x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    public boolean equals(Object obj) {
        ImageRoots other = (ImageRoots)obj;
        return x1.equals(other.x1) && x2.equals(other.x2);
    }
}
