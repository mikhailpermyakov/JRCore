package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String monthS[] = {"January","February","March","April","May","June","July","August",
                           "September","October","November","December"};
        Integer monthI[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < monthI.length; i++) {
            map.put(monthS[i], monthI[i]);
        }

         String monthName = br.readLine();

        System.out.println(monthName + " is " + map.get(monthName) + " month");


    }
}
