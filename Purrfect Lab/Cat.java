public class Cat {
    String name;
    String ownerName;
    int moodLevel;
    String catId;
    char catChar;
    boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    public Cat() {
        name = "cat";
        ownerName = "catOwner";
        moodLevel = 0;
        catId = "1234";
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
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

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        String catMoodMessage = PurrfectUtils.determineCatMood(this);
        return "== ABOUT " + name + " ==\n" 
            + name + " is a cat.\nTheir tag is " + generateCatTag()
            + ".\nCurrently, " + name + " is in a " + catMoodMessage;
    }

    public boolean equals(Cat other) {
        if (this.toString().equals(other.toString())) {
            return true;
        }
        return false;
    }
    

}
