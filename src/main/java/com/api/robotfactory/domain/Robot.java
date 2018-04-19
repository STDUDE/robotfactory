package com.api.robotfactory.domain;

import java.util.Date;
import java.util.List;

public abstract class Robot {
    private static final int STATUS_WORK = 0;
    private static final int STATUS_WAIT = 1;
    protected static final int CONFIDENCE_HIGH = 10;
    protected static final int CONFIDENCE_MID = 11;
    protected static final int CONFIDENCE_LOW = 12;

    private int id;
    private int status = STATUS_WAIT;
    private int confidence;
    private Task task;

    public Robot(int id, int confidence) {
        this.id = id;
        this.confidence = confidence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isWait() {
        updateStatus();
        return task == null;
    }

    public boolean isWork() {
        updateStatus();
        return task != null;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void updateStatus() {
        Date curDate = new Date();
        if(task != null) {
            if(task.getDeadline().after(curDate) || task.getDeadline().equals(curDate)) {
                System.out.println("Робот" + (id+1) + "выполнил задание");
                status = STATUS_WAIT;
                task = null;
            }
        } else {
            status = STATUS_WORK;
        }
    }
}
