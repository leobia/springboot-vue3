package it.leobia.gym.controller.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    private static final Logger LOGGER = LogManager.getLogger(TestController.class);

    @GetMapping
    public ResponseEntity<Object> test() {
        LOGGER.info("test request");
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

}
