package com.project.officeManagement.practices;

import java.util.TreeSet;

public class TryTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(110);
        treeSet.add(92);
        treeSet.add(540);
        treeSet.add(105);


        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Omar");
        treeSet1.add("Banna");
        treeSet1.add("omar");
        treeSet1.add("Tanvir");
        treeSet1.add("Omar");

        System.out.println("Print from TreeSet = " + treeSet);
        System.out.println("Print from TreeSet _1 = " + treeSet1);
    }
}
