import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.webservice.Grade;
import com.webservice.GradeController;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GradeController.class)
public class GradeControllerTest {

    @InjectMocks
    GradeController gradeController;

    static String inputText;
    
    @Test
    public void testGradeReturnedCorrectlyForDistinctionWithOKStatus() throws JSONException {
     inputText = "a,100newlineb,58newlinec,70";
 
     MockHttpServletRequest request = new MockHttpServletRequest();
     RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
 
     ResponseEntity<Grade> responseEntity = gradeController.classifyGrade(inputText);
 
     assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
     assertEquals("Distinction", responseEntity.getBody().getAnswer());
    }
 
    @Test
    public void testGradeReturnedCorrectlyForCommendationWithOKStatus() throws JSONException {
     inputText = "a,80newlineb,58newlinec,70";
 
     MockHttpServletRequest request = new MockHttpServletRequest();
     RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
 
     ResponseEntity<Grade> responseEntity = gradeController.classifyGrade(inputText);
 
     assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
     assertEquals("Commendation", responseEntity.getBody().getAnswer());
    }
 
    @Test
    public void testGradeReturnedCorrectlyForPassWithOKStatus() throws JSONException {
     inputText = "a,60newlineb,58newlinec,60";
 
     MockHttpServletRequest request = new MockHttpServletRequest();
     RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
 
     ResponseEntity<Grade> responseEntity = gradeController.classifyGrade(inputText);
 
     assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
     assertEquals("Pass", responseEntity.getBody().getAnswer());
    }
 
    @Test
    public void testGradeReturnedCorrectlyForMarginalFailWithOKStatus() throws JSONException {
     inputText = "a,45newlineb,48newlinec,45";
 
     MockHttpServletRequest request = new MockHttpServletRequest();
     RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
 
     ResponseEntity<Grade> responseEntity = gradeController.classifyGrade(inputText);
 
     assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
     assertEquals("Marginal Fail", responseEntity.getBody().getAnswer());
    }
 
    @Test
    public void testGradeReturnedCorrectlyForFailWithOKStatus() throws JSONException {
     inputText = "a,30newlineb,38newlinec,35";
 
     MockHttpServletRequest request = new MockHttpServletRequest();
     RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
 
     ResponseEntity<Grade> responseEntity = gradeController.classifyGrade(inputText);
 
     assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
     assertEquals("Fail", responseEntity.getBody().getAnswer());
    }
 
    @Test
    public void testGradeReturnedCorrectlyForLowFailWithOKStatus() throws JSONException {
     inputText = "a,10newlineb,28newlinec,20";
 
     MockHttpServletRequest request = new MockHttpServletRequest();
     RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
 
     ResponseEntity<Grade> responseEntity = gradeController.classifyGrade(inputText);
 
     assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
     assertEquals("Low Fail", responseEntity.getBody().getAnswer());
    }

    //TODO: Add negative tests
    
}
