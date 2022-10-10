package com.webservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017\u00a8\u0006\t"}, d2 = {"Lcom/webservice/GradeController;", "", "()V", "classifyGrade", "Lorg/springframework/http/ResponseEntity;", "Lcom/webservice/Grade;", "inputText", "", "Companion", "blog"})
@org.springframework.web.bind.annotation.RestController
@org.springframework.boot.autoconfigure.SpringBootApplication
public class GradeController {
    @org.jetbrains.annotations.NotNull
    public static final com.webservice.GradeController.Companion Companion = null;
    
    public GradeController() {
        super();
    }
    
    /**
     * @param inputText
     * @return
     * @throws JSONException
     */
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(path = {"/"}, produces = {"application/json"})
    public org.springframework.http.ResponseEntity<com.webservice.Grade> classifyGrade(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.RequestParam(name = "input_text", required = true)
    java.lang.String inputText) {
        return null;
    }
    
    /**
     * @param args
     */
    @kotlin.jvm.JvmStatic
    public static final void main(@org.jetbrains.annotations.NotNull
    java.lang.String[] args) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/webservice/GradeController$Companion;", "", "()V", "main", "", "args", "", "", "([Ljava/lang/String;)V", "blog"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * @param args
         */
        @kotlin.jvm.JvmStatic
        public final void main(@org.jetbrains.annotations.NotNull
        java.lang.String[] args) {
        }
    }
}