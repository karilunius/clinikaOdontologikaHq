package com.clinikaOdontologikaHq;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

     private static final Logger logger = Logger.getLogger(GlobalExceptionHandler.class);

   @ExceptionHandler(Exception.class)
    public ResponseEntity<?> todosErrores(Exception ex, WebRequest req){
         logger.error(ex.getMessage());
         return new ResponseEntity("Error"+ ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
     }


   /* @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<?> error400Status(Exception ex, WebRequest req){
        logger.error(ex.getMessage());
        return new ResponseEntity("Error"+ ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<?> error404Status(Exception ex) {
        logger.error(HttpStatus.NOT_FOUND + ex.getMessage() + LocalDateTime.now());
        return new ResponseEntity<>("Error"+ ex.getMessage(), HttpStatus.NOT_FOUND);
    }
*/
}


