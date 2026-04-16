public class Course {
    int course_Id;
    String course_Name;
    double course_fee;

    public Course(int course_Id, String course_Name, double course_fee) {
        this.course_Id = course_Id;
        this.course_Name = course_Name;
        this.course_fee = course_fee;
    }

    @Override
    public String toString() {
        return course_Id + " - " + course_Name + " (Fee: " + course_fee + ")";
    }
}