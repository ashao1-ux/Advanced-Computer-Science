public class RectangleTester {
    public static void main() {
        Rectangle rect = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(5, 11);
        System.out.println(rect.toString());
        System.out.println(rect2.toString());
        rect.setLength(4);
        rect.setWidth(6);
        rect2.setLength(3);
        rect2.setWidth(7);
        System.out.println(rect.toString());
        System.out.println(rect2.toString());
        System.out.println("It is " + rect.equals(rect2) 
            + " to say these two rectangles are equal.");
        System.out.println("The area of this rectangle is " + rect.getArea() + ".");
        System.out.println("The perimeter of this rectangle is " + rect.getPerimeter() 
            + ".");
        System.out.println("The length of this rectangle's diagonal is " + rect.getDiagonal() 
            + ".");
        System.out.println("The area of this rectangle is " + rect2.getArea() + ".");
        System.out.println("The perimeter of this rectangle is " + rect2.getPerimeter() 
            + ".");
        System.out.println("The length of this rectangle's diagonal is " + rect2.getDiagonal() 
            + ".");

    }
}