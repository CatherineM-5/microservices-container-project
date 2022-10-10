import com.webservice.GradeCalculator.classifyGrades
import com.webservice.GradeCalculator.parseMarksFromInput
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.util.*

class GradeCalculatorTest {
    
    @Test
    fun testMarksCorrectlyParsedFromInputText() {
        val inputText = "a,100newlineb,58newlinec,70"

        val marks: MutableList<Double> = ArrayList()
        marks!!.add(100.0)
        marks!!.add(58.0)
        marks!!.add(70.0)

        val expectedMarks = marks
        val actualMarks = parseMarksFromInput(inputText!!)
        Assertions.assertEquals(expectedMarks, actualMarks)
    }

    @Test
    fun testGradeCalculatedCorrectlyFromFinalMarkForDistinction() {
        val finalMark = 70.0
        val expectedGrade = "Distinction"
        val actualGrade = classifyGrades(finalMark)
        Assertions.assertEquals(expectedGrade, actualGrade)
    }

    @Test
    fun testGradeCalculatedCorrectlyFromFinalMarkForCommendation() {
        val finalMark = 60.0
        val expectedGrade = "Commendation"
        val actualGrade = classifyGrades(finalMark)
        Assertions.assertEquals(expectedGrade, actualGrade)
    }

    @Test
    fun testGradeCalculatedCorrectlyFromFinalMarkForPass() {
        val finalMark = 50.0
        val expectedGrade = "Pass"
        val actualGrade = classifyGrades(finalMark)
        Assertions.assertEquals(expectedGrade, actualGrade)
    }

    @Test
    fun testGradeCalculatedCorrectlyFromFinalMarkForMarginalFail() {
        val finalMark = 40.0
        val expectedGrade = "Marginal Fail"
        val actualGrade = classifyGrades(finalMark)
        Assertions.assertEquals(expectedGrade, actualGrade)
    }

    @Test
    fun testGradeCalculatedCorrectlyFromFinalMarkForFail() {
        val finalMark = 30.0
        val expectedGrade = "Fail"
        val actualGrade = classifyGrades(finalMark)
        Assertions.assertEquals(expectedGrade, actualGrade)
    }

    @Test
    fun testGradeCalculatedCorrectlyFromFinalMarkForLowFail() {
        val finalMark = 29.0
        val expectedGrade = "Low Fail"
        val actualGrade = classifyGrades(finalMark)
        Assertions.assertEquals(expectedGrade, actualGrade)
    }
}