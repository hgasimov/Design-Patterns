package MVC;


public class MVCPattern {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        
        StudentController contr = new StudentController(model, view);
        contr.updateView();
        
        contr.setStudentName("Sexy");
        contr.setStudentRollNo("7");
        contr.updateView();
    }
    
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Geek");
        student.setRollNo("10");
        
        return student;
    }
}
