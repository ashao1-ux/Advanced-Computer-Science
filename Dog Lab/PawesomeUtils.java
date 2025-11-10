public class PawesomeUtils {

    public static char generateDogChar(int dogId) {
        return (char) ('F' + (dogId % 10 + (dogId / 10) % 10 + (dogId / 100) % 10) % 10);
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            return "The dog can't leave because person name" 
                + " fails to match registered owner name.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
        } else {
            System.out.println("Invalid dog tag! Entry denied.");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId <= 999 && dogId >= 100) {
            return dogId;
        } else {
            return (int) (Math.random() * 899 + 100);
        }

    }

    public static boolean validateDogTag(Dog dog) {
        char dogLetter = generateDogChar(validateDogId(dog.getDogId()));
        String newDogTag = validateDogId(dog.getDogId()) + "" + dogLetter;
        return newDogTag.equals(dog.getDogTag());
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + (dog.getAge() - 2) * 5;
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 5 + 2;
        }
    }
    
}
