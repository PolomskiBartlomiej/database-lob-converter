package demo.jpa.converter.infrastructure.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.MalformedURLException;

@ControllerAdvice
 class AdvertisementAdvice {

    @ExceptionHandler(MalformedURLException.class)
     ResponseEntity<String> reponseMyException(MalformedURLException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("The Banner in Advertisement have not valid banner url");
    }

}
