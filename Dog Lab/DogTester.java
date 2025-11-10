public class DogTester {
    public static void main(String[] args) {
        Dog a = new Dog();
        Dog b = new Dog("b", "B", 1, 123);
        Dog c = new Dog("c", "C", 2, 234);
        System.out.println(a.getAge());
        System.out.println(a.getDogChar());
        System.out.println(a.getDogId());
        System.out.println(a.getDogTag());
        System.out.println(a.getName());
        System.out.println(a.getOwnerName());
        System.out.println(a.isStillInFacility());
        System.out.println(b.getAge());
        System.out.println(b.getDogChar());
        System.out.println(b.getDogId());
        System.out.println(b.getDogTag());
        System.out.println(b.getName());
        System.out.println(b.getOwnerName());
        System.out.println(b.isStillInFacility());
        System.out.println(c.getAge());
        System.out.println(c.getDogChar());
        System.out.println(c.getDogId());
        System.out.println(c.getDogTag());
        System.out.println(c.getName());
        System.out.println(c.getOwnerName());
        System.out.println(c.isStillInFacility());
        b.setAge(3);
        c.setDogId(693);
        System.out.println(b.getAge());
        System.out.println(b.getDogId());
        System.out.println(b.getDogChar());
        System.out.println(c.getDogChar());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        Dog d = new Dog("b", "B", 2, 234);
        System.out.println(a.equals(b));
        System.out.println(b.equals(d));
        a.setStillInFacility(false);
        System.out.println(a.toString());
        System.out.println(PawesomeUtils.generateDogChar(234)); 
        System.out.println(PawesomeUtils.generateDogChar(123)); // should return 'L'
        System.out.println(PawesomeUtils.generateDogChar(345)); 
        Dog myDog = new Dog("doggy", "Maria", 1, 369);
        System.out.println(PawesomeUtils.pickup(myDog, "John"));
        System.out.println(myDog.isStillInFacility()); //true
        System.out.println(PawesomeUtils.pickup(myDog, "Maria"));
        System.out.println(myDog.isStillInFacility()); //false
        Dog myDoggy = new Dog("myDoggy", "Alice", 1, 369);
        myDoggy.setStillInFacility(false);
        PawesomeUtils.checkIn(myDoggy, "NewOwner");
        System.out.println(myDoggy.isStillInFacility()); //true
        System.out.println(myDoggy.getOwnerName()); //NewOwner
        System.out.println(PawesomeUtils.validateDogId(123));
        System.out.println(PawesomeUtils.validateDogId(1111));
        System.out.println(PawesomeUtils.validateDogId(12));
        System.out.println(PawesomeUtils.validateDogTag(a));
        System.out.println(PawesomeUtils.validateDogTag(b));
        System.out.println(PawesomeUtils.validateDogTag(c));
        a.setDogTag("11L");
        System.out.println(PawesomeUtils.validateDogTag(a));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(a));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(b));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(c));
        System.out.println(PawesomeUtils.convertAgeToDogYears(15));
        System.out.println(PawesomeUtils.convertAgeToDogYears(24));
        System.out.println(PawesomeUtils.convertAgeToDogYears(49));


    }
    
}
