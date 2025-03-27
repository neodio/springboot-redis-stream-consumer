package redis.consumer.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import redis.consumer.exception.JobAlreadyQueuedException;
import redis.consumer.exception.RemovingRunningJobException;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
    @ExceptionHandler({JobAlreadyQueuedException.class, RemovingRunningJobException.class, JobAlreadyQueuedException.class})
    public ResponseEntity<String> handleConflict(Exception exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(exception.getMessage());
    }
}
