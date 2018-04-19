package com.api.robotfactory.domain;

import java.util.List;

public class KillTask extends Task {

    @Override
    protected void execute(List<Robot> robots) {
        for (Robot robot:
             robots) {
            robot.updateStatus();
            robot.setTask(this);
        }
    }

    @Override
    protected void execute(List<Robot> robots, int id) {
        robots.get(id).setTask(this);
    }


}
