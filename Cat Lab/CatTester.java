public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); //1. new object
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); //2. new object
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); //3. Print string

        System.out.println("Are the cat's equal?" + myCat.equals(otherCat)); //4. print not return

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); //5. no get function, and print function

        String firstName = "Tiger";
        String lastName = "Beast"; //6. setting variable not checking value
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}