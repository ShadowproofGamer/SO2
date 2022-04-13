package Main;

import Algorithms.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int max = 180;

    public static void main(String[] args) throws IOException {
        int n = 100;
        int arrivalTime = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ilość procesów: ");
        n = scanner.nextInt();
        System.out.println("Wpisz maksymalny czas przybycia: ");
        arrivalTime = scanner.nextInt();
        System.out.println("Wpisz ilość bloków procesora: ");
        max  = scanner.nextInt();
        tasksGenerator generator = new tasksGenerator();
        ArrayList<Task> tasks = generator.generator(n,arrivalTime,max);
        String main = "Liczba przesunięć głowicy dla " + n + " procesów,\n z czasem najpóźniejszego przybycia" + arrivalTime + "\n i wielkością dysku " + max + " bloków, dla algorytmu: ";
        System.out.println(main);



        Algorithms.FCFS fcfs = new Algorithms.FCFS();
        String fcfsString = "FCFS : "+fcfs.fcfsAlgo(tasks);
        System.out.println(fcfsString);

        Algorithms.SSTF sstf = new Algorithms.SSTF();
        String sstfString = "SSTF : " + sstf.sstfAlgo(tasks);
        System.out.println(sstfString);

        Algorithms.SCAN scan = new Algorithms.SCAN();
        String scanString = "SCAN : " + scan.scanAlgo(tasks);
        System.out.println(scanString);

        C_SCAN cscan = new C_SCAN();
        String cscanString = "C-SCAN : " + cscan.cscanAlgo(tasks);
        System.out.println(cscanString);

        EDF edf = new EDF();
        String edfString = "EDF : " + edf.edfAlgo(tasks);
        System.out.println(edfString);

        Algorithms.FD_SCAN fd_scan =  new Algorithms.FD_SCAN();
        String fdscanString = "FD-SCAN : " + fd_scan.fdscanAlgo(tasks);
        System.out.println(fdscanString);

        Zapis zapis = new Zapis();
        zapis.zapis(main,fcfsString,sstfString,scanString,cscanString,edfString,fdscanString);

}

}
