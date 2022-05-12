package JavaOOP;

public class Box {

    private int width;
    private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Box)) return false;

        Box compare = (Box) obj;

        if (this.width == compare.width &&
        this.height == compare.height) {
            return true;
        }

        return false;
    }

    public void display() {
        System.out.println("Width is " + this.width + " and the height is " + this.height);
    }

    public static boolean isTwoObjectsEqual(Box b1, Box b2) {
        if (b1.width == b2.width &&
        b1.height == b2.height) {
            return true;
        } else return false;
    }

    public Box duplicate() {
        return new Box(this);
    }

}
