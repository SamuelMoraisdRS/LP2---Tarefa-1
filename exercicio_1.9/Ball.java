public class Ball {
    private Float x;
    private Float y;
    private Integer radius;
    private Float xDelta;
    private Float yDelta;


    public Ball(Float x, Float y, Integer radius, Float xDelta, Float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public Float getX() {
        return this.x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return this.y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Integer getRadius() {
        return this.radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Float getXDelta() {
        return this.xDelta;
    }

    public void setXDelta(Float xDelta) {
        this.xDelta = xDelta;
    }

    public Float getYDelta() {
        return this.yDelta;
    }

    public void setYDelta(Float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        setX(x + xDelta);
        setY(y + yDelta);
    }

    public void reflectHorizontal() {
        setXDelta(-xDelta);
    }

    public void reflectVertical() {
        setYDelta(-yDelta);
    }

    public String toString() {
        return String.format("Ball[(%.1f,%.1f), speed=(%.1f,%.1f)]", x, y, xDelta, yDelta);
    }
}
