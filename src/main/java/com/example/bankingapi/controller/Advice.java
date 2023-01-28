package com.example.bankingapi.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Advice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.badRequest()
                .body(Error.builder().errorMessage(ex.getMessage()).build());
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception ex) {
        return ResponseEntity.badRequest()
                .body(Error.builder().errorMessage(ex.getMessage()).build());
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static
    class Error {
        private String errorMessage;
    }

}
