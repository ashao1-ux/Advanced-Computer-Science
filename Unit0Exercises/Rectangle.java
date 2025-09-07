public class Rectangle {
    private int width;
    private int length;




    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    public int getLength() {
        return length;
       
    }
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int wid) {
        this.width = wid;
    }

    public void setLength(int len) {
        this.length = len;
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
    
