public class Rectangle {
    private Float length = 1.0f;
    private Float width = 1.0f;

    public Rectangle() {

    }

    public Rectangle(Float length, Float width) {
        this.length = length;
        this.width = width;
    }

    public Float getLength() {
        return this.length;
    }

    public Float getWidth() {
        return this.width;
    }

    public Double getPerimeter() {
        return Double.valueOf(2*width + 2*length);
    }

    public Double getArea() {
        return Double.valueOf(width*length);
    }
    public void setLength(Float length) {
        this.length = length;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public String toString() {
        return String.format("Rectangle[lenght=%.1f, width=%.1f]", width, length);
    }

}
