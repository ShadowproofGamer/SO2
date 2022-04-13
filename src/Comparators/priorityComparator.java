package Comparators;

import java.util.Comparator;
import Main.Task;

public class priorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task p1, Task p2) {

        if (p1.isPriority() && p2.isPriority()){
            return new arrivalComparator().compare(p1, p2);
        }else if (!p1.isPriority() && !p2.isPriority()){
            return new arrivalComparator().compare(p1, p2);
        }else if (!p1.isPriority() && p2.isPriority()){
            return 1;
        }else {
            return -1;
        }
    }
}
