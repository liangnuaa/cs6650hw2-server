package com.liang.model;

public class StepCounts {
    protected int userId;
    protected int dayId;
    protected int timeInterval;
    protected int stepCount;

    public StepCounts(int userId, int dayId, int timeInterval, int stepCount) {
        this.userId = userId;
        this.dayId = dayId;
        this.timeInterval = timeInterval;
        this.stepCount = stepCount;
    }

    public int getUserId() {
        return userId;
    }

    public int getDayId() {
        return dayId;
    }

    public int getTimeInterval() {
        return timeInterval;
    }

    public int getStepCount() {
        return stepCount;
    }

}
