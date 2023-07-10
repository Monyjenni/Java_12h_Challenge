import java.util.Map;
import java.util.HashMap;

public class Student {
    private String name;
    private Integer studentID;
    private Map<String, Integer> classesTaken;

    public Student(String name, Integer studentID) {
        this.name = name;
        this.studentID = studentID;
        this.classesTaken = new HashMap<>();
    }

    public void addClass(String className, Integer score) {
        classesTaken.put(className, score);
    }

    public void dropClass(String className) {
        classesTaken.remove(className);
    }

    public double calculateGPA() {
        if (classesTaken.isEmpty()) {
            return 0.0;
        }

        int totalCredit = 0;
        double totalSumScore = 0.0;

        for (int score : classesTaken.values()) {
            totalCredit++;
            totalSumScore += gradeToGPA(score);
        }

        return totalSumScore / totalCredit;
    }

    private double gradeToGPA(int score) {
        if (score >= 90) {
            return 4.0;
        } else if (score >= 80) {
            return 3.0;
        } else if (score >= 70) {
            return 2.0;
        } else if (score >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
public class Main {
  public static void main(String[] args) {
      Student student = new Student("Jennie", 18246);
      student.addClass("Physics", 100);
      student.addClass("Math", 99);

      double GPA = student.calculateGPA();
      System.out.println("Student's GPA: " + GPA);

      student.dropClass("Math");
      GPA = student.calculateGPA();
      System.out.println("Updated overall GPA: " + GPA);
  }
}

