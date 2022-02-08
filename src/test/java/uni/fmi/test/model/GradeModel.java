package uni.fmi.test.model;

import uni.fmi.GradeService;
import uni.fmi.Student;
import uni.fmi.Subject;

public class GradeModel {

    private Student student;
    private Subject subject;
    private int grade;
    private String message;

    public void clickCheckButton(){
        message = GradeService.checkGrade(student,subject);
    }

    public void clickEnterButton(){
        message = GradeService.enterGrade(student,subject,grade);
    }

    public String getMessage(){
        return message;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
