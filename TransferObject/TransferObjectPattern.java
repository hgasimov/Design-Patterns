package TransferObject;


public class TransferObjectPattern {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();
        
        for (StudentVO student : studentBO.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                + student.getRollNo() + ", Name : "+student.getName() + " ]");
        }
      
        // update the student
        StudentVO student = new StudentVO("Michael", 1);
        studentBO.updateStudent(student);

        //get the student
        student = studentBO.getStudent(1);
        System.out.println("Student: [RollNo : " + student.getRollNo()
            + ", Name : " + student.getName() + " ]");
    }    
}
