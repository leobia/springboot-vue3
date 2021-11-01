package it.leobia.gym.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {


    private static final Logger LOGGER = LogManager.getLogger(RootController.class);

    @RequestMapping(value = "/**/{[path:[^\\.]*}")
    public static String forward() {

        LOGGER.info("forward to /");

        return "forward:/";
    }
}
