public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = Dog.generateDogChar(this.dogId);
        dogTag = generateDogTag();
        stillInFacility = true;
    }

    public Dog() {
        name = "Dog";
        ownerName = "ownerName";
        age = 0;
        dogId = 111;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        if (stillInFacility) {
            return name + " is a good dog. They are " + age 
                + " years old and belong to " + ownerName  
                + ". They are currently in our facility. For employee use only: DogTag is " 
                + dogId + ".";
        }
        return name + " is a good dog. They are " + age 
            + " years old and belong to " + ownerName  
            + ". They are currently not in our facility. For employee use only: DogTag is " 
            + dogTag +  ".";
    }

    public boolean equals(Dog other) {
        return this.toString().equals(other.toString());
    }

    public String generateDogTag() {
        return "" + dogId + dogChar;
    }

    public static char generateDogChar(int dogId) {
        return (char) ('F' + (dogId % 10 + (dogId/10) % 10 + (dogId/100) % 10) % 10);
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.ownerName.equals(personName)) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner " + personName + ".";
        } else {
            return "The dog can't leave because person name" 
                + "fails to match registered owner name.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.stillInFacility = true;
        dog.ownerName = personName;
    }
    
}
