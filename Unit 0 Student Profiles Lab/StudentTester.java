public class StudentTester {
    public static void main(String[] args) {
        Student a = new Student("A", 11);
        Student b = new Student("B", 9);
        Student c = new Student("C");
        Student d = new Student("D");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        a.setGrade(12);
        b.setGrade(10);
        c.setGrade(11);
        d.setGrade(11);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(c.equals(b));

    }
}
