package Comparators;

import java.util.Comparator;
import Main.Task;

public class fdscanComparator implements Comparator<Task> {
    private int headSegment;

    public fdscanComparator(int headSegment){
        this.headSegment = headSegment;
    }
    @Override
    public int compare(Task p1, Task p2) {

        if (p1.isPriority() && p2.isPriority()){
            return new Comparators.scanComparator(headSegment).compare(p1, p2);
        }else if (!p1.isPriority() && !p2.isPriority()){
            return new Comparators.scanComparator(headSegment).compare(p1, p2);
        }else if (!p1.isPriority() && p2.isPriority()){
            return 1;
        }else {
            return -1;
        }
    }
}
