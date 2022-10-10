import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.webservice.GradeCalculator;

public class GradeCalculatorTest {

    static String inputText;
    static String grade;
    static ArrayList<String> marks;
    static double finalMark;

    @BeforeAll
    public static void beforeAll(){
        inputText = "a,100newlineb,58newlinec,70";
        populateExpectedMarks();
    }

    @Test
    public void testMarksCorrectlyParsedFromInputText(){
        ArrayList<String> expectedMarks = marks;
        ArrayList<String> actualMarks = GradeCalculator.parseMarksFromInput(inputText);

        assertEquals(expectedMarks, actualMarks);
    }

    @Test
    public void testFinalMarkCalculatedCorrectlyFromParseMarks(){
        double expectedFinalMark = 76.0;
        double actualFinalMark = GradeCalculator.calculateFinalMarkFromMarks(marks);

        assertEquals(expectedFinalMark, actualFinalMark);
    }

    @Test
    public void testGradeCalculatedCorrectlyFromFinalMarkForDistinction(){
        Double finalMark = 70.0;
        String expectedGrade = "Distinction";
        String actualGrade = GradeCalculator.classifyGrade(finalMark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void testGradeCalculatedCorrectlyFromFinalMarkForCommendation(){
        Double finalMark = 60.0;
        String expectedGrade = "Commendation";
        String actualGrade = GradeCalculator.classifyGrade(finalMark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void testGradeCalculatedCorrectlyFromFinalMarkForPass(){
        Double finalMark = 50.0;
        String expectedGrade = "Pass";
        String actualGrade = GradeCalculator.classifyGrade(finalMark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void testGradeCalculatedCorrectlyFromFinalMarkForMarginalFail(){
        Double finalMark = 40.0;
        String expectedGrade = "Marginal Fail";
        String actualGrade = GradeCalculator.classifyGrade(finalMark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void testGradeCalculatedCorrectlyFromFinalMarkForFail(){
        Double finalMark = 30.0;
        String expectedGrade = "Fail";
        String actualGrade = GradeCalculator.classifyGrade(finalMark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void testGradeCalculatedCorrectlyFromFinalMarkForLowFail(){
        Double finalMark = 29.0;
        String expectedGrade = "Low Fail";
        String actualGrade = GradeCalculator.classifyGrade(finalMark);

        assertEquals(expectedGrade, actualGrade);
    }

    private static void populateExpectedMarks(){
        marks = new ArrayList<>();
        marks.add("100");
        marks.add("58");
        marks.add("70");
    }
    
}

