package com.webservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0007J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/webservice/GradeCalculator;", "", "()V", "COMMA_REGEX", "", "COMMENDATION", "DISTINCTION", "EMPTY_STRING", "FAIL", "FIFTY", "", "FORTY", "FORWARD_SLASH_REGEX", "LOW_FAIL", "MARGINAL_FAIL", "NEWLINE_REGEX", "PASS", "SEVENTY", "SIXTY", "THIRTY", "classifyGrades", "finalMark", "parseMarksFromInput", "", "inputText", "blog"})
public final class GradeCalculator {
    @org.jetbrains.annotations.NotNull
    public static final com.webservice.GradeCalculator INSTANCE = null;
    private static final double SEVENTY = 70.0;
    private static final double SIXTY = 60.0;
    private static final double FIFTY = 50.0;
    private static final double FORTY = 40.0;
    private static final double THIRTY = 30.0;
    private static final java.lang.String DISTINCTION = "Distinction";
    private static final java.lang.String COMMENDATION = "Commendation";
    private static final java.lang.String PASS = "Pass";
    private static final java.lang.String MARGINAL_FAIL = "Marginal Fail";
    private static final java.lang.String FAIL = "Fail";
    private static final java.lang.String LOW_FAIL = "Low Fail";
    private static final java.lang.String NEWLINE_REGEX = "newline";
    private static final java.lang.String EMPTY_STRING = "";
    private static final java.lang.String COMMA_REGEX = ".*,";
    private static final java.lang.String FORWARD_SLASH_REGEX = "/";
    
    private GradeCalculator() {
        super();
    }
    
    /**
     * Parse marks entered by student from input String.
     *
     * @param inputText String input of modules and marks from request.
     * @return ArrayList<String> of marks without module names or other characters
     *   </String>
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.Double> parseMarksFromInput(@org.jetbrains.annotations.NotNull
    java.lang.String inputText) {
        return null;
    }
    
    /**
     * Classify student grade based on final mark.
     *
     * @param finalMark double final mark score for all modules.
     * @return String of classified grade.
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final java.lang.String classifyGrades(double finalMark) {
        return null;
    }
}