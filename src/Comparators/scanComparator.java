package Comparators;

import java.util.Comparator;
import Main.Task;

public class scanComparator implements Comparator<Task> {
private int headSegment;
public scanComparator(int headSegment){
        this.headSegment = headSegment;
        }
@Override
        public int compare(Task p1, Task p2) {
                int temp = Math.abs(p1.getSegment() - headSegment) - Math.abs(p2.getSegment()- headSegment);
                if (temp == 0){
                          return new arrivalComparator().compare(p1,p2);
                }else if (temp > 0){
                            return 1;
                 }else {
                         return -1;
                 }
        }
}
