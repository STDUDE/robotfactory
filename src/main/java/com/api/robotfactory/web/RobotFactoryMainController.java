package com.api.robotfactory.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class RobotFactoryMainController {


    

    @RequestMapping(value = "/error403", method = RequestMethod.GET)
    public void error403() { }

    @RequestMapping(value = "/error404", method = RequestMethod.GET)
    public void error404() { }

    @RequestMapping(value = "/error500", method = RequestMethod.GET)
    public void error500() { }

    @RequestMapping(value = "/error400", method = RequestMethod.GET)
    public void error400() { }
}
