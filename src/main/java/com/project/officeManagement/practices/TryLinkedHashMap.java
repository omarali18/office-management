package com.project.officeManagement.practices;

import java.util.LinkedHashMap;

public class TryLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("BD", "Dhaka");
        linkedHashMap.put("USA", "DC");
        linkedHashMap.put("Australia", "Canberra");
        linkedHashMap.put("BD", "Dhaka");
        linkedHashMap.put("China", "Beijing");

//        key is int
        LinkedHashMap<Integer, String> intLinkedHashMap = new LinkedHashMap<>();
        intLinkedHashMap.put(3, "Dhaka");
        intLinkedHashMap.put(5, "DC");
        intLinkedHashMap.put(1, "Canberra");
        intLinkedHashMap.put(3, "Dhaka");
        intLinkedHashMap.put(2, "Beijing");
        intLinkedHashMap.put(4, "Tokyo");

        LinkedHashMap<String, Integer> linkedHashMap_2 = new LinkedHashMap<>();
        linkedHashMap_2.put("Dhaka",3);
        linkedHashMap_2.put("DC",5);
        linkedHashMap_2.put("Canberra",1);
        linkedHashMap_2.put("Dhaka",4);
        linkedHashMap_2.put("Beijing",2);
        linkedHashMap_2.put("Tokyo",6);

        System.out.println("Print from LinkedHashMap = " + linkedHashMap);
        System.out.println("Print from LinkedHashMap_int = " + intLinkedHashMap);
        System.out.println("Print from LinkedHashMap_int_2 = " + linkedHashMap_2);
    }
}
