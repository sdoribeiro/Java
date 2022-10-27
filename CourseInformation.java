import java.util.Scanner;

public class CourseInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Course myCourse = new Course();
        OfferedCourse myOfferedCourse = new OfferedCourse();

        String courseNumber, courseTitle;
        String oCourseNumber, oCourseTitle, instructorName, term, classTime;

        courseNumber = "ECE287";
        courseTitle = "Digital Systems Desing";

        oCourseNumber =  "ECE387";
        oCourseTitle =  "Embeddeb Systems Degign";
        instructorName = "Mark Patterson";
        term = "Fall 2018";
        classTime = "WF: 2-3:30 pm";

        myCourse.setCourseNumber(courseNumber);
        myCourse.setCourseTitle(courseTitle);
        myCourse.printInfo();

        myOfferedCourse.setCourseNumber(oCourseNumber);
        myOfferedCourse.setCourseTitle(oCourseTitle);
        myOfferedCourse.setInstructorName(instructorName);
        myOfferedCourse.setTerm(term);
        myOfferedCourse.setClassTime(classTime);
        myOfferedCourse.printInfo();

        System.out.println("   Instructor Name: " + myOfferedCourse.getInstructorName());
        System.out.println("   Term: " + myOfferedCourse.getTerm());
        System.out.println("   Class Time: " + myOfferedCourse.getClassTime());
    }
}
