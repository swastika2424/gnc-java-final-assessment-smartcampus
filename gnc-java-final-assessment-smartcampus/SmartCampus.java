import java.util.*;

public class SmartCampus {

    static HashMap<Integer, Student> students = new HashMap<>();
    static HashMap<Integer, Course> courses = new HashMap<>();
    static HashMap<Integer, ArrayList<Course>> enrollments = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Smart Campus Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Enrollments");
            System.out.println("6. Exit");

            int choice;

            try {
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.next();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    students.put(sid, new Student(sid, name, email));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    try {
                        System.out.print("Enter Course ID: ");
                        int cid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Course Name: ");
                        String cname = sc.nextLine();

                        System.out.print("Enter Fee: ");
                        double fee = sc.nextDouble();

                        if (fee < 0) {
                            throw new InvalidFeeException(" Fee cannot be negative!");
                        }

                        courses.put(cid, new Course(cid, cname, fee));
                        System.out.println("Course Added!");

                    } catch (InvalidFeeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int sId = sc.nextInt();

                    System.out.print("Enter Course ID: ");
                    int cId = sc.nextInt();

                    if (!students.containsKey(sId) || !courses.containsKey(cId)) {
                        System.out.println("Invalid Student or Course!");
                        break;
                    }

                    enrollments.putIfAbsent(sId, new ArrayList<>());
                    enrollments.get(sId).add(courses.get(cId));

                    
                    EnrollmentProcessor thread = new EnrollmentProcessor(sId, cId);
                    thread.start();

                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students.values()) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 5:
                    if (enrollments.isEmpty()) {
                        System.out.println("No enrollments found.");
                    } else {
                        for (int id : enrollments.keySet()) {
                            System.out.println("Student ID: " + id);
                            for (Course c : enrollments.get(id)) {
                                System.out.println("   " + c);
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        
        }
    }
}
