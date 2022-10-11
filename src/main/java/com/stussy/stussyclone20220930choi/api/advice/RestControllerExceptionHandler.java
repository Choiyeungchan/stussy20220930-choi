package com.stussy.stussyclone20220930choi.api.advice;

import com.stussy.stussyclone20220930choi.dto.CMRespDto;
import com.stussy.stussyclone20220930choi.exception.CustomValidationException;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public  class RestControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<?> validationErrorException(@NotNull CustomValidationException e) {

        return ResponseEntity.badRequest().body(new CMRespDto<>(e.getMessage(), e.getErrorMap()));
    }

}

