package uni.fmi;

import java.util.Objects;
import java.util.Set;


public class Subject {
    private String title;
    private Set<Class> classes;

    public Subject(String title) {
        this.title = title;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(getTitle(), subject.getTitle()) &&
                Objects.equals(getClasses(), subject.getClasses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getClasses());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Class> getClasses() {
        // TODO implement here
        return null;
    }

    public void setClasses(Set<Class> classes) {
        // TODO implement here
    }

}