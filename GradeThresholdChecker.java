public class GradeThresholdChecker {
    public static void main(String[] args) {
        double averageGrade = 88.5;
        int absences = 2;

        boolean isPassing = (averageGrade >= 75 && absences <= 3) || (averageGrade >= 90);

        System.out.println("=== GRADE THRESHOLD CHECKER ===");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Absences: " + absences);

        if (isPassing) {
            System.out.println("Status: PASS");
            if (averageGrade >= 90) {
                System.out.println("Reason: Student achieved an average grade of 90 or higher.");
            } else {
                System.out.println("Reason: Student achieved an average grade >= 75 with 3 or fewer absences.");
            }
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reason: Student did not meet the requirement of having an average >= 75 with <= 3 absences, nor did they achieve an average >= 90.");
        }
    }
}
