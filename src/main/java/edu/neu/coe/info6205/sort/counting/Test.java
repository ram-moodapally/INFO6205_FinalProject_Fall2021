package edu.neu.coe.info6205.sort.counting;

import edu.neu.coe.info6205.sort.elementary.InsertionSort;
import edu.neu.coe.info6205.sort.counting.MSDStringSort;
import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Timer;
import edu.neu.coe.info6205.sort.linearithmic.QuickSort_DualPivot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        String[] inou = {"గ్రేటర్","సిద్ధంగా", "గటర" , "కొంతకాలంగా" ,"అ", "ప్రపంచవ్యాప్తంగా", "కాకి" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "పేరు", "మార్మోగుతోంది" ,  "బొగ్గు", "గత" , "కొంతకాలంగా" ,"అ",  "ప్రపంచవ్యాప్తంగా" ,  "గ్లోబల్‌", "ఆ",  "వార్మింగ్‌", "మార్మోగుతోంది" ,  "బొగ్గు"};
        //String[] inou = {"TEST", "NEW" , "OLD","TET"};
        List<String> new1 = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Abhishikth Daniel M\\Desktop\\6205\\Assigments\\INFO6205-Assignments\\input.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
              //  System.out.println(str);
                new1.add(str);
            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }
        String[] newinp = new1.toArray(new String[0]);

   //     MSDStringSort.sort(newinp);
        //Collections.sort(new1);
     //   Collections.sort(new1, Collections.reverseOrder());


//       // System.out.println(MSDStringSort.sort(inou));
        Timer timer = new Timer();
        final double time = timer.repeat(1, () -> 0, t -> {
            MSDStringSort.sort(newinp);
            return null;
        });
//        MSDStringSort.sort(inou);
//        LSDStringSort lsdStringSort = new LSDStringSort();
      //  lsdStringSort.sort(inou);

                System.out.println(time);
    int a = 10;

    }


}
