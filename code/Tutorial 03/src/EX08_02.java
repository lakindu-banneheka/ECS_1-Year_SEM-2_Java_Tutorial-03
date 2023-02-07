public class EX08_02 {
    public static void main(String[] args) {
        String str = "ICS 102: Introduction to Computing I";
        String courseName = str.split(":")[0].split(" ")[0];
        String courseNumber = str.split(":")[0].split(" ")[1];
        String courseDescription = str.split(":")[1];

        System.out.println("Course Name: " + courseName);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Course Description: " + courseDescription);
    }
}
