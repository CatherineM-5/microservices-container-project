/**
 * GradeController is a Rest Controller to process GET requests and return response in JSON.
 */
package com.webservice

import com.webservice.GradeCalculator.classifyGrades
import com.webservice.GradeCalculator.parseMarksFromInput
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
open class GradeController {

    /**
     *
     * @param inputText
     * @return
     * @throws JSONException
     */
    @GetMapping(path = ["/"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun classifyGrade(@RequestParam(name = "input_text", required = true) inputText: String?): ResponseEntity<Grade> {

        val marks = parseMarksFromInput(inputText!!)

        val grades: MutableList<String> = ArrayList()

        for (i in marks.indices){
            grades.add(classifyGrades(marks[i]))
        }

        return ResponseEntity.ok()
                .header("Access-Control-Allow-Origin", "*")
                .header("Content-type", "application/json")
                .body(Grade(grades))
    }

    companion object {
        /**
         *
         * @param args
         */
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(GradeController::class.java, *args)
        }
    }
}