package com.api.robotfactory.domain;

import java.util.List;

public abstract class Robot {
    private boolean status;
    private Task tasks;

    public abstract boolean execute();
}
