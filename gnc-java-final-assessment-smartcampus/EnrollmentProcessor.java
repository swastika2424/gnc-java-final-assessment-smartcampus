public class EnrollmentProcessor extends Thread {
    int student_Id;
    int course_Id;

    public EnrollmentProcessor(int student_Id, int course_Id) {
        this.student_Id = student_Id;
        this.course_Id = course_Id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Processing enrollment...");
            Thread.sleep(2000);
            System.out.println("Enrollment completed for Student " + student_Id + " in Course " + course_Id);
        } catch (InterruptedException e) {
            System.out.println("Error in processing");
        }
    }
}