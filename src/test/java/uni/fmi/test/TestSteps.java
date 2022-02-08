package uni.fmi.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.Student;
import uni.fmi.Subject;
import uni.fmi.test.model.GradeModel;

public class TestSteps {

    private GradeModel gradeModel;

    public TestSteps(GradeModel GradeModel){
        this.gradeModel = GradeModel;
    }

    @Given("^Започва да въвежда оценка$")
    public void startEnterGrade() throws Throwable {

    }

    @When("^Избира ученик: \"([^\"]*)\"$")
    public void selectStudent(String name) throws Throwable {
        gradeModel.setStudent(new Student(name));
    }

    @When("^Избира предмет: \"([^\"]*)\"$")
    public void selectSubject(String subject) throws Throwable {
        gradeModel.setSubject(new Subject(subject));
    }

    @When("^Въвежда оценката: \"([^\"]*)\"$")
    public void enterGrade(String grade) throws Throwable {
        gradeModel.setGrade(Integer.parseInt(grade));
    }

    @When("^Натиска бутона за въвеждане$")
    public void pressEnterGradeButton() throws Throwable {
        gradeModel.clickEnterButton();
    }

    @Then("^Вижда съобщение: \"([^\"]*)\"$")
    public void checkMessage(String message) throws Throwable {
        assert(message.equals(gradeModel.getMessage()));
    }

    @Given("^Започва проверка на оценката$")
    public void startCheckGrade() throws Throwable {

    }

    @When("^Избира на кое свое дете да провери: \"([^\"]*)\"$")
    public void selectChild(String arg1) throws Throwable {

    }

    @When("^Натиска бутона за проверка$")
    public void checkGradeButton() throws Throwable {
        gradeModel.clickCheckButton();
    }


}
