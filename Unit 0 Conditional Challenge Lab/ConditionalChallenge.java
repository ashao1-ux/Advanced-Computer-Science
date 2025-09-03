public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here
        
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 1.1;
        boolean isCold = true; 
        if (isCold == true) {
            temperature-=15;
        }
        else { 
            temperature+=10;
        }
        System.out.println("The temperature is " + temperature);


        // Part 2: Grade Calculator
        System.out.println("--- Part 1: Temperature Converter ---");
        int score = 50;
        String result = "result is";
        if (score > 70) {
            result = "passed";
        }
        else {
            result = "failed";
        }
        System.out.println("Your score is " + score + ". You " + result);

        // Part 3: Leap Year Checker
        
        // Part 4: Number Classifier
        
    }
}