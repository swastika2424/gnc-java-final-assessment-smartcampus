public class Student {
    int student_Id;
    String student_name;
    String student_email;

    public Student(int student_Id, String student_name, String student_email) {
        this.student_Id = student_Id;
        this.student_name = student_name;
        this.student_email = student_email;
    }

    @Override
    public String toString() {
        return student_Id + " - " + student_name + " (" + student_email + ")";
    }
}
