package Main;

import java.io.Serializable;

public class Task implements Serializable {
    private final static long serialVersionUID = -8420577340779607644L;
    private int number;
    public int arrivalTime;
    private int segmentNUM;
    private boolean priority;

    public Task(int number, int segment, int arrivalTime, boolean priority) {
        this.number = number;
        this.arrivalTime = arrivalTime;
        this.segmentNUM = segment;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Main.Task{" +
                "number=" + number +
                ", arrivalTime=" + arrivalTime +
                ", segmentNUM=" + segmentNUM +
                ", priority=" + priority +
                '\n';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSegment() {
        return segmentNUM;
    }

    public void setWaitingTime(int waitingTime) {
        this.segmentNUM = waitingTime;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }
}
