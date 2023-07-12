package com.example.rest.global.exception;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static com.example.rest.global.exception.ErrorCode.DUPLICATE_RESOURCE;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // @ExceptionHandler 에 ConstraintViolationException 와 DataIntegrityViolationException 만 처리하겠다. 라는 의미
    @ExceptionHandler(value = { ConstraintViolationException.class, DataIntegrityViolationException.class})
    protected ErrorResponse handleDataException(Exception ex) {
        log.error("handleDataException throw Exception : {}", DUPLICATE_RESOURCE);
        return DUPLICATE_RESOURCE.convertErrorResponse(ex);
    }

}
