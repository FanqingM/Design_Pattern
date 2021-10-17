package musementpark.offline.base.chair.flyweight;

public interface Chess {
    String getColor();
    void display(Coordinate c);
}
// ConcreteFlyweight
class ConcreteChess implements Chess{
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void display(Coordinate c) {
        System.out.println("颜色:"+color);
        System.out.println("位置:("+c.getX()+","+c.getY()+")");
    }
}
// UnsharedConcreteFlyweight
class Coordinate{
    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}