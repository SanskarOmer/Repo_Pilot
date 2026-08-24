package repoPilot.backend.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalExceptionHandler {
//
//    @ExceptionHandler(HttpClientErrorException.NotFound.class)
//    public ResponseEntity<String> handleNotFoundException(HttpClientErrorException.NotFound e) {
//        return error
//
//    }

}
