package school;
import java.util.Random;

public class Student extends Person {
    private final Random random = new Random();
    private final int studentId = random.nextInt(1000);
    private int grade;
    private final int[] examScores = new int[5];

    public int getMaxScore() {
        int max = examScores[0];
        for (int score : examScores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public int getMinScore() {
        int min = examScores[0];
        for (int score : examScores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int score : examScores) {
            sum += score;
        }
        return sum / 5.0;
    }

    @Override
    public void captureDetails() {
        super.captureDetails();
        System.out.print("Grade:  ");
        grade = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            captureExamScore(i);
        }
    }

    private void captureExamScore(int i) {
        System.out.printf("Enter exam score %d:  ", i + 1);
        int inputScore = scanner.nextInt();
        if (inputScore >= 0 && inputScore <= 100) {
            examScores[i] = inputScore;
        } else {
            System.out.println("Invalid score. Please enter a valid score.");
            captureExamScore(i);
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student ID\tFull Name\t\tAge\t\tGrade\t\tAverage Score\t\tMax\t\tMin");
        System.out.println("*********************************************************************************");
        System.out.println(studentId + "\t\t" + super.getName() + "\t\t" + getAge() + "\t\t" +
                grade + "\t\t" + calculateAverage() + "\t\t" + getMaxScore() + "\t\t" + getMinScore());
    }
}
