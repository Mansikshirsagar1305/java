public class Classes {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 29;
        s1.college = "Sveri";
        s1.name = "Mansi";

        s2.age = 22;
        s2.college = "Sveri";
        s2.name = "Mandar";

        s1.MarkedAttendence();
        s2.MarkedAttendence();

        s1.print();
        s2.print();
    }
}


class Student {

    int age;
    String name;
    String college;

    void MarkedAttendence() {
        System.out.println("Marked Attendance " + name);
    }

    void print() {
        System.out.println(
            "Name: " + name +
            " Age: " + age +
            " College: " + college
        );
    }
}