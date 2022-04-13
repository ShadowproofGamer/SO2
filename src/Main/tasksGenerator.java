package Main;

import Comparators.arrivalComparator;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class tasksGenerator {


    public ArrayList<Task> generator(int n,int activeTime,int max){
        ArrayList<Task> tasksList = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        for(;i<n*0.70;i++){
            tasksList.add(new Task(i,random.nextInt(max)+1 ,random.nextInt(activeTime)+1,false));
        }
        for(;i<n;i++){
            tasksList.add(new Task(i,random.nextInt(max)+1 ,random.nextInt(activeTime)+1, true));
        }

        tasksList.sort(new arrivalComparator());
        return tasksList;
    }


}
