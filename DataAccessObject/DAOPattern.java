package DataAccessObject;

import java.util.List;


public class DAOPattern {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        printStudentList(dao.getAllStudents());
        
        Student student = dao.getAllStudents().get(0);
        student.setName("Zero");
        dao.updateStudent(student);
        
        printStudentList(dao.getAllStudents());
    }
    
    private static void printStudentList(List<Student> students) {
        for (Student student : students) {
            System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
        }
    }
}
