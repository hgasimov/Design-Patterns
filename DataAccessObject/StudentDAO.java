package DataAccessObject;

import java.util.ArrayList;
import java.util.List;


public class StudentDAO implements StudentDAOInterface {
    private List<Student> students;
    
    public StudentDAO() {
        students = new ArrayList<Student>();
        students.add(new Student("Jack", 1));
        students.add(new Student("Mike", 2));
    }
    
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        for (Student student : students)
            if (student.getRollNo() == rollNo)
                return student;
        
        return null;
    }

    @Override
    public void updateStudent(Student student) {
        Student stud = getStudent(student.getRollNo());
        stud.setName(student.getName());
        System.out.println("Update Student - RollNo: " + stud.getRollNo() 
                + ", Name: " + stud.getName());
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Delete Student: Roll No " + student.getRollNo() 
            + ", deleted from database");
    }
    
}
