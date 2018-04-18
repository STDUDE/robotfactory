package com.api.robotfactory.web;

import com.api.robotfactory.domain.Robot;
import com.api.robotfactory.domain.RobotFactory;
import com.api.robotfactory.domain.TaskType;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

@RestController
@Configuration
public class RobotFactoryMainController {
    private RobotFactory robotFactory = new RobotFactory();
    private ArrayList<Robot> robots = new ArrayList<>();

    RobotFactoryMainController() {
        //robotFactory = new RobotFactory();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(@RequestParam(value = "task_type", required = false) TaskType taskType,
                             Map<String,Object> map) {

        if(robots.size() == 0) {
            //заполнить каждым типом

        }

        return new ModelAndView("index", map);
    }




    @RequestMapping(value = "/error403", method = RequestMethod.GET)
    public void error403() { }

    @RequestMapping(value = "/error404", method = RequestMethod.GET)
    public void error404() { }

    @RequestMapping(value = "/error500", method = RequestMethod.GET)
    public void error500() { }

    @RequestMapping(value = "/error400", method = RequestMethod.GET)
    public void error400() { }
}
