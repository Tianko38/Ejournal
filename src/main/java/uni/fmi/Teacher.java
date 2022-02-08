package uni.fmi;

/**
 * 
 */
public class Teacher extends User {
    private String name;
    private Class classes;

    public Teacher() {
    }

    public String getName() {
        // TODO implement here
        return "";
    }

    public void setName(String name) {
        // TODO implement here
    }

    public int fetchStudentGrade(Student student, Subject subject) {
        // TODO implement here
        return 0;
    }

    public void saveStudentGrade(Student student, int grade, Subject subject) {
        // TODO implement here
    }

    public Class getClasses() {
        // TODO implement here
        return null;
    }

    public void setClasses(Class classes) {
        // TODO implement here
    }

}