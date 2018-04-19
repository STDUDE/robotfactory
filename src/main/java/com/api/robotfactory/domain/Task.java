package com.api.robotfactory.domain;

import java.util.Date;
import java.util.List;

public abstract class Task {
    public static int KILL = 0;
    public static int WAIT = 1;

    private int type;
    private String subject;
    private Date deadline;
    private List<Robot> robots;

    protected abstract void execute(List<Robot> robots);
    protected abstract void execute(List<Robot> robots, int id);

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public void setRobots(List<Robot> robots) {
        this.robots = robots;
    }
}
