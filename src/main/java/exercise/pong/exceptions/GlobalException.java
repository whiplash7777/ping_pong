package exercise.pong.exceptions;

import exercise.pong.payloads.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalException {

    public ApiResponse apiResponse;

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<ApiResponse> badRequestExceptionHandler(HttpClientErrorException.BadRequest exception) {
        String message = exception.getMessage().toString();
        ApiResponse apiResponse = new ApiResponse(message, false);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.BAD_REQUEST);
    }
}
