import com.webservice.GradeController
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.mock.web.MockHttpServletRequest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

@ExtendWith(MockitoExtension::class)
@SpringBootTest(classes = [GradeController::class])
class GradeControllerTest {

    @Test
    fun testGradeReturnedCorrectlyForAllGradeWithOKStatus() {
        inputText = "a,70newlineb,60newlinec,50newlined,40newlinee,30newlinef,20"
        val request = MockHttpServletRequest()
        RequestContextHolder.setRequestAttributes(ServletRequestAttributes(request))

        var gradeController = GradeController()
        val responseEntity = gradeController.classifyGrade(inputText)

        val expected = ArrayList<String>(6)
        expected.add("Distinction")
        expected.add("Commendation")
        expected.add("Pass")
        expected.add("Marginal Fail")
        expected.add("Fail")
        expected.add("Low Fail")

        Assertions.assertEquals(HttpStatus.OK, responseEntity.statusCode)
        Assertions.assertEquals(expected, responseEntity.body?.answers)
    }

    @Test
    fun testGradeReturnedCorrectlyForSingleGradeWithOKStatus() {
        inputText = "a,70"
        val request = MockHttpServletRequest()
        RequestContextHolder.setRequestAttributes(ServletRequestAttributes(request))

        var gradeController = GradeController()
        val responseEntity = gradeController.classifyGrade(inputText)

        val expected = ArrayList<String>(1)
        expected.add("Distinction")

        Assertions.assertEquals(HttpStatus.OK, responseEntity.statusCode)
        Assertions.assertEquals(expected, responseEntity.body?.answers)
    }


    companion object {
        var inputText: String? = null
    }
}