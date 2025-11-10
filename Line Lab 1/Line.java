
public class Line { 
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY());
        // b = x2 - x1
        this.b = p2.getX() - p1.getX();
        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public int getC() {
        return c;
    }

    public double calculateSlope() {
        return (double) -a / b;
    }

    public boolean isCoordinateOnLine(Point p) {
        return a * p.getX() + b * p.getY() + c == 0;
    }

    public String toString() {
        return a + "x" + " + " + b + "y" + " + " + c + " = 0";
    }

    public boolean equals(Line other) {
        return this.a == other.a && this.b == other.b && this.c == other.c;
    }

    public double calculateSlopeFromPoints() {
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public String generatePointSlopeFormula() {
        return "(y - " + p1.getY() + ") = " + calculateSlopeFromPoints()
            +  "(x - " + p1.getX() + ")";
    }
}

