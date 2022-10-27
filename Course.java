public class Course{
    // TODO: Declare private fields - courseNumber, courseTitle
    private String courseNumber;
    private String courseTitle;

    // TODO: Define mutator methods -
    //       setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String userInput) {
        courseNumber = userInput;
    }
    public void setCourseTitle (String userInput) {
        courseTitle = userInput;
    }

    // TODO: Define accessor methods -
    //       getCourseNumber(), getCourseTitle()
    public String getCourseNumber() {
        return courseNumber;
    }
    public String getCourseTitle() {
        return courseTitle;
    }

    // TODO: Define printInfo()
    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + getCourseNumber());
        System.out.println("   Course Title: " + getCourseTitle());
    }

}
