public class ThreeDPrinter { //Defines a class, instructions for item
    //instance variables, nouns
    private String color; //= "Grey"
    private int cost; //1200
    private double weight; //12.5 lbs
    private int sizeInCubicFeed; //1
    private int numberOfMagazines; //4
    private String type; //"Carbon X-1"
    private boolean on;
    private boolean fixed; 
    //attributes, Constructor = instructions for creating particular bottles (instances of the class), verbs(methods)
    public ThreeDPrinter() {
        color = "Grey";
        cost = 1200;
        weight = 12.5;
        sizeInCubicFeed = 1;
        numberOfMagazines = 4;
        type = "X-1 Carbon";
    }

    //paint
    //print
    //fix
    //all functions public, all variables private
    //method header/signature
    //methods first letter is never capitalized
    //drinkMe(double amount) drinkMe is a method to drink to lower weight, double amount is parameter or arguement
    //if (amount < weight) { 
    //  weight-=amount
    //}
    //else {
    //  System.out.println("Not enough " + brand + "!!")
    //}
    // == is a boolean returns true or false
    
    public void paint() { //void for no returned value, otherwise, name what type of data is returned. ex. String, float, double, char, etc.
        color = "Red"; //method body - instructions for what the method should do can use parameter variables
        System.out.println("The color of my printer is " + color);
    }
    public void print() {
        System.out.println("Something was printed");
    }
    public void fix() {
        cost += 30;
        if (cost>1200) {
            System.out.println(cost);
        }
        System.out.println("My printer is fixed. The cost of my printer is " + cost);
    }
    public void on() {
        on = true;
        System.out.println("Your printer is turned on");
    }
}
