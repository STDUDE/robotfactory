package com.api.robotfactory.domain;

import java.util.Date;
import java.util.List;

public class DifficultTask extends Task {

    public DifficultTask(int type, String subject, boolean broadcasting, Date deadline) {

    }

    @Override
    protected void execute(List<Robot> robots) {
        return;
    }

    @Override
    protected void execute(List<Robot> robots, int id) {
        return;
    }
}
