package MVC;


public class StudentView {
    public void printStudentDetails(Student student) {
        System.out.println("Student name: " + student.getName()
                + ", Student RollNo: " + student.getRollNo());
    }
}
