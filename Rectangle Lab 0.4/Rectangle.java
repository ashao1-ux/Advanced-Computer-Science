public class Rectangle {
    private int width;
    private int length;
    private double x;
    private double y;
    private double x2 = length + x;
    private double y2 = y;
    private double x3 =  x2;
    private double y3 = y + width;
    private double x4 = x;
    private double y4 = y3;

    public Rectangle() {
        width = 1;
        length = 2;
        x = 0;
        y = 0;
    }

    public Rectangle(int newLength, int newWidth, double newx, double newy) {
        length = newLength;
        width = newWidth;
        x = newx;
        y = newy;
    }

    public int getLength() {
        return length;
       
    }
    
    public int getWidth() {
        return width;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void setX(double x) {
        this.x = x;
        this.x2 = length + x;
        this.x3 = x2;
        this.x4 = x;
    }

    public void setY(double y) {
        this.y = y;
        this.y2 = y;
        this.y3 = y + width;
        this.y4 = y3;
    }

    public void rotation(double degrees, double xrotation, double yrotation) {
        this.x2 = length + x;
        this.x3 = x2;
        this.x4 = x;
        this.y2 = y;
        this.y3 = y + width;
        this.y4 = y3;
        this.x = x * Math.round(Math.cos(degrees)) - y * Math.round(Math.sin(degrees)) + xrotation;
        this.y = y * Math.round(Math.cos(degrees)) + x * Math.round(Math.sin(degrees)) + yrotation;
        this.x2 = x2 * Math.round(Math.cos(degrees)) - y2 * Math.round(Math.sin(degrees)) + xrotation;
        this.y2 = y2 * Math.round(Math.cos(degrees)) + x2 * Math.round(Math.sin(degrees)) + yrotation;
        this.x3 = x3 * Math.round(Math.cos(degrees)) - y3 * Math.round(Math.sin(degrees)) + xrotation;
        this.y3 = y3 * Math.round(Math.cos(degrees)) + x3 * Math.round(Math.sin(degrees)) + yrotation;
        this.x4 = x4 * Math.round(Math.cos(degrees)) - y4 * Math.round(Math.sin(degrees)) + xrotation;
        this.y4 = y4 * Math.round(Math.cos(degrees)) + x4 * Math.round(Math.sin(degrees)) + yrotation;
    }
    
    public String coords() {
        return "(" + x + "," + y + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")";
    }
    
    public String toString() {
        return "This rectangle has a length of " + length 
            + " and a width of " + width + ". Its area is " + length * width + ".";
    }

    public boolean equals(Rectangle other) {
        if (this.length == other.length && this.width == other.width) {
            return true;
        }
        return false;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
 

}
    
