package DataAccessObject;

import java.util.List;


public interface StudentDAOInterface {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
