package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import Main.Task;
import Comparators.*;

public class EDF {
    public int edfAlgo(ArrayList<Task> list){
        ArrayList<Task> tasks = list;
        ArrayList<Task> queue = new ArrayList<>();
        ArrayList<Task> doneTasks = new ArrayList<>();
        int index = 0;
        int time = 0;
        int result = 0;
        int headSegment = 0;
        while (doneTasks.size() != list.size()){
            if (queue.isEmpty() && index < tasks.size()){
                queue.add(tasks.get(index));
                index++;
                if (time < queue.get(0).getArrivalTime()) {
                    time = queue.get(0).getArrivalTime();
                }
            }
            if (index < tasks.size()) {
                while (tasks.get(index).getArrivalTime() <= time ) {
                    queue.add(tasks.get(index));
                    index++;
                    if (index >= tasks.size()){
                        break;
                    }
                }
            }
            queue.sort(new priorityComparator());
            if (queue.get(0).getArrivalTime() <= time) {
                int temp = Math.abs(headSegment - queue.get(0).getSegment());
                result += temp;
                time += temp;
                headSegment = queue.get(0).getSegment();
                doneTasks.add(queue.get(0));
                queue.remove(0);
            }else {
                result++;
                time++;
            }


        }
        return result;
    }
}
