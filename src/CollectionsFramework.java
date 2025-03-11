import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

class Student {
    private int id;
    private String name;
    private int age;
    private Set<String> courses;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>();
    }

    public int getId(){
        return id;
    }

    public Set<String> getCourses(){
        return courses;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void addCourse(String course){
        courses.add(course);
    }



    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Courses: " + courses;
    }
}

class Univer {
    private Map<Integer, Student> students;

    public Univer() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void updateStudent(int id, String name, int age) {
        Student student = students.get(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
        }
    }

    public void displayAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public Student searchStudent(int id) {
        return students.get(id);
    }

    public List<Student> getStudentsByCourse(String course) {
        List<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getCourses().contains(course)) {
                result.add(student);
            }
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Univer university = new Univer();

        Student s1 = new Student(0, "Aibek", 19);
        Student s2 = new Student(2, "Mirlan",12 );
        s1.addCourse("Java ");
        s1.addCourse("CS");
        university.addStudent(s1);
        university.addStudent(s2);

        university.updateStudent(2,"Aibek", 20 );
        System.out.println(university.searchStudent(2));
        System.out.println("hello");
    }
}
