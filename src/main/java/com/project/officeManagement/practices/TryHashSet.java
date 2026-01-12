package com.project.officeManagement.practices;

import java.util.HashSet;

public class TryHashSet {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("Tanvir");
        name.add("Omar");
        name.add("Omar");
        name.add("Banna");
        name.add("omar");

//        add number
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(1);

        System.out.println("Print from HashSet = " + name + hs);
    }
}
