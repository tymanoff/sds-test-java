package plus.irbis.news.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import plus.irbis.news.exception.CustomException;

@ControllerAdvice
public class ExceptionConfiguration {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleStudentNotFoundException(CustomException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
