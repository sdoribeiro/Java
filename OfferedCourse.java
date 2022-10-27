public class OfferedCourse extends Course {
    // TODO: Declare private fields - instructorName, term, classTime
    private String instructorName;
    private String term;
    private String classTime;

    // TODO: Define mutator methods -
    //      setInstructorName(), setTerm(), setClassTime()
    public  void  setInstructorName (String userInput) {
        instructorName = userInput;
    }
    public  void  setTerm (String userInput) {
        term = userInput;
    }
    public void  setClassTime (String userInput) {
        classTime = userInput;
    }


    // TODO: Define accessor methods -
    //      getInstructorName(), getTerm(), getClassTime()
    public String  getInstructorName() {
        return instructorName;
    }
    public String getTerm() {
        return term;
    }
    public String getClassTime() {
        return classTime;
    }
}