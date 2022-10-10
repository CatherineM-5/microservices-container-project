/**
 * GradeController is a Rest Controller to process GET requests and return response in JSON.
 */
package com.webservice;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.webservice")
@RestController
public class GradeController {

 /**
  * 
  * @param inputText
  * @return
  * @throws JSONException
  */
 @GetMapping(path="/", produces = MediaType.APPLICATION_JSON_VALUE)
 public ResponseEntity<Grade> classifyGrade(@RequestParam(name="input_text", required = true) 
   String inputText) throws JSONException {

    //TODO: Add null/empty check for input_text

    ArrayList<String> marks = GradeCalculator.parseMarksFromInput(inputText);
     
    double finalMark = GradeCalculator.calculateFinalMarkFromMarks(marks);

    String grade = GradeCalculator.classifyGrade(finalMark);

    if (grade == null) {
     return ResponseEntity.notFound().build();
    } else {
      return ResponseEntity.ok()
      .header("Access-Control-Allow-Origin", "*")
      .header("Content-type", "application/json")
      .body(new Grade(grade));
   }
 }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(GradeController.class, args);
  }

}