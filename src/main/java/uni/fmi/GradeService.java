package uni.fmi;

import org.javatuples.Pair;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GradeService {
    private static Student student = new Student("Мартин Христов");
    private static Subject subject = new Subject("Физическо");

    private static List<Pair<Student, Subject>> studentSubjectDB = Collections.singletonList(new Pair<>(student,subject));
    private static HashMap<Pair<Student, Subject>, Integer> studentSubjectGradeDB = new HashMap<>();

    public static String checkGrade(Student student, Subject subject) {

        if (student == null) {
            return "Изберете ученик";
        }

        if (subject == null) {
            return "Изберете предмет";
        }

        boolean studentStudiesSubject = studentSubjectDB.stream()
                .anyMatch(p -> p.contains(student) && p.contains(subject));

        if(!studentStudiesSubject){
            return "Ученикът не учи този предмет";
        }


        Integer grade = studentSubjectGradeDB.get(Pair.with(student,subject));


        return grade != null ? "Оценката е: " + grade : "Ученикът няма оценка по този предмет" ;
    }

    public static String enterGrade(Student student, Subject subject, int grade) {

        if (student == null) {
            return "Изберете ученик";
        }

        if (subject == null) {
            return "Изберете предмет";
        }

        Pair<Student,Subject> pair = new Pair<>(student,subject);

        boolean studentStudiesSubject = studentSubjectDB.contains(pair);

        if(!studentStudiesSubject){
            return "Ученикът не учи този предмет";
        }

        if (grade < 2 || grade > 6){
            return "Въведете оценка между 2-6";
        }

        studentSubjectGradeDB.put(pair,grade);


        return "Успешен запис на оценка!";
    }
}
