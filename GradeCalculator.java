public class GradeCalculator
{
  public static void main(String[] args)
  {
    String className = "Computer Science A";
    int averageTime = 135;
    int hwGrade1 = 75;
    int hwGrade2 = 99;
    int hwGrade3 = 80;
    int hwGrade4 = 100;

    double quiz1 = 89.2;
    double quiz2 = 98.1;

    double finalExam = 87.58

    int timeSpendHr = (averageTime / 60);
    int timeSpendMins = (averageTime % 60);

    System.out.println("Weekly time spent: " + timeSpendHr + "h" + timeSpendMins);

    double averageHwGrade = ((double)(hwGrade1 + hwGrade2 + hwGrade3 + hwGrade4) / 4.0);
    double averageQuizGrade = ((double)(quiz1 + quiz2) / 2.0);

    System.out.println("Average Homework Grade: " + averageHwGrade);
    System.out.println("Average Quiz Grade: " + averageQuizGrade);

    double finalExamGrade = ((double)())


  }
}
