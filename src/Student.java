public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int credits;

    public Student() { //default constructor

    }

    public Student(String id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    /**
     * Overloading
     * paramaterized constructor
     * @param id
     * @param name
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //copy constructor; deep coping
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.credits = student.credits;
    }

    @Override
    public boolean equals(Object obj) { //method parameter has to be the same for overriding cant be Student student
        if (obj instanceof Student){
            Student student = (Student) obj;
            return student.id.equals(this.id);
        }
        return false;
    }
    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " credits: " + credits;
    }

    @Override
    public int compareTo(Student student) { //1, 0, -1
        if (this.id.compareToIgnoreCase(student.id) > 0)
            return 1;
        if (this.id.compareToIgnoreCase(student.id) < 1)
            return -1;
        return 0;
    }
}
