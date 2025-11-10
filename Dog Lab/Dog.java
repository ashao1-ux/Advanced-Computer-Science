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
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        stillInFacility = true;
    }

    public Dog() {
        name = "Dog";
        ownerName = "ownerName";
        age = 5;
        dogId = 111;
        dogChar =  PawesomeUtils.generateDogChar(this.dogId);
        dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        stillInFacility = true;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }
    
    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogTag() {
        return dogTag;
    }

    public char getDogChar() {
        return dogChar;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
        setDogChar(PawesomeUtils.generateDogChar(this.dogId));
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);


    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
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

}
