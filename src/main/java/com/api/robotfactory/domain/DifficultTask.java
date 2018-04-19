package com.api.robotfactory.domain;

import java.util.Date;
import java.util.List;

public class DifficultTask extends Task {

    public DifficultTask(int type, String subject, boolean broadcasting, Date deadline) {
        super(type, subject, broadcasting, deadline);
    }

    @Override
    protected boolean execute(List<Robot> robots) {
        return false;
    }

    @Override
    protected boolean execute(List<Robot> robots, int id) {
        return false;
    }
}
