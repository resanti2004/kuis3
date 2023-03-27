public class shape {
    String color;
    Boolean filled;

    public shape(){
        this.color = "red";
        this.filled = true;
    }

    public shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape berwarna" + color + "dan filled" + filled;
    }
}
