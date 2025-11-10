
public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7) {
            return "Currently, " + cat.getName() + " is in a great mood."
                + "\nPetting is appreciated.";
        }
        else if (cat.getMoodLevel() > 3 ) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life."
                + "\nPetting is acceptable.";
        }
        return "Currently, " + cat.getName() + " is plotting revengeance."
                + "\nPetting is extremely risky.";
    }

    public static char generateCatChar(String catId) {
        int sumOfDigits = 0;
        int newId = Integer.parseInt(catId);
        for (int i = 0; i < catId.length(); i++) {
            sumOfDigits += newId % 10;
            newId = newId / 10;
        }
        return (char) ('A' + sumOfDigits % 26);
        
    }

    public static int generateRandomNumber(int low, int high) {
        if (low < high) {
            return (int) (Math.random() * (high - low) + low);
        }
        return (int) (Math.random() * (low - high) + high);

    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel >= 0 && moodLevel <= 10) {
            return moodLevel;
        } else if(moodLevel < 0 ) {
            return 0;
        }
        return 10;
    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) >= 1000 && Integer.parseInt(catId) <= 9999) {
            return catId;
        }
        return "" + generateRandomNumber(1000, 9999); 
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else if(cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        } 
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        System.out.println("Petting successful!");
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        if (generateRandomNumber(1, 100) >= 50) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } 
        cat.setMoodLevel(cat.getMoodLevel() - 2);
        System.out.println(cat.getName() + " really hated that!");
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...\nDone!\n" 
            + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up " + cat.getName() + "'s bowl..."
            + "\nDone!\n" + cat.getName() + " is done eating..." 
            + cat.getName() + " is full!");
    }


}
