package com.example.testrabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    private final Logger log = LoggerFactory.getLogger(SimpleController.class);

    @Autowired
    AmqpTemplate template;

    @RequestMapping("/emit") //испускать
    @ResponseBody
    String queue1() {
        log.info("Emit to queue1");
        template.convertAndSend("queue1", "Message to queue 1");
        return "Request: Emit to queue 1";
    }
}
