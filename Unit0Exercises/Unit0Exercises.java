// Solution: Unit 0 Exercises
public class Unit0Exercises {
    private boolean weekday;
    private boolean vacation;
    private int num;
    private int sqft;
    private double pricePerSqft;

    public Unit0Exercises() {
        weekday = false;
        vacation = true;
        num = 0;
        sqft = 0;
        pricePerSqft = 0;
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday) {
            if (vacation) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public int diff21(int num) {
        if (num > 21) {
            int diff = 2 * (num - 21);
            return diff;
        } else {
            int diff = 21 - num;
            return diff;
        }
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        double amount = sqft * pricePerSqft;
        if (amount < 0) {
            amount = 0.0;
            return amount;
        } else {
            return amount;
        }
    }


    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true
        // sleepIn(true, false) -> true
        // sleepIn(false, true) -> true

        // testing diff21() method
        System.out.println(obj.diff21(19)); // ouput: 2
        // diff21(10) -> 11
        // diff21(21) -> 0

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
        // flooringCalculator(0, 3.0) -> 0.0
        // flooringCalculator(100, -1.5) -> 0.0

    }

}
