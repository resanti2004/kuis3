public class square extends Rectangle{
    public square() {
        super();
    }

    public square(double side) {
        super(side, side);
    }

    public square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth(); // atau super.getLength(), karena keduanya sama
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square dengan side=" + getSide() + ", " + super.toString();
    }
}
