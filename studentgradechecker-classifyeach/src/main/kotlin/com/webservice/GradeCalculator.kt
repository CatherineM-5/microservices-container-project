package com.webservice

import java.util.*

object GradeCalculator {
    private const val SEVENTY = 70.0
    private const val SIXTY = 60.0
    private const val FIFTY = 50.0
    private const val FORTY = 40.0
    private const val THIRTY = 30.0
    private const val DISTINCTION = "Distinction"
    private const val COMMENDATION = "Commendation"
    private const val PASS = "Pass"
    private const val MARGINAL_FAIL = "Marginal Fail"
    private const val FAIL = "Fail"
    private const val LOW_FAIL = "Low Fail"
    private const val NEWLINE_REGEX = "newline"
    private const val EMPTY_STRING = ""
    private const val COMMA_REGEX = ".*,"
    private const val FORWARD_SLASH_REGEX = "/"

    /**
     * Parse marks entered by student from input String.
     *
     * @param inputText String input of modules and marks from request.
     * @return ArrayList<String> of marks without module names or other characters
    </String> */
    @JvmStatic
    fun parseMarksFromInput(inputText: String): MutableList<Double> {
        val cleanInput = inputText.replace(NEWLINE_REGEX, FORWARD_SLASH_REGEX)
        val lines = cleanInput.split(FORWARD_SLASH_REGEX.toRegex()).toTypedArray()

        val marks: MutableList<Double> = ArrayList()

        for (line in lines) {
            val mark = line.replace(COMMA_REGEX.toRegex(), EMPTY_STRING)
            marks.add(mark.toDouble())
        }
        return marks
    }

    /**
     * Classify student grade based on final mark.
     *
     * @param finalMark double final mark score for all modules.
     * @return String of classified grade.
     */
    @JvmStatic
    fun classifyGrades(finalMark: Double): String {

        var grade: String = if (finalMark >= SEVENTY) {
            DISTINCTION
        } else if (finalMark >= SIXTY && finalMark < SEVENTY) {
            COMMENDATION
        } else if (finalMark >= FIFTY && finalMark < SIXTY) {
            PASS
        } else if (finalMark >= FORTY && finalMark < FIFTY) {
            MARGINAL_FAIL
        } else if (finalMark >= THIRTY && finalMark < FORTY) {
            FAIL
        } else {
            LOW_FAIL
        }
        return grade
    }
}