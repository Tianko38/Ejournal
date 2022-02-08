package uni.fmi;

import java.util.Objects;
import java.util.Set;

public class Student extends User {

    private String name;
    private Class classes;
    private Set<Parent> parents;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(classes, student.classes) &&
                Objects.equals(getParents(), student.getParents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), classes, getParents());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int fetchStudentGrade(Student student, Subject subject) {
        // TODO implement here
        return 0;
    }

    public Set<Parent> getParents() {
        // TODO implement here
        return null;
    }

    public void setParents(Set<Parent> parents) {
        // TODO implement here
    }

}