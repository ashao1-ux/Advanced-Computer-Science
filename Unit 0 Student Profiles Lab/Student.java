public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String generateId() {
        int first = (int) (Math.random() * 7 + 1);
        int second = (int) (Math.random() * 7 + 1);
        int third = (int) (Math.random() * 7 + 1);
        int four = (int) (Math.random() * 9);
        int five = (int) (Math.random() * 9);
        int six = (int) (Math.random() * 9);
        int seven = (int) (Math.random() * 9);
        return "" + first + second + third + "-" + four + five + six + seven + "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return name + " is a " + grade 
            + "th grade student. Their id is " + id + ".";
    }

    public boolean equals(Student other) {
        if (this.grade == other.grade && this.name.equals(other.name) 
            && this.id.equals(other.id)) {
            return true;
        }
        return false;
    }
}

