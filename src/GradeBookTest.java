
public class GradeBookTest {

    public static void main(String[] args) {

        int[][] gradesArray = { {68, 78, 99},
                                {100, 77, 94},
                                {85, 90, 82},
                                {69, 100, 79},
                                {100, 74, 88},
                                {87, 72, 97},
                                {88, 100, 65},
                                {76, 90, 80},
                                {71, 92, 83},
                                {99, 100, 68} };
        GradeBook myGradeBook =
                new GradeBook("CS101 Intorduction to Java Programming", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
