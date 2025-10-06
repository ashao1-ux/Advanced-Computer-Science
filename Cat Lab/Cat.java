public class Cat {     //1. lowercase public, name class after file, Cat
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { //2. added parameters breed and 3. constructor class
		this.name = name;   //4. used this to refer to current class variable
		this.breed = breed;      //5. used this to refer to current class variable
		this.isHungry = true;    //6. ishungry must be boolean
		livesRemaining = 9;
	}

	public String getName() { //7. Not void method
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry(){ //8. Not void method and camel case
		return isHungry;
	}

	public String getBreed() { //8. getters and setters
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	
	public void setLivesRemaining(int livesRemaining) {
		this.livesRemaining = livesRemaining;
	}

	public int getLivesRemaining() {
		return livesRemaining;
	}


	public void feed() { //9. this method returns nothing
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed) // 10. name is string
			&& this.livesRemaining == other.livesRemaining; //10. double equals
	}

	public String toString() { 
		return name + " is of breed " + breed 
            + " and has " + livesRemaining + " lives remaining."; //11. supposed to return String not print
	}
}