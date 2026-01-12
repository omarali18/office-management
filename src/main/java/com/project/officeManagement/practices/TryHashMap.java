package com.project.officeManagement.practices;

import java.util.HashMap;

public class TryHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("BD", "Dhaka");
        hashMap.put("USA", "DC");
        hashMap.put("Australia", "Canberra");
        hashMap.put("BD", "Dhaka");
        hashMap.put("China", "Beijing");

//        key is int
        HashMap<Integer, String> intHashmap = new HashMap<Integer, String>();
        intHashmap.put(3, "Dhaka");
        intHashmap.put(5, "DC");
        intHashmap.put(1, "Canberra");
        intHashmap.put(3, "Dhaka");
        intHashmap.put(2, "Beijing");
        intHashmap.put(4, "Tokyo");

        HashMap<String, Integer> intHashmap_2 = new HashMap<String, Integer>();
        intHashmap_2.put("Dhaka",3);
        intHashmap_2.put("DC",5);
        intHashmap_2.put("Canberra",1);
        intHashmap_2.put("Dhaka",4);
        intHashmap_2.put("Beijing",2);
        intHashmap_2.put("Tokyo",6);

        System.out.println("Print from HashMap = " + hashMap);
        System.out.println("Print from HashMap_int = " + intHashmap);
        System.out.println("Print from HashMap_int_2 = " + intHashmap_2);
    }
}
