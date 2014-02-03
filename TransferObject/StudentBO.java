package TransferObject;

import java.util.ArrayList;
import java.util.List;


public class StudentBO {
    private List<StudentVO> students;
    
    public StudentBO() {
        students = new ArrayList<StudentVO>();
        students.add(new StudentVO("Jack", 0));
        students.add(new StudentVO("John", 1));        
    }
    
    public List<StudentVO> getAllStudents() {
        return students;
    }
    
    public StudentVO getStudent(int rollNo) {
        for (StudentVO student : students)
            if (student.getRollNo() == rollNo)
                return student;
        
        return null;
    }
    
    public void deleteStudent(StudentVO student) {
        students.remove(student);
    }
    
    public void updateStudent(StudentVO student) {
        getStudent(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() 
                + ", updated in the database");
    }
}
