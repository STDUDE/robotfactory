package com.api.robotfactory.domain;

import java.util.Date;

public class Task {
    public static int KILL = 0;
    public static int WAIT = 1;

    private int type;
    private String subject;
    private boolean broadcasting = false;
    private Date deadline;

    public Task(int type, String subject, boolean broadcasting, Date deadline) {
        this.type = type;
        this.subject = subject;
        this.broadcasting = broadcasting;
        this.deadline = deadline;
    }
}
