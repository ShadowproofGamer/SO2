package Algorithms;

import java.util.ArrayList;
import Main.Task;
import Comparators.*;

public class FCFS {
    public int fcfsAlgo(ArrayList<Task> list){
        int result = 0;
        int headSegment = list.get(0).getSegment();
        for(Task t : list){
            result += Math.abs(headSegment - t.getSegment());
            headSegment = t.getSegment();
        }
        return result;
    }
}
