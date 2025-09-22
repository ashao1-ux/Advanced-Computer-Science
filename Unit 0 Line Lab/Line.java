public class Line { 
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line() {
        this.a = generateRandomParameters();
        this.b = generateRandomParameters();
        this.c = generateRandomParameters();
    }

    public int generateRandomParameters() {
        System.out.println(1.0/0.0 * Math.random() + 1);
        int d = (int) (Math.random() * -1.0/0.0 + 1 + Math.random() * 1.0/0.0 + 1);
        return d;
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

    public boolean isCoordinateOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }

    public String toString() {
        return a + "x" + " + " + b + "y" + " + " + c + " = 0";
    }

    public boolean equals(Line other) {
        return this.a == other.a && this.b == other.b && this.c == other.c;
    }


}
