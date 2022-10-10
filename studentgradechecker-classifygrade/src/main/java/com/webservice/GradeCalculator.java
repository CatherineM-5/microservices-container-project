package com.webservice;

import java.util.ArrayList;

public class GradeCalculator {

    private static final double SEVENTY = 70.0;
    private static final double SIXTY = 60.0;
    private static final double FIFTY = 50.0;
    private static final double FORTY = 40.0;
    private static final double THIRTY = 30.0;

    private static final String DISTINCTION = "Distinction";
    private static final String COMMENDATION = "Commendation";
    private static final String PASS = "Pass";
    private static final String MARGINAL_FAIL = "Marginal Fail";
    private static final String FAIL = "Fail";
    private static final String LOW_FAIL = "Low Fail";
    private static final String NEWLINE_REGEX = "newline";
    private static final String EMPTY_STRING = "";
    private static final String COMMA_REGEX = ".*,";
    private static final String FORWARD_SLASH_REGEX = "/";

    /**
     * Private constructor for utility Controller class to prevent creation of object.
     */
    private GradeCalculator(){}

   /**
     * Parse marks entered by student from input String.
     * 
     * @param inputText String input of modules and marks from request.
     * @return ArrayList<String> of marks without module names or other characters
     */
    public static ArrayList<String> parseMarksFromInput(String inputText){
      
      String cleanInput = inputText.replace(NEWLINE_REGEX, FORWARD_SLASH_REGEX);
   
      String [] lines = cleanInput.split(FORWARD_SLASH_REGEX);
   
      ArrayList<String> marks = new ArrayList<>();
   
      for(String line : lines){
        marks.add(line.replaceAll(COMMA_REGEX, EMPTY_STRING));
      }
   
      return marks;
    }
   
    /**
     * Calculate final mark from input marks provided.
     * 
     * Final mark is calculated by dividing the total sum of marks 
     * by the number of modules.
     * 
     * @param marks ArrayList<String> of marks used to calculate total.
     * @return double of calculated final mark.
     */
    public static double calculateFinalMarkFromMarks(ArrayList<String> marks){
      int total = 0;
      double finalMark = 0;
      
      for(String mark: marks){
        total += Integer.parseInt(mark);
      }
   
      finalMark = total / marks.size();
   
      return finalMark;
    }
   
    /**
     * Classify student grade based on final mark.
     * 
     * @param finalMark double final mark score for all modules.
     * @return String of classified grade.
     */
    public static String classifyGrade(double finalMark){
      String grade = EMPTY_STRING;
   
      if(finalMark >= SEVENTY){
        grade = DISTINCTION;
      } else if (finalMark >= SIXTY && finalMark < SEVENTY) {
          grade = COMMENDATION;
      } else if (finalMark >= FIFTY && finalMark < SIXTY) {
          grade = PASS;
      } else if (finalMark >= FORTY && finalMark < FIFTY) {
          grade = MARGINAL_FAIL;
      } else if (finalMark >= THIRTY && finalMark < FORTY) {
          grade = FAIL;
      } else {
          grade = LOW_FAIL;
      }
   
      return grade;
   
    }
    
}
