public class Student extends Person{
    public String major;
    public Integer studentId;

    public Student(Integer id, String name, String gender, String address,
                   int age, String major, Integer studentId) {
        super(id, name, gender, address, age);
        this.major = major;
        this.studentId = studentId;
    }
}
