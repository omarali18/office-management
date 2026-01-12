package com.project.officeManagement.practices;


import java.util.TreeMap;

public class TryTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("BD", "Dhaka");
        treeMap.put("USA", "DC");
        treeMap.put("Australia", "Canberra");
        treeMap.put("BD", "Dhaka");
        treeMap.put("China", "Beijing");

//        key is int
        TreeMap<Integer, String> intTreeMap = new TreeMap<>();
        intTreeMap.put(3, "Dhaka");
        intTreeMap.put(5, "DC");
        intTreeMap.put(1, "Canberra");
        intTreeMap.put(3, "Dhaka");
        intTreeMap.put(2, "Beijing");
        intTreeMap.put(4, "Tokyo");

        TreeMap<String, Integer> treeMap_2 = new TreeMap<>();
        treeMap_2.put("Dhaka",3);
        treeMap_2.put("DC",5);
        treeMap_2.put("Canberra",1);
        treeMap_2.put("Dhaka",4);
        treeMap_2.put("Beijing",2);
        treeMap_2.put("Tokyo",6);

        System.out.println("Print from LinkedHashMap = " + treeMap);
        System.out.println("Print from LinkedHashMap_int = " + intTreeMap);
        System.out.println("Print from LinkedHashMap_int_2 = " + treeMap_2);
    }
}
