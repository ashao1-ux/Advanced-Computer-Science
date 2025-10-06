public class DogTester {
    public static void main(String[] args) {
        Dog a = new Dog();
        Dog b = new Dog("b","B", 1, 123);
        Dog c = new Dog("c", "C", 2, 234);
        System.out.println(a.getAge());
        System.out.println(a.getDogChar());
        System.out.println(a.getDogId());
        System.out.println(a.getDogTag());
        System.out.println(a.getName());
        System.out.println(a.getOwnerName());
        System.out.println(a.stillInFacility());
        System.out.println(b.getAge());
        System.out.println(b.getDogChar());
        System.out.println(b.getDogId());
        System.out.println(b.getDogTag());
        System.out.println(b.getName());
        System.out.println(b.getOwnerName());
        System.out.println(b.stillInFacility());
        System.out.println(c.getAge());
        System.out.println(c.getDogChar());
        System.out.println(c.getDogId());
        System.out.println(c.getDogTag());
        System.out.println(c.getName());
        System.out.println(c.getOwnerName());
        System.out.println(c.stillInFacility());
        b.setAge(3);
        c.setDogId(693);
        System.out.println(b.getAge());
        System.out.println(b.getDogId());
        System.out.println(b.generateDogChar());
        System.out.println(c.generateDogChar());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        Dog d = new Dog("b", "B", 2, 234);
        System.out.println(a, b);
        System.out.println(b, d);
        a.stillInFacility = false;
        System.out.println(a.toString());




    }
    
}
