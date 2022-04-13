package Comparators;

import java.util.Comparator;
import Main.Task;

public class arrivalComparator implements Comparator<Task> {
    @Override
    public int compare(Task p1, Task p2) {
        int temp = p1.getArrivalTime() - p2.getArrivalTime();
        if (temp == 0){
            return 0;
        }else if (temp > 0){
            return 1;
        }else {
            return -1;
        }
    }
}
